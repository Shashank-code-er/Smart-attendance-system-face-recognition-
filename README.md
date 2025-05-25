# Smart Attendance System Using Face Recognition

This is a Java-based GUI project for managing student attendance using face recognition.

## Features
- Student registration and data management
- Placeholder for face recognition integration
- Basic login UI with Java Swing
- MySQL backend integration using JDBC
- Modular project structure with DAO, Model, UI

## Technologies Used
- Java (JDK 17)
- MySQL
- JDBC
- Java Swing

## Project Structure
```
src/
  model/       # Java model classes
  dao/         # Data Access Objects
  ui/          # UI components
  util/        # Utilities like DB connection
docs/          # Project presentation and documentation
```

## Setup Instructions
1. Install JDK 17 and MySQL.
2. Create the `students` table using:
```sql
CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  roll_number VARCHAR(50),
  face_id VARCHAR(100)
);
```
3. Update DBConnection.java with your MySQL credentials.
4. Compile and run `MainApp.java` or `LoginUI.java`.

## Contributors
- Shashank Verma

## License
This project is for academic purposes only.
