# Hmw: 9-10-11
# Hmw - 9 
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```sql
SELECT city.city, country.country
FROM city
INNER JOIN country ON city.country_id = country.country_id;

```
2- customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki 
first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```sql
SELECT customer.first_name, customer.last_name, payment.payment_id
FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

```
3- customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

```sql
SELECT customer.first_name, customer.last_name, rental.rental_id
FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id;

```
# Hmw - 10
1- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country)
isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
```sql
SELECT city.city, country.country
FROM city
LEFT JOIN country ON city.country_id = country.country_id;

```
2- customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name 
isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
```sql
SELECT customer.first_name, customer.last_name, payment.payment_id
FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

```
3- customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve 
last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
```sql
SELECT customer.first_name, customer.last_name, rental.rental_id
FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id;
```

# Hmw 11
1- actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
```sql
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer;
```
2- actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
```sql
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

```
3- actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
```sql
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;
```
4-İlk 3 sorguyu tekrar eden veriler için de yapalım.
```sql
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;
------------------------------------------------------------
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer;
-------------------------------------------------------------
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;
```