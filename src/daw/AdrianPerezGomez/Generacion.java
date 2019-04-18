/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.AdrianPerezGomez;

/**
 *
 * @author adrian
 */
public class Generacion {
    
    // Una genereacion es un conjunto de celulas
    // Una matriz de NxN
    private Celula[][] matriz;
    
    public Generacion(int numCel){
        
        // Reservo espacio de memoria para las celulas
        
        matriz = new Celula[numCel][numCel];
        // Para cada posicion de la matriz creo una celula 
        
        // y la coloco en su posición
        for (int i = 0; i < numCel; i++) {
            for (int j = 0; j < numCel; j++) {
                Celula tmp = new Celula();
                this.ponerCelula(i,j,tmp);
            }
        }
    }
    
    public void ponerCelula(int i,int j, Celula tmp){
        matriz[i][j] = tmp;
             
    }
    
    public Celula getCelula(int i, int j){
        return matriz[i][j];
    }

    public Celula[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Celula[][] matriz) {
        this.matriz = matriz;
    }
    
    
}
