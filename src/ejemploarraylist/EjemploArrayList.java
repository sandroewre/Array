/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        ArrayList<String> nombres = new ArrayList<String>();
        System.out.println("Calidad de datos que desea ingresar: ");
        int cantidad = sc.nextInt();
       
        sc.nextLine();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el dato: ");
            nombres.add(sc.nextLine());
            
        }
        System.out.println("=================");
        for(String dato:nombres){
            System.out.println(dato);
        }
        System.out.println("Ingrese el nombre a buscar:");
        String buscar = sc.nextLine();
        
        if (nombres.contains(buscar)){
            System.out.println("El elemento existe y esta en la posicion" +nombres.indexOf(buscar));
        }
        else{
            System.out.println("No esta");
        }
        //Eliminar
 System.out.println("Ingrese el nombre a eliminar:");
        String eliminar = sc.nextLine();
        
        if (nombres.contains(eliminar)){
            nombres.remove(eliminar);
            System.out.println("El elemento eliminado" );
        }
        else{
            System.out.println("No esta");
        }
// Modificar
        System.out.println("Ingrese el nombre a buscar:");
        String modificar = sc.nextLine();
        
        if (nombres.contains(modificar)){
            System.out.println("El elemento se removio" );
            String nuevo = sc.nextLine();
            nombres.set(nombres.indexOf(modificar),nuevo);
        }
        else{
            System.out.println("No esta");
        }

        
//        nombres.add("Juan");
//        nombres.add("Carlos");
//        nombres.add("Mary");
//        
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//            
//        }
//        System.out.println(nombres.contains("Juan"));
//        nombres.set(0, "Pepe");
//        
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//            
//        }
//        
//        System.out.println(nombres.size());
//         System.out.println(nombres.indexOf("Mary"));
//         
//         nombres.remove("Pepe");
//          for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//          }
//          nombres.clear();
//          System.out.println(nombres.size());
//          
//          System.out.println(nombres);
    }
    
}

//arreglos
//arraylist Examen