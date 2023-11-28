/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3;

/**
 *
 * @author MAX
 */
public class EVA3_8_OBJETOS {
    public static void main(String[] args) {
       persona perso1=new persona();
       //Scanner lee=new Scanner(System.in);
       //int[] arreglo =new int [5]
        System.out.println(perso1);
        perso1.name="juan";
        perso1.apellido="perez";
        perso1.edad=50;
        
        
        persona perso2 = new persona();
        perso2.apellido="bernal";
        perso2.name="max";
        perso2.edad=70;
        imprimirPersona(perso2);
        
    }
    public static void imprimirPersona(persona perso1) {
        System.out.println("direccion"+perso1);   
        System.out.println("nombre completo"+perso1.name+""+perso1.apellido);
        imprimirPersona(perso1);
        
        
        
        
                
        
    }
}
//SON PLATILLLAS
//SON TIPOS DE DATOS 
class persona {
    String name;
    String apellido;
    int edad;
}