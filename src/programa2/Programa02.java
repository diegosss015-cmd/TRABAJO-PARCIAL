package programas;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        // Declaración de variables
        String empleado;
        double ht, th, sb, d, sn;

        // Creando el objeto Scanner
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado = lectura.nextLine();   // permite ingresar nombre completo

        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();

        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();

        // Proceso de datos
        sb = ht * th;
        d = sb * 0.13;
        sn = sb - d;

        // Salida de datos
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre de empleado: " + empleado);
        System.out.println("Horas trabajadas: " + ht);
        System.out.println("Tarifa por hora: " + th);
        System.out.println("Sueldo bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo Neto: " + sn);

        // Cerrar scanner
        lectura.close();
    }
}
