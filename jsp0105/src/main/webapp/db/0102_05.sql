select employee_id, emp_name, hire_date from employees
order by hire_date;
-- board2 ���̺� ����
create table board2 (
no number(4),
title varchar2(100),
content varchar2(3000),
userId varchar2(30),
bdate date,
hit number(4),
fileName varchar2(30),
noticeChk number(1)
);

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
1,'�Խñ�����','�Խñ� ����','aaa',sysdate,1,'',0
);

select * from board2;

commit;

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
2,'�Խñ�����','�Խñ� ����','aaa',sysdate,1,'',0
);

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
3,'�Խñ�����','�Խñ� ����','aaa',sysdate,1,'',0
);

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
4,'�Խñ�����','�Խñ� ����','aaa',sysdate,1,'',0
);

select * from board2;

rollback;

select * from board2;


select employee_id,emp_name,manager_id from employees;

select distinct manager_id from employees;

select employee_id, emp_name from employees
where employee_id = 103;

select * from employees;
select employee_id,emp_name,department_id from employees;

select * from departments;

select * from employees;

select salary, salary*12 annual, (salary*12)-(salary*12*0.01) realAnn from employees;

select * from stuscore;

select kor,eng,kor+eng,(kor+eng)/2 from stuscore;

select * from employees;

select employee_id, emp_name,salary,commission_pct from employees;

select employee_id,emp_name,salary,commission_pct,salary+(salary*commission_pct) from employees;

select employee_id, emp_name,salary,nvl(commission_pct,0),
salary+(salary*nvl(commission_pct,0)) from employees;

select commission_pct from employees
where commission_pct is not null;

select EMP_NAME from Employees;

select emp_name as "�����ȣ" from employees;

select * from departments;

select department_id as "�μ���ȣ", department_name as "�μ��̸�",manager_id as ������  from departments;

select * from stuscore;

select kor||','||eng||','||math as subject from stuscore;

select kor||'-'||eng||'-'||math as subject from stuscore;


select distinct department_id from employees;

select * from employees;

select distinct job_id from employees;



select emp_name,salary from employees
where salary<=3000
order by salary;

select emp_name,salary from employees
where salary<=7000 and salary>=3000
order by salary desc;

select emp_name,salary from employees
where salary <> 3000;

-- �μ���ȣ department_id 10 ����Ͻÿ�.
select emp_name,department_id from employees
where department_id=10;


select employee_id,emp_name,salary from employees
where salary<=4000
order by salary desc
;

upper(), lower()

select emp_name from employees
where lower(emp_name)=lower('james marlow');


select * from employees
where hire_date >= '05/01/01';

--03/01/01 ~ 08/12/31
select hire_date from employees
where hire_date>='03/01/01' and hire_date<='08/12/31';

select salary, hire_date from employees
where hire_date between '03/01/01' and '08/12/31';


select * from employees
where department_id != 10;

-- ������ 4000�޷� �̻��̸鼭 �Ի��� '03/01/01' ������ ����� �˻��Ͻÿ�.
select salary,hire_date from employees
where salary>=4000 and hire_date>='03/01/01';

-- ���� 3000�̻�, 6000������ ����� ����Ͻÿ�.
select salary,hire_date from employees
where salary>=3000 and salary<=6000;

select salary,hire_date from employees
where salary between 3000 and 6000;



-- ���� 4000,6000,7000�޷� �� ����� ����Ͻÿ�.
select salary,hire_date from employees
where salary=4000 or salary=6000 or salary=7000;

select salary,hire_date from employees
where salary in(4000,6000,7000);


-- �����ȣ 100,200,300,400
select employee_id as e_id, salary,hire_date from employees
where employee_id =100 or employee_id=200 or employee_id=300 or employee_id = 400;

select emp_name from employees
where emp_name like 'S%';


select emp_name from employees
where emp_name like '%n%'

select emp_name from employees
where emp_name like '%������%';

-- ��ҹ��� ���о��� k ��� ã�Ƽ� ����Ͻÿ�.
select emp_name from employees
where emp_name like '%k%' or emp_name like '%K%';

select emp_name from employees;

select emp_name from employees
where emp_name like '__s%';

-- �ڿ��� �ι�° ���ڰ� a�� ����̸��� ����Ͻÿ�.
select emp_name from employees
where emp_name like '%a_';


create table freeboard (
bno number(4) primary key,
bname varchar2(20),
btitle varchar2(100),
bcontent varchar2(3000),
bdate date,
bhit number(4),
bgroup number(4),
bindent number(4)
);

insert into freeboard values(
1,'ȫ�浿','����1','����1',sysdate,1,1,0
);

insert into freeboard values(
2,'ȫ�浿','2022�� �ҵ������ �� �ΰ���ġ�� ','�Ｚī�带 �̿� ���� ȸ���Բ� ��������.',sysdate,1,2,0
);

insert into freeboard values(
3,'ȫ�浿','�������� ó����ħ ���� �ȳ� ','�Ｚī�带 �̿��� �ּż� ����帳�ϴ�.',sysdate,1,3,0
);

insert into freeboard values(
4,'������','KT �Ｚī�� ������ ���� �ȳ� ','KT �Ｚī���� �������� ����',sysdate,1,4,0
);

insert into freeboard values(
5,'������','�����̾� ������ ���� �� ���������ҺΡ� ���� �� ���� �ȳ� ','ȸ����, 2022�� �Ϲݱ� �����̾� ������ ���񽺴� 2022.12.31(��)���� �����ǰ�, 2023.1.2(��)���ʹ� ��ݱ� �����̾� ������ ���񽺰� ���۵��� �˷������.',sysdate,1,5,0
);

insert into freeboard values(
6,'������','�Ｚī�� ǥ�����ڱ����ŷ� �⺻��� ���� �ȳ� ','�Ｚī�� ǥ�����ڱ����ŷ� �⺻����� ����Ǿ� 2023.2.1(��)���� ������ ����� ����� �����̿���.',sysdate,1,6,0
);

insert into freeboard values(
7,'������','2023�� �Ｚī�� CS�г� ���� �ȳ� ','�Ｚī��� ���� ������ �ǰ��� ���������� ����',sysdate,1,7,0
);

insert into freeboard values(
8,'������','�ڷγ�19 ���� �һ���� �� �߼ұ���� ���� ���� ���� ���� �ȳ� ','�Ｚī��� �ڷγ�19�� ���ظ� ���� �һ���ΰ� �߼ұ���� ���',sysdate,1,8,0
);

insert into freeboard values(
9,'������','�ڷγ� 19 ���ؿ� ���� ������� ������ũ�ƿ� ���� �ȳ� ','�� ���񽺰� ȸ���Բ� �����̳��� ���Ȱ� ���� �Ǳ⸦ �ٶ��Կ�.',sysdate,1,9,0
);

insert into freeboard values(
10,'������','U����Ʈ ��������� ȸ�� �̿� ��� ���� �ȳ� ','U����Ʈ ��������� ȸ�� �̿� ��� �� ����Ǿ� 2023.1.1(��)���� ������ ����� ����� �������� �˷� �帳�ϴ�.',sysdate,1,10,0
);

commit;

select * from freeboard;

select * from freeboard
where btitle like '%�ȳ�%';

select * from freeboard
where bcontent like '%�Ｚī��%';

select * from employees;

select * from employees
where manager_id is null;

select * from employees;

select * from employees
order by employee_id desc;

select employee_id,emp_name,job_id,hire_date from employees
order by hire_date, employee_id desc;

select * from stuscore;

select * from stuscore
order by total desc;


select stuno,name,total,
rank() over(order by total desc) as rank
from stuscore
order by stuno
;
--6461
select avg(salary) from employees;

select emp_name,salary from employees
where salary<=(select avg(salary) from employees)
order by salary desc;

select employee_id,department_id,hire_date from employees
order by employee_id desc, hire_date desc;

-- �μ���ȣ �����ϵ� ���� �μ��� �Ի����� �ֱټ����� ����Ͻÿ�.
select employee_id,department_id,hire_date from employees
order by department_id asc, hire_date desc;

select avg,round(avg,1) from stuscore;

select avg(salary),round(avg(salary),2) from employees;


select -10,abs(-10) from dual;

-- ����� ¦�� �� ����� ����Ͻÿ�.
-- mod()

select 10,mod(10,2) from dual;

select * from employees
where mod(employee_id,2)=1
order by employee_id;

select 34.5678, floor(34.5678),round(34.5678,2),trunc(34.5678,2),trunc(34.5678,-1),round(35.5678,-1) from dual;


