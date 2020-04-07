/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeexercicio1;

/**
 *
 * @author Andressa Freitas
 */
public class AtividadeExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // imprima do 150 a 300
        int i = 150;
        while (i <= 300){
            System.out.println (i);
            i = ++i;
        }
        // imprima a soma de 1 até 1000
        int j = 1;
        int soma = j;
        while (j <= 1000){
            j = ++j;
            soma = soma + j;
        }
        System.out.println (soma);
        
        // Imprima todos os múltiplos de 3, entre 1 e 100
        int m = 1;
        while (m <= 100) {
            System.out.println (m);
            m = m * 3;
        }
        
        // Imprima o fatorial de 1 a 10
        int fat = 1;
        int fatorial = 1;
        while (fat <= 10){
            fatorial = fatorial * fat;
            fat = ++fat;
        }
        System.out.println (fatorial);
        
        // Imprima o fatorial de 1 a 10 recursiva
        long fati = 1;
        for (int n = 1; n <= 20; n++){
            fati = fati * n;
        }
        System.out.println (fati);
        
        // Imprima a série de Fibonacci
        long f = 0;
        long k = 1;
        long fibonacci = 0;
        System.out.println (f);
        System.out.println (k);
        for (int n = 0; n <= 100; n++){
            fibonacci = f + k;
            f = k;
            k = fibonacci;
            System.out.println (fibonacci);
             
        }
        
        //Imprima
        int x = 13;
        while (x != 1){
            // se x é par, dividir por 2
            if (x % 2 == 0){
                //System.out.println ("x é par");
                x = x / 2;
                } else {
                //System.out.println ("x é impar");
                x = 3 * x + 1;
                }
            System.out.println(x);
        }
            
           
        }
    }
    

