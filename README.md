# ShoppingList
Practicing Java, Spring boot, Maven and PostgreSQL. Simple API to create a Shopping List.

## URLs
URL from application hosted by Heroku for education purposes:  
* https://shopping-list-java.herokuapp.com/

You can see the Swagger's Documentation in:  
* https://shopping-list-java.herokuapp.com/swagger-ui.html#/produto45resource

## Routes


### HomePage
- Route: '/ '
- HTTP Method: GET

### Get All products:
- Route: /produtos
- HTTP Method: GET  

Example of return:
```
[
  {
    "id": 0,
    "nome": "string",
    "quantidade": 0,
    "valor": 0
  }
]
```
- Status Code:  
200 > OK  
401 > Unauthorized  
403 > Forbidden  
404 > Not Found

### Get Specific product:
- URL: /produto/{id}
- HTTP Method: GET

Example of return:
```
[
  {
    "id": 0,
    "nome": "string",
    "quantidade": 0,
    "valor": 0
  }
]
```
- Status Code:  
200 > OK  
401 > Unauthorized  
403 > Forbidden  
404 > Not Found

### Insert a product:
- URL: /produto
- HTTP Method: POST
- Body:
```
{
  "nome": "Coca",
  "quantidade": 1,
  "valor": 5
}
```
- Status Code:  
200 > OK  
201 > Created  
401 > Unauthorized  
403 > Forbidden  
404 > Not Found

## Edit a product:
- URL: /produto
- HTTP Method: PUT
- Body:
```
{
  "id": 2,
  "nome": "Coca",
  "quantidade": 10,
  "valor": 5
}
```
- Status Code:  
200 > OK  
201 > Created  
401 > Unauthorized  
403 > Forbidden  
404 > Not Found

## Delete a product:
- URL: /produto/{id}
- HTTP Method: DELETE
- Status Code:  
200 > OK  
204 > No Content  
401 > Unauthorized  
403 > Forbidden
