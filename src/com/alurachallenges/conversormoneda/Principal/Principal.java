package com.alurachallenges.conversormoneda.Principal;
import com.alurachallenges.conversormoneda.Api.DatosDeRequest;
import com.alurachallenges.conversormoneda.Api.FuncionesDeConversion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean menu = true;
        int opcionMenu = 0;

        FuncionesDeConversion funciones = new FuncionesDeConversion();

        //Menú Principal
        while (menu) {
            System.out.println("***************************");
            System.out.println("1) Dolar  -- Peso Argentino");
            System.out.println("2) Peso Argentino -- Dolar");
            System.out.println("3) Dolar -- Real Brasileño");
            System.out.println("4) Real Brasileño -- Dolar");
            System.out.println("5) Dolar -- Peso Colombiano");
            System.out.println("6) Peso Colombiano -- Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion correcta: ");

            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ha seleccionado la opcion de USD a ARS");
                    double cantidadDolarARS = obtenerCantidadValida(teclado, "Ingrese la cantidad en dólares (USD): ");
                    DatosDeRequest resultadoDolarARS = funciones.opcion1(cantidadDolarARS);
                    System.out.println("Su conversion de Dolar a Peso Argentino es: " + resultadoDolarARS.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion de ARS a USD");
                    double cantidadPesoArgentinoUSD = obtenerCantidadValida(teclado, "Ingrese la cantidad en pesos argentinos (ARS): ");
                    DatosDeRequest resultadoPesoArgentinoUSD = funciones.opcion2(cantidadPesoArgentinoUSD);
                    System.out.println("Su conversion de Peso Argentino a Dolar es: " + resultadoPesoArgentinoUSD.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion de USD a BRL");
                    double cantidadDolarBRL = obtenerCantidadValida(teclado, "Ingrese la cantidad en dólares (USD): ");
                    DatosDeRequest resultadoDolarBRL = funciones.opcion3(cantidadDolarBRL);
                    System.out.println("Su conversion de Dolar a Real Brasileño es: " + resultadoDolarBRL.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opcion de BRL a USD");
                    double cantidadRealBrasileñoUSD = obtenerCantidadValida(teclado, "Ingrese la cantidad en reales brasileños (BRL): ");
                    DatosDeRequest resultadoRealBrasileñoUSD = funciones.opcion4(cantidadRealBrasileñoUSD);
                    System.out.println("Su conversion de Real Brasileño a Dolar es: " + resultadoRealBrasileñoUSD.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opcion de USD a COP");
                    double cantidadDolarCOP = obtenerCantidadValida(teclado, "Ingrese la cantidad en dólares (USD): ");
                    DatosDeRequest resultadoDolarCOP = funciones.opcion5(cantidadDolarCOP);
                    System.out.println("Su conversion de Dolar a Peso Colombiano es: " + resultadoDolarCOP.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opcion de COP a USD");
                    double cantidadPesoColombianoUSD = obtenerCantidadValida(teclado, "Ingrese la cantidad en pesos colombianos (COP): ");
                    DatosDeRequest resultadoPesoColombianoUSD = funciones.opcion6(cantidadPesoColombianoUSD);
                    System.out.println("Su conversion de Peso Colombiano a Dolar es: " + resultadoPesoColombianoUSD.conversion_result());
                    menu = verificarContinuar(teclado);
                    break;
                case 7:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    //Funcion verificación de valores
    private static double obtenerCantidadValida(Scanner teclado, String mensaje) {
        double cantidad = 0.0;
        boolean cantidadValida = false;

        while (!cantidadValida) {
            try {
                System.out.print(mensaje);
                cantidad = Double.parseDouble(teclado.next());
                cantidadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un valor numérico válido.");
            }
        }

        return cantidad;
    }
    //Funcion verificación de continuación
    private static boolean verificarContinuar(Scanner teclado) {
        System.out.println("Continuar? 1)Si 2)No");
        int opcionContinuar = teclado.nextInt();
        return opcionContinuar != 2;
    }
}
