package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Haga una función que reciba una distancia en metros y calcule el equivalente en pies y
    pulgadas. Tenga en cuenta que:
•   1 pie = (1 metro * 39) dividido 12
•   1 pulgada = (1 metro*39) módulo 12
•   Ejemplo: si la función recibe 1,67mts retorna 
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej7w10 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 
        calcularDistancia();
    }

    public static void calcularDistancia() throws IOException{
        double distanciaMetros;
        double pie;
        double pulgada;
        double distanciaPie;
        double distanciaPulgadas;

        out.println("Digite la distancia en metros:");
        distanciaMetros = Double.parseDouble(in.readLine());

        //pie = (1 * 39) / 12;
        pie = 3.281;
        distanciaPie = distanciaMetros * pie;

        //pulgada = (1 * 39) % 12;
        pulgada=39.37;
        distanciaPulgadas = distanciaMetros * pulgada;
    
        out.println(distanciaPie);
        out.println(distanciaPulgadas);
    }
}