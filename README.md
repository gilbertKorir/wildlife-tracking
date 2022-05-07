### WILDLIFE TRACKER!

### Developed by: [Gilbert Korir.](https://github.com/gilbertKorir)

## DESCRIPTION 
The website allows Rangers to track wildlife sightings in the area. A wildlife entity is either an Animal or an endangered animal. When wild life is spotted, the ranger submits a form to create a sighting.

[Check-Out App!](https://wl-tracker.herokuapp.com/)

## User Story

- Ranger can add an Animal.

- Ranger add a Sighting of a Single Animal

- Ranger can delete both Animal and Sightings Recorded.

- Application can Keep track of Endangered animals, health, date of sighting, location age, identity number and number of animals.

## PRE-REQUISITES.

## **SETUP/INSTALLATION!**

**{follow the below instructions for set up.}**

1. You will need Internet connection.

2. You need to get into the Project Repository.

3. From there you can access the Wildlife Tracker.

4. **Clone** the project.

5. **get into project folder** (cd into project).

6. If you have all the **Pre-requisites** you can run the application.


### DATABASE SET UP.
```
* Type in psql
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar,type VARCHAR,health VARCHAR,age VARCHAR);
* CREATE TABLE locations (id serial PRIMARY KEY,name VARCHAR);
* CREATE TABLE rangers (id serial PRIMARY KEY,name VARCHAR,badge_number VARCHAR, phone_number VARCHAR);
* CREATE TABLE sightings (id serial PRIMARY KEY,animal_id INT,ranger_id INT,location_id INT,time TIMESTAMP);
* CREATE TABLE locations_sightings (id serial PRIMARY KEY,location_id INT,sighting_id INT);
* CREATE TABLE rangers_sightings (id serial PRIMARY KEY,ranger_id INT,sighting_id INT);
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
```
### TECHNOLOGIES USED:

- **[Java](https://java.com/en/download/) - source language.**

- **[Gradle](https://gradle.org/) for dependency management and running tasks.**

- Bootstrap.

- Cascading Style Sheets.

- Apache Handlebars Engine.

## License

The app is licensed by MIT. [**HERE**](LICENSE)