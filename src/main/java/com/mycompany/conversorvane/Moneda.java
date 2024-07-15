package com.mycompany.conversorvane;


public class Moneda {
    // Tasas de conversión de ejemplo, puedes actualizarlas según sea necesario
    private static final double TASA_DOLAR_A_PESO_ARGENTINO = 98.0;
    private static final double TASA_PESO_ARGENTINO_A_DOLAR = 1.0 / 98.0; // Aseguramos que al menos uno de los operandos sea un número decimal
    private static final double TASA_DOLAR_A_REAL = 5.25;
    private static final double TASA_REAL_A_DOLAR = 1.0 / 5.25; // Aseguramos que al menos uno de los operandos sea un número decimal
    private static final double TASA_DOLAR_A_PESO_COLOMBIANO = 3850.0;
    private static final double TASA_PESO_COLOMBIANO_A_DOLAR = 1.0 / 3850.0; // Aseguramos que al menos uno de los operandos sea un número decimal


    public static double dolarAPesoArgentino(double cantidad) {
        return cantidad * TASA_DOLAR_A_PESO_ARGENTINO;
    }

    public static double pesoArgentinoADolar(double cantidad) {
        return cantidad * TASA_PESO_ARGENTINO_A_DOLAR;
    }

    public static double dolarAReal(double cantidad) {
        return cantidad * TASA_DOLAR_A_REAL;
    }

    public static double realADolar(double cantidad) {
        return cantidad * TASA_REAL_A_DOLAR;
    }

    public static double dolarAPesoColombiano(double cantidad) {
        return cantidad * TASA_DOLAR_A_PESO_COLOMBIANO;
    }

    public static double pesoColombianoADolar(double cantidad) {
        return cantidad * TASA_PESO_COLOMBIANO_A_DOLAR;
    }
}