/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USER
 */
public class ForLoop {
    public static void main(String[] args) {
        int i, j;

        for(i = 1; i <= 12; i++) {
            for (j = 1; j <= 12; j++) {        
                System.out.printf("%1d", i * j);
            }
            System.out.println("");
        }
    }
}
