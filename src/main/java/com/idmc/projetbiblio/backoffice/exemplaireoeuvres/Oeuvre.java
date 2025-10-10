package com.idmc.projetbiblio.backoffice.exemplaireoeuvres;

import java.sql.Date;

public class Oeuvre {
    private String titre;
    private String auteur;
    private Date parution;

    public Oeuvre(String title, String auteur, java.sql.Date par){
        this.auteur = auteur;
        this.titre = title;
        this.parution = par;
    }

    /**
     * Identifie une oeuvre
     * @return Oeuvre oeuvre
     */
    //public static Oeuvre identifier(String titre, String auteur){
    //    return new Oeuvre();
    //}
}
