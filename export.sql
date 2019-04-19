--------------------------------------------------------
-- Archivo creado  - viernes-abril-19-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMPRESA
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."EMPRESA" 
   (	"ID" NUMBER(19,0), 
	"DIRECCION_FACTURACION" VARCHAR2(255 BYTE), 
	"NOMBRE_EMPRESA" VARCHAR2(255 BYTE), 
	"RAZON_SOCIAL" VARCHAR2(255 BYTE), 
	"TELEFONO" NUMBER(10,0), 
	"REPRESENTANTE_LEGAL" NUMBER(19,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ESTADIA
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."ESTADIA" 
   (	"ID" NUMBER(19,0), 
	"FECHA_CHECK_OUT" DATE, 
	"FECHA_CHECK_IN" DATE, 
	"HABITACION" NUMBER(19,0), 
	"HUESPED" NUMBER(19,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ESTADO_HABITACION
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."ESTADO_HABITACION" 
   (	"ID" NUMBER(19,0), 
	"ESTADO_HABITACION" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HABITACION
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."HABITACION" 
   (	"ID" NUMBER(19,0), 
	"ESTADO_HABITACION" NUMBER(19,0), 
	"TIPO_HABITACION" NUMBER(19,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HUESPED
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."HUESPED" 
   (	"ID" NUMBER(19,0), 
	"APELLIDO_MATERNO" VARCHAR2(255 BYTE), 
	"APELLIDO_PATERNO" VARCHAR2(255 BYTE), 
	"EMAIL" VARCHAR2(255 BYTE), 
	"FECHA_NACIMIENTO" DATE, 
	"NOMBRE" VARCHAR2(255 BYTE), 
	"RUT" VARCHAR2(255 BYTE), 
	"TELEFONO" NUMBER(10,0), 
	"EMPRESA" NUMBER(19,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table REPRESENTANTE_LEGAL
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" 
   (	"ID" NUMBER(19,0), 
	"APELLIDO_MATERNO" VARCHAR2(255 BYTE), 
	"APELLIDO_PATERNO" VARCHAR2(255 BYTE), 
	"EMAIL" VARCHAR2(255 BYTE), 
	"NOMBRE" VARCHAR2(255 BYTE), 
	"RUT" VARCHAR2(255 BYTE), 
	"TELEFONO" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIPO_HABITACION
--------------------------------------------------------

  CREATE TABLE "C##PORTAFOLIO"."TIPO_HABITACION" 
   (	"ID" NUMBER(19,0), 
	"CAPACIDAD_HABITACION" NUMBER(10,0), 
	"PRECIO_HABITACION" NUMBER(10,0), 
	"TIPO_HAB" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into C##PORTAFOLIO.EMPRESA
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.ESTADIA
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.ESTADO_HABITACION
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.HABITACION
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.HUESPED
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.REPRESENTANTE_LEGAL
SET DEFINE OFF;
REM INSERTING into C##PORTAFOLIO.TIPO_HABITACION
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SYS_C007481
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007481" ON "C##PORTAFOLIO"."EMPRESA" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007492
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007492" ON "C##PORTAFOLIO"."ESTADIA" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007473
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007473" ON "C##PORTAFOLIO"."ESTADO_HABITACION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007475
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007475" ON "C##PORTAFOLIO"."HABITACION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007484
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007484" ON "C##PORTAFOLIO"."HUESPED" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007487
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007487" ON "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007478
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##PORTAFOLIO"."SYS_C007478" ON "C##PORTAFOLIO"."TIPO_HABITACION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table EMPRESA
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."EMPRESA" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."EMPRESA" MODIFY ("TELEFONO" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."EMPRESA" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ESTADIA
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."ESTADIA" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."ESTADIA" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ESTADO_HABITACION
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."ESTADO_HABITACION" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."ESTADO_HABITACION" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table HABITACION
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."HABITACION" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."HABITACION" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table HUESPED
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."HUESPED" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."HUESPED" MODIFY ("TELEFONO" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."HUESPED" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table REPRESENTANTE_LEGAL
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" MODIFY ("TELEFONO" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIPO_HABITACION
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."TIPO_HABITACION" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##PORTAFOLIO"."TIPO_HABITACION" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EMPRESA
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."EMPRESA" ADD CONSTRAINT "FKEX9AQ6S4N49W6LGUTDHRFPPHC" FOREIGN KEY ("REPRESENTANTE_LEGAL")
	  REFERENCES "C##PORTAFOLIO"."REPRESENTANTE_LEGAL" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ESTADIA
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."ESTADIA" ADD CONSTRAINT "FKKE0MDGG568K45I064S1KJCO8T" FOREIGN KEY ("HABITACION")
	  REFERENCES "C##PORTAFOLIO"."HABITACION" ("ID") ENABLE;
  ALTER TABLE "C##PORTAFOLIO"."ESTADIA" ADD CONSTRAINT "FKN4QYGYSLWERVQ1X59FC694K4I" FOREIGN KEY ("HUESPED")
	  REFERENCES "C##PORTAFOLIO"."HUESPED" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table HABITACION
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."HABITACION" ADD CONSTRAINT "FK9IHUBODMEYMK811QN86MCK52U" FOREIGN KEY ("ESTADO_HABITACION")
	  REFERENCES "C##PORTAFOLIO"."ESTADO_HABITACION" ("ID") ENABLE;
  ALTER TABLE "C##PORTAFOLIO"."HABITACION" ADD CONSTRAINT "FKJF5YWJG70WRRW184E1KM58CS2" FOREIGN KEY ("TIPO_HABITACION")
	  REFERENCES "C##PORTAFOLIO"."TIPO_HABITACION" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table HUESPED
--------------------------------------------------------

  ALTER TABLE "C##PORTAFOLIO"."HUESPED" ADD CONSTRAINT "FKSBQC899XU9V1MKXGU2OLH3V02" FOREIGN KEY ("EMPRESA")
	  REFERENCES "C##PORTAFOLIO"."EMPRESA" ("ID") ENABLE;
