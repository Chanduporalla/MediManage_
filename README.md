# MediManage

A pharmacy management desktop application built with Java and JavaFX. Helps small medical stores handle day-to-day operations like billing, inventory tracking, customer management, and more.

## What it does

- Billing and invoice generation
- Inventory management with low stock & expiry alerts
- Customer records and credit tracking
- Purchase order management
- Employee attendance tracking
- AI-powered insights (connects to cloud AI providers like Gemini, Groq etc.)
- WhatsApp integration for sending invoices to customers
- Email notifications
- Backup and restore

## Tech Stack

- **Frontend:** JavaFX (Java 21)
- **Database:** SQLite (embedded)
- **AI Backend:** Python Flask server (runs locally on port 5000)
- **WhatsApp Bridge:** Node.js Express server

## How to run

### Prerequisites
- JDK 21+
- Python 3.x (for AI features)
- Node.js (for WhatsApp bridge)

### Running the app

Windows:
```
.\mvnw.cmd clean compile
.\mvnw.cmd javafx:run
```

Linux/Mac:
```
./mvnw clean compile
./mvnw javafx:run
```

Or just use the quick launcher:
```
.\run_windows.bat
```

### Setting up the AI engine

```
python -m venv ai_engine\.venv
ai_engine\.venv\Scripts\pip install -r ai_engine\requirements\requirements.txt
ai_engine\.venv\Scripts\python ai_engine\server\server.py
```

### Setting up WhatsApp bridge

```
cd whatsapp-server
npm install
node index.js
```

## Project Structure

```
src/main/java/          - Java source code (controllers, DAOs, services, etc.)
src/main/resources/     - FXML views, CSS, fonts, images
ai_engine/              - Python AI backend
whatsapp-server/        - Node.js WhatsApp bridge
```

## Default Login

Username: `admin`  
Password: `admin`

## License

See LICENSE.txt
