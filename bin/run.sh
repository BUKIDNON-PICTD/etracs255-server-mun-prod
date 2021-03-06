#!/bin/sh
### ====================================================================== ###
##                                                                          ##
##  ETRCS Bootstrap Script                                                  ##
##                                                                          ##
### ====================================================================== ###

### $Id: run.sh 57514 2006-10-09 18:16:00Z dimitris@jboss.org $ ###
# test
sh /opt/etracs255-server-muni/bin/shutdown.sh
rm /opt/etracs255-server-muni/bin/.osiris_pid
rm /opt/etracs255-server-muni/log*

DIRNAME=`dirname $0`
PROGNAME=`basename $0`
GREP="grep"

# Use the maximum available, or set MAX_FD != -1 to use that
MAX_FD="maximum"

#
# Helper to complain.
#
warn() {
    echo "${PROGNAME}: $*"
}

#
# Helper to puke.
#
die() {
    warn $*
    exit 1
}

# OS specific support (must be 'true' or 'false').
cygwin=false;
darwin=false;
case "`uname`" in
    CYGWIN*)
        cygwin=true
        ;;

    Darwin*)
        darwin=true
        ;;
esac

# Read an optional running configuration file
if [ "x$RUN_CONF" = "x" ]; then
    RUN_CONF="$DIRNAME/run.conf"
fi
if [ -r "$RUN_CONF" ]; then
    . "$RUN_CONF"
fi

# For Cygwin, ensure paths are in UNIX format before anything is touched
if $cygwin ; then
    [ -n "$JBOSS_HOME" ] &&
        JBOSS_HOME=`cygpath --unix "$JBOSS_HOME"`
    [ -n "$JAVA_HOME" ] &&
        JAVA_HOME=`cygpath --unix "$JAVA_HOME"`
    [ -n "$JAVAC_JAR" ] &&
        JAVAC_JAR=`cygpath --unix "$JAVAC_JAR"`
fi

# Setup JBOSS_HOME
if [ "x$JBOSS_HOME" = "x" ]; then
    # get the full path (without any relative bits)
    JBOSS_HOME=`cd $DIRNAME/..; pwd`
fi
export JBOSS_HOME

# Increase the maximum file descriptors if we can
if [ "$cygwin" = "false" ]; then
    MAX_FD_LIMIT=`ulimit -H -n`
    if [ $? -eq 0 ]; then
	if [ "$MAX_FD" = "maximum" -o "$MAX_FD" = "max" ]; then
	    # use the system max
	    MAX_FD="$MAX_FD_LIMIT"
	fi

	ulimit -n $MAX_FD
	if [ $? -ne 0 ]; then
	    warn "Could not set maximum file descriptor limit: $MAX_FD"
	fi
    else
	warn "Could not query system maximum file descriptor limit: $MAX_FD_LIMIT"
    fi
fi

# Setup the JVM
if [ "x$JAVA" = "x" ]; then
    if [ "x$JAVA_HOME" != "x" ]; then
	JAVA="$JAVA_HOME/bin/java"
    else
	JAVA="java"
    fi
fi

# Setup the classpath
#runjar="$JBOSS_HOME/bin/run.jar"
#if [ ! -f "$runjar" ]; then
#    die "Missing required file: $runjar"
#fi
#JBOSS_BOOT_CLASSPATH="$runjar"

# Include the JDK javac compiler for JSP pages. The default is for a Sun JDK
# compatible distribution which JAVA_HOME points to
#if [ "x$JAVAC_JAR" = "x" ]; then
#    JAVAC_JAR="$JAVA_HOME/lib/tools.jar"
#fi
#if [ ! -f "$JAVAC_JAR" ]; then
#   # MacOSX does not have a seperate tools.jar
#   if [ "$darwin" != "true" ]; then
#      warn "Missing file: $JAVAC_JAR"
#      warn "Unexpected results may occur.  Make sure JAVA_HOME points to a JDK and not a JRE."
#   fi
#fi

#if [ "x$JBOSS_CLASSPATH" = "x" ]; then
#    JBOSS_CLASSPATH="$JBOSS_BOOT_CLASSPATH:$JAVAC_JAR"
#else
#    JBOSS_CLASSPATH="$JBOSS_CLASSPATH:$JBOSS_BOOT_CLASSPATH:$JAVAC_JAR"
#fi

# If -server not set in JAVA_OPTS, set it, if supported
#SERVER_SET=`echo $JAVA_OPTS | $GREP "\-server"`
#if [ "x$SERVER_SET" = "x" ]; then

    # Check for SUN(tm) JVM w/ HotSpot support
#    if [ "x$HAS_HOTSPOT" = "x" ]; then
#	HAS_HOTSPOT=`"$JAVA" -version 2>&1 | $GREP -i HotSpot`
#    fi

    # Enable -server if we have Hotspot, unless we can't
#    if [ "x$HAS_HOTSPOT" != "x" ]; then
       # MacOS does not support -server flag
#	if [ "$darwin" != "true" ]; then
#	    JAVA_OPTS="-server $JAVA_OPTS"
#	fi
#    fi
#fi

# Setup JBoss sepecific properties
JAVA_OPTS="-Xmx2G -Dosiris.run.dir=$JBOSS_HOME/bin -Dosiris.base.dir=$JBOSS_HOME"

# Setup the java endorsed dirs
#JBOSS_ENDORSED_DIRS="$JBOSS_HOME/lib/endorsed"

# For Cygwin, switch paths to Windows format before running java
#if $cygwin; then
#    JBOSS_HOME=`cygpath --path --windows "$JBOSS_HOME"`
#    JAVA_HOME=`cygpath --path --windows "$JAVA_HOME"`
#    JBOSS_CLASSPATH=`cygpath --path --windows "$JBOSS_CLASSPATH"`
#    JBOSS_ENDORSED_DIRS=`cygpath --path --windows "$JBOSS_ENDORSED_DIRS"`
#fi

# Display our environment
echo "========================================================================="
echo ""
echo "  ETRACS Bootstrap Environment"
echo ""
echo "  ETRACS_HOME: $JBOSS_HOME"
echo ""
echo "  JAVA      : $JAVA"
echo ""
echo "  JAVA HOME : $JAVA_HOME"
#echo ""
#echo "  JAVA_OPTS : $JAVA_OPTS"
echo ""
echo "  CLASSPATH : $JBOSS_CLASSPATH"
echo ""
echo "========================================================================="
echo ""

$JAVA $JAVA_OPTS -classpath $JBOSS_HOME/lib/*:. com.rameses.main.bootloader.MainBootLoader >> /opt/etracs255-server-muni/log-$NOW$(date +"%H_%M_%S").txt

