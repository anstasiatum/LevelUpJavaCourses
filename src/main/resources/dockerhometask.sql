CREATE TABLE dnd_characters
(
    id SERIAL primary key,
	player_name VARCHAR(255) NOT NULL,
    character_name VARCHAR(255) UNIQUE NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    character_level INT NOT NULL,
    abilities TEXT NOT NULL,
    character_class_id INT NOT NULL,
    character_race_id INT NOT NULL,
    has_start_gold BOOLEAN NOT NULL
);

CREATE table dnd_character_class
(
class_id SERIAL primary key,
class_name VARCHAR(30)
);

CREATE table dnd_character_race
(
race_id SERIAL primary key,
race_name VARCHAR(30)
);

ALTER TABLE dnd_character_class ADD UNIQUE (class_name);
ALTER TABLE dnd_character_race ADD UNIQUE (race_name);

ALTER TABLE dnd_characters ADD CONSTRAINT fk_dnd_characters_dnd_character_class FOREIGN KEY (character_class_id) REFERENCES dnd_character_class (class_id);
ALTER TABLE dnd_characters ADD CONSTRAINT fk_dnd_characters_dnd_character_race FOREIGN KEY (character_race_id) REFERENCES dnd_character_race (race_id);

INSERT into dnd_character_class (class_name) VALUES ('BARD');
INSERT into dnd_character_class (class_name) VALUES ('WIZARD');
INSERT into dnd_character_class (class_name) VALUES ('ROGUE');

INSERT into dnd_character_race (race_name) VALUES ('HUMAN');
INSERT into dnd_character_race (race_name) VALUES ('ELF');
INSERT into dnd_character_race (race_name) VALUES ('TIEFLING');

INSERT into dnd_characters (player_name, character_name, creation_date, character_level, abilities, character_class_id, character_race_id, has_start_gold) VALUES ('John Doe', 'Ana Amari', '2025-02-24T16:02:28', 3, 'abilities', 1, 1, false);
INSERT into dnd_characters (player_name, character_name, creation_date, character_level, abilities, character_class_id, character_race_id, has_start_gold) VALUES ('John Doe', 'Cole Cassidy', '2024-03-24T16:02:28', 6, 'rogue_abilities', 3, 1, true);
INSERT into dnd_characters (player_name, character_name, creation_date, character_level, abilities, character_class_id, character_race_id, has_start_gold) VALUES ('Jane Doe', 'Hazard', '2023-06-24T16:02:28', 1, 'test', 2, 2, false);

SELECT character_name, character_level FROM dnd_characters WHERE player_name = 'John Doe';
SELECT player_name, count(*) FROM dnd_characters GROUP BY player_name ORDER BY count(*) ASC;

SELECT dnd_characters.character_name, dnd_character_class.class_name, dnd_character_race.race_name
FROM dnd_characters
JOIN dnd_character_class
ON dnd_characters.character_class_id = dnd_character_class.class_id
JOIN dnd_character_race
ON dnd_characters.character_race_id = dnd_character_race.race_id;


