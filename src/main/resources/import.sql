
insert into estados_habitaciones ( estado)VALUES('Disponible');
insert into estados_habitaciones ( estado)VALUES('Asignada');
insert into estados_habitaciones ( estado)VALUES('Mantencion');

insert into estados_estadia ( estado) VALUES('Cancelada');
insert into estados_estadia ( estado) VALUES('En Reserva');
insert into estados_estadia (estado) VALUES('Iniciada');
insert into estados_estadia ( estado) VALUES('Periodo Facturacion');
insert into estados_estadia ( estado) VALUES('Finalizada');


insert into estados_ordenes_de_compras (estado) VALUES('Por facturar');
insert into estados_ordenes_de_compras (estado) VALUES('Finalizada');

insert into tipos_habitaciones( tipo, precio, capacidad) VALUES('King', 15000,5);

insert into habitaciones ( cupo, estado_habitacion, tipo_habitacion) VALUES (5,2,1);
