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

References: 
1. https://stackoverflow.com/questions/39632667/how-do-i-kill-the-process-currently-using-a-port-on-localhost-in-windows
2. 


Spring boot rest api
1. docker build -t employeeapp .
2. docker run -p 8080:8080 employeeapp

To Run Overall:
    docker-compose  up
    
