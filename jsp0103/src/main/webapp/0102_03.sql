-- �˻�
select * from member;

select * from member where id='aaa';

create table board (
bId number(4), -- no
bName varchar2(20), --�ۼ���
bTitle varchar2(100), --����
bContent varchar2(300), --����
bDate date,  --�ۼ���
bHit number(4), --��ȸ��
bGroup number(4), -- ��� �׷�
bStep number(4),  -- ��۱׷��� ����
bIndent number(4) -- �鿩����
);

insert into board values (
1,'ȫ�浿','�����Դϴ�.','�����Դϴ�.',sysdate,1,1,1,0);

select * from board;



insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
2,'�̼���','�����Դϴ�.2','�����Դϴ�.2','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
3,'������','�����Դϴ�.3','�����Դϴ�.3','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
4,'�豸','�����Դϴ�4.','�����Դϴ�.4','2022-01-03',1,1,1,0);

insert into board (bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent) values (
5,'������','�����Դϴ�.5','�����Դϴ�.5','2022-01-03',1,1,1,0);

insert into board values (
1,'������','�����Դϴ�.5','�����Դϴ�.5',sysdate,1,1,1,0);


commit;

select to_char() from board;

update board set bHit=1 where bId=1;

delete board where bid=1;

select * from board;

commit;

select * from board;

drop table board;

-- ��� ���̺� Ȯ��
select * from tab;

select * from employees;
-- ���̺��� Ÿ�� Ȯ��
desc employees;


