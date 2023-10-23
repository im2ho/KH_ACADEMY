CREATE TABLE cafes (
    cafe_id INT PRIMARY KEY,
    cname VARCHAR2(255) NOT NULL,
    address VARCHAR2(255),
    phone_number VARCHAR2(15),
    operationg_hours VARCHAR2(255)
);
DROP TABLE menu;
CREATE TABLE menu (
    menu_id INT PRIMARY KEY,
    cafe_id INT,
    menu_name VARCHAR2(255) NOT NULL,
    price number(8,2) NOT NULL,
    description VARCHAR2(500),
    CONSTRAINT fk_cafes
        FOREIGN KEY(cafe_id)
        REFERENCES cafes(cafe_id) ON DELETE CASCADE --cafes를 지울 때 menu도 같이 지우겟음
);

--------------------------------------------------

--SEQUENCE : 1부터 시작해서 값을 하나씩 증가하게 만들기
CREATE SEQUENCE cafe_seq
START WITH 1
INCREMENT BY 1
NOCACHE; --NOCYLCLE;
/*
CREATE SEQUENCE cafes_seq
START WITH 19
INCREMENT BY 1
NOCACHE;
*/

--TRIGGER
CREATE OR REPLACE TRIGGER cafes_trigger
BEFORE INSERT ON cafes
FOR EACH ROW
BEGIN
    SELECT cafe_seq.NEXTVAL --다음 번호로 넘어가겟읍니다
    INTO : NEW.cafe_id --다음 값에 cafe_id를 넣겟음..
    FROM dual;
END;
/

UPDATE cafes SET cafe_id = cafe_seq.nextVAL; --자식 테이블 menu가 잇어서 안됨;;

--방법1.foreign key DROP
--방법2. 둘 다 시퀀스 적용하기?

---------------------------------------------------

CREATE SEQUENCE menu_seq
START WITH 1
INCREMENT BY 1
NOCACHE;

CREATE OR REPLACE TRIGGER menu_trigger
BEFORE INSERT ON menu
FOR EACH ROW
BEGIN
    SELECT menu_seq.NEXTVAL
    INTO:NEW.menu_id
    FROM dual;
END;
/
---------------------------------------------------
INSERT INTO menu(menu_id, cafe_id, menu_name, price, description)
SELECT 1, 1,'아메리카노', 4500, '카페인수혈포션' FROM DUAL UNION ALL
SELECT 2, 2, '카페라떼', 5000, '아메리카노가 너무 쓸 때' FROM DUAL UNION ALL
SELECT 3, 3, '모카라떼', 5000, '다크초콜릿 풍미가 찐한' FROM DUAL UNION ALL
SELECT 4, 4, '쿨 라임 피지오', 6000, '라임향이 좋은 탄산음료 근데 이제 고카페인을 곁들인' FROM DUAL UNION ALL
SELECT 5, 5, '딸기오레', 6000, '잼민입맛저격' FROM DUAL UNION ALL
SELECT 6, 6, '바닐라 크림 콜드브루', 5500, '바닐라라떼가 부담스러울 때' FROM DUAL UNION ALL
SELECT 7, 7, '바닐라 라떼', 5500, '바크쿨은 너무 밋밋할 때' FROM DUAL UNION ALL
SELECT 8, 8, '벨기에 생 초콜릿 라떼', 6500, '컴포즈에서 레시피 훔쳐옴' FROM DUAL UNION ALL
SELECT 9, 9, '퐁크러쉬', 6500, '메가커피에서 레시피 훔쳐옴' FROM DUAL UNION ALL
SELECT 10, 10, '아인슈페너', 6000, '첫 맛은 부드럽고 달콤하며 끝 맛은 깔끔하고 쌉쌀한 어쩌구' FROM DUAL UNION ALL
SELECT 11, 11, '고구마라떼', 5500, '해남고구마 썻음 맛있다' FROM DUAL UNION ALL
SELECT 12, 12, '토피넛 라떼', 5000, '견과류 향 좋아하면 드세요' FROM DUAL UNION ALL
SELECT 13, 13, '그린밀싹', 6500, '샐러디에서 레시피 훔쳐옴 수원FC 인기 1등 메뉴' FROM DUAL UNION ALL
SELECT 14, 14, '옐로우클렌즈', 6500, '이것도 날먹할게요 ㅎㅎ' FROM DUAL UNION ALL
SELECT 15, 15, '오렌지당근', 6500, '진짜 마지막 날먹' FROM DUAL UNION ALL
SELECT 16, 16, '레드클렌즈', 6500, '신메뉴 날먹' FROM DUAL UNION ALL
SELECT 17, 17, '메뉴 이름', 300, '우엥옹앙' FROM DUAL UNION ALL
SELECT 18, 18, '추가하기', 400, '힝힝퐁구리' FROM DUAL UNION ALL
SELECT 19, 19, '넘 힘들다..', 600, '웨옭옹' FROM DUAL;


---------------------------------------------------

CREATE SEQUENCE c
START WITH 1
INCREMENT BY 1;

UPDATE products SET product_id = c.nextVAL;
