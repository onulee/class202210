-- 검색
select * from member;

select * from member where id='aaa';

create table board (
bId number(4), -- no
bName varchar2(20), --작성자
bTitle varchar2(100), --제목
bContent varchar2(300), --내용
bDate date,  --작성일
bHit number(4), --조회수
bGroup number(4), -- 답글 그룹
bStep number(4),  -- 답글그룹의 순서
bIndent number(4) -- 들여쓰기
);

insert into board values (
1,'홍길동','제목입니다.','내용입니다.',sysdate,1,1,1,0);

select * from board;



insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
2,'이순신','제목입니다.2','내용입니다.2','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
3,'유관순','제목입니다.3','내용입니다.3','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
4,'김구','제목입니다4.','내용입니다.4','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
5,'김유신','제목입니다.5','내용입니다.5','2022-01-03',1,1,1,0);

insert into board values (
1,'강감찬','제목입니다.5','내용입니다.5',sysdate,1,1,1,0);


commit;

select to_char() from board;

update board set bHit=1 where bId=1;

delete board where bid=1;

select * from board;

commit;

select * from board;

drop table board;

-- 모든 테이블 확인
select * from tab;

select * from employees;
-- 테이블의 타입 확인
desc employees;


