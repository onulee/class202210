select employee_id, emp_name, hire_date from employees
order by hire_date;
-- board2 테이블 생성
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
1,'게시글제목','게시글 내용','aaa',sysdate,1,'',0
);

select * from board2;

commit;

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
2,'게시글제목','게시글 내용','aaa',sysdate,1,'',0
);

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
3,'게시글제목','게시글 내용','aaa',sysdate,1,'',0
);

insert into board2 (no,title,content,userId,bdate,hit,fileName,noticeChk) values (
4,'게시글제목','게시글 내용','aaa',sysdate,1,'',0
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

select emp_name as "사원번호" from employees;

select * from departments;

select department_id as "부서번호", department_name as "부서이름",manager_id as 관리자  from departments;

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

-- 부서번호 department_id 10 출력하시오.
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

-- 월급이 4000달러 이상이면서 입사일 '03/01/01' 이후인 사원을 검색하시오.
select salary,hire_date from employees
where salary>=4000 and hire_date>='03/01/01';

-- 월급 3000이상, 6000이하인 사원을 출력하시오.
select salary,hire_date from employees
where salary>=3000 and salary<=6000;

select salary,hire_date from employees
where salary between 3000 and 6000;



-- 월급 4000,6000,7000달러 인 사원을 출력하시오.
select salary,hire_date from employees
where salary=4000 or salary=6000 or salary=7000;

select salary,hire_date from employees
where salary in(4000,6000,7000);


-- 사원번호 100,200,300,400
select employee_id as e_id, salary,hire_date from employees
where employee_id =100 or employee_id=200 or employee_id=300 or employee_id = 400;

select emp_name from employees
where emp_name like 'S%';


select emp_name from employees
where emp_name like '%n%'

select emp_name from employees
where emp_name like '%아이유%';

-- 대소문자 구분없이 k 모두 찾아서 출력하시오.
select emp_name from employees
where emp_name like '%k%' or emp_name like '%K%';

select emp_name from employees;

select emp_name from employees
where emp_name like '__s%';

-- 뒤에서 두번째 글자가 a인 사원이름을 출력하시오.
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
1,'홍길동','제목1','내용1',sysdate,1,1,0
);

insert into freeboard values(
2,'홍길동','2022년 소득공제용 및 부가가치세 ','삼성카드를 이용 중인 회원님께 감사드려요.',sysdate,1,2,0
);

insert into freeboard values(
3,'홍길동','개인정보 처리방침 변경 안내 ','삼성카드를 이용해 주셔서 감사드립니다.',sysdate,1,3,0
);

insert into freeboard values(
4,'관리자','KT 삼성카드 디자인 변경 안내 ','KT 삼성카드의 디자인이 변경',sysdate,1,4,0
);

insert into freeboard values(
5,'관리자','프리미엄 리워즈 서비스 중 ‘무이자할부’ 개월 수 변경 안내 ','회원님, 2022년 하반기 프리미엄 리워즈 서비스는 2022.12.31(토)까지 제공되고, 2023.1.2(월)부터는 상반기 프리미엄 리워즈 서비스가 시작됨을 알려드려요.',sysdate,1,5,0
);

insert into freeboard values(
6,'관리자','삼성카드 표준전자금융거래 기본약관 변경 안내 ','삼성카드 표준전자금융거래 기본약관이 변경되어 2023.2.1(수)부터 개정된 약관이 시행될 예정이에요.',sysdate,1,6,0
);

insert into freeboard values(
7,'관리자','2023년 삼성카드 CS패널 모집 안내 ','삼성카드는 고객의 소중한 의견을 적극적으로 수렴',sysdate,1,7,0
);

insert into freeboard values(
8,'관리자','코로나19 피해 소상공인 및 중소기업을 위한 금융 지원 서비스 안내 ','삼성카드는 코로나19로 피해를 입은 소상공인과 중소기업을 대상',sysdate,1,8,0
);

insert into freeboard values(
9,'관리자','코로나 19 피해에 따른 가계대출 프리워크아웃 지원 안내 ','이 서비스가 회원님께 조금이나마 위안과 힘이 되기를 바랄게요.',sysdate,1,9,0
);

insert into freeboard values(
10,'관리자','U포인트 공동멤버십 회원 이용 약관 변경 안내 ','U포인트 공동멤버십 회원 이용 약관 이 변경되어 2023.1.1(일)부터 개정된 약관이 시행될 예정임을 알려 드립니다.',sysdate,1,10,0
);

commit;

select * from freeboard;

select * from freeboard
where btitle like '%안내%';

select * from freeboard
where bcontent like '%삼성카드%';

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

-- 부서번호 정렬하되 같은 부서는 입사일이 최근순으로 출력하시오.
select employee_id,department_id,hire_date from employees
order by department_id asc, hire_date desc;

select avg,round(avg,1) from stuscore;

select avg(salary),round(avg(salary),2) from employees;


select -10,abs(-10) from dual;

-- 사번이 짝수 인 사번만 출력하시오.
-- mod()

select 10,mod(10,2) from dual;

select * from employees
where mod(employee_id,2)=1
order by employee_id;

select 34.5678, floor(34.5678),round(34.5678,2),trunc(34.5678,2),trunc(34.5678,-1),round(35.5678,-1) from dual;


