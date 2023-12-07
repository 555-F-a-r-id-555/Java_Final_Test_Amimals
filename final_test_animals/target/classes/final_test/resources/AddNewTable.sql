-- Использование базы данных "HumanFriends"
USE HumanFriends;

-- Удаление записей о верблюдах (Camel) из таблицы "PackAnimals"
DELETE FROM PackAnimals_Commands_Relationship WHERE PackAnimalID IN (
    SELECT PackAnimalID FROM PackAnimals WHERE TypeAnimal = 'Camel'
);

DELETE FROM PackAnimals WHERE TypeAnimal = 'Camel';

-- Создание новой таблицы "HorseAndDonkey" для объединения данных о лошадях и осях
CREATE TABLE IF NOT EXISTS HorseAndDonkey AS
SELECT * FROM PackAnimals WHERE TypeAnimal = 'Horse'
UNION ALL
SELECT * FROM PackAnimals WHERE TypeAnimal = 'Donkey';

-- Создание пустой таблицы Combined_Animals_1_to_3_Years
CREATE TABLE IF NOT EXISTS Combined_Animals_1_to_3_Years (
    CombinedAnimalsID INT,
    CombinedAnimalsName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE,
    AgeInMonths INT
);

-- Вставка данных из двух таблиц в новую таблицу
INSERT INTO Combined_Animals_1_to_3_Years (CombinedAnimalsID, CombinedAnimalsName, TypeAnimal, BirthDate, AgeInMonths)
SELECT
    PetID AS CombinedAnimalsID,
    PetName AS CombinedAnimalsName,
    TypeAnimal,
    BirthDate,
    TIMESTAMPDIFF(MONTH, BirthDate, NOW()) AS AgeInMonths
FROM
    Pets
WHERE
    TIMESTAMPDIFF(YEAR, BirthDate, NOW()) BETWEEN 1 AND 3;

INSERT INTO Combined_Animals_1_to_3_Years (CombinedAnimalsID, CombinedAnimalsName, TypeAnimal, BirthDate, AgeInMonths)
SELECT
    PackAnimalID AS CombinedAnimalsID,
    PackAnimalName AS CombinedAnimalsName,
    TypeAnimal,
    BirthDate,
    TIMESTAMPDIFF(MONTH, BirthDate, NOW()) AS AgeInMonths
FROM
    PackAnimals
WHERE
    TIMESTAMPDIFF(YEAR, BirthDate, NOW()) BETWEEN 1 AND 3;