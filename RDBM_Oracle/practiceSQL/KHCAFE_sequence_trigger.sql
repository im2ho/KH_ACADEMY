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
        REFERENCES cafes(cafe_id) ON DELETE CASCADE --cafes�� ���� �� menu�� ���� �������
);

--------------------------------------------------

--SEQUENCE : 1���� �����ؼ� ���� �ϳ��� �����ϰ� �����
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
    SELECT cafe_seq.NEXTVAL --���� ��ȣ�� �Ѿ�����ϴ�
    INTO : NEW.cafe_id --���� ���� cafe_id�� �ְ���..
    FROM dual;
END;
/

UPDATE cafes SET cafe_id = cafe_seq.nextVAL; --�ڽ� ���̺� menu�� �վ �ȵ�;;

--���1.foreign key DROP
--���2. �� �� ������ �����ϱ�?

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
SELECT 1, 1,'�Ƹ޸�ī��', 4500, 'ī���μ�������' FROM DUAL UNION ALL
SELECT 2, 2, 'ī���', 5000, '�Ƹ޸�ī�밡 �ʹ� �� ��' FROM DUAL UNION ALL
SELECT 3, 3, '��ī��', 5000, '��ũ���ݸ� ǳ�̰� ����' FROM DUAL UNION ALL
SELECT 4, 4, '�� ���� ������', 6000, '�������� ���� ź������ �ٵ� ���� ��ī������ �����' FROM DUAL UNION ALL
SELECT 5, 5, '�������', 6000, '����Ը�����' FROM DUAL UNION ALL
SELECT 6, 6, '�ٴҶ� ũ�� �ݵ���', 5500, '�ٴҶ�󶼰� �δ㽺���� ��' FROM DUAL UNION ALL
SELECT 7, 7, '�ٴҶ� ��', 5500, '��ũ���� �ʹ� �Թ��� ��' FROM DUAL UNION ALL
SELECT 8, 8, '���⿡ �� ���ݸ� ��', 6500, '������� ������ ���Ŀ�' FROM DUAL UNION ALL
SELECT 9, 9, '��ũ����', 6500, '�ް�Ŀ�ǿ��� ������ ���Ŀ�' FROM DUAL UNION ALL
SELECT 10, 10, '���ν����', 6000, 'ù ���� �ε巴�� �����ϸ� �� ���� ����ϰ� �Խ��� ��¼��' FROM DUAL UNION ALL
SELECT 11, 11, '������', 5500, '�س����� ���� ���ִ�' FROM DUAL UNION ALL
SELECT 12, 12, '���ǳ� ��', 5000, '�߰��� �� �����ϸ� �弼��' FROM DUAL UNION ALL
SELECT 13, 13, '�׸��н�', 6500, '�����𿡼� ������ ���Ŀ� ����FC �α� 1�� �޴�' FROM DUAL UNION ALL
SELECT 14, 14, '���ο�Ŭ����', 6500, '�̰͵� �����ҰԿ� ����' FROM DUAL UNION ALL
SELECT 15, 15, '���������', 6500, '��¥ ������ ����' FROM DUAL UNION ALL
SELECT 16, 16, '����Ŭ����', 6500, '�Ÿ޴� ����' FROM DUAL UNION ALL
SELECT 17, 17, '�޴� �̸�', 300, '�쿨�˾�' FROM DUAL UNION ALL
SELECT 18, 18, '�߰��ϱ�', 400, '����������' FROM DUAL UNION ALL
SELECT 19, 19, '�� �����..', 600, '���Ŀ�' FROM DUAL;


---------------------------------------------------

CREATE SEQUENCE c
START WITH 1
INCREMENT BY 1;

UPDATE products SET product_id = c.nextVAL;
