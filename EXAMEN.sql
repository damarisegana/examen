
CREATE SCHEMA `examen`;

CREATE TABLE `empleados` (
  `CODIGO` int(11) NOT NULL,
  `RUT` varchar(10) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `APELLIDO` varchar(20) NOT NULL,
  `CELULAR` int(11) NOT NULL,
  `EMAIL` varchar(30) NOT NULL,
  `SUELDO_BRUTO` int(11) NOT NULL,
  `EST_CIVIL` varchar(1) NOT NULL,
  `NOM_DEPTO` varchar(20) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into examen.empleados values (1, '14254684-5', 'Harry', 'Potter', 968954799, 'hpotter@gmail.com', 1200000, 'C', 'Redes');
insert into examen.empleados values (2, '14254694-5', 'Noam', 'Chomsky', 968954800, 'nchomsky@gmail.com', 120000, 'V', 'Administracion');
insert into examen.empleados values (3, '14254604-5', 'Emma', 'Goldman', 968954801, 'egoldman@gmail.com', 500000, 'S', 'Informatica');