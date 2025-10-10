package com.idmc.projetbiblio.frontoffice.empruntsreservations;

import com.idmc.projetbiblio.backoffice.exemplaireoeuvres.Exemplaire;

import java.sql.Date;

public class Emprunt {
    private Date dateRendu;
    private Exemplaire exemplaire;

    public Emprunt(Date dateRendu, Exemplaire ex){
        this.dateRendu = dateRendu;
        this.exemplaire = ex;
    }

    public void rendre(){

    }
}
