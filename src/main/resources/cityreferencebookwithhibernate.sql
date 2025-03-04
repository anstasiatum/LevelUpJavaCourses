CREATE TABLE cities (
    id SERIAL PRIMARY KEY,
    city_code VARCHAR(255) UNIQUE NOT NULL,
    rus_name VARCHAR(255) NOT NULL,
    eng_name VARCHAR(255) NOT NULL,
    population INT NOT NULL,
    region_id INT REFERENCES regions (id)
);

CREATE TABLE regions (
    id SERIAL PRIMARY KEY,
    region_name INT NOT NULL
);

