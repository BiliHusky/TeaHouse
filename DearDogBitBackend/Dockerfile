FROM       prographerj/centos7-java8
MAINTAINER David Yang <15901268179@163.com>

ADD target/DearDogBitBackend-1.0-SNAPSHOT.jar .

ADD entrypoint.sh /root/entrypoint.sh

ENTRYPOINT ["/root/entrypoint.sh"]