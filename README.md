# JARLOVEIN INVENTORY BACKEND APPLICATION
For barcode scanner, (by Kataykin) "QR & Scanner POST & GET request to server" application is used.

## Start Mysql Server Container
```
docker run -d -e MYSQL_ROOT_PASSWORD=dummypassword -e MYSQL_DATABASE=todos -e MYSQL_USER=todos-user -e MYSQL_PASSWORD=dummytodos -p 3306:3306 --name mysql mysql:5.7
```

## Sample Mysql Commands
```
 mysqlsh
 \connect todos-user@localhost:3306 --> password:dummytodos
 \sql
 use todos
 select * from todo ;
```
## Start Docker Server Container 
```
docker run  -d --name inventory --link mysql:mysql -p 8000:8080 -e RDS_HOSTNAME=mysql -e RDS_PORT=3306 -e RDS_DB_NAME=todos -e RDS_USERNAME=todos-user -e RDS_PASSWORD=dummytodos yustunay/inventory:1.0
```