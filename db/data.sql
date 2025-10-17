INSERT INTO Usager (nom, date_inscription)
VALUES ('Alice Martin', '2023-02-14'),
       ('Bruno Dupont', '2022-11-05'),
       ('Claire Girard', '2024-01-20'),
       ('David Leroy', '2023-06-10');

INSERT INTO Bibliothecaire (nom, date_embauche)
VALUES ('Jean Morel', '2020-03-01'),
       ('Sophie Bernard', '2021-09-15');

INSERT INTO Oeuvre (titre, auteur, date_parution, nb_reservation)
VALUES ('Les Misérables', 'Victor Hugo', '1862-01-01', 1),
       ('Le Petit Prince', 'Antoine de Saint-Exupéry', '1943-04-06', 2),
       ('L’Étranger', 'Albert Camus', '1942-05-01', 0),
       ('1984', 'George Orwell', '1949-06-08', 1);

INSERT INTO Exemplaire (date_achat, etat, id_oeuvre)
VALUES ('2022-01-10', 'bon', 1),
       ('2023-02-12', 'usé', 1),
       ('2022-06-05', 'neuf', 2),
       ('2023-01-20', 'bon', 2),
       ('2022-09-30', 'neuf', 3),
       ('2021-12-15', 'bon', 4);

INSERT INTO Emprunt (date_emprunt, id_usager, id_exemplaire)
VALUES ('2024-03-05', 1, 1),
       ('2024-03-07', 2, 3),
       ('2024-05-01', 3, 4),
       ('2024-06-15', 4, 5);

INSERT INTO Reservation (date_reservation, id_usager, id_oeuvre)
VALUES ('2024-02-20', 2, 1),
       ('2024-03-10', 1, 2),
       ('2024-03-12', 3, 2),
       ('2024-04-05', 4, 4);