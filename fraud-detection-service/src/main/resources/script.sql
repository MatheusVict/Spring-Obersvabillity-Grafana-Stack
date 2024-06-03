
CREATE TABLE IF NOT EXISTS fraud_records
(
    id            BIGINT      NOT NULL,
    fraudRecordId VARCHAR(36) NOT NULL,
    customerId    INT         NOT NULL,
    PRIMARY KEY (id)
);

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
TRUNCATE TABLE fraud_records;


INSERT INTO fraud_records (id, fraudRecordId, customerId)
VALUES (1, uuid_generate_v4(), 101),
       (2, uuid_generate_v4(), 103);


