-- Использование базы данных "HumanFriends"
USE HumanFriends3;


-- Добавление столбца Commands в таблицу Pets2 и заполнение его значениями из Pets_Commands_Relationship2
ALTER TABLE Pets3
ADD Commands VARCHAR(255);

-- Обновление списка команд для животных в таблице Pets2
UPDATE Pets3 p
SET p.Commands = (
    SELECT GROUP_CONCAT(c.CommandName SEPARATOR ', ')
    FROM Pets_Commands_Relationship3 pr
    JOIN Commands3 c ON pr.CommandID = c.CommandID
    WHERE pr.PetID = p.PetID
    GROUP BY pr.PetID
);

-- Добавление столбца Commands в таблицу PackAnimals2 и заполнение его значениями из PackAnimals_Commands_Relationship2
ALTER TABLE PackAnimals3
ADD Commands VARCHAR(255);

-- Обновление списка команд для животных в таблице PackAnimals2
UPDATE PackAnimals3 pa
SET pa.Commands = (
    SELECT GROUP_CONCAT(c.CommandName SEPARATOR ', ')
    FROM PackAnimals_Commands_Relationship3 par
    JOIN Commands3 c ON par.CommandID = c.CommandID
    WHERE par.PackAnimalID = pa.PackAnimalID
    GROUP BY par.PackAnimalID
);



-- Создание таблицы Animals2
CREATE TABLE IF NOT EXISTS Animals3 (
    FirstFIeldName VARCHAR(20),
    AnimalID INT PRIMARY KEY  AUTO_INCREMENT,
    AnimalName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);

-- Вставка данных из Pets2 в таблицу Animals2
INSERT INTO Animals3 (FirstFieldName,AnimalName, TypeAnimal, BirthDate, Commands)
SELECT 
	'Pet' AS FirstFieldName,
    PetName AS AnimalName,
    TypeAnimal,
    BirthDate,
    Commands
FROM Pets3
UNION ALL
SELECT 
    'PackAnimals' AS FirstFieldName,
    PackAnimalName AS AnimalName,
    TypeAnimal,
    BirthDate,
    Commands
FROM PackAnimals3;

-- Показать содержимое новой таблицы Animals2
SELECT * FROM Animals3;




