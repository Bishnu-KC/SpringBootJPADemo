Create table person
{
id integer not null,
name varchar(255) not null,
location varchar(255)
birth_date timestamp,
primary key(id)
};

INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE)
values (100,'Bishnu Jung K C','VA',sysdate());

INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE)
values (101,'Yaman Jung K C','NY',sysdate());

INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE)
values (100,'Bhagwat Jung K C','CA',sysdate());