# Student Record Management System
## Overview
I made this project with a goal tobuild java application that manages student information using OOP principles we have learnt in our course. It allows users to create, store, analyze, and back up student records while demonstrating file handling and serialization techniques as we learnt in our lessons.

## Features My Project Has
- Add and manage student records
- Store student ID, name, department, and GPA
- Display all student records
- Save records to text files
- Save records to binary files
- Serialize student objects
- Generate student statistics and reports
- Create backup copies of data
- Handle exceptions for safe execution

## My Project Structure
src/
└── StudentRecord/
    ├── Main.java
    ├── Student.java
    ├── StudentManager.java
    ├── FileManager.java
    ├── StudentStatistics.java
    └── DataBackup.java

## Built Using
- Java
- OOP (Object-Oriented Programming)
- File Handling
- Serialization
- Java Collections Framework

## How to Run It
1. Clone or download the project.
2. Open it in IntelliJ IDEA or any Java IDE.
3. Compile the source files.
4. Run Main.java.

## Generated Files
students.txt   -> Text format records
students.dat   -> Binary format records
students.obj   -> Serialized objects
backup.obj     -> Backup file

## Sample Student Record
Student student = new Student(
    1,
    "Tina",
    "CS",
    3.8
);

## Outcomes
My project demonstrates:
- Encapsulation and class design
- Object management using collections
- File input/output operations
- Object serialization
- Basic data analysis and reporting
- Data backup and recovery

## Author
KEBRON TESHOME KEBEDE Student-ID(0056/26)
