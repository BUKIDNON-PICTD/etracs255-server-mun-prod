FROM openjdk:8
COPY . /etracs255-server-muni
CMD ["/etracs255-server-muni/bin/run.sh"]