CREATE SCHEMA sistema_escolar;

-- Existing schemas
SELECT schema_name FROM INFORMATION_SCHEMA.SCHEMATA;

CREATE USER director_sistema_escolar WITH PASSWORD 'yEcu0vvc3UNcm2M67O46';

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA sistema_escolar TO director_sistema_escolar;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA sistema_escolar TO director_sistema_escolar;
GRANT CREATE ON SCHEMA sistema_escolar TO director_sistema_escolar;
GRANT USAGE ON SCHEMA sistema_escolar TO director_sistema_escolar;

ALTER USER director_sistema_escolar SET search_path=sistema_escolar, "$user", public;
