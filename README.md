# Task Manager API

A simple Java REST API for managing tasks using JDBC and SQLite.

## Features
- Create, Read, Update, Delete (CRUD) tasks
- Lightweight, no Spring Data or Hibernate
- Uses plain JDBC API

## Technologies
- Java
- SQLite
- JDBC
- Maven

## Database
The application uses a local `taskmanager.db` SQLite database.  
It will be created automatically if it doesn't exist.

## Endpoints

| Method | Endpoint     | Description         |
|--------|--------------|---------------------|
| GET    | `/tasks`      | Get all tasks        |
| GET    | `/tasks/{id}` | Get a task by ID     |
| POST   | `/tasks`      | Create a new task    |
| DELETE | `/tasks/{id}` | Delete a task by ID  |

