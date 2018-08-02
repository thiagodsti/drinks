FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /app

ARG APP_NAME=drinks
ENV APP_NAME=${APP_NAME}

COPY build/libs/*.jar /app/$APP_NAME.jar

EXPOSE 8080

CMD java -jar /app/$APP_NAME.jar
