# 🏦 ATM Simulator System

A desktop-based **ATM Simulator System** developed using **Java, Swing, JDBC, and MySQL**. This project simulates the basic functionalities of an Automated Teller Machine (ATM), allowing users to perform banking operations through a simple and user-friendly graphical interface.

---

## 📌 Features

* 🔐 User Login Authentication
* 📝 New Account Registration
* 💰 Cash Deposit
* 💸 Cash Withdrawal
* ⚡ Fast Cash
* 📄 Mini Statement
* 💳 PIN Change
* 💼 Balance Enquiry
* 🚪 Exit Application

---

## 🛠️ Tech Stack

| Technology  | Description               |
| ----------- | ------------------------- |
| Java        | Core Programming Language |
| Java Swing  | GUI Development           |
| JDBC        | Database Connectivity     |
| MySQL       | Database Management       |
| Eclipse IDE | Development Environment   |

---

## 📂 Project Structure

```
ATM-Simulator-System/
│
├── src/
│   ├── Login.java
│   ├── Signup.java
│   ├── Signup2.java
│   ├── Signup3.java
│   ├── Transactions.java
│   ├── Deposit.java
│   ├── Withdraw.java
│   ├── FastCash.java
│   ├── BalanceEnquiry.java
│   ├── MiniStatement.java
│   ├── PinChange.java
│   ├── Conn.java
│   └── ...
│
├── icons/
│
├── database/
│   └── atm.sql
│
└── README.md
```

---

## ⚙️ Installation

### 1. Clone the Repository

```bash
git clone https://github.com/subodh0212/ATM-Stimulator-.git
```

### 2. Open the Project

Open the project using **Eclipse** or any Java IDE.

### 3. Create the Database

* Install MySQL.
* Create a database (for example: `bankmanagementsystem`).
* Import the SQL file (`atm.sql`) if available.

### 4. Configure Database Connection

Update your database credentials inside the `Conn.java` file.

Example:

```java
Connection c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bankmanagementsystem",
    "root",
    "your_password"
);
```

### 5. Run the Project

Run `Login.java` to start the application.

---

## 🗃️ Database

The project stores:

* User Details
* Account Information
* PIN
* Transaction History
* Balance Details

using a MySQL database connected through JDBC.

---

## 📸 Screenshots

Add screenshots here after uploading your project.

<img width="1920" height="1020" alt="Screenshot 2026-06-28 212757" src="https://github.com/user-attachments/assets/59eddd02-1eaf-43fc-804a-08feac44069b" />
<img width="1046" height="997" alt="image" src="https://github.com/user-attachments/assets/ef175a36-6569-401e-8481-c4afef882b36" />
<img width="1125" height="1080" alt="image" src="https://github.com/user-attachments/assets/f9518483-b7e1-4a4b-99ab-f962c82979aa" />
<img width="1102" height="980" alt="image" src="https://github.com/user-attachments/assets/87a7ee0f-90f4-44fc-95de-02028e0f3b2b" />
<img width="1125" height="1080" alt="image" src="https://github.com/user-attachments/assets/f0a0645c-0549-4f82-adcb-63977e62071d" />

---



## 🎯 Learning Outcomes

This project helped in understanding:

* Object-Oriented Programming (OOP)
* Java Swing GUI Development
* JDBC Connectivity
* MySQL Database Operations
* Event Handling
* CRUD Operations
* Exception Handling
* Software Design Principles

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a new branch.
3. Commit your changes.
4. Push to your branch.
5. Open a Pull Request.

---
