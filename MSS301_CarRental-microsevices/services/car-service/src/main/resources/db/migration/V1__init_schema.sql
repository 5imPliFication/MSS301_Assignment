CREATE TABLE suppliers (
    supplier_id bigint PRIMARY KEY,
    supplier_name VARCHAR(255) NOT NULL,
    supplier_description TEXT,
    supplier_address VARCHAR(255)
);

CREATE TABLE manufacturers (
    manufacturer_id bigint PRIMARY KEY,
    manufacturer_name VARCHAR(255) NOT NULL,
    description TEXT,
    manufacturer_country VARCHAR(100)
);

CREATE TABLE car_information (
    car_id bigint PRIMARY KEY,
    car_name VARCHAR(255) NOT NULL,
    car_description TEXT,
    number_of_doors INT,
    seating_capacity INT,
    fuel_type VARCHAR(50),
    year INT,
    manufacturer_id bigint REFERENCES manufacturers(manufacturer_id),
    supplier_id bigint REFERENCES suppliers(supplier_id),
    car_status VARCHAR(50),
    car_renting_price_per_day DOUBLE PRECISION
);
