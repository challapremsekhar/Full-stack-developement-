# Order Management System using Joins

## 📌 Objective
This project demonstrates how to use SQL Joins, Subqueries, and ORDER BY to manage and analyze customer orders.

---

## 🧩 Tables Used
- Customers
- Products
- Orders

---

## 🛠️ Concepts Covered
- INNER JOIN
- Subqueries
- GROUP BY & HAVING
- ORDER BY

---

## 🗄️ Database Schema

### Customers Table
- customer_id (PK)
- name
- email

### Products Table
- product_id (PK)
- product_name
- price

### Orders Table
- order_id (PK)
- customer_id (FK)
- product_id (FK)
- quantity
- order_date
- total_amount

---

## 🔗 Queries Implemented

### 1. Customer Order History (JOIN)
Displays all orders with customer and product details.

### 2. Highest Value Order (Subquery)
Finds the order with maximum total amount.

### 3. Most Active Customer
Finds the customer with the highest number of orders.

---

## 🌍 Real-Time Application
Used in:
- E-commerce platforms
- Retail management systems
- Customer analytics dashboards

---

## ▶️ How to Run
1. Create database in MySQL
2. Run `schema.sql`
3. Run `queries.sql`
4. (Optional) Open `index.html` for UI view

---