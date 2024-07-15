package com.mycompany.conversorvane;

import java.util.Scanner;

public class Conversorvane {

    public static void mostrarMenu() {
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Convertir de Dolar a Peso Argentino");
        System.out.println("2. Convertir de Peso Argentino a Dolar");
        System.out.println("3. Convertir de Dolar a Real Brasileño");
        System.out.println("4. Convertir de Real Brasileño a Dolar");
        System.out.println("5. Convertir de Dolar a Peso Colombiano");
        System.out.println("6. Convertir de Peso Colombiano a Dolar");
        System.out.println("7. Salir");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            mostrarMenu();
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 7) {
                System.out.println("Opcion no valida. Intente de nuevo.");
                continue;
            }

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de monedas vane.");
                break;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = Moneda.dolarAPesoArgentino(cantidad);
                    System.out.printf("%.2f dolares son %.2f pesos argentinos.\n", cantidad, resultado);
                    break;
                case 2:
                    resultado = Moneda.pesoArgentinoADolar(cantidad);
                    System.out.printf("%.2f pesos argentinos son %.2f dolares.\n", cantidad, resultado);
                    break;
                case 3:
                    resultado = Moneda.dolarAReal(cantidad);
                    System.out.printf("%.2f dolares son %.2f reales brasileños.\n", cantidad, resultado);
                    break;
                case 4:
                    resultado = Moneda.realADolar(cantidad);
                    System.out.printf("%.2f reales brasileños son %.2f dolares.\n", cantidad, resultado);
                    break;
                case 5:
                    resultado = Moneda.dolarAPesoColombiano(cantidad);
                    System.out.printf("%.2f dolares son %.2f pesos colombianos.\n", cantidad, resultado);
                    break;
                case 6:
                    resultado = Moneda.pesoColombianoADolar(cantidad);
                    System.out.printf("%.2f pesos colombianos son %.2f dolares.\n", cantidad, resultado);
                    break;
            }
        }
        scanner.close();
    }
}