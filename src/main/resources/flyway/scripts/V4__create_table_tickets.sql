CREATE TABLE travels.tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        client_id INT,
        from_planet_id VARCHAR(50),
        to_planet_id VARCHAR(50),
        FOREIGN KEY (client_id) REFERENCES clients(id),
        FOREIGN KEY (from_planet_id) REFERENCES planets(id),
        FOREIGN KEY (to_planet_id) REFERENCES planets(id)
);