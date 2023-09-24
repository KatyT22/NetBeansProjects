# Build
mvn clean package && docker build -t academy.learnprograming/javaee-fundamentals .

# RUN

docker rm -f javaee-fundamentals || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee-fundamentals academy.learnprograming/javaee-fundamentals 