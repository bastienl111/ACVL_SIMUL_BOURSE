/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationbourse;

/**
 *
 * @author Lorraine
 */
public class Action {
 
    String nom;
    int nombreActionsEmises;
    Float valeurUnitaire;
    int nombreActionsDisponibles;
    
    private Action (String nom, int nombreActionsEmises, Float valeurUnitaire, int nombreActionsDisponibles) {
        this.nom = nom;
        this.nombreActionsEmises = nombreActionsEmises;
        this.valeurUnitaire = valeurUnitaire;
        this.nombreActionsDisponibles = nombreActionsDisponibles;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getNombresActionsEmises() {
        return nombreActionsEmises;
    } 
    
    public Float getValeurUnitaire() {
        return valeurUnitaire;
    }
    
    public int nombreActionsDisponibles() {
        return nombreActionsDisponibles;
    }
    
    public void setNombresActionsEmises(int n) {
        this.nombreActionsEmises = n;
    }
    
    public void setValeurUnitaire(Float f) {
        this.valeurUnitaire = f;
    }
    
    public void setNombreActionsDisponibles(int n) {
        this.nombreActionsDisponibles = n;
    }
    
    
}
