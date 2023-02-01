/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc302.operaciones;

/**
 *
 * @author valed
 */
public class Operaciones {

    public static void main(String[] args) {
        // Desarrollador 2 
        function suma(a, b) { 
        return a + b; 
        }
        
        // Desarrollador 2 
        function raizCuadrada(n) { 
        return Math.sqrt(n); 
        }
        // Desarrollador 2 
        function minimo(numeros) { 
        let min = numeros[0]; 
        for (let i = 1; i < numeros.length; i++) { 
            if (numeros[i] < min) { 
                min = numeros[i]; 
                } 
            } 
        return min; 
        }
        // Desarrollador 2 
        console.log(division(6, 3)); 
        console.log(potencia(2, 3)); 
        console.log(raizCuadrada(9));     
    } 
}
