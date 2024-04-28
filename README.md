# News Search App


* build command \
  `mvn clean install`
---

This project is compiled on java 17 \
Spring 5 and Boot 2.\
Compilation tool is Maven 3.
---

### Current functionalities:
* swagger embedded

___


## Libraries Used
* Spring Boot
* Spring Web
* Spring jpa
* lombok

---

## Setting up the Service in Local

###Prerequisites
Install IntelliJ/ Eclipse:
Clone the repository
Install Brew (to install Maven): Terminal Command- `/bin/bash -c “$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)”` \
Install Maven: Terminal Command- `brew install maven` \

___

### Local Setup Process
1. Setup SDK: File->Project Structure...->Project->SDK->version 17
2. Install Search: Terminal Command- Run `mvn clean install` in Search Project
3. Run WebAppApplication: /src/main/java/com/news/search/NewsSearchApplication -> Run WebAppApplication

___

### Generate News via GET api
http://localhost:8080/news?keyword=india&page=2

### Swagger
http://localhost:8080/swagger-ui/

### Docker setup

`docker build -t search` \
`docker run search`

### Future Enhancement
- api configs can be added in online service like Amazon Secret Manager