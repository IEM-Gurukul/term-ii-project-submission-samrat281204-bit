[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Student Attendance Management System using Java

## Problem Statement (max 150 words)

In many educational institutions, attendance is still recorded manually using registers. This
approach leads to several problems such as data loss, calculation errors, difficulty in tracking
attendance trends, and time wastage. There is a need for a reliable and efficient system that can
store, manage, and process attendance data digitally while minimizing human effort and errors.

## Target User

Teachers
Students
Institution

## Core Features

• Add Student Details
• Mark Attendance
• View Attendance Records
• Calculate Attendance Percentage
• Display Student List
• Menu-driven Interface

## OOP Concepts Used

Encapsulation: Data members are private and accessed via methods.
Abstraction: Hides internal logic behind simple interfaces.
Inheritance: A base class 'Person' is extended into 'Student' and 'Teacher'.
Polymorphism: Methods behave differently based on object type.
Exception Handling: Ensures smooth handling of runtime errors.

## Proposed Architecture Description

The system will follow a modular architecture where different components of the application are 
separated into logical packages such as model, service, and main. The model layer represents the 
student data and attendance information, the service layer manages operations such as adding 
students and marking attendance, and the main layer handles the user interface and interaction with 
the system. This modular structure improves maintainability, readability, and scalability of the 
program while clearly separating responsibilities across different components.

## How to Run

1. cd src → go inside source folder
2. javac -d . ... → compile all files into proper packages
3. java main.Main → run your main class

## Git Discipline Notes
Minimum 10 meaningful commits required.
