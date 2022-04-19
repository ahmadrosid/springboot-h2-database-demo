# Springboot H2 Database Demo

## Run
```bash
mvn spring-boot:run
```

## Query insert dummy data
```sql
INSERT INTO MONEYS (ID,BALANCE,NAME) VALUES (1, 1000,'root')
```

## Sample endpoint
```bash
curl --request GET \
  --url http://localhost:8080/
```
Response:
```json
[
    {
        "id": 1,
        "name": "root",
        "balance": 1000.00
    }
]
```
