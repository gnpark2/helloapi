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

