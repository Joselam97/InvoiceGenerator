# 💼 Billing System Application

A web application built with Java and Jakarta EE that generates and manages invoices for products. This project uses dependency injection, servlets, and JSP for an efficient and modular design, ideal for learning enterprise-level Java development.

## Features
- **Invoice Creation**: Automatically generates invoices with unique IDs and detailed product lines.
- **Product Management**: Adds products to an invoice, including quantity and pricing.
- **Dynamic Client Details**: Configurable client information displayed on each invoice.
- **Dependency Injection with CDI**: Uses CDI annotations for managing dependencies like products and clients.

## 🛠️ Tech Stack
- **Java (Jakarta EE)** - Core language for enterprise logic.
- **CDI** - For dependency injection and modular design.
- **JSP** - Generates dynamic HTML for invoices.
- **Bootstrap** - Provides a polished and responsive interface.

## 📖 Usage
1. **Invoice Display**: Accesses an automatically generated invoice at the `/factura` route.
2. **Product and Client Details**: Shows detailed product lines, prices, and client information.
3. **Customization**: Modify products and client settings in the code for tailored invoicing.

## 🚀 Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Joselam97/BillingSystem.git

2. **Navigate to the project directory**:
   ```bash
   cd BillingSystem

3. Build and deploy the project using Maven on a Jakarta EE apache tomcat
