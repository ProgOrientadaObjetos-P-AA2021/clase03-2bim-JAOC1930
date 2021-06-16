/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elegir\n1. Estudiante\n2. Docente\n3. Policia");
        int op = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese maticula");
                double mat = entrada.nextDouble();
                // TODO code application logic here
                Estudiante e = new Estudiante(nombre, apellido, edad, mat);
                System.out.println(e);
                break;

            case 2:
                System.out.println("Ingrese sueldo");
                double s = entrada.nextDouble();
                // Un docente hereda de una Persona y adicionalmente tiene 
                // la característia sueldo
                Docente d = new Docente(nombre, apellido, edad, s); // falta implementar
                System.out.println(d);
                break;

            case 3:
                entrada.nextLine();
                System.out.println("Ingrese rango");
                String rango = entrada.nextLine();
                // Un policia hereda de una Persona y adicionalmente tiene 
                // la característia rango
                Policia p = new Policia(nombre, apellido, edad, rango); // falta implementar
                System.out.println(p);
                break;
        }

    }

}
