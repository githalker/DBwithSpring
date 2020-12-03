-- Автосалон
-- айди, автомобиль(имя), цена,  продавец, працывник сервису, покупец
CREATE TABLE IF NOT EXISTS avtosalon(
  id        INTEGER PRIMARY KEY,
  car       TEXT    NOT NULL,
  price     REAL    NOT NULL,
  seller    TEXT    NOT NULL,
  client    TEXT    NOT NULL
);

--  Таблица сервисных центров
-- айди, имя сервисеного центра, автомобили
CREATE TABLE IF NOT EXISTS service(
  id          INTEGER  PRIMARY KEY,
  serName     TEXT     NOT NULL,
  car1        TEXT     NOT NULL,
  car2        TEXT     NOT NULL,
  carId1      INTEGER  NOT NULL,
  carId2      INTEGER  NOT NULL,
  FOREIGN KEY (carId1) REFERENCES avtosalon(id),
  FOREIGN KEY (carId2) REFERENCES avtosalon(id)
);

-- АвтосалонСервис
-- автомобиль айди, айди центр
CREATE TABLE IF NOT EXISTS avtoservice (
  serName_id INTEGER REFERENCES service,
  car_id  INTEGER REFERENCES avtosalon,
  PRIMARY KEY (serName_id, car_id)
);