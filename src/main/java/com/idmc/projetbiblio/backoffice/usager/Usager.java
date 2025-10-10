package com.idmc.projetbiblio.backoffice.usager;

import java.sql.Date;

public class Usager {
    private String nom;
    private Date inscription;
    public Usager(String n, java.sql.Date ins) {
        this.nom = n;
        this.inscription = ins;
    }

    /**
     * Identifie un usager
     * @return Usager usager
     */
    //public static Usager identifier(){
    //    return new Usager();
    //}


}
