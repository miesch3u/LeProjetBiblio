package com.idmc.projetbiblio.frontoffice.empruntsreservations;

import com.idmc.projetbiblio.backoffice.exemplaireoeuvres.Oeuvre;

import java.sql.Date;

public class Reservation {
    private Oeuvre oeuvre;
    private Date dateReservation;

    public Reservation(Oeuvre oe, Date date){
        this.oeuvre = oe;
        this.dateReservation = date;
    }

    public void annuler(){

    }
}
