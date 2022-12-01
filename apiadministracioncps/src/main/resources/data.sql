Insert Ignore Into Parametros(id, tarifa_admin, tarifa_servicios) values (1, 95000, 125000);

Insert Ignore Into Administrador (codigo,nombre) values ("ADM001","Administrador 1");
Insert Ignore Into Administrador (codigo,nombre) values ("ADM002","Administrador 2");

Insert Ignore Into inmueble(codigo, descripcion, es_tarifa_admin, id_residente, fecha_factura, fecha_pago) values
("Apto-11101", "Torre 1 Interior 1 Apto 101", 0, "Apto-11101", "2022-10-01", "2022-10-01"),
("Apto-11102", "Torre 1 Interior 1 Apto 102", 1, "Apto-11102", "2022-10-01", "2022-10-01"),
("Apto-11103", "Torre 1 Interior 1 Apto 103", 0, "Apto-11103", "2022-10-01", "2022-10-01"),
("Apto-12201", "Torre 1 Interior 2 Apto 201", 1, "Apto-12201", "2022-10-01", "2022-10-01"),
("Apto-12202", "Torre 1 Interior 2 Apto 202", 0, "Apto-12202", "2022-10-01", "2022-10-01"),
("Apto-12203", "Torre 1 Interior 2 Apto 203", 0, "Apto-12203", "2022-10-01", "2022-10-01"),
("Apto-21101", "Torre 2 Interior 1 Apto 101", 1, "Apto-21101", "2022-10-01", "2022-10-01"),
("Apto-21102", "Torre 2 Interior 1 Apto 102", 0, "Apto-21102", "2022-10-01", "2022-10-01"),
("Apto-21103", "Torre 2 Interior 1 Apto 103", 1, "Apto-21103", "2022-10-01", "2022-10-01"),
("Apto-22201", "Torre 2 Interior 2 Apto 201", 1, "Apto-22201", "2022-10-01", "2022-10-01"),
("Apto-22202", "Torre 2 Interior 2 Apto 202", 0, "Apto-22202", "2022-10-01", "2022-10-01"),
("Apto-22203", "Torre 2 Interior 2 Apto 203", 0, "Apto-22203", "2022-10-01", "2022-10-01");

Insert Ignore Into residente(codigo) values
("Apto-11101"),
("Apto-11102"),
("Apto-11103"),
("Apto-12201"),
("Apto-12202"),
("Apto-12203"),
("Apto-21101"),
("Apto-21102"),
("Apto-21103"),
("Apto-22201"),
("Apto-22202"),
("Apto-22203");
