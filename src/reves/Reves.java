/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reves;

/**
 *
 * @author Daniel
 */
public class Reves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] hola = new char[5];
        hola[0] = 'H';
        hola[1] = 'O';
        hola[2] = 'L';
        hola[3] = 'A';
        hola[4] = 'A';
        for (int i = 3; i < hola.length; i--) {
            System.out.println(hola[i]);
            System.out.print(i);
        }
    }
}
