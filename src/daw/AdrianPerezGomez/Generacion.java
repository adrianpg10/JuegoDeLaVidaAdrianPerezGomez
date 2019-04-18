/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.AdrianPerezGomez;

import java.util.Random;

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
    
  public static int generacionEstado(){
        Random aleatorio = new Random();
        int numeroestado= aleatorio.nextInt(1-0+1)+0;
        return numeroestado;
    }
  
    public static Celula[][] generacionCelulasAleatorias(int tamanio) {
        Celula[][] tmp = new Celula[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                tmp[i][j] = Celula.generacionCelulas(generacionEstado());

            }
        }

        return tmp;
    }
}
