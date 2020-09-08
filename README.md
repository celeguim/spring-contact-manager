# Spring Boot and MVC

* Spring Boot
* Spring MVC
* Spring JPA
* Hibernate
* ThymeLeaf
* MySQL
* Maven
* Docker
* JDK 1.8
* SpringToolSuite

### Start MySQL
```
docker network create my-network

docker run --rm --name mysqldb --network my-network -e  MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mysqldb -d -p 3306:3306 mysql:5.7

docker logs mysqldb

docker exec -it mysqldb mysql -u root --password=root -e 'show databases;'

docker exec -it mysqldb mysql -u root --password=root -e 'use mysqldb; show tables;'

docker kill $(docker ps -a -q)
```

### Create the Project
<https://start.spring.io/>

* Spring Web
* Spring Data JPA
* Thymeleaf
* MySQL Driver

1. Implement Model Class
2. Create Repository Interface
3. Implement Service Class
4. Implement MVC Controller
5. 