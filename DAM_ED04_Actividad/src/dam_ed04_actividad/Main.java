/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        mostrarEstado(cuenta1);

        operativa_cuenta(cuenta1, 2300, 695);
        
        mostrarEstado(cuenta1);
    }

    private static void mostrarEstado(CCuenta cuenta1) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual );
    }

    private static void operativa_cuenta(CCuenta cuenta1, float cantidad_ret, float cantidad_ing) {
        try {
            System.out.println("Retirada en cuenta: -" + cantidad_ret);
            cuenta1.retirar(cantidad_ret);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
         mostrarEstado(cuenta1);
        try {
            System.out.println("Ingreso en cuenta: +"+ cantidad_ing);
            cuenta1.ingresar(cantidad_ing);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
