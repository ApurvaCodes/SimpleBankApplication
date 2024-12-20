# Bank Application Documentation

## Table of Contents

1. [Introduction](#1-introduction)  
2. [Project Overview](#2-project-overview)  
3. [Getting Started](#3-getting-started)  
4. [Code Structure](#4-code-structure)  
5. [Features](#5-features)  
6. [Code Refactoring](#6-code-refactoring)  
7. [Usage](#7-usage)  
8. [Compile and Run](#8-compile-and-run)  
9. [Author](#9-author)  

---

## 1. Introduction

Welcome to the documentation for the Bank Application. This project demonstrates fundamental object-oriented programming concepts in Java, including encapsulation, user input validation, and interactive console-based menus for performing basic banking operations.

---

## 2. Project Overview

The Bank Application allows users to perform the following tasks:  
- Deposit money into their account.  
- Withdraw money from their account.  
- View account balance and previous transactions.  
- Calculate interest over a specified period.  
- Interact through a user-friendly console-based menu.  

---

## 3. Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.  
- Basic understanding of Java and command-line operations.

### Steps
1. Clone or download the project files (`Account.java` and `FirstBank.java`).  
2. Follow the instructions in [Compile and Run](#8-compile-and-run) to execute the application.  

---

## 4. Code Structure

The project consists of the following files:  

- **`Account.java`**:  
  Contains the `Account` class with methods to handle banking operations like deposit, withdraw, check balance, and calculate interest.  

- **`FirstBank.java`**:  
  Contains the `main` method to create account instances and display the application menu.  

### Key Classes and Methods

#### Account Class
- **`deposit(int amount)`**: Adds the specified amount to the account balance.  
- **`withdraw(int amount)`**: Subtracts the specified amount from the account balance.  
- **`getPreviousTransaction()`**: Displays the most recent transaction.  
- **`calculateInterest(int years)`**: Calculates interest over a specified period.  
- **`showMenu()`**: Displays the main menu for user interaction.  

#### FirstBank Class
- Entry point of the application where accounts are initialized and the menu is displayed.  

---

## 5. Features

- **Deposit Money**: Adds funds to the account and records the transaction.  
- **Withdraw Money**: Deducts funds from the account and records the transaction.  
- **Check Balance**: Displays the current account balance.  
- **Previous Transaction**: Shows the last transaction performed.  
- **Calculate Interest**: Calculates the future balance after applying a fixed interest rate over a specified number of years.  
- **Interactive Menu**: Console-based user interface for navigation and operations.  

---

## 6. Code Refactoring

### Improvements Made

#### Encapsulation
- Used private variables and public getter/setter methods to ensure data encapsulation.  

#### User Input Validation
- Added checks to ensure that only valid amounts are deposited or withdrawn.  

#### Menu Options
- Enhanced user experience with clear instructions and error messages for invalid inputs.  

---

## 7. Usage

### Launch the Application

1. Run the program using the following command:  
   ```bash
   java FirstBank
2. Follow the Menu Options Displayed in the Console

- **A**: Check your account balance.  
- **B**: Deposit money into your account.  
- **C**: Withdraw money from your account.  
- **D**: View your previous transaction.  
- **E**: Calculate interest for a specified number of years.  
- **F**: Exit the application.  

### Example:
- **Deposit 500**: Select `B` and enter `500`.  
- **Withdraw 200**: Select `C` and enter `200`.  
- **Check Balance**: Select `A`.  

---

## 8. Compile and Run

### Compile the Java Files
To compile the Java files, run the following command:  
```bash
javac Account.java FirstBank.java


### Run the Application
To execute the application, run:

```bash
java FirstBank

## 9. Author
This project was developed as a hands-on Java practice to demonstrate fundamental object-oriented programming concepts and banking operations.

