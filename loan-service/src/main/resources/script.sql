CREATE TABLE IF NOT EXISTS loan
(
    id            BIGINT  NOT NULL,
    loan_id       VARCHAR(255),
    customer_name VARCHAR(255),
    customer_id   INTEGER NOT NULL,
    amount        DECIMAL,
    loan_status   VARCHAR(255),
    CONSTRAINT pk_loan PRIMARY KEY (id)
);

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
TRUNCATE TABLE loan;


truncate table loan;
INSERT INTO loan (id, loan_id, customer_name, customer_id, amount, loan_status)
VALUES (1, uuid_generate_v4(), 'John', 101, 5000.00, 'APPROVED'),
       (2, uuid_generate_v4(), 'Sai', 102, 7500.00, 'APPROVED'),
       (3, uuid_generate_v4(), 'Alice', 103, 3000.00, 'REJECTED');