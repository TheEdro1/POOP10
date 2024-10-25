/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo03alu23
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        int a = 5;
        float c = (float) a / 2;
        System.out.println(c);

        int[] b = new int[6];
        for (int i = 0; i < b.length; i++) {
            b[i] = i * 10;
            System.out.println(b[i]);
        }

        try {
            float d = 4 / 0;
            System.out.println(d);
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción de desbordamiento de memoria");
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética segundo catch");
        }

        System.out.println("Hola, he sobrevivido");

        float n = miMetodoDivision(100, 2);
        System.out.println(n);

        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética permeada catch");
            System.out.println(ex.getMessage());
        }

        System.out.println("A pesar de todo seguimos en el programa");

        float x = miMetodoDivision(20, 5);
        System.out.println(x);

        try {
            int w = suma(4, 7);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Excepción de operación no soportada");
            System.out.println("Atributo Mensaje");
            System.out.println(ex.getMessage());
        }

        System.out.println("XXXXXXXXXXXXXXXX");

        Cuenta cuenta = new Cuenta(100.0);
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());
        cuenta.depositar(100);
        System.out.println("Saldo después del depósito: " + cuenta.consultarSaldo());

        try {
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Excepción: Saldo insuficiente");
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }

    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return (float) f / f0;
    }

    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operación no soportada");
    }
}
