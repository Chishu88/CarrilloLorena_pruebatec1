/*
-- Query: select * from empleado
LIMIT 0, 1000

-- Date: 2024-01-02 10:40
*/
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (1,'Programador','2023-06-15','Lorena',1600);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (2,'Ingeniero','2021-05-02','Diederik S.',2500);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (3,'RR.HH','2022-08-20','Miriam',1300);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (4,'Programador','2020-03-15','Rafael',1800);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (5,'RR.HH','2021-10-03','Juan',1300);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (6,'Comercial','2020-04-04','Eloisa',1300);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (7,'Programador','2023-05-01','Adriana',1400);
INSERT INTO `` (`EMPLEADOID`,`CARGO`,`FECHAINICIO`,`NOMBRE`,`SALARIO`) VALUES (9,'RR.HH','2021-05-10','Laura',1200);


use empleados;
select * from empleado;

UPDATE empleado
SET nombre = 'Lorena', salario = 1.650
WHERE empleadoId = 1;

DELETE FROM empleado
WHERE empleadoId = 9;

SELECT * FROM empleado
WHERE cargo = 'Programador';