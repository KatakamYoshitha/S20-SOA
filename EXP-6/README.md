<img width="1153" height="811" alt="image" src="https://github.com/user-attachments/assets/26267e84-bc87-4faa-b2b9-8b7abc6d892b" />

 
 Library Management Microservice


## 📚 Overview

This project is a simple Library Management Microservice developed using Spring Boot.

It manages book information and provides REST APIs to perform CRUD operations.

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## 📖 Book Details

Each book contains:

- ID
- Title
- Author
- ISBN

## 🔗 REST APIs

| Operation | Method | Endpoint |
|-----------|--------|----------|
| Add Book | POST | `/books` |
| View Books | GET | `/books` |
| Update Book | PUT | `/books/{id}` |
| Delete Book | DELETE | `/books/{id}` |

## 🗄️ Database

Database: MySQL

Database Name:

`library_db`

The `book` table is created automatically using JPA/Hibernate.

## 🧪 API Testing

The APIs were tested using Postman.

### Add Book

```json
{
  "title": "Java Programming",
  "author": "James Gosling",
  "isbn": "123456789"
}
