select * from tab;

desc board2;

alter table board2 modify bhit number(4) not null;

select bhit from board2;

update board2 set bhit=1;

select * from board2;

alter table board2 modify bindent number(4) unique;

insert into board2 values(
4,'aaa','제목1','내용1',sysdate,1,1,1,2);

alter table board modify no number(4) primary key;

desc board;

select * from board;



select * from member;

desc member;


desc member;

alter table board
add constraint fk_id foreign key(id) references member(id);

create table board3 (
no number(4) primary key,
title varchar2(30) not null,
content varchar2(2000),
userid varchar2(20) references member(id),
bdate date
);

insert into board3 values(
1,'제목입니다.1','내용','aaa',sysdate
);

select * from member;

insert into board3 values(
2,'제목입니다.1','내용','aaa',sysdate
);

insert into board3 values(
3,'제목입니다.1','내용','ggg',sysdate
);

commit;

create table board4 (
no number(4) primary key,
title varchar2(30) not null,
content varchar2(2000),
userid varchar2(30),
bdate date,
constraint fk_userid foreign key(userid) references member(id) );

insert into board4 values(
3,'제목1','내용1','abc',sysdate);

select * from board4;

drop board4;
drop table board4;

drop table board3;
alter table board
add constraint fk_user foreign key (userid) references member(id);

desc board;

alter table board
add constraint fk_userid 
foreign key(userid) references member(id);

desc member;

alter table member modify id varchar2(20) primary key;


drop table board2;

create table emp01(
empno number(4) primary key,
ename varchar2(20) not null,
jobid varchar(9),
salary number(7,2) check(salary between 500 and 5000),
gender varchar2(1) check(gender in('M','F'))
);

insert into emp01 values(
5,'이순신','30',4000,'M');

commit;

create table board2(
no number(4),
title varchar2(30) default '제목',
content varchar2(2000) default '내용',
userid varchar2(20),
constraint fk_board2_userid foreign key(userid) references member(id)
);

insert into board2 (no,userid) values(1,'aaa');

select * from board2;

-- dept01 테이블 departments
-- department_id,department_name

--,loc varchar2(10) default 'seoul'

create table dept01
as select department_id,department_name from departments;

alter table dept01
add(loc varchar2(10) default 'seoul');

select * from dept01;

alter table emp01
rename column jobid to deptid;

-- departments department_id

alter table emp01
add constraint fk_emp01_deptid foreign key(deptid) references departments(department_id);

desc departments;

desc emp01;

alter table emp01
modify deptid number(6);

select * from emp01;

create table emp02
as 
select * from emp01 where 1=2;

alter table emp02 modify deptid number(6);

desc emp02;

insert into emp02
select empno,ename,to_number(deptid),salary,gender from emp01;

select * from emp02;

drop table emp01;

rename emp02 to emp01;

select * from emp01;

alter table emp01
add constraint fk_emp01_deptid foreign key(deptid) references departments(department_id);

desc member;


