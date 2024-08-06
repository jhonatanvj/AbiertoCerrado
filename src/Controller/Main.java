/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cmonedas;
import Model.DolarAEuro;
import Model.DolarAPeso;
import Model.EuroAPeso;
import Model.EuroaDolar;
import Model.PesoADolar;
import Model.PesoaEuro;
import View.VistaConversor;

public class Main {

    public static void main(String[] args) {
        Cmonedas DaE = new DolarAEuro();
        Cmonedas EaD = new EuroaDolar();
        Cmonedas DaP = new DolarAPeso();
        Cmonedas PaD = new PesoADolar();
        Cmonedas EaP = new EuroAPeso();
        Cmonedas PaE = new PesoaEuro();

        VistaConversor vista = new VistaConversor(DaE, EaD, DaP, PaD, EaP, PaE);
        vista.setVisible(true);
    }
}
