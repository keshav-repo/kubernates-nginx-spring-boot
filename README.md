# kubernates-nginx-spring-boot
Demo rest api combining rest services using spring boot, nginx, kubernates application 

To Run mysql 
docker-compose -f .\local_mysql.yml up


mysql -u root -h localhost:8080 example -p

1. docker ps

2. docker exec -it b1e097aa5700 bash

3.  mysql -u root -p

4. show databases

5. 


Kill process running on a port
1. netstat -ano | findstr :<PORT>
2. taskkill /PID <PID> /F
