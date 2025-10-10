package com.idmc.projetbiblio;

import com.idmc.projetbiblio.backoffice.exemplaireoeuvres.Exemplaire;

public class IHM {
    private final Gestion gestion;
    public IHM() {
        this.gestion = new Gestion();
    }

    public void emprunter(String nom, String titre){
        gestion.emprunter(nom, titre);
    }

    public void reserver(String nom, String titre){
        gestion.reserver(nom, titre);
    }

    public void rendre(Exemplaire exemplaire){
        gestion.rendre(exemplaire);
    }

    public void ajouterClient(String nom){

    }

    public void modifierClient(){

    }
}
