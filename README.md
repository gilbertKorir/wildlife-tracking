### WILDLIFE TRACKER!

##### Developed by: [Gilbert Korir.](https://github.com/gilbertKorir)

## DESCRIPTION 
The website allows Rangers to track wildlife sightings in the area. A wildlife entity is either an Animal or an endangered animal. When wild life is spotted, the ranger submits a form to create a sighting.


## Table of Contents

+ [User Story](#user-story)
+ [Screen Shots](#screen-shots)
+ [Set up](#set-up)
+ [Database Set Up](#database-set-up)
+ [Usage](#usage)
+ [Known Bugs](#known-bugs)
+ [License](#license)

    
## User Story

- Ranger can add an Animal and a Ranger details.

- Ranger add a Sighting and a location of a Single Animal

- Application can Keep track of Endangered animals, health, date of sighting, location age, identity number and number of animals.

## Screen Shots

<img src="https://i.postimg.cc/hPC3JZNS/scr2.png" alt="Home" width="400"><img src="https://i.postimg.cc/FRgThTjX/scr1.png" alt="Home" width="400">


## Set Up/Installation

**{follow the below instructions for set up.}**
```
1. You will need Internet connection.
2. Clone the repo `https://github.com/gilbertKorir/wildlife-tracking`

3. cd wildlife-tracking

4. If you have all the **Pre-requisites** you can run the application.
```

### Database Set Up
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

## Usage

[Check-Out My App!](https://my-animal-tracker.herokuapp.com/)

## Known Bugs
1. User Cannot delete an animal or anything once entered.

### TECHNOLOGIES USED:

- **[Java](https://java.com/en/download/) - source language.**

- **[Gradle](https://gradle.org/) for dependency management and running tasks.**

- Bootstrap.
- Maven
- Cascading Style Sheets.
- Apache Handlebars Engine.


## License

MIT This project is licensed under the terms of the MIT license. Copyright (c) 2022 Gilbert Korir

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.