-- 문자열 함수---

---------------------------------------

-- CONCAT : 문자열을 이을 때 사용
-- emp 테이블에서 ename(job) 형태로 만들어 출력
SELECT CONCAT(ename, '(', job, ')') AS 'ename_job' FROM emp;

-- SMITH's sla is $sal 형태로 만들어 출력
-- 문자열은 작은 따옴표를 이용하기 때문에 '를 출력하기 위해서는 ''로 작성해야 출력됨
SELECT CONCAT(ename,'''s sal is $',sal) FROM emp;

-- format(A, B) - 숫자 타입 : 숫자 반올림 진행(숫자를 반올림하여 소숫점 아래 B 자리까지 나타내기)
SELECT FORMAT(250500.1254, 2);

-- 숫자 타입으로 변환해서 출력
SELECT empno, ename, format(sal,0) FROM emp;
-- format을 쓰지 않으면 sal은 문자타입
SELECT empno, ename, sal FROM emp;

---------------------------------------

-- insert : 문자열 내의 지정된 위치에 특정 문자 수만큼 문자열을 변경
SELECT INSERT('http://naver.com', 8, 5, 'kosta');

-- student 테이블에서 주민번호 뒤 7자리를 *로 변경
SELECT studno, name, INSERT(jumin, 7, 7, '*******') 주민번호, grade 학년 FROM student;

-- gogak 테이블의 고객번호와 이름 조회(단, 이름은 가운데 글자를 *로 변경)
SELECT gno 고객번호, INSERT(gname, 2, 1, '*') 이름 FROM gogak;


---------------------------------------

-- instr : 문자열 내에서 특정 문자의 위치를 구함(indexof와 유사)
SELECT INSTR('http://naver.com', 'n');

-- student 테이블의 tel에서 )의 위치 구하기
SELECT INSTR(tel, ')') FROM student;

---------------------------------------

-- substr : 문자열 내에서 부분 문자열 추출
-- SELECT 절에도 사용하지만, WHERE 절에도 사용
-- 8번째부터 5개 가져오기
SELECT SUBSTR('http://naver.com', 8, 5);
-- 8번째부터 맨 뒤까지 가져오기
SELECT SUBSTR('http://naver.com', 8);

-- student 테이블에서 tel의 )를 이용하여 지역번호 출력하기
SELECT SUBSTR(tel, 1, INSTR(tel, ')')-1) 지역번호 FROM student;

-- student 테이블에서 주민번호 생년월일이 9월인 학생 조회
SELECT * FROM student WHERE SUBSTR(jumin, 3, 2)='09';
-- 숫자 앞에는 0이 올 수 없기 때문에 09를 문자로 인식하여 자동으로 형변환을 해줌
-- 9를 쓸 경우에는 SUBSTR을 숫자로 변환해주어서 비교해주기 때문에 오류가 나지 않음
SELECT * FROM student WHERE SUBSTR(jumin, 3, 2)=09;

-- student 테이블에서 tel의 가운데 자리 숫자 조회
SELECT SUBSTR(tel, INSTR(tel, ')')+1, (INSTR(tel, '-')-INSTR(tel, ')'))-1) 가운데번호 FROM student;

---------------------------------------

-- length : 문자열의 바이트 길이 구하기 (영문 한 글자 : 1byte, 한글 한 글자 : 3byte)
SELECT email, LENGTH(tel) FROM student;

-- professor 테이블의 이메일에서 @ 뒤의 문자열의 길이를 구하기
SELECT LENGTH(email) FROM professor;
SELECT email, INSTR(email, '@') FROM professor;
SELECT email, LENGTH(SUBSTR(email, INSTR(email, '@')+1)) '@ 뒤 길이' FROM professor;

-- @뒤의 메일 형식을 kost.com으로 변환
SELECT email, INSERT(email, INSTR(email, '@')+1, LENGTH(SUBSTR(email, INSTR(email, '@')+1)), 'kosta.com') 변환메일 FROM professor;

-- 이름의 바이트 길이 출력 (영문과 한글의 문자열 길이가 다름) 문자열의 길이가 아닌 Byte 수, 한글은 한 글자에 3Byte
SELECT ename, LENGTH(ename) FROM emp;
SELECT name, LENGTH(name) FROM student;

---------------------------------------

-- char_length : 문자열의 글자수 구하기
SELECT ename, CHAR_LENGTH(ename) FROM emp;
SELECT name, CHAR_LENGTH(name) FROM student;

---------------------------------------

-- substring : = substring
SELECT SUBSTR('http://naver.com', 8, 5);
SELECT SUBSTRING('http://naver.com', 8, 5);

---------------------------------------

-- LOWER, LCASE : 전체를 소문자로 변경
SELECT ename, LOWER(ename) FROM emp;
SELECT ename, LCASE(ename) FROM emp;

---------------------------------------

-- UPPER, UCASE : 전체를 대문자로 변경
SELECT id, UPPER(id) FROM professor;
SELECT id, UCASE(id) FROM professor;

---------------------------------------

-- trim : 앞 뒤 공백 제거
SELECT LENGTH('test.     '), LENGTH(TRIM('  .test '));
SELECT LENGTH('t e s t'), LENGTH(TRIM('t e s t'));

---------------------------------------

-- ltrim : 왼쪽 공백 제거
SELECT LENGTH('  test   '), LENGTH(LTRIM('  test   '));

---------------------------------------

-- rtrim : 오른쪽 공백 제거
SELECT LENGTH('  test   '), LENGTH(RTRIM('  test   '));


---------------------------------------

-- 문자열을 왼쪽 정렬, 숫자는 오른쪽 정렬이 디폴트
SELECT ename, sal FROM emp;
SELECT sal, ename FROM emp;

-- lpad(칼럼명, 길이, 왼쪽에 채울 문자) : 왼쪽을 특정 문자로 채워넣기 (문자가 여러개면 남는 자리만큼 해당 문자를 채워넣음)
SELECT sal, lpad(ename, 20, ' ') 이름 FROM emp;
SELECT sal, lpad(ename, 20, '8') 이름 FROM emp;
SELECT LPAD(email, 20, '123456789') FROM professor;

-- rpad(칼럼명, 길이, 오른쪽에 채울 문자) : 오른쪽을 특정 문자로 채워넣기
SELECT sal, rpad(ename, 20, ' ') 이름 FROM emp;
SELECT sal, rpad(ename, 20, '8') 이름 FROM emp;