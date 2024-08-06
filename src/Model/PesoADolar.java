/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhona
 */
public class PesoADolar implements Cmonedas {

    @Override
    public double convertir(double cantidad) {
        return cantidad * 0.00024;
    }
    
}
