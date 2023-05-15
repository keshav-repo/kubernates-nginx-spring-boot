# Use the official MySQL 8.0 image as the base image
FROM mysql:8.0

# Set the MySQL root password (change it to your own secure password)
ENV MYSQL_ROOT_PASSWORD=password@123

# Copy the SQL scripts to create the database and user
COPY init.sql /docker-entrypoint-initdb.d/
#COPY myuser.sql /docker-entrypoint-initdb.d/

# Set the character set and collation of the database
RUN echo "[mysqld]\n\
character-set-server=utf8mb4\n\
collation-server=utf8mb4_unicode_ci\n" >> /etc/mysql/conf.d/charset.cnf

# Expose the default MySQL port (3306)
EXPOSE 3306

# Start MySQL server when the container starts
CMD ["mysqld"]
