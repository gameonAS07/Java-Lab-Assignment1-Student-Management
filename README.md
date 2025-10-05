# Student Management System in Java

- Course : Java programming
- Faculty : Dr. Manish Kumar
- Name : Akash Sharma
- Roll no : 2401201108
- Bca(Ai & Ds) Sec: B

## Overview
This Java console application manages student records by storing and displaying information like roll number, name, course, marks, and grade. It demonstrates concepts of inheritance, encapsulation, and basic user interaction via console input.

## Features
- Add multiple student details interactively
- Calculate letter grades automatically based on marks
- Display all stored student records clearly
- Input validation for marks (0-100)
- Simple menu-driven interface for ease of use

## Classes
- **Person**: Base class holding common attribute `name`
- **Student** (extends Person): Adds roll number, course, marks, and grade; contains methods for input, grade calculation, and display

## How to Run
1. Compile all Java files:
javac pratice.java
2. Run the program:
java pratice
3. Follow on-screen menu options to add or view students or exit.

## Usage
The program prompts the user to:
- Add a student's details (roll no, name, course, marks)
- View all added student details with their calculated grades
- Exit the program

## Notes
- Marks outside the 0-100 range are rejected with an error message.
- Grade calculation thresholds:
- A: 90 and above
- B: 80 to 89
- C: 70 to 79
- D: 60 to 69
- F: below 60
