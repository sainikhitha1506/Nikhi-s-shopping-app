#  Shopping App

A simple **Spring Boot + Thymeleaf + PostgreSQL** web application to manage products.  
This project demonstrates a full **CRUD (Create, Read, Update, Delete)** product management system with a clean UI built using **Bootstrap**.

---

## **Features**
- Add new products with name, price, description, and image URL.
- Edit existing product details.
- Delete products easily.
- Search and filter products.
- Beautiful UI using Bootstrap.
- Persistent storage with PostgreSQL database.

---

## **Tech Stack**
- **Backend:** Spring Boot (Java)
- **Frontend:** Thymeleaf + Bootstrap
- **Database:** PostgreSQL
- **Build Tool:** Maven
- **Version Control:** Git + GitHub
- **IDE:** IntelliJ IDEA

---

## **Getting Started**

### **1. Clone the repository**
```bash
git clone https://github.com/sainikhitha1506/Nikhi-s-shopping-app.git
2. Configure PostgreSQL
Create a database named shoppingdb.

Update the database credentials in src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/shoppingdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3. Build the project
bash
Copy
Edit
mvn clean install
4. Run the application
bash
Copy
Edit
mvn spring-boot:run
5. Access in Browser
arduino
Copy
Edit
http://localhost:8080
Future Enhancements
Implement user authentication (admin login).

Add product categories and filtering options.

Allow image upload instead of just URLs.

Add pagination for large product lists.

Author
Sai Nikhitha
