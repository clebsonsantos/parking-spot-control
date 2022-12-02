<h1 align=center>
  <img src="./icon.png">
</h1>

Sample api buit in Spring Boot to parking control
## Running
```bash
  mvn install
```

```bash
  mvn spring-boot:run
```


## Documentation 


`POST`
```curl
curl --request POST \
  --url http://localhost:8081/parking-spot \
  --header 'Content-Type: application/json' \
  --data '{
	"parkingSpotNumber": "2",
	"licensePlateCar": "RTW-2398",
	"brandCar": "FIAT",
	"modelCar": "ARGO",
	"colorCar": "RED",
	"responsibleName": "PEDRO",
	"apartment": "251",
	"block": "A"
}'
```


`GET`
```curl
curl --request GET \
  --url http://localhost:8081/parking-spot/
``` 

`DELETE`
```curl
curl --request DELETE \
  --url http://localhost:8081/parking-spot/{ID}
``` 

`PUT`
```curl
curl --request PUT \
  --url http://localhost:8081/parking-spot/{ID} \
  --header 'Content-Type: application/json' \
  --data '{
	"parkingSpotNumber": "3",
	"licensePlateCar": "RTW-2398",
	"brandCar": "FIAT",
	"modelCar": "ARGO",
	"colorCar": "BLUE",
	"responsibleName": "LUIZ",
	"apartment": "251",
	"block": "A"
}'
```