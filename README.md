# User Authentication System (JSP & Servlet) -REGISTER PAGE

## Description
This is a Java-based web application developed using JSP, Servlet, JDBC, and MySQL.  
The project implements a complete user authentication system with secure login and password management.

---

## Features
- User Registration
- User Login
- Logout Functionality
- Forgot Password
- Reset Password
- Password Encryption
- MySQL Database Integration

---

## Technologies Used
- Java
- JSP & Servlet
- JDBC
- MySQL
- Apache Tomcat
- Eclipse IDE

---


## Database Table
sql:
CREATE TABLE register (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  email VARCHAR(50) UNIQUE,
  password VARCHAR(255)
);


## How to Run
1.Import project into Eclipse.
2.Configure Apache Tomcat Server.
3.Create MySQL database and table.
4.Update database credentials in Java file.
5.Run project on Tomcat.
6.Open browser:

Copy code:
http://localhost:8080/REGISTER_PAGE/login.jsp
