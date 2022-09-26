use master
go

--- Pregunta 1

create database BDLibreria
on
(
Name=BDLibreria_Data, Filename='C:\biblioteca\BDLibreria_Data.MDF',
Size=20MB, MaxSize=200MB, Filegrowth=70%
)
Log on
(
Name=BDLibreria_Log, Filename='C:\biblioteca\BDLibreria_Log.LDF',
Size=20MB, MaxSize=200MB, Filegrowth=70%
)
Go

use BDLibreria
go


--- Pregunta 2

Create table Libro
(
Codigo varchar(20) not null Primary Key ,
Titulo varchar (200),
ISBN varchar(100),
Descripcion varchar (300),
Resumen varchar (300),
Año_edicion int,
Cod_editorial varchar(20)
)
Go

Create table Autor_Libro
(
Cod_libro varchar(20),
Cod_Autor varchar(20)
)
Go

Create table Autor
(
Codigo varchar(20) not null primary Key,
Nombres varchar (100),
Apellidos varchar (100),
Nacionalidad varchar (70)
)
Go

Create table Ejemplar
(
Cod_libro varchar(20),
Ubicacion varchar (70),
Estado varchar (50)
)
Go

Create table Editorial
(
Codigo varchar(20) not null primary key,
Nombre varchar (50),
Pais varchar (50)
)
Go

alter table Libro add foreign key (Cod_editorial) references Editorial(Codigo);
alter table Autor_Libro add foreign key (Cod_libro) references Libro(Codigo);
alter table Autor_Libro add foreign key (Cod_Autor) references Autor(Codigo);
alter table Ejemplar add foreign key (Cod_libro) references Libro(Codigo);


drop table Libro;
drop table Autor_Libro;
drop table Autor;
drop table Ejemplar;
drop table Editorial;


--- Pregunta 3

Insert Editorial values ('ED01', 'Thomson internacional', 'España');
Insert Editorial values ('ED02', 'Omega', 'Mexico');
Insert Editorial values ('ED03', 'La Funte de la Sabiduria', 'Colombia');
Insert Editorial values ('ED04', 'Siglo XV', 'España');
Select * from Editorial;

insert Libro values ('LB01', 'Metodologia de la programacion', '123-334-456','Sintaxis basicas de la programacion', '204 paginas', 2000, 'ED02');
insert Libro values ('LB02', 'SQL Server 2005', '345-678-076','Explicacion de las consultas SQL ', '798 paginas', 2005, 'ED03');
insert Libro values ('LB03', 'Como programar en C/C++', '153-567-345','Diferencias entre C y C++', '156 paginas', 1997, 'ED02');
insert Libro values ('LB04', 'Aprender PHP en 30 dias', '234-345-987','Sintaxis PHP para crear paginas web dinamicas', '200 paginas', 2005, 'ED01');
insert Libro values ('LB05', 'SQL Server 2008', '789-255-487','Administracion de Base de datos', '150 paginas', 2008, 'ED03');
insert Libro values ('LB07', 'CSS y HTML', '652-414-111','Creacion de paginas Web y hojas de estilo', '350paginas', 2007, 'ED01');
Select * from Libro;

Insert Ejemplar values ('LB01', 'Estante 1', 'Prestado');
Insert Ejemplar values ('LB02', 'Estante 2', 'Disponible');
Insert Ejemplar values ('LB02', 'Estante 2', 'Reservado');
Insert Ejemplar values ('LB03', 'Estante 3', 'Prestado');
Insert Ejemplar values ('LB04', 'Estante 4', 'Disponible');
Insert Ejemplar values ('LB02', 'Estante 2', 'Reservado');
Insert Ejemplar values ('LB04', 'Estante 4', 'Prestado');
Insert Ejemplar values ('LB01', 'Estante 1', 'Disponible');
Insert Ejemplar values ('LB02', 'Estante 2', 'Reservado');
Insert Ejemplar values ('LB03', 'Estante 3', 'Prestado');
Insert Ejemplar values ('LB01', 'Estante 1', 'Disponible');
Insert Ejemplar values ('LB05', 'Estante 5', 'Disponible');
Insert Ejemplar values ('LB06', 'Estante 5', 'Prestado');
Insert Ejemplar values ('LB06', 'Estante 5', 'Disponible');
Select * from Ejemplar;

Insert Autor values ('AU01', 'Jose Pedro', 'Alvarado', 'Española');
Insert Autor values ('AU02', 'Maria Teresa', 'Rivas', 'Mexicano');
Insert Autor values ('AU03', 'Julio Carlos', 'Fernandez', 'Colombiano');
Insert Autor values ('AU04', 'Alexander', 'Rodriguez', 'Mexicano');
Insert Autor values ('AU05', 'Juan Manuel', 'Artiga', 'Colombiano');
Select * from Autor;

Insert Autor_Libro values('LB01', 'AU02');
Insert Autor_Libro values('LB01', 'AU04');
Insert Autor_Libro values('LB02', 'AU01');
Insert Autor_Libro values('LB03', 'AU05');
Insert Autor_Libro values('LB03', 'AU03');
Insert Autor_Libro values('LB04', 'AU02');
Insert Autor_Libro values('LB04', 'AU04');
Select * from Autor_Libro;


-- Crear sp de registro de datos para tabla Ejemplar.
Create procedure sp_ingresoEjemplar
@Codlib varchar(20),
@Ubi varchar (70),
@Est varchar (50)
as 
Begin
	Begin Try
	If @Est = 'Disponible' OR @Est = 'Prestado' OR @Est = 'Reservado' 
		insert into dbo.Ejemplar 
		values (@Codlib, @Ubi, @Est)
	Else
		RaisError ('Error... Solo puede registrar estados: Disponible, Prestado o Reservado. Revise!!', 16, 1)

	End Try
	Begin Catch 
		Print Error_message()
	End Catch
end

--Comprobación
Exec sp_ingresoEjemplar 'LB01', 'Estante 2', 'Disponibless'

select * from dbo.Ejemplar order by Cod_libro asc


-- Crear sp de registro de datos para tabla Libro.
Alter procedure sp_ingresoLibro
@Cod varchar(20),
@Tit varchar (200),
@ISBN varchar (100),
@Des varchar (300),
@Res varchar (300),
@AñoEdi int,
@CodEdi varchar (20)
as 
Begin
	Begin Try
	If @AñoEdi > 1995
		insert into dbo.Libro 
		values (@Cod, @Tit, @ISBN, @Des, @Res, @AñoEdi, @CodEdi)
	Else
		RaisError ('Error... Solo puede registrar libros con años de edición mayor a 1995. Revisar...!!', 16, 1)

	End Try
	Begin Catch 
		Print Error_message()
	End Catch
end

--Comprobación
Exec sp_ingresoLibro 'LB08', 'SQL 2022', '999-333-134', 'Sintaxis SQL', '100 páginas', '1996', 'ED02'

select * from dbo.Libro order by Codigo asc


/************************
*****  PREGUNTA 4 *******
************************/
-- Crear TIGGER_MESSAGE para Insert y Update de tabla Libro.
alter trigger nueva_transac_libro
		on Libro for insert, update
		as
		begin
		print 'Tabla: Libro. se ha realizado una transaccion.'
		end

--Comprobación
insert Libro values ('LB10', 'CSS y HTML', '652-414-111','Creacion de paginas Web y hojas de estilo', '350paginas', 2007, 'ED01');

Select * from Libro;


/************************
*****  PREGUNTA 5 *******
************************/

-- Crear sp de registro de datos para tabla Ejemplar.
Alter procedure sp_ConsultaLibro_X_Autor
@NomAut varchar(100)
as 
Begin

If Exists (Select * from Autor where upper(Nombres) = upper(@NomAut))
	select l.Codigo, l.Titulo, l.Descripcion, l.Resumen, a.Nombres, a. Apellidos, a.Nacionalidad 
	from Libro l 
	join Autor_Libro al on l.Codigo=al.Cod_libro
	join Autor a on al.Cod_Autor=a.Codigo AND upper(a.Nombres) = upper(@NomAut)

Else
	Raiserror ('El nombre del autor %s no existe. Revisar.', 16, 1, @NomAut);

end


--Comprobación

Exec sp_ConsultaLibro_X_Autor 'Alexanders'



/************************
*****  PREGUNTA 6 *******
************************/

-- Crear sp de registro de datos para tabla Ejemplar.
Create procedure sp_ConsultaLibro_X_Codigo
@Cod varchar(20)
as 
Begin

	select l.Titulo AS 'LIBRO', l.ISBN AS 'ISBN', 
			l.Año_edicion AS 'AñoEdicion', 
			year(getdate()) - l.Año_edicion AS 'AñosTranscurridos',
			a.Nombres AS 'NombreAutor', 
			e.Nombre AS 'NombreEditorial', ej.Estado AS 'Estado',
			ej.Ubicacion AS 'Ubicación'
	from Libro l 
	join Autor_Libro al on l.Codigo=al.Cod_libro
	join Autor a on al.Cod_Autor=a.Codigo
	join Editorial e on l.Cod_editorial=e.Codigo
	join Ejemplar ej on l.Codigo=al.Cod_libro
	where l.Codigo = @Cod

end


--Comprobación

Exec sp_ConsultaLibro_X_Codigo 'LB02'