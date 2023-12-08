-- Использование базы данных "HumanFriends"
USE HumanFriends3;

-- Удаление записей о верблюдах (Camel) из таблицы "PackAnimals"
DELETE FROM PackAnimals_Commands_Relationship3 WHERE PackAnimalID IN (
    SELECT PackAnimalID FROM PackAnimals3 WHERE TypeAnimal = 'Camel'
);

DELETE FROM PackAnimals3 WHERE TypeAnimal = 'Camel';

-- Создание новой таблицы "HorseAndDonkey" для объединения данных о лошадях и осях
CREATE TABLE IF NOT EXISTS HorseAndDonkey3 AS
SELECT * FROM PackAnimals3 WHERE TypeAnimal = 'Horse'
UNION ALL
SELECT * FROM PackAnimals3 WHERE TypeAnimal = 'Donkey';



-- Создание пустой таблицы Combined_Animals_1_to_3_Years
CREATE TABLE IF NOT EXISTS Combined_Animals_1_to_3_Years3 (
    CombinedAnimalsID INT,
    CombinedAnimalsName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE,
    AgeDescription VARCHAR(100)
);

-- Вставка данных из таблицы Pets2 в таблицу Combined_Animals_1_to_3_Years2 с возрастом животных в формате "годы - месяцы - дни"
INSERT INTO Combined_Animals_1_to_3_Years3 (CombinedAnimalsID, CombinedAnimalsName, TypeAnimal, BirthDate, AgeDescription)
SELECT
    PetID AS CombinedAnimalsID,
    PetName AS CombinedAnimalsName,
    TypeAnimal,
    BirthDate,
    CONCAT(
        FLOOR(DATEDIFF(NOW(), BirthDate) / 365), ' год ',
        FLOOR((DATEDIFF(NOW(), BirthDate) % 365) / 30.44), ' месяцев ',
        ROUND(DATEDIFF(NOW(), BirthDate) % 30.44), ' дней'
    ) AS AgeDescription
FROM
    Pets3
WHERE
    TIMESTAMPDIFF(MONTH , BirthDate, NOW()) BETWEEN 12 AND 36;
   
   
   
-- Вставка данных из таблицы Pets2 в таблицу Combined_Animals_1_to_3_Years2 с возрастом животных в формате "годы - месяцы - дни"
INSERT INTO Combined_Animals_1_to_3_Years3 (CombinedAnimalsID, CombinedAnimalsName, TypeAnimal, BirthDate, AgeDescription)
SELECT
    PackAnimalID AS CombinedAnimalsID,
    PackAnimalName AS CombinedAnimalsName,
    TypeAnimal,
    BirthDate,
    CONCAT(
        FLOOR(DATEDIFF(NOW(), BirthDate) / 365), ' год ',
        FLOOR((DATEDIFF(NOW(), BirthDate) % 365) / 30.44), ' месяцев ',
        ROUND(DATEDIFF(NOW(), BirthDate) % 30.44), ' дней'
    ) AS AgeDescription
FROM
    PackAnimals3
WHERE
    TIMESTAMPDIFF(MONTH , BirthDate, NOW()) BETWEEN 12 AND 36;
   

   

   
   






