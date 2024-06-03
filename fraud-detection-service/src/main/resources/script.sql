
CREATE TABLE IF NOT EXISTS fraud_records
(
    id              BIGINT  NOT NULL,
    fraud_record_id VARCHAR(255),
    customer_id     INTEGER NOT NULL,
    loan_status     SMALLINT,
    CONSTRAINT pk_fraud_records PRIMARY KEY (id)
);

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
TRUNCATE TABLE fraud_records;


INSERT INTO fraud_records (id, fraud_record_id, customer_id)
VALUES (1, uuid_generate_v4(), 101),
       (2, uuid_generate_v4(), 103);


