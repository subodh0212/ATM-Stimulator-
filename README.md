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
git clone https://github.com/your-username/ATM-Simulator-System.git
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

Example:

```
screenshots/
│
├── login.png
├── signup.png
├── deposit.png
├── withdraw.png
├── fastcash.png
├── ministatement.png
└── balance.png
```

---

## 🚀 Future Improvements

* OTP Verification
* Email Notifications
* Password Encryption
* Transaction Receipt (PDF)
* Admin Dashboard
* User Profile Management
* Money Transfer Between Accounts
* Mobile Banking Version

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
