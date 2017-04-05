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
public class Joueur {
    String identifiant;
    String motDePasse;
    Float solde;
    
    
    private Joueur (String identifiant, String motDePasse, Float solde) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.solde = solde;
    }
    
    public String getIdentifiant() {
        return this.identifiant;
    }
    
    public Float getSolde () {
        return this.solde;
    }
    
    public void setSolde (Float solde) {
        this.solde= solde;
    }
   
}
