# 🛰️ Space Travel App – Hibernate ORM CRUD Example

This is a simple Java application demonstrating the use of **Hibernate ORM** for managing two entities: `Client` and `Planet`.  
The project includes full **CRUD functionality**, **DAO pattern**, and **Flyway**-based database migration.


## 📋 Implemented Features

### ✅ Entities

- `Client`: has `id` (Long, auto-generated) and `name` (String)
- `Planet`: has `id` (String) and `name` (String)

### ✅ DAO Layer

Encapsulates data access logic using Hibernate.  
Defined interfaces + separate implementations for `Client` and `Planet`.

### ✅ Service Layer

Implements high-level CRUD logic using DAO.  
Separates business logic from data access.

### ✅ Flyway

Handles database migrations:
- `V1__create_db.sql` – schema creation
- `V2__populate_db.sql` – inserts default data

### ✅ Test Class

`TestCrudOperations.java` contains tests for all CRUD operations:
- Create
- Read
- Update
- Delete

