create database hospital_management_system;
use hospital_management_system;

create table login(
ID varchar(20),
PW varchar(20)
);
select * from login;
insert into login
values("root", "VENECEDOr_01");

create table patient_info(
ID varchar(20),
Number varchar(40),
Name varchar(20),
Gender varchar(20),
Patient_Disease varchar(20), 
Room_Number varchar(20),
Time varchar(20),
Deposit varchar(20)
);
select * from patient_info;


create table Room(room_no varchar(20), Availability varchar(20), Price varchar(20), Room_Type varchar(100));
select * from Room;

insert into Room 
values
("100", "Available", "500", "G Bed 1"),
("101", "Available", "500", "G Bed 2"),
("102", "Available", "500", "G Bed 3"),
("103", "Available", "500", "G Bed 4"),
("200", "Available", "1500", "Private Room"),
("201", "Available", "1500", "Private Room"),
("202", "Available", "1500", "Private Room"),
("203", "Available", "1500", "Private Room"),
("300", "Available", "3500", "ICU Bed 1"),
("301", "Available", "3500", "ICU Bed 2"),
("302", "Available", "3500", "ICU Bed 3"),
("303", "Available", "3500", "ICU Bed 4"),
("304", "Available", "3500", "ICU Bed 5"),
("305", "Available", "3500", "ICU Bed 6");

select * from Room;

ALTER TABLE patient_info MODIFY COLUMN Time VARCHAR(50); -- Adjust length as needed

create table department(Department varchar(100), Phone_no varchar(20));
select * from department;

insert into department 
values
("Surgical department", "123456789"),
("Nursing department", "123456789"),
("Operation theater complex (OT)", "123456789"),
("Paramedical department", "123456789");


create table EMP_INFO(Name varchar(20), Age varchar(20), Phone_Number varchar(20), salary varchar(20), Gmail varchar(20), Aadhar_Number varchar(20));
select * from EMP_INFO;

insert into EMP_INFO
values
("Doctors1" ,"30", "123456789", "50000", "gr@gmail.com", "123456789101"), 
("Doctors2" ,"30", "123456789", "50000", "gr@gmail.com", "123456789101");

create table Ambulance(Name varchar(20), Gender varchar(20), Car_Name varchar(20), Available varchar(20), Location varchar(20));
insert into Ambulance 
values 
("av", "Male", "Zen" , "Available" , "area 16");
select * from Ambulance;














