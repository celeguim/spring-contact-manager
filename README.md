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

### Angular Frontend
<https://github.com/celeguim/springboot-frontend>

```
npm i -g @angular/cli
ng new springboot-frontend
cd springboot-frontend
```

```
# src/app/app.module.ts

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```

```
# src/app/app.component.ts

import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  constructor(private http: HttpClient) { }
  title = 'springboot-frontend';
  httpdata;

  ngOnInit() {
    this.http.get('http://localhost:8081/api/cities')
      .subscribe((data) => this.displaydata(data));
  }
  displaydata(data) { this.httpdata = data; }
}
```

```
# src/app/app.component.html

<h2>List of cities</h2>

<ul *ngFor="let data of httpdata">
  <li>Name : {{data.name}} Population: {{data.population}}</li>
</ul>

```

```
ng serve --verbose=true
mvn spring-boot:run 
```

Test it
<http://localhost:4200>

