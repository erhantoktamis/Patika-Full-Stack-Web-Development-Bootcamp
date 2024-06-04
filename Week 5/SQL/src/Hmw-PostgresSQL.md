# Hmw-1
```sql
SELECT title, description FROM film;
```
```sql
SELECT * FROM film WHERE length >60 AND length < 75; 
```
```sql
SELECT * FROM film WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);
```
```sql
SELECT last_name FROM customer WHERE first_name= 'Mary';
```
```sql
SELECT * FROM film WHERE length <= 50 AND rental_rate NOT IN (2.99, 4.99);
```
# Hmw-2
```sql
SELECT * FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99;
```
```sql
SELECT first_name, last_name FROM actor WHERE first_name IN ('Penelope', 'Nick', 'Ed');
```

```sql
SELECT * FROM film WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99);
```
# Homework-3
```sql
SELECT country FROM country WHERE country LIKE 'A%a';
```
```sql
SELECT country FROM country WHERE LENGTH(country) >= 6 AND RIGHT(country, 1) = 'n';
```
```sql
SELECT title FROM film WHERE LOWER(title) LIKE '%t%' OR UPPER(title) LIKE '%T%' GROUP BY title HAVING COUNT(*) >= 4;
```
```sql
SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
```

# Hmw-4
```sql
SELECT DISTINCT replacement_cost FROM film;
```
```sql
SELECT COUNT(DISTINCT replacement_cost) AS unique_values_count FROM film;
```
```sql
SELECT COUNT(*) AS film_count FROM film WHERE title LIKE 'T%' AND rating = 'G';
```
```sql
SELECT COUNT(*) AS country_count FROM country WHERE LENGTH(country) = 5;
```
```sql
SELECT COUNT(*) AS city_count FROM city WHERE LOWER(RIGHT(city, 1)) = 'r';
```
