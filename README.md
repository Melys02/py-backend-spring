CREATE DATABASE  selmar_db;
USE selmar_db;
CREATE TABLE EquipoMarino (
    id_equipo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    fabricante VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    estado ENUM('En Venta', 'Mantenimiento', 'Vendido') NOT NULL
);

INSERT INTO EquipoMarino (nombre, tipo, fabricante, precio, estado) VALUES
('XINUO - MODEL XA 198', 'Ais', 'RbfTech', 150000.00, 'En Venta'),
('XINUO - MODEL HM 2612', 'Monitores', 'MonitorsTech', 500000.00, 'En Venta'),
('JRC - JMR 5400 SERIES', 'Radar', 'TechLab', 75000.00, 'Vendido'),
('COMNAV - X5 CLASS A AIS', 'Ais', 'Corp', 300000.00, 'Mantenimiento');



CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    telefono VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO Cliente (nombre, direccion, telefono, email) VALUES
('Juan Pérez', 'Calle Pedrerias 123', '987654321', 'juan@gmail.com'),
('María López', 'Av. Peru 742', '987234567', 'maria@gmail.com'),
('Pedro González', 'Jr Cuzco 456', '962314256', 'pedro@gmail.com'),
('Lucía Fernández', 'Boulevard San Antonio 101', '903546112', 'lucia@gmail.com');

CREATE TABLE OrdenMantenimiento (
    id_orden INT AUTO_INCREMENT PRIMARY KEY,
    id_equipo INT,
    id_cliente INT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    estado ENUM('Pendiente', 'En Progreso', 'Finalizado') NOT NULL,
    FOREIGN KEY (id_equipo) REFERENCES EquipoMarino(id_equipo),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

INSERT INTO OrdenMantenimiento (id_equipo, id_cliente, fecha_inicio, fecha_fin, estado) VALUES
(1, 1, '2024-01-01', '2024-01-15', 'Pendiente'),
(2, 2, '2024-01-05', '2024-01-20', 'En Progreso'),
(3, 3, '2024-01-10', '2024-01-25', 'Finalizado'),
(1, 4, '2024-02-01', '2024-02-10', 'Pendiente');

CREATE TABLE Venta (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    id_equipo INT,
    id_cliente INT,
    fecha_venta DATE NOT NULL,
    monto_total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_equipo) REFERENCES EquipoMarino(id_equipo),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

INSERT INTO Venta (id_equipo, id_cliente, fecha_venta, monto_total) VALUES
(1, 1, '2024-03-01', 150000.00),
(2, 2, '2024-03-05', 500000.00),
(3, 3, '2024-03-10', 75000.00),
(1, 4, '2024-03-15', 150000.00);

CREATE TABLE Proveedor (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    contacto VARCHAR(100) NOT NULL,
    telefono VARCHAR(50) NOT NULL
);

INSERT INTO Proveedor (nombre, contacto, telefono) VALUES
('Marítimos S.A.', 'Carlos Ruiz', '900346241'),
('Marine', 'Ana Torres', '952413245'),
('Equipos Ltda.', 'Luis Gómez', '983000124'),
('Tecnología Marina', 'Sofia Morales', '987333241');
