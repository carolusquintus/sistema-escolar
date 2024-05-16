-- USERS
INSERT INTO users (id, username, password, role, enabled)
VALUES (1, 'carlos', '$2a$10$5K6gxg8v/UF2kX0mMiuDXOh4xPUD/ozvNZw8bzhIB/Em4aKRu4i6O', 'USER', true);

INSERT INTO users (id, username, password, role, enabled)
VALUES (2, 'admin', '$2a$10$ywGM2Uzfg0tXUrkry2aWqefv/l/lEnQ9T8V1HNPuxtetECU17jzve', 'ADMIN', true);

-- MENU
INSERT INTO menu (id, parent_id, name, path, active)
VALUES (1, 0, 'Actividades', '/activities', true);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (3, 1, 'Culturales', '/activities?type=CULTURE', false);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (4, 1, 'Academicas', '/activities?type=ACADEMIC', false);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (5, 1, 'Extra curriculares', '/activities?type=EXTRA', false);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (2, 0, 'Administración', '/admin', false);

-- ACTIVITIES
INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (1, 'ACADEMIC', 'Iniciación al proyecto de investigación por campo de conocimiento', TIMESTAMP '2024-05-10 12:00:00', TIMESTAMP '2024-12-10 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (2, 'ACADEMIC', 'Investigación Pedagógica', TIMESTAMP '2024-07-10 12:00:00', TIMESTAMP '2024-12-10 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (3, 'ACADEMIC', 'Saber Pedagógico (Teorías pedagógicas y curriculares)', TIMESTAMP '2024-08-12 12:00:00', TIMESTAMP '2024-12-10 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (4, 'ACADEMIC', 'Pedagogía en el siglo XXI (globalización y desarrollo humano)', TIMESTAMP '2024-01-24 12:00:00', TIMESTAMP '2024-12-10 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (5, 'ACADEMIC', 'Seminario de formación para el diseño', TIMESTAMP '2024-06-09 12:00:00', TIMESTAMP '2024-12-10 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (6, 'CULTURE', 'A la calle: Los dos hidalgos de Verona', TIMESTAMP '2024-06-09 12:00:00', TIMESTAMP '2024-06-09 13:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (7, 'CULTURE', 'Festival de la niñez mexicana', TIMESTAMP '2024-02-09 14:00:00', TIMESTAMP '2024-02-09 16:30:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (8, 'CULTURE', 'Semillero ensamble comunitario de alientos y percusiones del centro histórico', TIMESTAMP '2025-02-14 09:00:00', TIMESTAMP '2024-02-14 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (9, 'CULTURE', 'Vamos a aprender lenguas. Rally para las infancias y su familia', TIMESTAMP '2024-09-28 17:00:00', TIMESTAMP '2024-12-10 19:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (10, 'CULTURE', 'Proyección de los cuadros mágicos', TIMESTAMP '2024-12-12 08:00:00', TIMESTAMP '2024-12-12 09:30:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (11, 'EXTRA', 'Futbol', TIMESTAMP '2024-12-01 12:00:00', TIMESTAMP '2024-06-01 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (12, 'EXTRA', 'Basquetball', TIMESTAMP '2024-12-01 12:00:00', TIMESTAMP '2024-06-01 12:00:00');

INSERT INTO activity (id, type, name, init_date_time, end_date_time)
VALUES (13, 'EXTRA', 'Tae-Kwon-Do', TIMESTAMP '2024-12-01 12:00:00', TIMESTAMP '2024-06-01 12:30:00');
