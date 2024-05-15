INSERT INTO users (id, username, password, role, enabled)
VALUES (1, 'carlos', '', 'USER', true);

INSERT INTO users (id, username, password, role, enabled)
VALUES (2, 'admin', '', 'ADMIN', true);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (1, 0, 'Actividades', '/activities', true);

INSERT INTO menu (id, parent_id, name, path, active)
VALUES (2, 0, 'Administración', '/admin', false);
