#!/bin/bash

./mvnw initialize
./mvnw clean package -Pnative -DskipTests "-Dquarkus.native.container-build=true"
docker build -f src/main/docker/Dockerfile.native -t incck/static-provider .
docker container stop $(docker container ls -aq)
docker run -i --rm -p 8080:8080 incck/static-provider