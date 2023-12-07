-- Создание базы данных "HumanFriends"
CREATE DATABASE IF NOT EXISTS HumanFriends;

-- Использование базы данных "HumanFriends"
USE HumanFriends;

-- Создание таблицы "Pets"
CREATE TABLE IF NOT EXISTS Pets (
    PetID INT AUTO_INCREMENT PRIMARY KEY,
    PetName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE
);

-- Создание таблицы "PackAnimals"
CREATE TABLE IF NOT EXISTS PackAnimals (
    PackAnimalID INT AUTO_INCREMENT PRIMARY KEY,
    PackAnimalName VARCHAR(50),
    TypeAnimal VARCHAR(50),
    BirthDate DATE
);

-- Создание таблицы "Commands"
CREATE TABLE IF NOT EXISTS Commands (
    CommandID INT AUTO_INCREMENT PRIMARY KEY,
    CommandName VARCHAR(255)
);

-- Создание таблицы "Pets_Commands_Relationship"
CREATE TABLE IF NOT EXISTS Pets_Commands_Relationship (
    PetID INT,
    CommandID INT,
    FOREIGN KEY (PetID) REFERENCES Pets(PetID),
    FOREIGN KEY (CommandID) REFERENCES Commands(CommandID),
    PRIMARY KEY (PetID, CommandID)
);


-- Создание таблицы "PackAnimals_Commands_Relationship"
CREATE TABLE IF NOT EXISTS PackAnimals_Commands_Relationship (
    PackAnimalID INT,
    CommandID INT,
    FOREIGN KEY (PackAnimalID) REFERENCES PackAnimals(PackAnimalID),
    FOREIGN KEY (CommandID) REFERENCES Commands(CommandID),
    PRIMARY KEY (PackAnimalID, CommandID)
);

-- Добавление данных в таблицу Pets
INSERT INTO Pets (PetName,TypeAnimal,BirthDate) VALUES
    ('Fido', 'Dog', '2020-01-01'),
    ('Whiskers', 'Cat', '2019-05-15'),
    ('Hammy', 'Hamster', '2021-03-10'),
    ('Buddy', 'Dog', '2018-12-10'),
    ('Smudge', 'Cat', '2020-02-20'),
    ('Peanut', 'Hamster', '2021-08-01'),
    ('Bella', 'Dog', '2019-11-11'),
    ('Oliver','Cat','2020-06-30');
   
   
   -- Добавление данных в таблицу PackAnimals
INSERT INTO PackAnimals (PackAnimalName, TypeAnimal ,BirthDate) VALUES
    ('Thunder', 'Horse', '2015-07-21'),
    ('Sandy', 'Camel', '2016-11-03'),
    ('Eeyore', 'Donkey', '2017-09-18'),
    ('Storm', 'Horse', '2014-05-05'),
    ('Dune', 'Camel', '2018-12-12'),
    ('Burro', 'Donkey', '2019-01-23'),
    ('Blaze', 'Horse', '2016-02-29'),
    ('Sahara', 'Camel', '2015-08-14');
   
   -- Добавление данных в таблицу Commands
INSERT INTO Commands (CommandName) VALUES
    ('Sit'), -- 1
    ('Stay'), -- 2
    ('Bark'), -- 3
    ('Paw'),  -- 4
    ('Fetch'), -- 5
    ('Roll'), -- 6
    ('Pounce'), -- 7
    ('Scratch'), -- 8
    ('Meow'), -- 9
    ('Jump'), -- 10
    ('Hide'), -- 11
    ('Spin'), -- 12
    ('Trot'), -- 13
    ('Canter'), -- 14
    ('Run'), -- 15
    ('Walk'), -- 16
    ('Carry Load'), -- 17
    ('Bray'), -- 18
    ('Kick'), -- 19
    ('Gallop'); -- 20
   
   -- Добавление связей между животными и командами в таблицу Pets_Commands_Relationship
INSERT INTO Pets_Commands_Relationship (AnimalID, CommandID) VALUES
    (1, 1), -- Fido: Sit
    (1, 2),  -- Fido: Stay
    (1, 4),  -- Fido: Fetch
    (2, 1), -- Whiskers: Sit
    (2, 7), -- Whiskers: Pounce
    (3, 6), -- Hammy: Roll
    (3, 11), -- Hammy: Hide
    (4, 1), -- Buddy: Sit
    (4, 4), -- Buddy: Pow
    (4, 3), -- Buddy: Bark
    (5, 1), -- Smudge: Sit
    (5, 7), -- Smudge: Pounce
    (5, 8), -- Smudge: Scratch
    (6, 6), -- Peanut: Roll
    (6, 12), -- Peanut: Spin
    (7, 1), -- Bella: Sit
    (7, 2), -- Bella: Stay
    (7, 6), -- Bella: Roll
    (8, 9), -- Oliver: Meow
    (8, 8), -- Oliver: Scratch
    (8, 10); -- Oliver: Jump
    
INSERT INTO PackAnimals_Commands_Relationship (AnimalID, CommandID) VALUES
    (1, 13), -- Thunder: Trot
    (1, 14),  -- Thunder: Canter
    (1, 20),  -- Thunder: Gallop
    (2, 16), -- Sandy: Walk
    (2, 17), -- Sandy: Carry Load
    (3, 16), -- Eeyore: Walk
    (3, 17), -- Eeyore: Carry Load
    (3, 18), -- Eeyore: Bray
    (4, 13), -- Storm: Trot
    (4, 14), -- Storm: Canter
    (5, 16), -- Dune: Walk
    (5, 1), -- Dune: Sit
    (6, 16), -- Burro: Walk
    (6, 18), -- Burro: Bray
    (6, 19), -- Burrot: Kick
    (7, 13), -- Blaze: Trot
    (7, 10), -- Blaze: Jump
    (7, 20), -- Blaze: Gallop
    (8, 16), -- Sahara: Walk
    (8, 15); -- Sahara: Run