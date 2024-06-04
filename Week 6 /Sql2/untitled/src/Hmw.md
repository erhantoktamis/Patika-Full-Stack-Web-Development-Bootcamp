# Sql Temelleri II 
# Hmw - 5
```sql
1- SELECT title, length FROM film WHERE title LIKE '%n' ORDER BY length DESC LIMIT 5;
```

```sql
SELECT title, length FROM film WHERE title LIKE '%n' ORDER BY length ASC OFFSET 1 LIMIT 5;
```

```sql
3- SELECT last_name, store_id FROM customer WHERE store_id = 1 ORDER BY last_name DESC  LIMIT 4; 
```
# Hmw - 6
```sql
1- SELECT AVG(rental_rate) FROM film;
```
```sql
2- SELECT COUNT(*) FROM film WHERE title LIKE 'C%';
```
```sql
3- SELECT MAX(length) length FROM film WHERE rental_rate = 0.99;
```
```sql
4- SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length > 150;
```
# Hmw - 7
1- Film tablosundaki filmleri rating değerlerine göre gruplayınız:
```sql
1- SELECT rating, COUNT(*) FROM film GROUP BY rating;
```
2- film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla
olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
```sql
SELECT replacement_cost, COUNT(*) as film_sayisi
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_sayisi DESC;
```
3- customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir? 4. city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
```sql
SELECT country_id, COUNT(*) as sehir_sayisi
FROM city
GROUP BY country_id
ORDER BY sehir_sayisi DESC
LIMIT 1;
```













