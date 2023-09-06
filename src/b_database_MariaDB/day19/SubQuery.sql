-- --------------------------
-- subQuery
-- ------------------------

/*SELECT COLUMN_LIST
FROM TABLE
WHERE 조건 연산자(SELECT COLUMN_LIST)
				FROM TABLE
				WHERE 조건 연산자);

SELECT에 들어갈 수 있으나 조인과 별반 다르지 않으며 조인이 더 효율적
WHERE에 들어가는 경우가 대부분
FROM 절에도 들어갈 수는 있음
*/

-- =, <> (!=), >, >=, <, <= : 단일행 서브쿼리 연산자

SELECT ename, comm
FROM emp
WHERE comm < (SELECT comm FROM emp WHERE ename='WARD');

SELECT e1.ename, e1.comm
FROM emp e1 JOIN emp e2
WHERE e2.ename='WARD' AND e1.comm < e2.comm;

-- student, department 테이블을 이용하여 서진수 학생과 주전공이 동일한 학생들의 이름과 전공 조회
SELECT s.name, d.dname
FROM student s JOIN department d
                    ON s.deptno1=d.deptno
WHERE s.deptno1 = (SELECT deptno1 FROM student WHERE name='서진수');


-- professor, department 테이블을 이용하여 박원범 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명 조회
SELECT p.name, p.hiredate, d.dname
FROM professor p
         JOIN department d ON p.deptno=d.deptno
WHERE p.hiredate > (SELECT hiredate FROM professor WHERE name='박원범');


-- student 테이블에서 주전공이 201 학과의 평균 몸무게보다 몸무게가 많은 학생들의 이름과 몸무게 조회
SELECT s.name, s.weight
FROM student s
WHERE s.weight > (SELECT AVG(weight) FROM student WHERE deptno1='201');


-- student 테이블에서 주전공이 전자공학과인 학과의 평균 몸무게보다 몸무게가 많은 학생들의 이름과 몸무게 조회
SELECT s.name, s.weight
FROM student s
WHERE s.weight > (SELECT AVG(st.weight)
                  FROM student st
                           JOIN department d ON d.deptno = st.deptno1
                  WHERE d.dname = '전자공학과')
ORDER BY 2;


-- gogak, gift 테이블을 이용하여 노트북을 받을 수 있는 고객의 이름, 포인트 조회
SELECT go.gname, go.point
FROM gogak go
WHERE go.point > (SELECT g_start FROM gift WHERE gname='노트북');


-- emp, dept 테이블을 이용하여 NEWWORK에서 근무하는 직원목록 조회
SELECT *
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE loc='NEW YORK');


-- student, professor 테이블을 이용하여 박원범 교수가 지도하는 학생 목록 조회
SELECT *
FROM student
WHERE profno = (SELECT profno FROM professor WHERE name='박원범');


-- gogak, gift 테이블을 사용하여 안광훈 고객이 포인터로 받을 수 있는 상품 목록 조회
SELECT gname
FROM gift
WHERE g_start <= (SELECT point FROM gogak WHERE gname='안광훈');


-- emp, dept 테이블을 이용하여 sales 부서를 제외한 나머지 부서에 속한 직원의 사번, 이름, 부서명 조회
SELECT e.empno, e.ename, d.dname
FROM emp e JOIN dept d USING(deptno)
WHERE deptno <> (SELECT deptno FROM dept WHERE dname='SALES');


-- student, exam_01, hakjum 테이블을 이용하여 학점이 B 미만인 학생의 학번, 이름, 점수 조회
SELECT s.studno, s.name, e.total
FROM student s JOIN exam_01 e ON s.studno=e.studno
WHERE e.total < (SELECT min_point FROM hakjum WHERE grade='B0')
ORDER BY 3;


-- student, exam_01, hakjum 테이블을 이용하여 학점이 A0인 학생의 학번, 이름, 점수 조회
SELECT s.studno, s.name, e.total
FROM student s JOIN exam_01 e ON s.studno=e.studno
WHERE e.total > (SELECT min_point FROM hakjum WHERE grade='A0')
  AND e.total < (SELECT min_point FROM hakjum WHERE grade='A+')
ORDER BY 3;

-- ------------------------------
-- 다중행 서브쿼리

-- in, exists, > any, > any, <all,>all : 다중행 서브쿼리 연산자


-- emp2, dept2 테이블을 이용하여 '포항본사'에서 근무하는 직원들의 사번, 이름, 직급, 부서명 조회
SELECT e.empno, e.name, e.position, d.dname
FROM emp2 e JOIN dept2 d ON e.deptno=d.dcode
WHERE e.deptno IN(SELECT dcode FROM dept2 WHERE area='포항본사');


-- emp2 테이블을 이용하여 '과장' 직급의 최소 연봉자보다 연봉이 높은 직원의 사번, 이름, 연봉 조회
-- 단일행
SELECT empno, name, pay
FROM emp2
WHERE pay > (SELECT MIN(pay) FROM emp2 WHERE position='과장');

-- 다중행
SELECT empno, name, pay
FROM emp2
WHERE pay >any (SELECT pay FROM emp2 WHERE position='과장')
ORDER BY 3;


-- student 테이블에서 학년별로 키가 가장 큰 학생의 이름과 학년 조회
SELECT name, grade, height
FROM student
WHERE (grade, height) IN (SELECT grade, max(height) FROM student GROUP BY grade)
ORDER BY 2;


-- student 테이블에서 학년이 2학년인 학생중에 몸무게가 가장 적은 학생보다 몸무게가 적은 학생의 이름, 학년, 몸무게 조회
SELECT name, grade, weight
FROM student
WHERE weight <all (SELECT weight FROM student WHERE grade=2);


-- emp2 테이블에서 본인이 속한 부서의 평균 연봉보다 적게 받는 직원의 이름, 연봉, 부서명 조회
-- 단일행
SELECT name, pay, d.dname
FROM emp2 e JOIN dept2 d ON e.deptno = d.dcode
WHERE pay < (SELECT AVG(pay) FROM em2 WHERE deptno=e.deptno);


-- emp2, dept2 테이블을 이용해 각 부서별 평균 연봉을 구하고 평균 연봉이 가장 적은 부서의 평균 연봉보다 많이 받는 직원들의 직원명, 부서명, 연봉 조회
SELECT e.name, d.dname, e.pay
FROM emp2 e JOIN dept2 d ON e.deptno=d.dcode
WHERE e.pay >any (SELECT AVG(pay) FROM emp2 GROUP BY deptno);


-- professor, department 테이블에서 각 학과별 입사일이 가장 오래된 교수의 교수번호, 이름, 입사일, 학과명 조회
SELECT p.profno, p.name, p.hiredate, d.dname
FROM professor p JOIN department d USING(deptno)
WHERE p.hiredate IN (SELECT  MIN(hiredate) FROM professor GROUP BY deptno)
ORDER BY 3;

SELECT p.profno, p.name, p.hiredate, d.dname
FROM professor p JOIN department d USING(deptno)
WHERE (deptno, p.hiredate) IN (SELECT deptno, MIN(hiredate) FROM professor GROUP BY deptno)
ORDER BY 3;


-- emp2 테이블에서 직급별 최대 연봉을 받는 직원의 이름, 직급, 연봉 조회
SELECT name, position, pay
FROM emp2
WHERE pay IN (SELECT MAX(pay) FROM emp2 GROUP BY position);

SELECT name, position, pay
FROM emp2
WHERE (position, pay) IN (SELECT position, MAX(pay) FROM emp2 GROUP BY position);


-- student, exam_01, department 테이블에서 같은 학과 같은 학년 학생의 평균 점수보다 점수가 높은 학생의 학번, 이름, 학과, 학년, 점수 조회
SELECT s.studno, s.name, d.dname, s.grade, e.total
FROM student s JOIN department d ON s.deptno1=d.deptno
               JOIN exam_01 e USING(studno)
WHERE e.total >any (SELECT AVG(e1.total)
                    FROM student s1 JOIN exam_01 e1 USING(studno)
                    GROUP BY grade, deptno1)
ORDER BY s.deptno1, s.grade;


SELECT s.studno, s.name, d.dname, s.grade, e.total
FROM student s JOIN department d ON s.deptno1=d.deptno
               JOIN exam_01 e USING(studno)
WHERE e.total >= (SELECT AVG(e1.total)
                  FROM student s1 JOIN exam_01 e1 USING(studno)
                  WHERE s.grade=s1.grade AND s.deptno1=s1.deptno1)
ORDER BY s.grade, s.deptno1;


-- emp2 테이블에서 직원들 중 자신의 직급의 평균연봉과 같거나 많의 받는 사람들의 이름, 직급, 연봉 조회
-- 단, 직급이 없으면 조회하지 않음
SELECT e1.name, e1.position, e1.pay
FROM emp2 e1
WHERE e1.position <> ''AND e1.position IS NOT NULL
  AND e1.pay >= (SELECT AVG(e2.pay) FROM emp2 e2 WHERE e1.position=e2.position);


-- student, professor 테이블에서 담당 학생이 있는 교수들의 교수번호, 교수명 조회
SELECT DISTINCT s.profno, p.name
FROM student s JOIN professor p USING(profno)
WHERE profno IS NOT NULL;

SELECT p.profno, p.name
FROM professor p
WHERE EXISTS (SELECT * FROM student WHERE profno=p.profno);

SELECT e.profno, p.name
FROM (SELECT DISTINCT profno FROM student) e JOIN professor p USING(profno);

-- student, professor 테이블에서 담당 학생이 없는 교수들의 교수번호 교수명 조회
SELECT p.profno, p.name
FROM professor p
WHERE NOT EXISTS(SELECT * FROM student s WHERE p.profno=s.profno);


-- emp, dept 테이블에서 직원이 한 명도 소속되지 않은 부서의 부서번호와 부서명 조회
SELECT d.deptno, d.dname
FROM dept d
WHERE NOT EXISTS(SELECT * FROM emp WHERE d.deptno=deptno);


-- limit : 페이징 처리할 때 많이 사용 (가져올 개수를 지정할 때 사용)
-- emp 테이블에서 sal의 상위 5개를 가져옴
-- limit 상에서는 예외적으로 0번째가 존재함
-- limit(숫자1, 숫자2) : 숫자1번째부터 숫자2개만큼 가져옴 (숫자1이 생략되면 0을 의미)

SELECT *
FROM emp
ORDER BY sal desc
    limit 5;

SELECT * FROM emp ORDER BY sal desc limit 5, 5;
