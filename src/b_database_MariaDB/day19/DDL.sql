-- 데이터베이스 생성
CREATE DATABASE testdb;

-- 데이터베이스 삭제
DROP DATABASE testdb;

-- 테이블 생성
CREATE TABLE Person(
                       email VARCHAR(100) PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       age int DEFAULT 0,
);

-- ---------------------------------------------
-- emp 테이블 생성
drop table IF EXISTS emp;
CREATE TABLE EMP (
                     EMPNO     int,
                     ENAME     VARCHAR(30),
                     JOB       VARCHAR(20),
                     MGR       int,
                     HIREDATE  DATE,
                     SAL       int,
                     COMM      int,
                     DEPTNO    int) DEFAULT CHARSET=UTF8;

insert into emp values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1982-02-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30);
insert into emp values (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,null,10);
insert into emp values (7788,'SCOTT','ANALYST',7566,'1987-04-17',3000,null,20);
insert into emp values (7839,'KING','PRESIDENT',null,'1981-11-17',5000,null,10);
insert into emp values (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
insert into emp values (7876,'ADAMS','CLERK',7788,'1987-05-23',1100,null,20);
insert into emp values (7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30);
insert into emp values (7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20);
insert into emp values (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

-- EMP 테이블의 INDEX를 만듦
CREATE UNIQUE INDEX PK_EMP ON EMP (EMPNO) ;

-- EMP 테이블에서 PK 설정
ALTER TABLE EMP ADD  CONSTRAINT PK_EMP PRIMARY KEY (EMPNO);

-- --------------------------
-- emp 테이블에서 deptno=10인 데이터들을 가져와 emp_sub 테이블로 생성함
CREATE TABLE emp_sub AS SELECT empno, ename, job, hiredate, sal FROM emp WHERE deptno=10;

-- 내용이 없는 테이블을 생성하고 싶을 때 WHERE 절을 거짓으로 하면 가지고오는 데이터가 없음
CREATE TABLE emp_t AS SELECT * FROM emp WHERE 1=2;

-- Persons 테이블 생성
CREATE TABLE Persons(
                        id INT,
                        last_name VARCHAR(255),
                        first_name VARCHAR(255),
                        address VARCHAR(255),
                        city VARCHAR(200)
);

-- 이미 생성된 테이블에 칼럼 추가
ALTER TABLE Persons ADD email VARCHAR(255);

-- 이미 있는 칼럼의 형식/정보를 변경
ALTER TABLE Persons MODIFY COLUMN city VARCHAR(255);


-- 칼럼 삭제
ALTER TABLE Persons DROP COLUMN email;

-- 칼럼의 디폴트 값 지정
ALTER TABLE emp_sub ADD deptno INT DEFAULT 10;

-- 칼럼명 변경
ALTER TABLE emp_sub RENAME COLUMN deptno To decode;

-- 테이블명 변경
RENAME TABLE emp_sub TO emp_10;

--
SELECT * FROM emp_10;
-- 테이블 비우기 (테이블은 삭제되지 않음), 메모리까지 삭제
TRUNCATE TABLE emp_10;

-- 데이터와 관련 crud(create(insert), read(select), update(update), delete(delete))
-- emp 테이블의 모든 데이터는 삭제되며, 메모리는 유지
DELETE FROM emp;
DELETE FROM emp WHERE deptno=10;







