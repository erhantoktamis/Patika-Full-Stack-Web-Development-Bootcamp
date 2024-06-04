# SQL Tables HMW

```sql
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50), lastName VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
--INSERT 
INSERT INTO employee (name, last name, birthday, email) VALUES
insert into employee (first_name, last_name, email, birthday) values ('Sianna', 'Rochewell', 'srochewell0@google.co.uk', '1959-05-20');
insert into employee (first_name, last_name, email, birthday) values ('Harwell', 'Casewell', 'hcasewell1@bluehost.com', '1965-10-02');
insert into employee (first_name, last_name, email, birthday) values ('Ethan', 'Leaf', null, '1927-06-11');
insert into employee (first_name, last_name, email, birthday) values ('Tommi', 'Huggett', 'thuggett3@edublogs.org', null);
insert into employee (first_name, last_name, email, birthday) values ('Vonnie', 'Sepey', 'vsepey4@zdnet.com', '1946-11-19');
insert into employee (first_name, last_name, email, birthday) values ('Barnard', 'Ivatt', 'bivatt5@usda.gov', null);
insert into employee (first_name, last_name, email, birthday) values ('Marci', 'Drillot', 'mdrillot6@1und1.de', '1910-03-08');
insert into employee (first_name, last_name, email, birthday) values ('Lanna', 'Metcalfe', 'lmetcalfe7@creativecommons.org', '1985-09-24');
insert into employee (first_name, last_name, email, birthday) values ('Donny', 'Sieghart', 'dsieghart8@g.co', '1920-03-16');
insert into employee (first_name, last_name, email, birthday) values ('Troy', 'McKennan', 'tmckennan9@xrea.com', '1957-12-31');
insert into employee (first_name, last_name, email, birthday) values ('Lyn', 'Childerhouse', null, '1989-06-18');
insert into employee (first_name, last_name, email, birthday) values ('Wain', 'Goggins', 'wgogginsb@huffingtonpost.com', '1911-08-10');
insert into employee (first_name, last_name, email, birthday) values ('Bernette', 'Crampsey', 'bcrampseyc@barnesandnoble.com', '1973-11-27');
insert into employee (first_name, last_name, email, birthday) values ('Jobye', 'Sousa', null, '1970-12-16');
insert into employee (first_name, last_name, email, birthday) values ('Yorker', 'Loweth', 'ylowethe@cocolog-nifty.com', '1962-07-08');
insert into employee (first_name, last_name, email, birthday) values ('Ringo', 'Oliver-Paull', 'roliverpaullf@blog.com', '1962-12-28');
insert into employee (first_name, last_name, email, birthday) values ('Armstrong', 'Pheazey', 'apheazeyg@yale.edu', '1948-03-10');
insert into employee (first_name, last_name, email, birthday) values ('Justin', 'Wiffen', 'jwiffenh@tamu.edu', '1951-05-21');
insert into employee (first_name, last_name, email, birthday) values ('Addy', 'Harmond', 'aharmondi@dot.gov', '1994-05-02');
insert into employee (first_name, last_name, email, birthday) values ('Esra', 'Langrick', 'elangrickj@globo.com', '1934-05-18');
insert into employee (first_name, last_name, email, birthday) values ('Von', 'Shevlane', 'vshevlanek@intel.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Terry', 'Tooke', 'ttookel@jigsy.com', '1919-08-02');
insert into employee (first_name, last_name, email, birthday) values ('Ara', 'Markwick', 'amarkwickm@ft.com', '1939-12-10');
insert into employee (first_name, last_name, email, birthday) values ('Ruthe', 'Demer', null, '1910-04-06');
insert into employee (first_name, last_name, email, birthday) values ('Elwyn', 'Skim', 'eskimo@weebly.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Maximo', 'Litchmore', null, null);
insert into employee (first_name, last_name, email, birthday) values ('Floyd', 'Mouser', 'fmouserq@creativecommons.org', '1957-01-02');
insert into employee (first_name, last_name, email, birthday) values ('Felice', 'Lewtey', 'flewteyr@123-reg.co.uk', '1915-02-16');
insert into employee (first_name, last_name, email, birthday) values ('Olympie', 'Carswell', 'ocarswells@issuu.com', '1979-01-17');
insert into employee (first_name, last_name, email, birthday) values ('Marquita', 'Rumke', 'mrumket@woothemes.com', '1990-06-17');
insert into employee (first_name, last_name, email, birthday) values ('Raychel', 'Decent', 'rdecentu@instagram.com', '1985-02-14');
insert into employee (first_name, last_name, email, birthday) values ('Lionel', 'Critten', 'lcrittenv@java.com', '1900-03-20');
insert into employee (first_name, last_name, email, birthday) values ('Ashley', 'Le Ball', 'aleballw@google.co.uk', null);
insert into employee (first_name, last_name, email, birthday) values ('Jacinthe', 'Radborne', 'jradbornex@army.mil', '1906-09-02');
insert into employee (first_name, last_name, email, birthday) values ('Bebe', 'Flacknoe', 'bflacknoey@google.it', null);
insert into employee (first_name, last_name, email, birthday) values ('Justen', 'Lawtey', 'jlawteyz@lulu.com', '1982-05-14');
insert into employee (first_name, last_name, email, birthday) values ('Joye', 'Derrick', 'jderrick10@va.gov', '1905-04-18');
insert into employee (first_name, last_name, email, birthday) values ('Lanie', 'Gheeorghie', 'lgheeorghie11@themeforest.net', '1969-05-12');
insert into employee (first_name, last_name, email, birthday) values ('Miquela', 'June', 'mjune12@cbsnews.com', '1929-09-08');
insert into employee (first_name, last_name, email, birthday) values ('Alia', 'Al Hirsi', null, null);
insert into employee (first_name, last_name, email, birthday) values ('Margalit', 'Croxall', 'mcroxall14@jugem.jp', null);
insert into employee (first_name, last_name, email, birthday) values ('Tricia', 'Austen', 'tausten15@mozilla.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Jackson', 'Palin', 'jpalin16@tuttocitta.it', '1928-11-03');
insert into employee (first_name, last_name, email, birthday) values ('Perrine', 'Chastang', 'pchastang17@wufoo.com', '1952-08-04');
insert into employee (first_name, last_name, email, birthday) values ('Jaime', 'Scrimshire', 'jscrimshire18@zdnet.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Shari', 'Dymoke', 'sdymoke19@wikimedia.org', '1976-09-10');
insert into employee (first_name, last_name, email, birthday) values ('Katharina', 'Stains', 'kstains1a@psu.edu', '1909-12-13');
insert into employee (first_name, last_name, email, birthday) values ('Janey', 'Gilhouley', 'jgilhouley1b@theguardian.com', '1996-06-02');
insert into employee (first_name, last_name, email, birthday) values ('Cart', 'Howell', 'chowell1c@blogspot.com', '1997-02-13');
insert into employee (first_name, last_name, email, birthday) values ('Anderea', 'Lujan', 'alujan1d@friendfeed.com', '1910-01-23');

--UPDATE
UPDATE employee SET name = 'New Name' WHERE id = 10;
UPDATE employee SET birthday = '1992-05-20' WHERE id = 20;

--DELETE

DELETE FROM employee WHERE id = 1;
DELETE FROM employee WHERE birthday < '1990-01-01';




```

