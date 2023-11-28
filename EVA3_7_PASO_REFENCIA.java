/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3;


public class EVA3_7_PASO_REFENCIA {
    public static void main(String[] args) {
         int []arreglo=new int [10];
         System.out.println("el valor en  arreglo en el main"+arreglo);
         llenarArreglo(arreglo);
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print("["+arreglo[i]+"]");
        }
    }
    public static void llenarArreglo(int []valores) {
        System.out.println("el valor del arreglo en llenarArreglo es "+valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i]=(int)(Math.random()*100);
        }
    }
  
}
