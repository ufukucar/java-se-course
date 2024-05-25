-- Tüm kayıtlar
SELECT * FROM mydemodb.customers;
	
	
-- Ülkesi TR olanlar
SELECT * FROM mydemodb.customers WHERE country = 'TR';

-- Sadece bütün ülkeler kolonunu listele
SELECT country FROM mydemodb.customers;

-- Ülkesi TR olmayanlar !  not
SELECT * FROM mydemodb.customers WHERE country != 'TR';

-- Ülkeleri tekil olarak göster
SELECT DISTINCT country FROM mydemodb.customers;

-- Ülkesi TR olmayanlar !  not
SELECT * FROM mydemodb.customers WHERE NOT country = 'TR';

-- Ülkesi TR olmayanlar !  not
SELECT * FROM mydemodb.customers WHERE NOT country = 'TR';


--- age sütununu ekledik
ALTER TABLE IF EXISTS mydemodb.customers
    ADD COLUMN "age" smallint;


-- kolonların son durumu
SELECT * FROM mydemodb.customers;


-- yasi 25 den buyuk olanlar
SELECT * FROM mydemodb.customers WHERE age > 25;


-- hangi ülkeden toplam kaç tane var?
SELECT COUNT( DISTINCT country) FROM mydemodb.customers;


-- Alias (lakap, takma isim)
SELECT customer_id as c_id FROM mydemodb.customers;


-- Alias (lakap, takma isim) ve diğer kolonlar
SELECT customer_id as c_id, first_name, last_name, phone, country, age FROM mydemodb.customers;


-- Alias (lakap, takma isim) ve diğer kolonlar
SELECT customer_id as c_id, first_name as f_name, last_name as l_name, phone, country, age FROM mydemodb.customers;


-- as kullanmadan da alias olur
SELECT customer_id  c_id, first_name  f_name, last_name l_name, phone, country, age FROM mydemodb.customers;


-- Alias (lakap, takma isim) ve diğer kolonlar ve tablolarda da kullanabiliriz
SELECT c.customer_id id, 
		c.first_name f_name, 
		c.last_name l_name, 
		c.phone, 
		c.country, 
		c.age 
		FROM mydemodb.customers c;


-- kayıtların yaş ortalaması
SELECT AVG(age) as ortalama FROM mydemodb.customers;


-- en büyük yaş
SELECT MAX(age) as en_buyuk_yas FROM mydemodb.customers;

-- en kucuk yaş
SELECT MIN(age) as en_buyuk_yas FROM mydemodb.customers;


-- en büyük, en küçük yaş ve ortalama
SELECT MAX(age) as en_buyuk_yas, MIN(age) as en_kucuk_yas, AVG(age) as ortalama_yas FROM mydemodb.customers;

-- en büyük, en küçük yaş, ortalama, kayıt sayısı, toplam_yas
SELECT 
	MAX(age) as en_buyuk_yas, 
	MIN(age) as en_kucuk_yas, 
	AVG(age) as ortalama_yas,
	COUNT(age) as kayit_sayisi,
	SUM(age) as toplam_yas 
	FROM mydemodb.customers;


-- adı ve soyadını 1 kolonda yazdırma
SELECT CONCAT(first_name, ' ', last_name) as full_name FROM mydemodb.customers;


-- 1 kayıt ekleme
INSERT INTO mydemodb.customers (first_name, last_name, phone, country, age)
						VALUES ( 'Fatih', 	'Mehmet' ,'1453',   'TR' , 21);


-- Tüm kayıtlar
SELECT * FROM mydemodb.customers;
	

-- Adı Fatih olanları listele
SELECT * FROM mydemodb.customers Where first_name = 'Burak';


-- Adı Burak olan ve yaşı 25'ten büyük olan kayıtları listele
SELECT * FROM mydemodb.customers WHERE first_name = 'Burak' AND age > 25;


-- Adı Burak olan veya yaşı 25'ten büyük olan kayıtları listele
SELECT * FROM mydemodb.customers WHERE first_name = 'Burak' OR age > 25;



-- Kodla birden fazla kayıt ekleme
INSERT INTO mydemodb.customers  (first_name, last_name, phone, country, age )
						VALUES  ( 'AAA', 	'EEE' ,'11',   'DE' ,  34  ),
								( 'BBB', 	'HHH' ,'22',   'BR' ,  44  ),
								( 'CCC', 	'PPP' ,'33',   'TR' ,  22  );


-- Tüm kayıtlar
SELECT * FROM mydemodb.customers
	ORDER BY first_name DESC
	LIMIT 8;
	

-- Ülke kolonuna göre sırala
SELECT * FROM mydemodb.customers
	ORDER BY country;


-- Önce ülkeye göre sonra da yaşa göre sırala
SELECT * FROM mydemodb.customers
	ORDER BY country, age;


-- Önce ülkeye göre sonra da yaşa göre tersten sırala
SELECT * FROM mydemodb.customers
	ORDER BY country ASC, age DESC;


-- Bir kaydı güncelleme
UPDATE mydemodb.customers
	SET
	first_name= 'Mustafa', 
	last_name= 'Turan', 
	phone= '555', 
	age=22
	WHERE customer_id = 7;

SELECT * FROM mydemodb.customers WHERE customer_id = 7;

-- Bir kayıtta 2 kolon güncelleme
UPDATE mydemodb.customers
	SET
	first_name= 'Burak Han', 
	last_name= 'Aksoy' 
	
	WHERE customer_id = 7;

SELECT * FROM mydemodb.customers WHERE customer_id = 7;


-- id değeri 7 olan kaydı siliyoruz
DELETE FROM mydemodb.customers
	WHERE customer_id = 7;

SELECT * FROM mydemodb.customers;


-- ülke isimlerini al ve kişi sayısına göre sırala
SELECT country, COUNT(*) FROM mydemodb.customers
	GROUP BY country;

-- isme görev ve kişi sayısına göre sırala
SELECT first_name, COUNT(*) FROM mydemodb.customers
	GROUP BY first_name;

-- Tüm kayıtlar
SELECT * FROM mydemodb.customers;


-- ülkelerdeki müşterilerimizin isimlerinin sayısıın listele.
SELECT country, first_name, COUNT(*) FROM mydemodb.customers
	GROUP BY country, first_name;


-- Grubun şartı HAVING
-- Sadece seçilen ülkeden hangi isimde kaç müşterimiiz var.
SELECT country, first_name, COUNT(*) FROM mydemodb.customers
	GROUP BY country, first_name
	HAVING country = 'TR';



-- hangi  ülkeden, hangi isimde, yaşı 25 - 32 arasında kaç müşterimiz var.
SELECT country, first_name, COUNT(*) FROM mydemodb.customers
	
	WHERE age > 25 AND age < 32
	
	GROUP BY country, first_name
	;
	
	
-- hangi  ülkeden, hangi isimde, yaşı 25 - 32 arasında kaç müşterimiz var.
SELECT country, first_name, age, COUNT(*) FROM mydemodb.customers
	
	WHERE age > 25 AND age < 32
	
	GROUP BY country, first_name, age
	;


-- Tüm kayıtlar
SELECT * FROM mydemodb.customers;


-- Grubun şartı HAVING
-- Sadece seçilen ülkeden hangi müşteri isimde kaç müşterimiiz var.
SELECT country, first_name, age, COUNT(*) 
	FROM mydemodb.customers
	WHERE age > 29
	GROUP BY country, first_name, age
	HAVING first_name = 'Tuna';



-- Grubun şartı HAVING
-- Sadece seçilen ülkeden olmayanlar hangi müşteri isimde kaç müşterimiiz var.
SELECT country, first_name, age, COUNT(*) 
	FROM mydemodb.customers
	WHERE age > 29
	GROUP BY country, first_name, age
	HAVING NOT country = 'TR';




-- MAX() yaşi en buyuk olan kişi adını soyadını görmek istiyoruz
SELECT last_name, MAX(age) FROM mydemodb.customers
	GROUP BY last_name
	ORDER BY last_name DESC
	LIMIT 1;


-- Çözüm 2
SELECT * FROM mydemodb.customers
	WHERE age ( SELECT MAX(age) FROM mydemodb.customers );


-- Çözüm 3
SELECT * FROM mydemodb.customers
	ORDER BY age DESC 
	LIMIT 1;


-- MIN yasi en kucuk
SELECT * FROM mydemodb.customers
	WHERE age = (SELECT MAX(age) FROM mydemodb.customers);

-- Mın adı en kucuk
SELECT MIN(first_name), MAX(last_name) FROM mydemodb.customers;

-- COUNT adet kaç tane olduğunu verir
SELECT COUNT(first_name) as ADET FROM mydemodb.customers;


SELECT COUNT(*) FROM mydemodb.customers;


SELECT COUNT(*) as musteri_sayisi FROM mydemodb.customers;


-- Ülkesi TR olanların sayısı
SELECT COUNT(*) FROM mydemodb.customers 
	WHERE country = 'TR';

SELECT COUNT(*) as ULKESI_TR_OLANLAR FROM mydemodb.customers 
	WHERE country = 'TR';
	
	

-- Kaç ülke var?
SELECT country, COUNT(country) FROM mydemodb.customers
	GROUP BY country;

SELECT  COUNT(DISTINCT country) FROM mydemodb.customers;
	
	

-- Her ülkeden kaç kişi var? Tersten Sıralama yap.
SELECT country, COUNT(country) as customer_totals FROM mydemodb.customers
	GROUP BY country
	ORDER BY customer_totals DESC;
	
	

-- Her ülkeden kaç kişi var? Tersten Sıralama yap. Müşteri sayısı en az 2 olanları sadece  göster.
SELECT country, COUNT(country) as customer_totals FROM mydemodb.customers
	GROUP BY country
	HAVING COUNT(country) > 1
	ORDER BY customer_totals DESC;
		
	
-- Müşterilerin yaşlarının toplamı	
SELECT SUM(age) musterilerin_yaslarinin_toplami FROM mydemodb.customers;
	
-- Müşterilerin yaşlarının ortalaması	
SELECT AVG(age) musterilerin_yaslarinin_ortalamasi FROM mydemodb.customers;
	
		
-- AVG, MIN, MAX, SUM, COUNT	
SELECT AVG(age), MIN(age), MAX(age), SUM(age), COUNT(age) FROM mydemodb.customers;
	

-- Çoklu şart. seçilen müşterileri listeleme
SELECT * FROM mydemodb.customers
	WHERE age > 28 AND country = 'TR';


-- IN kulanımı - Çoklu şart. Aynı kolonlarda kullanımı - Ülkesi TR olanlar veya BR veya NL olanlar
SELECT * FROM mydemodb.customers
	WHERE country IN ('TR', 'BR', 'NL');

-- IN kulanımı - Çoklu şart. Aynı kolonlarda kullanımı - Ülkesi TR olanlar veya BR veya NL olmayanlar
SELECT * FROM mydemodb.customers
	WHERE country NOT IN ('TR', 'BR', 'NL');


-- Yaşi 25 ve 30 olanlar ( 25 ve 30 dahil)
SELECT * FROM mydemodb.customers
	WHERE age BETWEEN 25 AND 30;

-- Yaşi 25 ve 30 olmayanlar ( 25 ve 30 dahil)
SELECT * FROM mydemodb.customers
	WHERE age NOT BETWEEN 25 AND 30;


-- Seçilen isimlere göre listeleme
SELECT * FROM mydemodb.customers
	WHERE first_name = 'M. Burak';


-- Seçilen isimlere göre listeleme
SELECT * FROM mydemodb.customers
	WHERE first_name IN('M. Burak');



-- Seçilen isimlere göre listeleme -- Adı M ile başlayanlar
SELECT * FROM mydemodb.customers
	WHERE first_name LIKE 'M%';


-- Seçilen isimlere göre listeleme -- Adının içinde u - a geçsin
SELECT * FROM mydemodb.customers
	WHERE first_name LIKE '%u%a%';



-- Seçilen isimlere göre listeleme -- Adı M ile başlamayanlar
SELECT * FROM mydemodb.customers
	WHERE first_name NOT LIKE 'M%';



-- customers table
SELECT * FROM mydemodb.customers;



-- tables
SELECT * FROM mydemodb.customers;
SELECT * FROM mydemodb.orders;
SELECT * FROM mydemodb.shipping;
SELECT * FROM mydemodb.products;
SELECT * FROM mydemodb.categories;

-- JOIN
SELECT * FROM mydemodb.customers;
SELECT * FROM mydemodb.orders;

-- 2 tablonun arasındaki ortak kısımlar kesişim kümesi
-- Varsayılan JOIN - INNER JOIN'dir. Kesişimdir.
SELECT *
	FROM mydemodb.customers 
	JOIN mydemodb.orders 
	ON orders.customer_id = customers.customer_id;


SELECT *
	FROM mydemodb.customers 
	INNER JOIN mydemodb.orders 
	ON orders.customer_id = customers.customer_id;


-- JOIN'lerde kolonları seçme
SELECT c.customer_id, c.first_name, o.order_id, o.customer_id, o.order_branch
	FROM mydemodb.customers c
	INNER JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id;



-- Fiyatı 30'dan buyuk olan siparişler
SELECT c.customer_id, c.first_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	INNER JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
WHERE o.amount > 300;



-- LEFT JOIN
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	LEFT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id;



-- RIGHT JOIN
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	RIGHT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
	
	WHERE o.amount  > 200;


-- FULL JOIN -- FULL OUTER JOIN
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	FULL JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id;
	


-- LEFT JOIN şart IS NULL
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	LEFT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
	WHERE o.customer_id IS NULL;


-- RIGHT JOIN şart IS NULL
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	RIGHT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
	
	WHERE o.customer_id  IS NULL ;



-- LEFT JOIN şart IS NOT NULL
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	LEFT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
	WHERE o.customer_id IS NOT NULL;



-- RIGHT JOIN şart IS NOT NULL
SELECT c.customer_id, c.first_name, c.last_name,
		o.order_id, o.customer_id, o.order_branch, o.amount
FROM mydemodb.customers c
	RIGHT JOIN mydemodb.orders o
	ON o.customer_id = c.customer_id
	WHERE o.customer_id  IS NOT NULL ;
	
SELECT * FROM mydemodb.customers;






























