-- Использование базы данных "HumanFriends"
USE HumanFriends;

-- Удаление внешнего ключа
ALTER TABLE Pets_Commands_Relationship DROP FOREIGN KEY Pets_Commands_Relationship_ibfk_1;

ALTER TABLE PackAnimals_Commands_Relationship DROP FOREIGN KEY PackAnimals_Commands_Relationship_ibfk_1;




-- Удаление старых таблиц Pets и PackAnimals
DROP TABLE IF EXISTS Pets;
DROP TABLE IF EXISTS PackAnimals;


-- Удаление старых таблиц HorseAndDonkey и Combined_Animals_1_to_3_Years
DROP TABLE IF EXISTS HorseAndDonkey;
DROP TABLE IF EXISTS Combined_Animals_1_to_3_Years;