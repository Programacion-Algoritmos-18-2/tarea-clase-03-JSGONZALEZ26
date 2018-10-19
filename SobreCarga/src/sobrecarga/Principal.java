/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("Ingrese su sueldo:\n1. Mensual\n2. Semanal");
        int sueldos = scanner.nextInt();
        if (sueldos == 1) {
            System.out.println("Ingrese el sueldo mensual del trabajador");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        } else {
            if (sueldos == 2) {
                System.out.println("Ingrese el sueldo de la semana 1 del trabajador");
                double sueldo1 = scanner.nextDouble();
                System.out.println("Ingrese el sueldo de la semana 2 del trabajador");
                double sueldo2 = scanner.nextDouble();
                System.out.println("Ingrese el sueldo de la semana 3 del trabajador");
                double sueldo3 = scanner.nextDouble();
                System.out.println("Ingrese el sueldo de la semana 4 del trabajador");
                double sueldo4 = scanner.nextDouble();
                t.agregar_sueldo(sueldo1, sueldo2, sueldo3, sueldo4);
            }
        }

        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());

    }
}
