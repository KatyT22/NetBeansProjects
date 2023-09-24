#!/bin/sh
mvn clean package && docker build -t academy.learnprograming/myCdiProject .
docker rm -f myCdiProject || true && docker run -d -p 8080:8080 -p 4848:4848 --name myCdiProject academy.learnprograming/myCdiProject 
