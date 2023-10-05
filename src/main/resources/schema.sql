CREATE TABLE IF NOT EXISTS users
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    email  VARCHAR(255) NOT NULL UNIQUE,
    first_name   VARCHAR(50) NOT NULL,
    last_name   VARCHAR(100) NOT NULL,
    password  VARCHAR(255) NOT NULL,
    role   VARCHAR(255) NOT NULL,
    status   VARCHAR(255) default 'ACTIVE' NOT NULL
    );