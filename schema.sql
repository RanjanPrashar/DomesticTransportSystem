CREATE DATABASE TransportManagementSystem;


USE TransportManagementSystem;


CREATE TABLE flights (
    flight_id INT AUTO_INCREMENT PRIMARY KEY,
    flight_name VARCHAR(100) NOT NULL,
    flight_date DATE NOT NULL,
    time TIME,
    class VARCHAR(100) NOT NULL
);


CREATE TABLE trains (
    train_id INT AUTO_INCREMENT PRIMARY KEY,
    train_name VARCHAR(100),
    departure_date DATE,
    arrival_date DATE,
    class VARCHAR(50)
);


CREATE TABLE buses (
    bus_id INT AUTO_INCREMENT PRIMARY KEY,
    bus_name VARCHAR(100),
    route VARCHAR(100),
    departure_time TIME,
    arrival_time TIME
);


CREATE TABLE ships (
    ship_id INT AUTO_INCREMENT PRIMARY KEY,
    ship_name VARCHAR(100),
    departure_date DATE,
    arrival_date DATE,
    class VARCHAR(50)
);


CREATE TABLE passengers (
    passenger_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50), 
    contact_no VARCHAR(15),
    passenger_address TEXT,
    email_id VARCHAR(100) 
);


CREATE TABLE bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    passenger_id INT, 
    transport_type ENUM('flight', 'train', 'bus', 'ship'),  booking type
    booking_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (passenger_id) REFERENCES passengers(passenger_id)
);

CREATE TABLE payment ( 
    payment_id INT AUTO_INCREMENT PRIMARY KEY, 
    booking_id INT,
    amount DECIMAL(10, 2),
    payment_date DATETIME DEFAULT CURRENT_TIMESTAMP, 
    status ENUM('pending', 'completed'),
    FOREIGN KEY (booking_id) REFERENCES bookings(booking_id)
);