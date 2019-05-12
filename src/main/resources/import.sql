insert into tipo_habitacion(id_tipo, capacidad_habitacion, precio_habitacion, tipo_habitacion) values (1, 10, 15000,'KING');

insert into tipo_habitacion(id_tipo, capacidad_habitacion, precio_habitacion, tipo_habitacion) values (2, 2, 15000,'SINGLE');
insert into tipo_habitacion(id_tipo, capacidad_habitacion, precio_habitacion, tipo_habitacion) values (3, 4, 15000,'DOBLE');

insert into estado_habitacion(id_estado, estado_habitacion) values (1, 'Disponible');
insert into estado_habitacion(id_estado, estado_habitacion) values (2, 'No Disponible. En Mantencion');
insert into estado_habitacion(id_estado, estado_habitacion) values (3, 'No Disponible. Asignada');

insert into habitacion (id_habitacion, estadohabitacion, tipohabitacion) values(1,1,1);

insert into habitacion (id_habitacion, estadohabitacion, tipohabitacion) values(2,null,null);
