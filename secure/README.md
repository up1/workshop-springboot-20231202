# demo-spring-security
* [Spring Security](https://spring.io/projects/spring-security)

## API Specification

### Sign Up

Request
```
POST http://127.0.0.1:8080/api/v1/auth/signup
{
    "email": "demo",
    "password": "demo",
    "firstName": "",
    "lastName": ""
}
```

Response
```
{
 "token": "xxx"
}
```

### Sign in

Request
```
POST http://127.0.0.1:8080/api/v1/auth/signin
{
    "email": "demo",
    "password": "demo"
}
```

Response
```
{
 "token": "xxx"
}
```

### Get customer info

Request
```
GET [http://127.0.0.1:8080/api/v1/auth/signin](http://127.0.0.1:8080/api/v1/customer)

Header
```
Bearer Token : token
```

Response
```
Hello from customer controller
```
