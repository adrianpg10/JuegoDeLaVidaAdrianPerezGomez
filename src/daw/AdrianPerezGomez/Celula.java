/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.AdrianPerezGomez;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author adrian
 */
public class Celula extends JButton {
    
    private boolean estado;
    
    public Celula(){
        super();
        this.estado = false;
        this.setBackground(Color.black);
    }

    public Celula(boolean estado) {
        this.estado= estado;
    }

    public boolean isEstado() {
        return estado;
    }


    public void matar(){
        this.estado= false;
        this.setBackground(Color.black);
    }
    
    public void resucitar(){
        this.estado=true;
        this.setBackground(Color.white);
    }
    
    
    public static Celula generacionCelulas(int numeroCelulas) {
        switch (numeroCelulas) {

            case 1:
                return new Celula(true);
            case 2:
                return new Celula(false);

        }
        return new Celula();
    }
    
}
