/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * @author juanan forte
 * @version 28/02/15
 * clase CCuenta
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Contructor standard de CCuenta
 */
    public CCuenta()
    {
    }
/**
 * Constructor sobrecargado de CCuenta
 * @param nom: nombre cte
 * @param cue: num. cta
 * @param sal: saldo
 * @param tipo : interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom: nombre cte
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return string nombre cte
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return double saldo
     */
    public double estado()
    {
        return getSaldo();
    }

/**
 * Método ingresar: sumamos cantidad al saldo
 * @param cantidad : a ingresar
 * @throws Exception : cant. neg.
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método retirar: restamos cantidad al saldo.
 * @param cantidad: a retirar
 * @throws Exception : cant. neg. or fuera de saldo.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return string num. cta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     *
     * @return string nombre cte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre: cte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return double tipo
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés : tipo
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     *
     * @return string num. cta.
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     *
     * @param cuenta: num. cta. 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     *
     * @return double saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     *
     * @param saldo: actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
