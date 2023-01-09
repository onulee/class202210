select department_id,salary from employees;

select to_char(sum(salary),'$999,999') from employees
where department_id=50;


select count(*) from employees;

select count(manager_id),count(*) from employees;

select manager_id from employees
where manager_id is null;

select max(salary), min(salary) from employees;

select employee_id,emp_name,salary from employees
where salary=(select min(salary) from employees);

select employee_id,emp_name,salary from employees
where salary=(select max(salary) from employees);


select to_char(65) from dual;

select 65+1 from dual;

select sysdate from dual;

select sysdate,to_char(sysdate,'yyyy-mm-dd am hh:mi:ss') from dual;

select round(sysdate-to_date(19810101,'yyyymmdd'),2) from dual;

select * from employees;

select * from employees
where lower(emp_name) = 'david lee';

select emp_name,ltrim(emp_name,'D') from employees;

select * from employees;

-- A1001,A1002,A1003....

select emp_name,substr(emp_name,5,2) from employees;

select * from employees;

select substr(phone_number,5,8) from employees;

select length(phone_number) from employees;
select round(avg(length(emp_name)),2) from employees;


-- 모든 사원의 수와 월급의 합을 출력하시오.
select count(*) as "사원수",sum(salary) as "월급" from employees;

-- 부서50에서 최대월급 최소월급을 출력하시오.
select max(salary),min(salary) from employees
where department_id=50;

select department_id,max(salary),min(salary) from employees
group by department_id
order by department_id;

select * from employees;

select to_char(hire_date,'yyyy"년 "mm"월 "dd"일 "day') from employees
where emp_name='Donald OConnell';


-- 202 월급 달러, 1248원  원화표시 ￦02,845,012 형태로 출력

select to_char(salary*1248*12,'L00,000,000') from employees
where emp_name='Pat Fay';

-- 입사일, 입사일의 월을 출력하시오.
select hire_date,substr(hire_date,4,2) from employees;

-- 자신의 생일 속한 달의 마지막 일자를 출력하시오.
select last_day('2023-01-09') from dual;



create table board3 (
id number(4),
name varchar2(30),
txt clob
);

insert into board3 values(
1,'홍길동','게시글 내용을 입력합니다.'
);

commit;

select * from board3;

create table board4(
id number(4),
name varchar2(30),
txt varchar2(4000)
);

desc board4;

drop table board4;
drop table board3;

select * from board2;

create table board3
as
select * from board;

select * from board3;

create table board4
as
select no,title,content from board;

select * from board4;

create table board5
as
select * from board where 1=2;

select * from board where 1=2;

select * from board5;

desc board5;

select * from board5;

insert into board5 select * from board;


select * from board4;

insert into board4  select no,title,content from board;

select * from board4;

delete board4;

commit;

select * from board4;

insert into board4(no) select no from board;

select * from board4;

drop table board3;

select * from board2;

alter table board2
add(bfile varchar2(30),bfile2 varchar2(30));

desc board2;

alter table board2
modify (bfile varchar(100));

alter table board2
rename column bfile2 to bfile22;

-- bhit -> varchar2(30) 변경하시오.
alter table board2
modify(bhit varchar2(30));

select * from board2;

update board2
set bhit='' ;

select * from board2;

commit;

alter table board2
modify(bhit varchar2(30));

desc board2;

update board2
set bhit=1;

select * from board2;

select bgroup,bgroup+1 from board2;

select bhit, bhit+1 from board2;

alter table board2 modify btitle varchar2(200) not null;

desc board2;


desc board;


update stuscore a
set rank=(select ranks
       from (select rank() over(order by total desc) as ranks 
            , stuno
          from stuscore) b
       where b.stuno = a.stuno); 
       
select * from stuscore;

update stuscore set rank='';

commit;


select * from stuscore;

select stuno,name,kor,eng,math,total,avg,rank,rank() over(order by total desc) from stuscore
order by stuno;
select rank() over (order by total desc) from stuscore;

update stuscore s1
set rank=(select ranks from
(select rank() over (order by total desc) as ranks,stuno from stuscore) s2
where s1.stuno=s2.stuno);

select * from stuscore;

select max(salary) from employees;

select emp_name,salary from employees
where salary=(select max(salary) from employees);

select employee_id,emp_name,manager_id from employees
order by employee_id;

select emp_name,department_id from employees;

select emp_name,e.department_id,department_name from employees e,departments d
where e.department_id = d.department_id;


select department_id,department_name from departments;

desc board2;

alter table board2 drop column bfile22;

alter table board2 drop column bfile;

-- bfile, bfile2 컬럼을 추가하시오.
-- 이름 변경 bfile bprefile, bfile2 bprefile2


desc board2;

alter table board2 modify bhit invisible;

alter table board2 modify bhit visible;

desc board2;

alter table board2 modify bgroup invisible;
alter table board2 modify bstep invisible;
alter table board2 modify bindent invisible;

select * from board2;

alter table board2 modify bgroup visible;
alter table board2 modify bstep visible;
alter table board2 modify bindent visible;


select * from stuscore;

update stuscore
set rank='';

select * from stuscore;

select max(salary) from employees;

select emp_name,salary from employees
where salary=(select salary from employees);

update stuscore a
set rank= (
select ranks from
( select rank() over (order by total desc) ranks, stuno,name
from stuscore) b
where a.stuno = b.stuno
); 

select stuno,name,rank() over (order by total desc) as ranks from stuscore;

select * from stuscore;

desc board2;

alter table board2
drop column bindent;

desc board2;

alter table board2
add (bindent number(4));

select * from board2;


insert into board2 values(
7,'a1007','유관순','내용7',sysdate,1,1,1
);

select * from board2;

commit;

alter table board2
set unused(bindent);

desc board2;

alter table board2
drop unused columns;

rename board2 to fboard;

select * from member;

create table board2(
bno number(4) primary key,
bid varchar2(30) not null,
btitle varchar2(100) not null,
bcontent clob,
bdate date,
bhit number(4),
bgroup number(4),
bstep number(4),
bindent number(4)
);

desc board2;

insert into board2 (bno,bid,btitle) values(
board2_seq.nextval,'aaa','제목입니다.1');

select * from board2;

insert into board2(bno,bid,btitle) values(
3,'aaa','제목입니다.1'
);
