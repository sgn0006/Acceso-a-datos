DROP DATABASE IF EXISTS tienda;
CREATE DATABASE IF NOT EXISTS tienda;
USE tienda;

 -- paso2
CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre     VARCHAR(30)  NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    ciudad     VARCHAR(30)  NOT NULL,
    email      VARCHAR(100)
);

CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre      VARCHAR(60) NOT NULL,
    categoria   VARCHAR(30),
    marca       VARCHAR(30) NOT NULL,
    precio      DECIMAL(8,2) NOT NULL,
    stock       INT DEFAULT 0
);

CREATE TABLE proveedor (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre       VARCHAR(60) NOT NULL,
    ciudad       VARCHAR(60) NOT NULL,
    telefono     VARCHAR(15)
);


CREATE TABLE compra (
    id_compra    INT AUTO_INCREMENT PRIMARY KEY,
    id_proveedor INT NOT NULL,
    id_producto  INT NOT NULL,
    fecha        DATE NOT NULL,
    cantidad     INT NOT NULL,
    coste        DECIMAL(8,2) NOT NULL,
    FOREIGN KEY (id_proveedor) REFERENCES proveedor (id_proveedor),
    FOREIGN KEY (id_producto)  REFERENCES producto (id_producto)
);

CREATE TABLE venta (
    id_venta    INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente  INT NOT NULL,
    id_producto INT NOT NULL,
    fecha       DATE NOT NULL,
    cantidad    INT NOT NULL,
    FOREIGN KEY (id_cliente)  REFERENCES cliente (id_cliente),
    FOREIGN KEY (id_producto) REFERENCES producto (id_producto)
);

-- paso3

ALTER TABLE cliente ADD COLUMN telefono VARCHAR(9);
ALTER TABLE cliente RENAME COLUMN telefono TO movil;
ALTER TABLE cliente MODIFY COLUMN movil VARCHAR(15);
DESCRIBE cliente;
ALTER TABLE cliente DROP COLUMN movil;
DESCRIBE cliente;


CREATE INDEX idx_ciudad ON cliente (ciudad);
SHOW INDEX FROM cliente;
DROP INDEX idx_ciudad ON cliente;
SHOW INDEX FROM cliente;

-- paso 4

INSERT INTO cliente (nombre, direccion, ciudad, email)
VALUES ('Juan Lopez', 'C/Andalucia nº 2', 'Badajoz', 'juan.lopez@davante.org');

INSERT INTO proveedor (nombre, ciudad, telefono) VALUES
 ('HP','Madrid','915000001'),
 ('Lenovo','Barcelona','934000002'),
 ('Logitech','Valencia','963000003'),
 ('TechMayorista','Malaga','952000004');

INSERT INTO producto (nombre, categoria, marca, precio, stock) VALUES
 ('Portatil HP 15','Portatiles', 'HP',549.00, 15),
 ('Portatil Lenovo IdeaPad','Portatiles','Lenovo',479.00, 20);

INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES
 (1, 1, '2026-09-01', 1),
 (1, 2, '2026-09-01', 1);
 
 
 -- 1Menos valores que columnas:
INSERT INTO cliente VALUES ('x', 'y', 'z');

-- 2) Un texto donde va un número:
INSERT INTO producto (nombre, marca, precio) VALUES ('Raton', 'Logitech', 'barato');

-- 3) Clave foránea inexistente (el cliente 99 no existe):
INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (99, 1, '2026-10-10', 1);

-- 4) Falta una columna obligatoria (NOT NULL):
INSERT INTO cliente (nombre, email) VALUES ('Marta', 'marta@davante.org');


-- paso 5

INSERT INTO cliente (nombre, direccion, ciudad, email) VALUES
 ('Pepe Tejada',      'Avda. de Sevilla 12',  'Sevilla',   'pepe.tejada@davante.org'),
 ('Victor Fernandez', 'C/Mayor 5',            'Jaen',      NULL),
 ('Jose Assensio',    'C/Huesca 8',           'Huesca',    'jose.assensio@davante.org'),
 ('Leo Perez',        'Plaza Mayor 1',        'Orense',    NULL),
 ('Patricia Aranda',  'Paseo de Gracia 20',   'Barcelona', 'patricia.aranda@davante.org'),
 ('David Lopez',      'Gran Via 45',          'Madrid',    'david.lopez@davante.org'),
 ('Enrique Ferreras', 'C/Larios 3',           'Malaga',    'enrique.ferreras@davante.org'),
 ('Luis Guzman',    'C/Colon 18',           'Valencia',  NULL);

INSERT INTO producto (nombre, categoria, marca, precio, stock) VALUES
 ('Monitor Samsung 24',    'Monitores',      'Samsung',  139.90,  30),
 ('Raton Logitech M185',   'Perifericos',    'Logitech',  14.90, 100),
 ('Teclado Logitech K120', 'Perifericos',    'Logitech',  12.50,  80),
 ('Impresora HP DeskJet',  'Impresoras',     'HP',        69.00,  25),
 ('Disco SSD 1TB',         'Almacenamiento', 'Kingston',  74.90,  45),
 ('Pendrive 64GB',         'Almacenamiento', 'Kingston',   8.90, 150);

INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES
 (2, 3, '2026-09-01', 2),
 (2, 5, '2026-09-01', 1),
 (1, 7, '2026-09-15', 1),
 (1, 6, '2026-09-15', 1),
 (5, 2, '2026-09-20', 1),
 (5, 4, '2026-09-20', 1),
 (5, 5, '2026-09-20', 1),
 (7, 6, '2026-10-01', 2),
 (7, 8, '2026-10-01', 3),
 (2, 4, '2026-10-05', 2),
 (2, 7, '2026-10-05', 1);

INSERT INTO compra (id_proveedor, id_producto, fecha, cantidad, coste) VALUES
 (1, 1, '2026-08-25',  20, 430.00),
 (1, 6, '2026-08-25',  30,  48.00),
 (2, 2, '2026-08-26',  25, 380.00),
 (3, 4, '2026-08-27', 120,   9.50),
 (3, 5, '2026-08-27', 100,   7.80),
 (4, 3, '2026-08-28',  40, 105.00),
 (4, 4, '2026-08-28',  50,  10.20),
 (4, 7, '2026-08-29',  60,  58.00),
 (4, 8, '2026-08-29', 200,   5.20);
 
 
 SELECT * FROM cliente;
SELECT * FROM producto;
SELECT COUNT(*) AS ventas FROM venta;
SELECT COUNT(*) AS compras FROM compra;

-- paso 6


INSERT INTO cliente (nombre, direccion, ciudad, email)
VALUES ('Ana Ruiz', 'C/Sol 7', 'Malaga', 'ana.ruiz@davante.org');

INSERT INTO cliente (nombre, direccion, ciudad, email)
VALUES ('Luis Soto', 'C/Luna 9', 'Granada', 'luis.soto@davante.org');

SELECT id_cliente, nombre, ciudad FROM cliente WHERE id_cliente > 8;

-- paso 7

UPDATE cliente SET ciudad = 'Cordoba' WHERE id_cliente = 3;
SELECT id_cliente, nombre, ciudad FROM cliente WHERE id_cliente = 3;


UPDATE producto SET stock = stock + 5, precio = 529.00 WHERE id_producto = 1;
UPDATE producto SET precio = precio * 1.10 WHERE id_producto = 4;
SELECT id_producto, nombre, precio, stock FROM producto WHERE id_producto IN (1, 4);


UPDATE cliente SET ciudad = 'Cordoba' WHERE ciudad = 'Jaen';


UPDATE cliente SET ciudad = 'Jaen' WHERE id_cliente = 3;
SELECT id_cliente, nombre, ciudad FROM cliente WHERE id_cliente = 3;


-- paso 8

REPLACE INTO producto (id_producto, nombre, categoria, marca, precio, stock)
VALUES (9, 'Alfombrilla raton', 'Perifericos', 'Logitech', 4.90, 60);

SELECT * FROM producto WHERE id_producto = 9;


REPLACE INTO producto (id_producto, nombre, categoria, marca, precio)
VALUES (9, 'Alfombrilla raton XL', 'Perifericos', 'Logitech', 9.90);

SELECT * FROM producto WHERE id_producto = 9;


REPLACE INTO producto (id_producto, nombre, categoria, marca, precio, stock)
VALUES (4, 'Raton Logitech M185 negro', 'Perifericos', 'Logitech', 15.90, 100);


-- paso 9


DELETE FROM cliente WHERE id_cliente IN (10, 11);
SELECT COUNT(*) AS clientes FROM cliente;

DELETE FROM cliente WHERE id_cliente = 1;

DELETE FROM producto WHERE id_producto = 9;
SELECT COUNT(*) AS productos FROM producto;


-- paso 10

SELECT * FROM cliente;
SELECT nombre, ciudad FROM cliente;
SELECT nombre AS Producto, precio AS Precio FROM producto;


SELECT marca FROM producto;
SELECT DISTINCT marca FROM producto;
SELECT DISTINCT categoria FROM producto;


-- Paso 11


SELECT nombre, precio FROM producto WHERE precio > 100;
SELECT nombre, precio FROM producto WHERE precio >= 74.90;
SELECT nombre, precio FROM producto WHERE precio < 15;
SELECT nombre, marca FROM producto WHERE marca = 'HP';
SELECT nombre, marca FROM producto WHERE marca <> 'HP';


SELECT id_cliente, nombre, email FROM cliente WHERE email IS NULL;
SELECT id_cliente, nombre, email FROM cliente WHERE email = NULL;
SELECT id_cliente, nombre, email FROM cliente WHERE email IS NOT NULL;


-- Paso 12

SELECT nombre FROM cliente WHERE nombre LIKE 'P%';       -- empieza por P
SELECT nombre FROM cliente WHERE nombre LIKE '%Lopez';   -- termina en Lopez
SELECT nombre FROM cliente WHERE nombre LIKE '%er%';     -- contiene "er"
SELECT nombre FROM cliente WHERE nombre LIKE '_e%';      -- segunda letra: e
SELECT nombre, email FROM cliente WHERE email LIKE '%@davante.org';

SELECT nombre, precio FROM producto WHERE nombre LIKE 'Portatil%';
SELECT nombre, marca FROM producto WHERE nombre LIKE '%Logitech%';
SELECT nombre, precio FROM producto WHERE precio BETWEEN 10 AND 100;
SELECT nombre, marca FROM producto WHERE marca IN ('HP', 'Kingston');
SELECT nombre, categoria FROM producto WHERE categoria IN ('Monitores', 'Impresoras');


-- Paso 13

SELECT nombre, precio FROM producto WHERE precio > 20 AND precio < 150;
SELECT nombre, marca FROM producto WHERE marca = 'HP' OR marca = 'Lenovo';
SELECT nombre, categoria FROM producto WHERE NOT categoria = 'Portatiles';


-- Sin paréntesis: AND se evalúa antes que OR
SELECT nombre, marca, precio FROM producto WHERE marca = 'HP' OR marca = 'Logitech' AND precio < 20;

-- Con paréntesis: primero el OR
SELECT nombre, marca, precio FROM producto WHERE (marca = 'HP' OR marca = 'Logitech') AND precio < 20;


-- Paso 14

SELECT nombre, precio FROM producto ORDER BY precio;
SELECT nombre, precio FROM producto ORDER BY precio DESC;

SELECT categoria, nombre, precio FROM producto ORDER BY categoria ASC, precio ASC;

SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 3;
SELECT nombre, ciudad FROM cliente ORDER BY nombre;

-- paso 15

SELECT *
FROM producto
WHERE precio > 100
ORDER BY nombre ASC;

SELECT nombre, marca, precio
FROM producto
WHERE precio BETWEEN 10 AND 150
ORDER BY nombre DESC;


-- paso 16

SELECT v.id_venta, v.fecha, c.nombre AS cliente, p.nombre AS producto,
       v.cantidad, v.cantidad * p.precio AS importe
FROM venta v
JOIN cliente c  ON v.id_cliente  = c.id_cliente
JOIN producto p ON v.id_producto = p.id_producto
ORDER BY v.id_venta;


SELECT v.fecha, p.nombre AS producto, v.cantidad
FROM venta v
JOIN producto p ON v.id_producto = p.id_producto
WHERE v.id_cliente = 1
ORDER BY v.fecha;


SELECT c.nombre, SUM(v.cantidad * p.precio) AS total_gastado
FROM venta v
JOIN cliente c  ON v.id_cliente  = c.id_cliente
JOIN producto p ON v.id_producto = p.id_producto
GROUP BY c.id_cliente, c.nombre
ORDER BY total_gastado DESC;


SELECT p.nombre AS producto, pr.nombre AS proveedor
FROM compra c
JOIN producto p   ON c.id_producto  = p.id_producto
JOIN proveedor pr ON c.id_proveedor = pr.id_proveedor
ORDER BY p.nombre, pr.nombre;

-- paso 17 

SELECT id_producto, nombre, stock FROM producto WHERE id_producto IN (1, 4);
SELECT COUNT(*) AS ventas FROM venta;


START TRANSACTION;

INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (3, 1, '2026-10-10', 1);
INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (3, 4, '2026-10-10', 2);
UPDATE producto SET stock = stock - 1 WHERE id_producto = 1;
UPDATE producto SET stock = stock - 2 WHERE id_producto = 4;

-- Dentro de la transacción vemos los cambios:
SELECT id_producto, nombre, stock FROM producto WHERE id_producto IN (1, 4);
SELECT COUNT(*) AS ventas FROM venta;

ROLLBACK;

-- Tras el ROLLBACK todo ha vuelto atrás:
SELECT id_producto, nombre, stock FROM producto WHERE id_producto IN (1, 4);
SELECT COUNT(*) AS ventas FROM venta;


START TRANSACTION;

INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (3, 1, '2026-10-10', 1);
INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (3, 4, '2026-10-10', 2);
UPDATE producto SET stock = stock - 1 WHERE id_producto = 1;
UPDATE producto SET stock = stock - 2 WHERE id_producto = 4;

COMMIT;

SELECT id_producto, nombre, stock FROM producto WHERE id_producto IN (1, 4);
SELECT id_venta, id_cliente, id_producto, fecha, cantidad FROM venta ORDER BY id_venta DESC LIMIT 2;


START TRANSACTION;

UPDATE producto SET precio = 519.00 WHERE id_producto = 1;   -- Portatil HP
SAVEPOINT despues_del_portatil;
UPDATE producto SET precio = 149.90 WHERE id_producto = 4;   -- Raton (error de tecleo)

SELECT id_producto, nombre, precio FROM producto WHERE id_producto IN (1, 4);

ROLLBACK TO despues_del_portatil;                            -- deshace solo lo posterior al savepoint

SELECT id_producto, nombre, precio FROM producto WHERE id_producto IN (1, 4);

COMMIT;                                                       -- guardamos lo que queda (el precio del portatil)


-- paso 18


CREATE TABLE producto_caro LIKE producto;
INSERT INTO producto_caro SELECT * FROM producto WHERE precio > 100;
SELECT * FROM producto_caro;

RENAME TABLE producto_caro TO productos_destacados;
SHOW TABLES;


DELETE FROM productos_destacados WHERE id_producto > 0;
INSERT INTO productos_destacados (nombre, marca, precio) VALUES ('Prueba 1', 'HP', 5.00);
SELECT id_producto, nombre FROM productos_destacados;

TRUNCATE TABLE productos_destacados;
INSERT INTO productos_destacados (nombre, marca, precio) VALUES ('Prueba 2', 'HP', 5.00);
SELECT id_producto, nombre FROM productos_destacados;

DROP TABLE productos_destacados;
DROP TABLE IF EXISTS productos_destacados;
SHOW TABLES;

-- Ejercicios Pospuestos


-- 1
SELECT nombre, stock FROM producto WHERE stock < 30 ORDER BY stock;

-- 2
SELECT * FROM cliente WHERE ciudad LIKE 'M%';


-- 3
SELECT * FROM cliente WHERE email IS NULL ORDER BY nombre;

-- 4
SELECT nombre, marca, precio FROM producto WHERE marca = 'Logitech' AND precio < 14;


-- 5
UPDATE producto SET precio = precio * 1.10 WHERE id_producto IN (5, 8);
SELECT id_producto, nombre, precio FROM producto WHERE id_producto IN (5, 8);


-- 6
INSERT INTO proveedor (nombre, ciudad, telefono) VALUES ('Kingston', 'Sevilla', '954000005');
INSERT INTO compra (id_proveedor, id_producto, fecha, cantidad, coste)
VALUES (LAST_INSERT_ID(), 8, '2026-10-12', 100, 5.00);
SELECT * FROM compra WHERE fecha = '2026-10-12';


-- 7
SELECT pr.nombre AS proveedor, SUM(c.cantidad * c.coste) AS total_gastado
FROM compra c
JOIN proveedor pr ON c.id_proveedor = pr.id_proveedor
GROUP BY pr.nombre
ORDER BY total_gastado DESC;