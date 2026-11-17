SELECT USER(), @@hostname, NOW();
USE tienda_db;
SHOW TABLES;
DESCRIBE producto;
DESCRIBE compra;
SHOW CREATE TABLE producto;
SHOW CREATE TABLE compra;
INSERT INTO categoria (nombre) VALUES ('Periféricos');
select * from categoria;
INSERT INTO producto (nombre, precio, stock, id_categoria) VALUES ('Teclado', 25.90, 40, 1);   -- OK
select * from producto;
INSERT INTO producto (nombre, precio, stock, id_categoria) VALUES ('Fantasma', 1, 1, 99);      -- ERROR


