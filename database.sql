CREATE DATABASE ProyectoFinal;

USE ProyectoFinal;

-- Creación de la tabla Suppliers
CREATE TABLE Suppliers (
	id_supplier INT PRIMARY KEY,
	name_supplier VARCHAR(250) NOT NULL,
	ruc_suplier VARCHAR(17) NOT NULL
);

-- Creación de la tabla ProductTypes
CREATE TABLE ProductTypes (
	id_productType INT PRIMARY KEY,
	name_productType VARCHAR(150) NOT NULL
);

-- Creación de la tabla Products
CREATE TABLE Products (
	id_product INT PRIMARY KEY,
	id_productType INT NOT NULL,
	name_product VARCHAR(250) NOT NULL,
	price_product REAL NOT NULL,
	stock INT NOT NULL,
	id_supplier INT NOT NULL,
	FOREIGN KEY (id_productType) REFERENCES ProductTypes(id_productType),
	FOREIGN KEY (id_supplier) REFERENCES Suppliers(id_supplier)
);
