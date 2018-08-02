# DRINKS BACKEND #

This project is the backend for a system of drink recommendation.

_The database is in memory so when you turnoff the server everything will be lost._

### Requirements

- Java 8

### How do I get set up? ###

#### Development

- Build
`./gradlew clean build`

- Tests
`./gradlew test`

- Run
`./gradlew bootRun`

#### Docker

You have to build your application first, so use the follow command: `./gradlew clean build`

- build
`docker build -t drinks .`

- run
`docker run -d -p 8080:8080 drinks`

- The project will be acessible on http://localhost:8080
- Api documentation at http://localhost:8080/swagger-ui.html


#### API

List all drinks:
- GET /drinks

Save a new drink:
- POST /drinks

List of recommendation:
- GET /drinks/recommendation

--------

### Contacts ###

Thiago Diniz da Silveira

+55 48 988416541

thiagods.ti@gmail.com