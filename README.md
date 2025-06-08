
# Smart Attendance System Using Face Recognition (GUI + MySQL)

This is a Java-based Smart Attendance System built as part of the 2nd Semester project for the GUVI - Galgotias Project Board 2028. The application uses Java Swing for the user interface and MySQL for backend data storage. It allows digital attendance marking with time stamping, robust data validation, and modular code structure.

## 📌 Features
- Java Swing-based graphical interface
- MySQL database integration using JDBC
- Attendance logging with timestamp
- Student-wise attendance records
- Error handling and input validation
- Clean modular code (GUI, DAO, Model)
- Extensible design for face recognition or biometric add-ons

## 🛠 Technologies Used
- Java (JDK 17)
- Swing (GUI framework)
- MySQL 8.x
- JDBC (Java Database Connectivity)
- IntelliJ IDEA / Eclipse
- Git & GitHub

## 🧱 Project Structure
```
SmartAttendanceSystem/
│
├── src/
│   ├── MainApp.java            # Entry point
│   ├── AttendanceGUI.java      # GUI layout and actions
│   ├── Student.java            # Student data model
│   └── AttendanceDAO.java      # Handles database operations
│
├── db/
│   └── create_tables.sql       # MySQL schema
│
├── screenshots/
│   └── ui_sample.png           # UI sample screenshot
│
└── README.md
```

## 🗄️ Database Schema
**Database:** `attendance_db`

**Table:** `attendance_log`
```
CREATE TABLE attendance_log (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(255),
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);
```

## 🚀 How to Run
1. Clone the repository:
```
git clone https://github.com/yourusername/SmartAttendanceSystem.git
cd SmartAttendanceSystem
```

2. Import the project into IntelliJ IDEA or Eclipse.

3. Ensure MySQL is installed and running. Create the database using the SQL script in `/db/create_tables.sql`.

4. Update your JDBC credentials in `AttendanceDAO.java`:
```java
String url = "jdbc:mysql://localhost:3306/attendance_db";
String username = "root";
String password = "your_mysql_password";
```

5. Compile and run `MainApp.java`.

## 🧪 Testing
- Test valid and invalid student inputs
- Test database connection loss
- Validate UI responsiveness

## 📸 Screenshots

### 🎯 Home Page
![Home Page](https://github.com/user-attachments/assets/2c2b4220-9ac7-4b70-b8cd-c19ac8b833e2
)
### 🧑‍🎓 Student Registration
![Student Registration](https://github.com/user-attachments/assets/5e1b3c7d-63d9-465c-bf38-e9ccb5cee8d0)

### 🔍 Search Student
![Search Student](https://github.com/user-attachments/assets/628dfa73-a459-45da-88a8-924ad98a9349)
# 👨‍💻 Author
- Name: shashank verma
- University: Galgotias University
- Semester: 2nd Sem

## 📎 License
This project is for academic use only.
