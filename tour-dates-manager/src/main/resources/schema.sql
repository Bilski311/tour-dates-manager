CREATE TABLE show (
    id BIGSERIAL PRIMARY KEY,
    city VARCHAR(255),
    venue VARCHAR(255),
    show_date DATE,
    show_time TIME,
    ticket_price DECIMAL
);

CREATE TABLE city (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255)
);
       