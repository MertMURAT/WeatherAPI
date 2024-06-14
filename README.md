***
# Weather APİ
***
## Technology Stack :

## Back-end :
  
 - [x] Java (JDK 21)
 
 - [x] Spring Boot (Spring Web, Lombok, Devtools)
 
 - [x] Maven
       
 - [x] RestTemplate


### `Weather Service Endpoints`
| Route                  | HTTP     | RequestBody                                                                                                                                                          | Description 	                           |
|------------------------|----------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------|
| /api/v1/weathers       | `GET`    | { "country": "Turkey", "city": "Istanbul", "period": "daily" }                                                                                                       | Get By country, city and daily period   |
| /api/v1/weathers       | `GET`    | { "country": "Turkey", "city": "Istanbul", "period": "weekly" }                                                                                                       | Get By country, city and weekly period  |
| /api/v1/weathers       | `GET`    | { "country": "Turkey", "city": "Istanbul", "period": "monthly" }                                                                                                       | Get By country, city and monthly period | 
