/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationbourse;

import java.util.ArrayList;

/**
 *
 * @author Lorraine
 */
public class MarcheFinancier {
    
    ArrayList  listeJoueur = new ArrayList(); 
    ArrayList tabAction = new ArrayList();
    
    private MarcheFinancier(ArrayList listeJoueur, ArrayList tabAction) {
        this.listeJoueur = listeJoueur;
        this.tabAction = tabAction;
    }
    
    public ArrayList getListeJoueur() {
        return this.listeJoueur;
    }
    
    public ArrayList getTabAction() {
        return this.tabAction;
    }
   
    
            
}
