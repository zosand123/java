select * from dept;

delete from dept where deptno = 90;

update dept set loc='DOKDO' where deptno=30;

insert into dept values(90,'IT','Seoul');

--table생성
create table 테이블명 
(컬럼명 타입(크기),
컬럼명2 타입(크기) [constraint 제약조건명 제약조건]
컬럼명2 타입(크기) [default 기본값]
);

--sequence 생성
create sequence 시퀀스명
start with 시작값
increment by 증감값
maxvalue 최대값
minvalue 최소값
cycle | nocycle

create sequence eno_seq
start with 8000
increment by 1
maxvalue 9999
nocycle;

--sequence사용 시퀀스명.nextval()
insert into emp(empno,ename,sal,hiredate)
values(eno_seq.nextval,'홍1',3000,sysdate);

select empno,ename,sal,hiredate
from emp
where empno>=7900 
order by empno desc;

update emp
set sal=sal+100
where empno=8000;

delete from emp where empno=8000;

*delete문법
delete from 테이블명 [where 조건]
--drop table 테이블명;

*update 문법
update 테이블 set 컬럼명=새값, 컬럼명=새값 ;
--alter table 테이블명

*insert 문법
insert into 테이블명 values(값,값);

*select 문법
select {* | 컬럼명 [as] 별칭} from 테이블명 
[where 조건] [group by 그룹기준 [having 그룹조건]] 
[order by 정렬기준 정렬방식]
정렬방식
asc(기본,오름차순) : 숫자 작>큰, a>z, ㄱ>ㅎ, 예전>최근
desc(내림차순)
