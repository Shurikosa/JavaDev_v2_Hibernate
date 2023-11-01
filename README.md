You work for SpaceTravel. The company is engaged in the transportation of passengers between planets.

Accordingly, there are the following entities with the following relationships:

Client - a client of the company. It has the following properties:
id - identifier, primary surrogate key, autoincremental number.
name - name, from 3 to 200 characters inclusive
Planet. The initial or final point of departure. It has the following properties:
id - planet identifier. A string consisting exclusively of uppercase Latin letters and numbers. For example, MARS, VEN
name - the name of the planet, a string of 1 to 500 characters inclusive
Ticket. It has the following properties:
id - ticket identifier, primary surrogate key, auto-incremental number.
created_at - TIMESTAMP in UTC when this ticket was created
client_id - identifier of the client to whom this ticket belongs.
from_planet_id - identifier of the planet from which the passenger departs
to_planet_id - identifier of the planet where the passenger is going

Task #1 - set up a project with hibernate
Create a new gradle project. Connect the following libraries to it:

H2
hibernate
flyway
Make sure your project starts and doesn't throw any errors.

Task #2 - write migrations to create and populate the database
Write two migrations.

The first migration (call it V1__create_db.sql) should create the database structure - all the tables and relationships between them. Pay attention to the correct constraints. For example, for the ticket table, the client_id field must be a foreign key for the client table by the id field.

The second migration should populate the database with data (name this migration V2__populate_db.sql). Create at least:

10 clients
5 planets
10 tickets
Make sure that the program is running and both migrations are executed correctly.

Task #3 - create CRUD services for Client and Planet
Describe the Client and Planet entities. Write Hibernate mappings for these entities (tables in the client and planet databases, respectively).

Write CRUD services for both entities - ClientCrudService and PlanetCrudService.

Write test code that will add/delete records using these services. Make sure that all CRUD operations work correctly.

Task #4 - upload the code to Github
Upload the code to the Github repository. Make sure that the .gitignore file is configured correctly and that only the necessary files are in the repository.

The result of the SLA is a link to the repository.