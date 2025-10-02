#REST_API

## Build
```bash
$ ./gradlew clean bootJar
```

## Run
```bash
$ java -jar build/lib/helloapi-<VERSION>.jar
```

## Test
```bash
$ curl http://localhost:8080/hello
{"message":"Hello, World!","koreatime":"2025-10-01T14:11:43.485169240+09:00[Asia/Seoul]","timestamp":1759295503485}%  
```

## Remote Run
```bash
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/restapi/
$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> "cd /home/ubuntu/app/restapi;./start.sh"
```

## Remote Run
```bash
# scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/restapi/
$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> "cd/home/ubuntu/app/restapi;./stop.sh"
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17
```bash

```
