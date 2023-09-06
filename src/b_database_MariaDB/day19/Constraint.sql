-- contraint : 제약조건
-- not null, unique, primary key, foreign key, check

-- PRIMARY KEY : 동일한 데이터 및 NULL값을 허용하지 않음 (unique & not null)
-- NOT NULL : NULL값이 허용되지 않음
-- UNIQUE : 동일한 데이터를 허용하지 않지만 null은 허용되며, null은 중복도 허용
-- CHECK : 값의 범위 제한. check(조건)
CREATE TABLE temp(
                     id INT PRIMARY KEY,
                     name VARCHAR(20) NOT NULL
);

INSERT INTO temp VALUES(null, 'jung'); -- 에러 : id에 null 값이 들어갈 수 없음
INSERT INTO temp VALUES(1, 'jang');
INSERT INTO temp VALUES(1, 'gong'); -- 에러 : 동일한 id 생성 불가
INSERT INTO temp VALUES(2, NULL); -- 에러 : 이름에 null이 들어갈 수 없음


CREATE TABLE temp2(
    email VARCHAR(50) UNIQUE
);

INSERT INTO temp2 VALUES(null);
INSERT INTO temp2 VALUES('kosta@kosta.com');
INSERT INTO temp2 VALUES(null);
INSERT INTO temp2 VALUES('kosta@kosta.com'); -- 에러 : email 중복



CREATE TABLE temp3(
                      name VARCHAR(20) NOT NULL,
                      age INT DEFAULT 1 CHECK(age>0)
);

-- 칼럼값을 전부 넣을 것이 아닌 경우 칼럼명 명시가 필요
INSERT INTO temp3 (name) VALUES('hong');
INSERT INTO temp3 VALUES('song', -2); -- 에러 : age>0이라는 check 조건을 만족하지 않음
INSERT INTO temp3 VALUES('song', 1);