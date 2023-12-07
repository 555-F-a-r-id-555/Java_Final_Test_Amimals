-- Использование базы данных "HumanFriends"
USE HumanFriends;

-- Создание пустой таблицы All_Animals
CREATE TABLE IF NOT EXISTS All_Animals (
    AnimalID INT AUTO_INCREMENT PRIMARY KEY,
    AnimalName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE,
    AgeInMonths INT,
    SourceTable VARCHAR(20)
);

-- Вставка данных из таблицы Pets в новую таблицу All_Animals с указанием источника данных
INSERT INTO All_Animals (AnimalName, TypeAnimal, BirthDate, AgeInMonths, SourceTable)
SELECT
    PetName AS AnimalName,
    TypeAnimal,
    BirthDate,
    TIMESTAMPDIFF(MONTH, BirthDate, NOW()) AS AgeInMonths,
    'Pets' AS SourceTable
FROM
    Pets;

-- Вставка данных из таблицы PackAnimals в новую таблицу All_Animals с указанием источника данных
INSERT INTO All_Animals (AnimalName, TypeAnimal, BirthDate, AgeInMonths, SourceTable)
SELECT
    PackAnimalName AS AnimalName,
    TypeAnimal,
    BirthDate,
    TIMESTAMPDIFF(MONTH, BirthDate, NOW()) AS AgeInMonths,
    'PackAnimals' AS SourceTable
FROM
    PackAnimals;
   
   -- Вставка данных из таблицы Combined_Animals_1_to_3_Years в All_Animals с указанием источника данных
INSERT INTO All_Animals (AnimalName, TypeAnimal, BirthDate, AgeInMonths, SourceTable)
SELECT
    CombinedAnimalsName AS AnimalName,
    TypeAnimal,
    BirthDate,
    AgeInMonths,
    'Combined_Animals_1_to_3_Years' AS SourceTable
FROM
    Combined_Animals_1_to_3_Years;

-- Вставка данных из таблицы HorseAndDonkey в All_Animals с указанием источника данных
INSERT INTO All_Animals (AnimalName, TypeAnimal, BirthDate, AgeInMonths, SourceTable)
SELECT
    PackAnimalName AS AnimalName,
    TypeAnimal,
    BirthDate,
    TIMESTAMPDIFF(MONTH, BirthDate, NOW()) AS AgeInMonths,
    'PackAnimals' AS SourceTable
FROM
    HorseAndDonkey;

