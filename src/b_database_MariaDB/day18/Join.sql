-- JOIN : 2개 이상의 테이블을 합친 것을 의미

-- CREATE TABLE : 테이블 생성
-- DROP TABLE : 테이블이 있으면 삭제
DROP TABLE test1;
CREATE TABLE test1(
                      A VARCHAR(10),
                      B VARCHAR(10)
);

DROP TABLE test2;
CREATE TABLE test2(
                      A VARCHAR(10),
                      C VARCHAR(20),
                      D VARCHAR(20));

-- TABLE에 데이터 삽입
INSERT INTO test1 VALUES('a1', 'b1');
INSERT INTO test1 VALUES('a2', 'b2');

INSERT INTO test2 VALUES('a3', 'c3', 'd3');
INSERT INTO test2 VALUES('a4', 'c4', 'd4');
INSERT INTO test2 VALUES('a5', 'c5', 'd5');

-- t1에 있는 모든 컬럼과 t2에 있는 모든 컬럼을 조회
SELECT t1.*, t2.*
FROM test1 t1, test2 t2;

SELECT e.*, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno;

SELECT e.empno, e.ename, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno;

SELECT e.empno, e.ename, d.dname
FROM emp e INNER JOIN dept d
                      ON e.deptno=d.deptno
WHERE e.deptno=10;


-- student, department 테이블을 이용해 학번, 학생명, 제1학과명 조회
SELECT s.studno, s.name, d.dname
FROM student s, department d
WHERE s.deptno1=d.deptno;

SELECT s.studno, s.name, d.dname
FROM student s JOIN department d
                    ON s.deptno1=d.deptno;


-- student, professor 테이블을 이용하여 학번, 학생명, 담당교수명을 조회
-- 당당 교수가 NULL인 학생들은 가져오지 않음
SELECT s.studno, s.name, p.name
FROM student s, professor p
WHERE s.profno=p.profno;

SELECT s.studno, s.name, p.name
FROM student s JOIN professor p
                    ON s.profno=p.profno;

-- LEFT JOIN : 조건을 만족하지 않아도 왼쪽 테이블에 있는 모든 행을 가져오라는 것
-- student, professor 테이블을 이용하여 학번, 학생명, 담당교수명을 조회
SELECT s.studno, s.name, p.name
FROM student s LEFT JOIN professor p
                         ON s.profno=p.profno;

-- RIGHT JOIN
SELECT s.studno, s.name, p.name
FROM student s RIGHT JOIN professor p
                          ON s.profno=p.profno;


-- UNION
SELECT s.studno, s.name, p.name
FROM student s LEFT JOIN professor p
                         ON s.profno=p.profno
UNION
SELECT s.studno, s.name, p.name
FROM student s RIGHT JOIN professor p
                          ON s.profno=p.profno;


-- student, department, professor를 이용해 학번, 이름, 제1전공명, 담당교수명 조회
SELECT s.studno, s.name, d.dname, p.name
FROM student s, department d, professor p
WHERE s.deptno1=d.deptno AND s.profno=p.profno;

SELECT s.studno, s.name, d.dname, p.name
FROM student s JOIN department d ON s.deptno1=d.deptno
               LEFT JOIN professor p ON s.profno=p.profno;


-- student, exam_01 테이블을 이용해 학번, 이름, 시험점수 조회
SELECT s.studno, s.name, e.total
FROM student s, exam_01 e
WHERE s.studno=e.studno;

SELECT s.studno, s.name, e.total
FROM student s JOIN exam_01 e
                    ON s.studno=e.studno
ORDER BY 3 desc;


-- student, exam_01, hakjum 테이블을 이용하여 학번, 이름, 시험 점수, 학점 조회
SELECT s.studno, s.name, e.total, h.grade
FROM student s, exam_01 e, hakjum h;
WHERE (s.studno=e.studno) AND (e.total BETWEEN h.min_point AND h.max_point);

SELECT s.studno, s.name, e.total, h.grade
FROM student s JOIN exam_01 e ON s.studno=e.studno
               JOIN hakjum h ON e.total BETWEEN h.min_point AND h.max_point;


-- gogakk, gift 테이블을 이용해 고객의 모든 정보와 고객이 본인의 포인트로 받을 수 있는 가장 좋은 상품 조회
SELECT g.*, t.gname
FROM gogak g JOIN gift t
                  ON g.point BETWEEN g_start AND g_end
ORDER BY g.point;

SELECT g.*, t.gname
FROM gogak g, gift t
WHERE g.point BETWEEN g_start AND g_end
ORDER BY g.point;


-- emp2, p_grade 테이블을 이용하여 이름, 직위, 급여, 같은 직급의 최소 급여, 최대 급여 조회
SELECT e.name, p.position, p.s_pay, p.e_pay
FROM emp2 e JOIN p_grade p
                 ON p.position = e.position


-- emp2 , p_grade 테이블을 이용하여 이름, 직위, 나이, 본인의 나이에 해당하는 예상 직급 조회
SELECT e.name, p.position, YEAR(CURDATE())-YEAR(e.birthday) "나이", p.position
FROM emp2 e, p_grade p
WHERE YEAR(CURDATE())-YEAR(e.birthday) BETWEEN p.s_age AND p.e_age;


-- gogak, gift 테이블을 이용하여 노트북을 받을 수 있는 고객긔 이름, 포인트, 상품명 조회
SELECT g.gname, g.point, t.gname
FROM gogak g, gift t
WHERE  g.point >= t.g_start AND t.gname='노트북';

SELECT g.gname, g.point, t.gname
FROM gogak g JOIN gift t ON g.point >= t.g_start
WHERE t.gname='노트북';


-- SELF JOIN
-- dept2 테이블을 이용하여 부서의 모든 정보와 각 부서의 상위 부서명을 조회
SELECT d.*, de.area
FROM dept2 d LEFT JOIN dept2 de
                       ON d.pdept=de.dcode;

SELECT d.*, de.*
FROM dept2 d, dept2 de
ORDER BY 1;


-- emp 테이블을 이용하여 직원의 사번, 이름, 담당 매니저(MGR)사번과 이름 조회
SELECT e1.empno, e1.ename, e1.mgr, e2.ename
FROM emp e1, emp e2
WHERE e1.mgr=e2.mgr;


-- student, department 테이블을 이용하여 학번, 이름, 제1전공명, 제2전공명 조회
-- 제2전공이 NULL인 학생들은 NULL인 상태로 나오도록 출력
SELECT s.studno, s.name, d1.dname, d2.dname
FROM student s JOIN department d1 ON s.deptno1=d1.deptno
               LEFT JOIN department d2 ON s.deptno2=d2.deptno;


-- student, department 테이블을 이용하여 컴퓨터정보학부에 속한 학생들의 학번, 이름, 학과 조회
SELECT s.studno, s.name, d.dname
FROM student s JOIN department d
                    ON s.deptno1=d.deptno AND d.part=100;

SELECT s.studno, s.name, d2.dname, d1.dname
FROM student s JOIN department d1 ON s.deptno1=d1.deptno
               JOIN department d2 ON (d1.part=d2.deptno AND d2.dname='컴퓨터정보학부');

-- department 테이블에서 '컴퓨터정보학부'인 학과 조회
SELECT d2.dname, d1.dname
FROM department d1 JOIN department d2
                        ON d1.part=d2.deptno
WHERE d2.dname='컴퓨터정보학부';


-- student, department 테이블에서 제1전공이나 제2전공으로 인해 '전자제어관'에서 수업을 듣는 학생들 조회
SELECT s.studno, s.name, s.deptno1, s.deptno2, d1.build
FROM student s JOIN department d1
                    ON s.deptno1=d1.deptno OR s.deptno2=d1.deptno
WHERE d1.build='전자제어관';

SELECT s.studno, s.name, s.deptno1, s.deptno2, d1.build, d2.build
FROM student s JOIN department d1 ON s.deptno1=d1.deptno
               LEFT JOIN department d2 ON s.deptno2=d2.deptno
WHERE d1.build='전자제어관' OR d2.build='전자제어관';

-- emp 테이블에서 자신보다 입사일이 빠른 사람의 수 조회 (NULL 값을 포함하지 않음)
SELECT e1.empno, e1.ename, e1.hiredate, COUNT(e2.hiredate)
FROM emp e1 LEFT JOIN emp e2
                      ON e1.hiredate > e2.hiredate
GROUP BY e1.empno, e1.ename
ORDER BY 1;

-- professor 테이블을 이용하여 교수번호, 교수이름, 입사일, 자신보다 먼저 입사한 사람 인원수 조회
SELECT p1.profno, p1.name, p1.hiredate, COUNT(p2.hiredate)
FROM professor p1 JOIN professor p2
                       ON p1.hiredate > p2.hiredate
GROUP BY p1.profno
ORDER BY 4;


SELECT e.*, d.*
FROM emp e JOIN dept d ON e.deptno=d.deptno;

-- USING 사용 : 조인하는 칼럼명이 동일할 경우 사용
SELECT e.*, d.dname
FROM emp e  JOIN dept d USING(deptno);

-- 위에서 USING사용 대신 NATURAL 사용 가능
SELECT e.*, d.dname
FROM emp e  NATURAL JOIN dept d;

ALTER TABLE STUDENT ADD COSTRAINT FK_PROFNO FOREIGN KEY (PROFNO) REFERENCES PROFESSOR (PROFNO);

-- MYSQL은 FULL OUTER JOIN을 지원하지 않음
SELECT s.*, p.name
FROM student s FULL OUTER JOIN professor p USING(profno);

SELECT s.*, p.name
FROM student s LEFT JOIN professor p USING(profno)
UNION
SELECT s.*, p.name
FROM student s RIGHT JOIN professor p USING(profno);

