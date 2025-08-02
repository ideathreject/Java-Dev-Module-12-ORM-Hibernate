INSERT INTO planet (id, name) VALUES
('MARS', 'Mars'),
('VEN', 'Venus'),
('EARTH', 'Earth'),
('JUP', 'Jupiter'),
('SAT', 'Saturn');

INSERT INTO client (name) VALUES
('Vladyslav Demchenko'),
('Daria Artemieva'),
('Oleksandr Rujkov'),
('Oleksand Fomenko'),
('Nikita Litchinuk'),
('Svitlana Kazarina'),
('Valerii Richter'),
('Sergey Kazarin'),
('Amanda Lee'),
('Klints Reins');

INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES
(NOW(), 1, 'EARTH', 'MARS'),
(NOW(), 2, 'MARS', 'VEN'),
(NOW(), 3, 'VEN', 'JUP'),
(NOW(), 4, 'EARTH', 'SAT'),
(NOW(), 5, 'JUP', 'EARTH'),
(NOW(), 6, 'SAT', 'VEN'),
(NOW(), 7, 'VEN', 'MARS'),
(NOW(), 8, 'MARS', 'EARTH'),
(NOW(), 9, 'SAT', 'JUP'),
(NOW(), 10, 'EARTH', 'VEN');