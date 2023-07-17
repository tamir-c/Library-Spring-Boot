create database library;
use library;
create table book(
	book_id int primary key auto_increment,
    isbn varchar(15) not null,
    title varchar(25) not null,
    author varchar(30) not null,
    book_desc varchar(120),
    member_id smallint not null,
    foreign key(member_id) references member(member_id)
);


create table member(
	member_id smallint primary key auto_increment,
    name varchar(50) not null,
    phone_num char(11) not null,
    email varchar(50) not null,
    date_joined date not null
)

INSERT INTO `member` VALUES (1,'John Doe','07324532457','john@doe.com','2023-07-07'),(2,'Jane Doe','07324596457','jane@doe.com','2023-07-07'),(4,'Jim Doe','07324596243','jim@doe.com','2023-07-07'),(5,'Jinny Doe','07235344234','jinny@doe.com','2023-07-07');
INSERT INTO `book` VALUES (1,'978-3243-234','1984','G. Orwell','Scary',1),(2,'978-3213-234','Jane Eyre','C. Bronte','Romantic',1),(3,'978-323-124','Slime','D. Walliams','Kids',NULL);