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

### All products:
- Route: /produtos
- HTTP Method: GET  

Example:
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

### Specific product:
- URL: /produto/{id}
- HTTP Method: GET

Example:
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

In editin......
