package lab1_oliveriraheta;

import java.util.Scanner;

public class Lab1_OliverIraheta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre: ");//Se ingresa el nombre del usuario
        String nombre = entrada.nextLine();

        //Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase; ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase; ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase; ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase; ");
        double cuartaClase = entrada.nextDouble();
    
        //Se calculo del promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase/4;
        
        //se imprime el calculo del promedio
        System.out.println(" --- "+ nombre + " el promedio de las cuatro clase es: " + promedio);
        
    }
    
}
