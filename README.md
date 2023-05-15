# kubernates-nginx-spring-boot
Demo rest api combining rest services using spring boot, nginx, kubernates application 

To Run mysql \
   docker-compose -f .\local_mysql.yml up

    mysql -u root -h localhost:8080 example -p

1. docker ps
2. docker exec -it b1e097aa5700 bash
3.  mysql -u root -p
4. show databases
5. 


Kill process running on a port\
1. netstat -ano | findstr :<PORT>
2. taskkill /PID <PID> /F



Spring boot rest api
1. docker build -t employeeapp .
2. docker run -p 8080:8080 employeeapp

To Run Overall:
    docker-compose  up


mysql alone: 
1. docker build -t my-mysql-image .
2. docker run --name my-mysql-container -p 3000:3306 my-mysql-image

References: 
1. https://stackoverflow.com/questions/39632667/how-do-i-kill-the-process-currently-using-a-port-on-localhost-in-windows
2. https://spring.io/guides/topicals/spring-boot-docker/
3. 

Skip test file \
    mvn install -DskipTests

Pass a specific profile in spring boot app: \
    -Dspring.profiles.active=local

