package com.idmc.projetbiblio.backoffice;

import java.sql.*;

/**
 * Connexion à la base de données seulement
 */
public class BDDConnection {
    private static final String HOST = "plg-broker.ad.univ-lorraine.fr";
    private static final String PORT = "5432";
    private static final String DB_NAME = "Bibliotheque_Jacquot_Miesch";
    private static final String user = "m1user1_18";
    private static final String password = "m1user1_18";
    private Connection con = null;

    public void connect() throws SQLException {
        String url = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DB_NAME;

        // (Optionnel mais parfois utile)
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL non trouvé !");
            throw new SQLException(e);
        }
        // Connexion
        this.con = DriverManager.getConnection(url, user, password);
    }

    public Connection getConnection() {
        if(con == null) {
            try{
                connect();
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}
