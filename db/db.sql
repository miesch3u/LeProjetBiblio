DROP DATABASE IF EXISTS bibliotheque;
CREATE DATABASE bibliotheque;
-- créer une nouvelle connexion a la base bibliotheque

CREATE TABLE usager
(
    id_usager        SERIAL PRIMARY KEY,
    nom              VARCHAR(100) NOT NULL,
    date_inscription DATE
);

CREATE TABLE bibliothecaire
(
    id_bibliothecaire SERIAL PRIMARY KEY,
    nom               VARCHAR(100) NOT NULL,
    date_embauche     DATE
);

CREATE TABLE oeuvre
(
    id_oeuvre      SERIAL PRIMARY KEY,
    titre          VARCHAR(200) NOT NULL,
    auteur         VARCHAR(150),
    date_parution  DATE,
    nb_reservation INTEGER DEFAULT 0
);

CREATE TABLE exemplaire
(
    id_exemplaire SERIAL PRIMARY KEY,
    date_achat    DATE,
    etat          VARCHAR(50),
    id_oeuvre     INTEGER NOT NULL REFERENCES oeuvre (id_oeuvre)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE emprunt
(
    id_emprunt    SERIAL PRIMARY KEY,
    date_emprunt  DATE    NOT NULL,
    id_usager     INTEGER NOT NULL REFERENCES usager (id_usager)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    id_exemplaire INTEGER NOT NULL REFERENCES exemplaire (id_exemplaire)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE reservation
(
    id_reservation   SERIAL PRIMARY KEY,
    date_reservation DATE    NOT NULL,
    id_usager        INTEGER NOT NULL REFERENCES usager (id_usager)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    id_oeuvre        INTEGER NOT NULL REFERENCES oeuvre (id_oeuvre)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);