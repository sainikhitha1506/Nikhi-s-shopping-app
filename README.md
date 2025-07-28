# 🛍️ Shopping App

A simple **Spring Boot + Thymeleaf + PostgreSQL** web application to manage products.  
This project demonstrates a full **CRUD (Create, Read, Update, Delete)** product management system with a responsive interface built using **Bootstrap**.

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

## **Project Screenshots**

### **Home Page**
![Home Page](https://github.com/sainikhitha1506/Nikhi-s-shopping-app/blob/main/assets/homepage.png?raw=true)

### **Product List Page**
![Product List](https://github.com/sainikhitha1506/Nikhi-s-shopping-app/assets/productlist.png)

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
How It Works
Home Page – A simple landing page with a "View Products" button.

Product List – Displays all products with options to Add, Edit, Delete, and Search.

CRUD Operations –

Add Product: Add a new product with name, description, price, and image URL.

Edit Product: Update product details.

Delete Product: Remove products from the database.

Search: Search products by name or keyword.

Future Enhancements
Implement user authentication (admin login).

Add product categories and filtering options.

Allow image upload instead of just URLs.

Add pagination for large product lists.

Author
Sai Nikhitha
