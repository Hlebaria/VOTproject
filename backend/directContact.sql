-- CREATE TABLE client(

--     id INT PRIMARY KEY NOT NULL,
--     userName TEXT,
--     password TEXT,
--     money FLOAT
-- );

INSERT INTO client (id, userName, password, money) VALUES (1, 'Ivan', 'bcd', 10);
INSERT INTO client (id, userName, password, money) VALUES (2, 'Deni', 'trac', 20);
INSERT INTO client (id, userName, password, money) VALUES (3, 'Oliv', '3456', 0);

-- INSERT INTO client (id, clientName, age, rights) VALUES (2, 'Gorge', 19, FALSE);

-- INSERT INTO client (id, clientName, age, rights) VALUES (3, 'Andrew', 23, TRUE);

SELECT * FROM client;

-- INSERT INTO Engine (id, engineCode, make) VALUES ();

-- SELECT * FROM Car JOIN Engine ON Car.id = Engine.id WHERE Engine.id = Car.id ;

-- CREATE TABLE Car(

--     id INT PRIMARY KEY NOT NULL,
--     model TEXT,
--     make TEXT,
    
-- );

-- INSERT INTO Car (id, model, make) VALUES (1, 'Mercedes', 'A30');
-- SELECT * FROM Car;
