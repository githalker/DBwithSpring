INSERT INTO avtosalon VALUES
  (1, 'BMW', 25000, 'Bob', 'Alex' );
INSERT INTO avtosalon VALUES
  (2, 'Mercedes', 30000, 'Taras', 'Oleg' );
INSERT INTO avtosalon VALUES
  (3, 'Lamborghini', 310000, 'Nazar', 'Sasha' );
INSERT INTO avtosalon VALUES
  (4, 'Bugatti', 440000, 'Apolo', 'Valera' );
INSERT INTO avtosalon VALUES
  (5, 'Tesla', 50000, 'Artur', 'Sergei' );

INSERT INTO service VALUES
  (1, 'U IVana', 'BMW', 'Mercedes', 1, 2);
INSERT INTO service VALUES
  (2, 'luxury', 'Lamborghini', 'Bugatti', 3, 4);
INSERT INTO service VALUES
  (3, 'RED', 'Tesla', 'BMW', 5, 1);

INSERT INTO avtoservice VALUES
  (1, 1);
INSERT INTO avtoservice VALUES
  (1, 2);
INSERT INTO avtoservice VALUES
  (2, 3);
INSERT INTO avtoservice VALUES
  (2, 4);
INSERT INTO avtoservice VALUES
  (3, 5);
INSERT INTO avtoservice VALUES
  (3, 1);