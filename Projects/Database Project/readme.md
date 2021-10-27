show databases;
create database university;
use university;
show tables;
drop table unistud;
create table Unistud
(
studId int auto_increment,
studName varchar(20) not null,
studDOB date,
studMOB varchar(10) unique,
studDept varchar(10) not null,
studYear varchar(4) not null,
studAVG varchar(3) not null,
primary key(studId)
);
desc Unistud;
insert into Unistud (studName, studDOB, studMOB, studDept, studYear, studAVG)
values('Nikita','1997-02-04','9878665534','Computer','BE',85),
('Snehal','1998-04-03','8087645533','IT','TE',90),
('Diksha','1999-12-12','9878600004','IT','TE',88),
('Supriya','1997-11-11','9845675533','IT','BE',80),
('Raj','1996-09-04','7866057866','EXTC','TE',89),
('Vrisha','1998-12-01','8087897744','Civil','BE',87),
('Tanishka','2000-03-05','9856332200','Computer','TE',70),
('Priyansh','1995-02-11','9112365534','Mechanical','BE',80),
('Aarti','1994-08-24','9877554427','IT','FE',80),
('Bhavika','1998-04-14','9119674553','Mechanical','TE',80);
select * from Unistud;

drop table Unistaff;
create table UniStaff
(
staffId int ,
staffName varchar(20) not null,
staffMOB varchar(20) unique,
staffDesg varchar(25),
staffDept varchar(10) not null,
staffSalary int not null,
primary key (staffId)
);
desc Unistaff;
insert into Unistaff values
(1,'Shalini',8756904762,'Teaching','IT',89000),
(2,'Nikhil',8756504762,'Teaching','Mech',450000),
(3,'Jasreen',7469047902,'Teaching','Extc',787000),
(4,'Janvhi',7455604761,'Teaching','IT',900000),
(5,'Tushar',8269047617,'Teaching','CS',679000),
(6,'Sheetal',7653904987,'Teaching','Commun',760000),
(7,'Mike',7187904760,'Teaching','Civil',979000),
(8,'Gaurav',9875904764,'Teaching','Aero',560000),
(9,'Girish',9875904701,'Teaching','IT',900000);
select * from Unistaff;
select * from Unistud;

select studName from Unistud where studAVG < 85;
select sum(studAVG) from Unistud where studAVG < 90;
select max(studAVG) from Unistud where studYear = 'TE';
select * from Unistud where studDept like '%a%';
select studName,studAVG, studDept ,if(studAVG >= 85,'Grade A','Grade M') as "Grade" from Unistud;

alter table Unistud add studadd varchar(45);
alter table Unistud rename column studDOB to DOB;

select * from Unistud order by studId;
select * from Unistud order by studId desc;

update Unistud set studDept='EXTC' where studId=2; 


select staffName from Unistaff where staffDept='IT' and staffSalary= 600000<80000;
select staffMOB from Unistaff;
select * from Unistaff where staffName like '%u%';
alter table Unistaff  add Dept varchar(45);
alter table Unistaff drop Dept;
desc Unistaff;
-- alter table Unistaff drop studadd;
alter table Unistaff modify staffName varchar(25);

select staffName, staffSalary, staffDept,
case 
when staffSalary > 900000 and staffSalary <= 1000000 then "Head"
when staffSalary > 700000 and staffSalary <= 900000 then "Profesor"
when staffSalary > 600000 and staffSalary <= 700000 then "Lab Assistant"
when staffSalary < 500000 then "Clerk"
else "Not correct"
end 
as "Position" 
from Unistaff;


create view Unistud_view
as
select studId, studName,studName from Unistud inner join stud on emp.id=stud.studId;
drop view emp_view;
select * from emp_view;

select * from emp;
update emp set 
salary = (case id
when 1 then 7500
when 2 then 8200
when 3 then 5000
end)
where id in (1,2,3);
select * from emp;



