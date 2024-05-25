-- VERITABANI OLUSTURULDU
CREATE SCHEMA `ticket_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

-- TABLO OLUSTURULDU
CREATE TABLE `ticket_db`.`musteriler` (
                              `id` INT NOT NULL AUTO_INCREMENT,
                              `adi` VARCHAR(30) NOT NULL,
                              `soyadi` VARCHAR(50) NULL,
                              `yasi` INT NULL DEFAULT 0,
                              PRIMARY KEY (`id`));

-- TABLODAKI VERİLER
SELECT * FROM ticket_db.musteriler;

-- EKLEME KODLARI
INSERT INTO `ticket_db`.`musteriler` (`adi`) VALUES ('Hasan');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('İlyas', 'Bakır', '22');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Oğuz', 'Akkaya', '25');

-- TABLODAKI KOLONUN NOT NULL YAPMAK
ALTER TABLE `ticket_db`.`musteriler` CHANGE COLUMN `adi` `adi` VARCHAR(30) NOT NULL

-- EKLENECEK 3 YENI KAYIT
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Murat Çağrı', 'Özkan', '29');
INSERT INTO `ticket_db`.`musteriler` (`adi`) VALUES ('Samet');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Selahettin', 'Dişli');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Seren', 'Aşkın', '18');

-- TABLODA ARAYA YENI BIR KOLON EKLENDI
ALTER TABLE `ticket_db`.`musteriler`
    ADD COLUMN `KIMLIK_NO` VARCHAR(11) NOT NULL AFTER `id`;

-- TABLODAKI VERİLER
SELECT * FROM ticket_db.musteriler;


































































