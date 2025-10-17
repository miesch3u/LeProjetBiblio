Rendu du projet à faire :
- JacquotMieschBibliotheque.zip
et dedans :
- JacquotMieschBibliothequeRapport.pdf
- JacquotMieschBibliothequeModele.vpp
- JacquotMieschBibliothequeApp.jar (ou toute autre forme de rendu)
- JacquotMieschBibliothequeDemo.mp4
- JacquotMieschBibliothequeReadme.txt
- JacquotMieschBibliothequeDB.sql
et les sources

Projet bibliothèque

Personnes dans le groupe :
- JACQUOT Reika
- MIESCH Nathanaël

Lancer le projet :
    Lancement rapide :
        Prérequis :
            - Docker
            - Java récent (nous utilisons le JDK 25, les versions antérieures peuvent ne pas lancer le projet).
        1. Lancer le container Docker qui lance la BDD PostgreSQL :
            -> docker
        2. Lancer l'application Bibliothèque avec le JAR déjà disponible :
            -> java -jar JacquotMieschBibliothequeApp.jar

    A partir des sources et du fichier SQL /
        Prérequis :
            - Java 25
            - Base de données PostgreSQL
        1. Créer la base de données :
            -> Lancer un serveur local PostgreSQL (via Docker ou invite de commande)
        2. Lancer le script SQL sur la base de données :
            -> Via PGAdmin avec le bouton d'import, ou via l'invite de commande
        3. Compiler les sources en un .jar
        4. Lancer l'application