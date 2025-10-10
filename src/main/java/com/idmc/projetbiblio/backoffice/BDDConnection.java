package com.idmc.projetbiblio.backoffice;

import java.sql.Connection;

/**
 * Connexion à la base de données seulement
 */
public class BDDConnection {
    private Connection con = null;

    public void connect(){

    }

    public Connection getConnection() {
        if(con == null) connect();
        return con;
    }
}
