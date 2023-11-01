     WITH random_names AS (
        SELECT
            array['John', 'Alice', 'Bob', 'Catherine', 'David', 'Ella', 'Frank', 'Grace', 'Henry', 'Isabel'] AS first_names,
            array['Smith', 'Johnson', 'Williams', 'Brown', 'Jones', 'Miller', 'Davis', 'García', 'Martínez', 'López'] AS last_names
    )
    INSERT INTO clients (name)
    SELECT
        (first_names[array_length(first_names, 1) * random()] || ' ' || last_names[array_length(last_names, 1) * random()])
    FROM random_names
    LIMIT 10;