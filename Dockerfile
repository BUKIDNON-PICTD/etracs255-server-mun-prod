FROM openjdk:8
COPY . /etracs255-server-muni-prod
CMD ["/etracs255-server-muni-prod/bin/run.sh"]