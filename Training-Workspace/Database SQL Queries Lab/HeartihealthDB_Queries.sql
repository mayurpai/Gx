 -- Hearthealth DB

-- Get all the predictions 
SELECT * FROM CARDIODIAGNOSIS;

-- Get all the predictions for the day
SELECT DATE, CARDIOARRESTDETECTED FROM CARDIODIAGNOSIS;

-- Get all the predictions for the day and sort it
-- based on highest percentage of probability at the top
SELECT SUM(CARDIOARRESTDETECTED), DATE FROM CARDIODIAGNOSIS
GROUP BY DATE 
ORDER BY CARDIOARRESTDETECTED DESC;

-- Get all the unique cities
SELECT CITY FROM ADDRESSINFO
GROUP BY CITY; 

-- Get all the members who are from a city - 'Burgos'
SELECT MEMBERINFO_MEMBER_ID FROM ADDRESSINFO WHERE CITY = 'BURGOS';

-- Get all the members who are from 'flora' city
SELECT MEMBERINFO_MEMBER_ID FROM ADDRESSINFO WHERE CITY = 'FLORA';


-- Get the total number of bloodtests done for Aisha
-- SELECT COUNT() FROM MEMBERINFO WHERE firstname = 'Aisha';

-- Get the xray details of Ajay whose cardio was done on 26th of Jan 2019
SELECT *
FROM XRAY JOIN CARDIODIAGNOSIS CARDIO
ON XRAY.CARDIODIAGNOSIS_CARDIO_ID = CARDIO.CARDIO_ID
JOIN MEMBERINFO 
ON MEMBERINFO.MEMBER_ID = CARDIO.MEMBERINFO_MEMBER_ID
WHERE MEMBERINFO.FIRSTNAME = 'AJAY' AND CARDIO.DATE LIKE '2019-01-26%';

-- Get all the members who are from city burgos and flora 
SELECT MEMBERINFO_MEMBER_ID FROM ADDRESSINFO
WHERE CITY = 'BURGOS' AND CITY = 'FLOAR';

-- Get the total number of bloodtests done for aberson

-- Get all address details for member ID M303
SELECT * FROM ADDRESSINFO JOIN MEMBERINFO
ON ADDRESSINFO.MEMBERINFO_MEMBER_ID = MEMBERINFO.MEMBER_ID
WHERE MEMBERINFO.MEMBER_ID = 'M303';

-- Get all xray details for cardio id cid 122
SELECT *
FROM XRAY JOIN CARDIODIAGNOSIS CARDIO
ON XRAY.CARDIODIAGNOSIS_CARDIO_ID = CARDIO.CARDIO_ID
WHERE CARDIO.CARDIO_ID = 'CID122';

-- Get all symptom details whose cardio id = cid250 and cid300
SELECT *
FROM SYMPTOM JOIN CARDIODIAGNOSIS CARDIO
ON SYMPTOM.CARDIODIAGNOSIS_CARDIO_ID = CARDIO.CARDIO_ID
WHERE CARDIO.CARDIO_ID = 'CID250' OR CARDIO.CARDIO_ID = 'CID300';

-- get all symptom details for month july and year 2019
SELECT * FROM SYMPTOM WHERE DATE LIKE '2019-07%';

-- get xray details for member with lastname "dailley"
SELECT *
FROM XRAY JOIN CARDIODIAGNOSIS CARDIO
ON XRAY.CARDIODIAGNOSIS_CARDIO_ID = CARDIO.CARDIO_ID
JOIN MEMBERINFO 
ON MEMBERINFO.MEMBER_ID = CARDIO.MEMBERINFO_MEMBER_ID
WHERE MEMBERINFO.LASTNAME = 'DAILLEY';

-- get wearabledevicedata details from cardio id from cid100 to cid200 
SELECT *
FROM WEARABLEDEVICEDATA WDD JOIN CARDIODIAGNOSIS CARDIO
ON WDD.CARDIODIAGNOSIS_CARDIO_ID = CARDIO.CARDIO_ID
WHERE CARDIO.CARDIO_ID BETWEEN 'CID100' AND 'CID200';

-- display all cardiodiagnosis details who first name start from letter "A"
SELECT *
FROM MEMBERINFO JOIN CARDIODIAGNOSIS CARDIO
ON MEMBERINFO.MEMBER_ID = CARDIO.MEMBERINFO_MEMBER_ID
WHERE FIRSTNAME LIKE 'A%';

-- display all cardiodiagnosis details who first name start from letter "A" and ends at letter "A"
SELECT *
FROM MEMBERINFO JOIN CARDIODIAGNOSIS CARDIO
ON MEMBERINFO.MEMBER_ID = CARDIO.MEMBERINFO_MEMBER_ID
WHERE FIRSTNAME LIKE 'A%A';

-- Create a Stored Procedure to get the details (firstname, lastname, age) of the members by just passing the member_id as a parameter.
DELIMITER @@
CREATE PROCEDURE GetMemberDetailsByMemberID(
IN MEMBER_IDS VARCHAR(45))
BEGIN
SELECT
FIRSTNAME, LASTNAME, AGE
FROM MEMBERINFO
WHERE MEMBER_ID = MEMBER_IDS;
END
@@
DELIMITER ;

call GetMemberDetailsByMemberID('M100');

-- Create a Stored Procedure to insert the details of the any new member by just passing the details as parameters.
DELIMITER @@
CREATE PROCEDURE InsertMemberDetailsByMemberID(
MEMBER_ID VARCHAR(45),
USERNAME VARCHAR(45),
FIRSTNAME VARCHAR(45),
LASTNAME VARCHAR(45),
AGE INT,
GENDER VARCHAR(45),
EMAIL VARCHAR(45),
PHONENUMBER BIGINT)
BEGIN
INSERT INTO MEMBERINFO VALUES(MEMBER_ID, USERNAME, FIRSTNAME, LASTNAME, AGE, GENDER, EMAIL, PHONENUMBER);
END
@@
DELIMITER ;

call InsertMemberDetailsByMemberID('M1000', 'ABCXYZ', 'ABC', 'XYX', 22, 'MALE', 'ABCXYZ@GMAIL.COM', 1234567890);
SELECT * FROM MEMBERINFO WHERE MEMBER_ID = 'M1000';

-- Create a Stored Procedure to get the X-ray report of the patient, based on their name and the date of cardiac test done.

-- Create a Stored procedure which would return the count of the patients based on the data stored in the database. Pass the parameter to get count of patients who are predicted or who are safe from getting a heart attack.

-- Write a stored procedure to create a memberinfo - M304
-- Create a stored procedure to add member address
-- Create a stored procedure to get member name of member_id - M250
-- Create a stored procedure to get city name of member_id - M275


-- Create a Function which would provide the count of the patients based on the data stored in the database. Pass the parameter to get count of patients who are predicted or who are safe from getting a heart attack.
DELIMITER @@
CREATE FUNCTION GetSafeCount(
MEMBER_ID VARCHAR(45)
)
RETURNS INT
BEGIN
    declare city_name varchar(45);
    -- Executing select query
    select city into city_name from addressinfo where
    memberinfo_member_id = member_id;
    -- Returning the value
    return city_name;
end $$
delimiter ;

CALL GetSafeCount(-131, @customerLevel);
SELECT @customerLevel;



