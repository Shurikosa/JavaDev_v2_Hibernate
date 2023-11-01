CREATE TABLE travels.tickets (
    id SERIAL PRIMARY KEY,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    client_id INT REFERENCES travels.clients(id),
    from_planet_id VARCHAR(50) REFERENCES travels.planets(id),
    to_planet_id VARCHAR(50) REFERENCES travels.planets(id)
);