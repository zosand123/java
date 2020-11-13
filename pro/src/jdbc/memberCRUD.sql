--company테이블만들기
create table company(
cno number not null,
cname varchar2(30) not null,
ceo varchar2(30),
tel varchar2(20),
dam varchar2(30));

--company에 데이터입력
insert into company values(
111,'컴퍼니','김사장','123','안영미');

select * from company;

--table삭제
drop table member;

create table board(
no number(4) not null,
writer varchar2(100) not null,
title varchar2(300) not null,
content varchar2(3000) not null,
writeDate Date default sysdate, 
hit number(10) default 0);

select * from board;

insert into board 
values(11,'작가',
'제목','내용',sysdate,22);

--회원테이블
create table member
(mno number(5) constraint member_mno_p primary key,
mname varchar2(20),mhp varchar2(30)
,mid varchar2(20),mpw varchar2(30),
mjoindate date default sysdate);

select * from member;

insert into member 
values(eno_seq.nextval,'1223',
'두댄이','aaa','1234',sysdate);

insert into member 
values(eno_seq.nextval,'1233',
'한강이','aaab','1234',sysdate);
insert into member 
values(eno_seq.nextval,'1234',
'아웅람지','aaab','1234',sysdate);

update member
set mhp='123456'
where mno=8004;