/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author usuario
 */
public class Jugada {
    Date fechaYHora;
    float saldo;
    float deposito;
    int premio;
    public Jugada(Date fechaYHora, float saldo, float deposito, int premio){
        fechaYHora = fechaYHora;
        this.saldo = saldo;
        this.deposito = deposito;
        this.premio = premio;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getDeposito() {
        return deposito;
    }

    public int getPremio() {
        return premio;
    }

}
