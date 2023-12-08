-- Использование базы данных "HumanFriends"
USE HumanFriends3;



-- Удаление внешнего ключа
ALTER TABLE Pets_Commands_Relationship3 DROP FOREIGN KEY Pets_Commands_Relationship3_ibfk_1;

ALTER TABLE PackAnimals_Commands_Relationship3 DROP FOREIGN KEY PackAnimals_Commands_Relationship3_ibfk_1;




-- Удаление старых таблиц Pets и PackAnimals
DROP TABLE IF EXISTS Pets3;
DROP TABLE IF EXISTS PackAnimals3;


-- Удаление старых таблиц HorseAndDonkey и Combined_Animals_1_to_3_Years
DROP TABLE IF EXISTS HorseAndDonkey3;
DROP TABLE IF EXISTS Combined_Animals_1_to_3_Years3;



-- Удаление таблицы PackAnimals_Commands_Relationship2, если она существует
DROP TABLE IF EXISTS PackAnimals_Commands_Relationship3;

-- Удаление таблицы Pets_Commands_Relationship2, если она существует
DROP TABLE IF EXISTS Pets_Commands_Relationship3;

-- Удаление таблицы Commands2, если она существует
DROP TABLE IF EXISTS Commands3;
