-- SELECT FROM : 테이블의 데이터를 조회할 때 사용
-- SELECT 조회할 칼럼명 FROM 테이블명; (칼럼명 *은 모든 칼럼을 의미)

-- emp 테이블의 전체 컬럼 조회
SELECT * FROM emp;

-- emp 테이블의 empno, enmae 칼럼 조회
SELECT empno, ename FROM emp;

-- dept 테이블에서 전체 컬럼 조회
SELECT * FROM dept;

-- dept 테이블에서 deptno, dname 조회
SELECT deptno, dname FROM dept;

-- student 테이블에서 학번, 이름, 생일, 전화번호 조회
SELECT studno, name, birthday, tel FROM student;

-- -------------------------------------------------

-- WHERE : 행에 대한 조건문(조건에 만족하는 행만 조회할 때 사용)
-- emp 테이블에서 deptno=0인 행만 조회
SELECT * FROM emp WHERE deptno=10;

-- emp 테이블에서 deptno=10인 empno, enmae, deptno 칼럼 조회
SELECT empno, ename, deptno FROM emp WHERE deptno=10;

-- emp 테이블에서 deptno가 10보다 큰 직원의 사번, 이름, 직무, 부서번호 조회
SELECT empno, ename, job, MGR FROM emp WHERE deptno>10;

-- student 테이블에서 4학년 학생들의 학번, 이름, 생일, 전화번호, 학년을 조회
SELECT studno, name, birthday, tel, grade FROM student WHERE grade=4;

-- -------------------------------------------------

-- WHRER 절 연산자
-- student 테이블에서 2학년 또는 3학년인 학생의 정보 조회
SELECT * FROM student WHERE grade=2 OR grade=3;
SELECT * FROM student WHERE 2<=grade AND grade<=3;
SELECT * FROM student WHERE grade IN(2, 3); -- IN 연산자는 2,3 중 하나에 포함되면 됨을 의미

-- student 테이블에서 4학년이 아닌 학생 정보 조회
SELECT * FROM student WHERE NOT grade = 4;
SELECT * FROM student WHERE NOT grade != 4;
SELECT * FROM student WHERE grade NOT IN(4);

SELECT * FROM studnet WHERE grade=1 OR grade=2 OR grade=3;
SELECT * FROM student WHERE 1<=grade AND grade<=3;
SELECT * FROM student WHERE grade IN(1,2,3); -- IN 연산자는 1,2,3 중 하나에 포함됨을 의미

-- emp 테이블에서 직무가 CLERK 이너가 SALESMAN인 직원의 사번, 이름, 직무 조회
-- 문자열 작성 시 작은 따옴표(큰 따옴표를 쓰지 않음)
SELECT empno, ename, job FROM emp WHERE job='CLERK' OR job='SALESMAN';

-- -------------------------------------------------

-- alias : 칼럼명을 바꿔서 조회 (as는 생략 가능)
SELECT empno as 사번, ename as 이름, job as 직무 FROM emp WHERE job='CLERK' OR job='SALESMAN';
SELECT empno 사번, ename 이름, job 직무 FROM emp WHERE job='CLERK' OR job='SALESMAN';
-- alias를 쓸 때에만 큰 따옴표 사용, alias 사용 시 스페이스가 들어가야 한다면 큰따옴표 사용
SELECT empno "사   번", ename "이   름", job "직   무" FROM emp WHERE job='CLERK' OR job='SALESMAN';

-- student 테이블에서 4학년 학생들의 학번, 이름, 학년을 조회(칼럼명 : 학 번, 이 름, 학 년)
SELECT studno "학 번", name "이 름", grade "학 년" FROM student WHERE grade=4;

-- professor 테이블에서 홈페이지가 null이 아닌 교수 목록 조회
-- 컬럼값 비교할 때 null은 =로 비교하지 않고 is를 이용
SELECT * FROM professor WHERE hpage IS NULL;
SELECT * FROM professor WHERE hpage IS NOT NULL;

-- -------------------------------------------------

-- 날짜 형식도 비교 연산자 사용 가능(최근일수록 큼)
SELECT * FROM emp WHERE hiredate>='1985-01-01';

-- student 테이블에서 1976년생 학생 조회
SELECT * FROM student WHERE '1976-01-01'<=birthday AND birthday<='1976-12-31';

-- -------------------------------------------------

-- emp 테이블에서 부서번호가 10이고 급여가 2000 이상인 직원의 목록 조회
SELECT * FROM emp WHERE deptno=10 AND sal>=2000;

-- professor 테이블에서 학과번호가 101이면서 정교수 조회
SELECT * FROM professor WHERE deptno=101 AND position='정교수';

-- student 테이블에서 전공이나 비전공이 101인사람
SELECT * FROM student WHERE deptno1=101 OR deptno2=101;

-- student 테이블에서 전공이나 부전공이 101인 학생 중 1학년 또는 2학년 조회
SELECT * FROM student WHERE (deptno1=101 OR deptno2=101) AND (grade=1 OR grade=2);
SELECT * FROM student WHERE (deptno1=101 OR deptno2=101) AND grade IN(1,2);

-- emp2 테이블에서 정규직 중 급여가 5000만원 이상인 직원의 이름, 직급, 급여 조회
SELECT name, position, pay FROM emp2 WHERE EMP_TYPE='정규직' AND pay>=50000000;

-- 컴퓨터정보학부에 소속된 교수의 이름, 직급, 소속학과 조회(Join 연산 배우기 이전)
SELECT name, position, deptno FROM professor WHERE deptno IN(101, 102, 103);

-- 조인형 교수(profno=1001)를 담당교수로 하는 학생의 학번, 이름, 학년, 학과번호, 교수번호 조회(Join 연산 배우기 이전)
SELECT studno, name, grade, deptno1, profno FROM student WHERE profno=1001;

-- 노트북을 상품으로 받을 수 있는 고객의 고객 번호, 이름, 포인트 조회
SELECT gno, gname, point FROM gogak WHERE 600001<=point;

-- exam_01 테이블에서 학점이 B0,B+인 학생의 학번과 점수 조회
SELECT studno, total FROM exam_01 WHERE 80<=total AND total<=89;

-- -------------------------------------------------

-- BETWEEN 은 사이값을 나타낼 때 쓰며 이상 이하를 나타냄(날짜도 BETWEEN 사용 가능)
SELECT studno, total FROM exam_01 WHERE total BETWEEN 80 AND 89;
-- student 테이블에서 1976년생 학생 조회
SELECT * FROM student WHERE birthday BETWEEN '1976-01-01' AND '1976-12-31';

-- -------------------------------------------------

-- ORDER BY : 정렬
-- ORDER BY '정렬 기준' (디폴트는 asc, 내릶차순을 원할경우 정렬 기준 뒤에 desc를 작성)
SELECT * FROM emp ORDER BY sal;
SELECT * FROM emp ORDER BY sal DESC;
SELECT * FROM emp WHERE deptno=10 ORDER BY sal DESC;

-- ORDER BY 숫자는 해당 숫자에 해당하는 SELECT 칼럼을 기준으로 정렬 (데이터베이스는 0이 시작이 아닌 1이 시작이므로, 아래 예시에서는 name을 말함)
SELECT studno, name FROM student ORDER BY 2;
SELECT studno, name FROM student ORDER BY name;

-- student 테이블에서 4학년 학생들의 학번, 이름, 생일, 학과번호를 생일 순으로 정렬
SELECT studno, name, birthday, deptno1 FROM student WHERE grade=4 ORDER BY 3;
SELECT studno, name, birthday, deptno1 FROM student WHERE grade=4 ORDER BY birthday;

-- ORDER BY 뒤 칼럼이 여러개라면 칼럼별로 정렬 진행
-- asc, desc는 칼럼 별 각각을 의미
SELECT * FROM emp ORDER BY deptno asc, sal desc;

-- student 테이블에서 학년순 정렬, 같은 학년은 키가 큰 학생이 먼저 오도록 정렬
SELECT * FROM student ORDER BY grade, height desc;

-- -------------------------------------------------

-- DISTINCT : 중복된 행을 제거
-- deptno1을 중복하지 않고 출력
SELECT DISTINCT(deptno1) FROM student

-- -------------------------------------------------

-- LIKE 연산자 : 컬럼의 문자열에 특정 문자열이 포함된 것을 거를 때 사용 (문자열에서만 사용 가능)
-- 이름의 성이 '서'인 학생
-- %는 아무거나 0개 이상인 글자를 의미
SELECT * FROM student WHERE name LIKE '서%';

-- job에 MAN이 포함된 것만 조회
SELECT * FROM emp WHERE job LIKE '%MAN%';

-- job의 두 번째 글자에 A인 것 조회
-- _(언더바)가 한 글자를 의미
SELECT * FROM emp WHERE job LIKE'_A%';

-- 주민번호를 가지고 9월이 생일인 학생의 학번, 이름, 학년, 주민번호 조회
SELECT studno, name, grade, jumin FROM student WHERE jumin LIKE '__09%';

-- professor 테이블에서 보너스가 있는 교수들의 교수번호, 이름, 급여, 보너스 조회
SELECT profno, name, pay, bonus FROM professor WHERE bonus IS NOT NULL;
SELECT profno, name, pay, bonus, pay+bonus FROM professor WHERE bonus IS NOT NULL;

-- -------------------------------------------------

-- Null과 연산하면 Null이 나오기 때문에 bonus가 Null이면 pay+bonus가 Null로 출력
SELECT profno, name, pay, bonus, pay+bonus FROM professor;
-- Bonus가 Null 이면 0으로 처리
-- IFNULL(칼럼명, 대체할 숫자) : 해당하는 칼럼이 null일 경우 대체하는 값 지정
SELECT profno, name, pay, bonus, pay+IFNULL(bonus, 0) FROM professor;

-- emp 테이블에서 sal이 1000보다 크고, comm이 1000보다 작거나 없는 직원의 사번, 이름, 급여, 커미션 조회
SELECT empno, ename, sal, comm FROM emp WHERE sal>1000 AND (comm IS NULL OR comm < 1000);

-- -------------------------------------------------

-- CONCAT : 문자열을 이을 때 사용
-- emp 테이블에서 ename(job) 형태로 만들어 출력
SELECT CONCAT(ename, '(', job, ')') AS 'ename_job' FROM emp;

-- SMITH's sla is $sal 형태로 만들어 출력
-- 문자열은 작은 따옴표를 이용하기 때문에 '를 출력하기 위해서는 ''로 작성해야 출력됨
SELECT CONCAT(ename,'''s sal is $',sal) FROM emp;
