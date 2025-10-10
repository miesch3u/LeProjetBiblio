package com.idmc.projetbiblio.backoffice.exemplaireoeuvres;

import java.sql.Date;
import java.util.UUID;

public class Exemplaire {
    private UUID id;
    private Oeuvre oeuvre;
    private Date dateAchat;

    public Exemplaire(Oeuvre oe, Date date) {
        this.oeuvre = oe;
        this.dateAchat = date;
        this.id = UUID.randomUUID();
    }

    /**
     * Identifie une oeuvre
     * @return Oeuvre oeuvre
     */
    //public static Exemplaire identifier(String titre){
    //    return new Exemplaire();
    //}
}
