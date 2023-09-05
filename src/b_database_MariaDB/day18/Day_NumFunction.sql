---------------------------------------

-- 날짜 함수---

---------------------------------------

-- curdate, current_date : 현재 날짜 출력
SELECT CURDATE();
SELECT CURRENT_DATE();

-- 날짜에 더하기 가능 (기존 날짜 형식과 달리 문자형식으로 출력)
SELECT CURDATE()+1;

-- adddate, date_add : 날짜 형식을 유지하면서 더하기
-- 형식 : adddate(기준 날짜, INTERVER 숫자 일/월/년), INTERVAL이 생략되고 숫자만 오게되면 기본 디폴트 값은 day
SELECT ADDDATE(CURDATE(), INTERVAL 1 DAY);
SELECT DATE_ADD(CURDATE(), INTERVAL 1 MONTH);
SELECT ADDDATE(CURDATE(), INTERVAL -1 YEAR);

-- emp 테이블에서 각 직원의 입사일과 10년 기념일 조회
SELECT hiredate 입사일, ADDDATE(hiredate, INTERVAL 10 YEAR) 10주년 FROM emp;
-- emp 테이블에서 각 직원의 입사일과 입사일 기준 2일 뒤 조회
SELECT hiredate 입사일, ADDDATE(hiredate, 2) FROM emp;

---------------------------------------

-- curtime, current_time : 현재 시간
SELECT CURTIME(), CURRENT_TIME();
SELECT CURTIME(), ADTIME(CURTIME(), '1:10:5');

---------------------------------------

-- now() : 현재 날짜 및 시간
SELECT NOW();
SELECT NOW(), ADDTIME(NOW(), '2 1:10:5');

---------------------------------------

-- DATEDIFF : 날짜 간격 계산
-- emp 테이블에서 현재 날짜부터 hiredate까지 얼마나 지났는지 반환
SELECT hiredate, DATEDIFF(CURDATE(), hiredate) FROM emp;
SELECT DATEDIFF(CURDATE(), '1999-06-10');

---------------------------------------

-- DATE_FORMAT
SELECT DATE_FORMAT('2017-06-15', "%M %D %Y");
SELECT DATE_FORMAT(NOW(), "%M")
SELECT DATE_FORMAT(NOW(), "%m %d %Y %H %i %s %W");

---------------------------------------

-- DATE_SUB : 날짜 빼기
SELECT CURDATE(), DATE_SUB(CURDATE(), INTERVAL 10 DAY);

---------------------------------------

-- DAY : 날짜에서 일 추출
-- emp 테이블에서 입사일과 입사일의 일만 반환
SELECT hiredate, Day(hiredate) FROM emp;
SELECT hiredate, DAYOFMONTH(hiredate) FROM emp;

---------------------------------------

-- DAYNAME : 날짜에서 요일 추출
SELECT hiredate, DAYNAME(hiredate) FROM emp;
-- DAYOWEEK는 일요일 기준 숫자를 가져옴
Select hiredate, DAYOFWEEK(hiredate) FROM emp;

SELECT NOW(), HOUR(NOW());
SELECT NOW(), MINUTE(NOW());
SELECT NOW(), SECOND(NOW());

---------------------------------------

-- EXTRACT
-- CURDATE()에서 월/연/일/주/분기 추출
SELECT CURDATE(), EXTRACT(MONTH FROM CURDATE()) AS MONTH;
SELECT CURDATE(), EXTRACT(YEAR FROM CURDATE()) AS YEAR;
SELECT CURDATE(), EXTRACT(DAY FROM CURDATE()) AS DAY;
SELECT CURDATE(), EXTRACT(WEEK FROM CURDATE()) AS WEEK;
SELECT CURDATE(), EXTRACT(QUARTER FROM CURDATE()) AS QUARTER;

---------------------------------------

-- NOW()에서 시/분/초 추출
SELECT NOW(), EXTRACT(HOUR FROM NOW()) AS HOUR;
SELECT NOW(), EXTRACT(MINUTE FROM CURDATE()) AS MINUTE;
SELECT NOW(), EXTRACT(SECOND FROM NOW()) AS SECOND;

---------------------------------------

-- CURDATE()에서 월과달을 같이 출력(형식 유지x)
SELECT CURDATE(), EXTRACT(YEAR_MONTH FROM CURDATE()) AS "YEAR_MONTH";

---------------------------------------

-- TIME_TO_SEC : 시간을 초로 변환
SELECT CURTIME(), TIME_TO_SEC(CURTIME());

---------------------------------------

-- TIMEDIFF : 기준 시간과 작성 시간의 차이
SELECT CURTIME(), TIMEDIFF(CURTIME(), '08:48:27');



---------------------------------------

-- 숫자 함수---

---------------------------------------

-- COUNT : 조건에 만족하는 레코드(행) 수, 조건이 없을 경우 칼럼에 해당하는 행 수
SELECT COUNT(*) FROM emp;
SELECT COUNT(comm) FROM emp;

SELECT COUNT(*) FROM emp WHERE deptno=10;

---------------------------------------

-- SUM : 합계
SELECT SUM(sal) FROM emp;
SELECT SUM(sal) FROM emp WHERE deptno=10;

---------------------------------------

-- AVG : 평균
SELECT AVG(sal) FROM emp;
SELECT AVG(sal) FROM emp WHERE deptno=10;

-- NULL이 제외되는 것을 막기 위해 NULL을 0으로 변경 후 평균 출력 (상황에 따라 변경)
SELECT AVG(IFNULL(comm, 0)) FROM emp;

-- Max
SELECT MAX(sal) FROM emp;

-- Min
SELECT MIN(sal) FROM emp;
---------------------------------------

-- professor 테이블에서 각 교수들의 연봉을 조회
SELECT profno "교수번호", name "이름", pay "월급여", bonus "보너스", pay*12+IFNULL(bonus, 0) "연봉" FROM professor;


-- GROUP BY : 그룹별로 함수를 적용
-- emp 테이블의 deptno 별로 칼럼 출력
SELECT deptno, COUNT(*), SUM(sal) FROM emp GROUP BY deptno;

-- emp 테이블에서 deptno, job을 그룹화
SELECT deptno, job, COUNT(*), SUM(sal) FROM emp GROUP BY deptno, job;

-- student 테이블에서 메인 학과별 학생 수 조회
SELECT deptno1, COUNT(*) FROM student GROUP BY deptno1;

-- student 테이블에서 학년별 평균 키 조회
SELECT grade, format(AVG(height),1) FROM student GROUP BY grade;

SELECT deptno, MAX(sal) FROM emp GROUP BY deptno;

-- emp 테이블에서 deptno 별 sal의 평균 중 평균이 2000 이상인것만 출력
SELECT deptno, avg(sal) FROM emp GROUP BY deptno HAVING AVG(sal) >=2000;

-- student 테이블에서 각 학과와 학년별 평균 몸무게, 최대/최소 몸무게를 조회 후 정렬
SELECT deptno1, grade, COUNT(*), format(AVG(weight),1), MIN(weight), MAX(weight) FROM student GROUP BY deptno1, grade HAVING AVG(weight) > 50 ORDER BY deptno1, grade;
