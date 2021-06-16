/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ReporteDocente extends Reporte {

    double promedioS;
    ArrayList<Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> l) {
        super(c);
        establecerListaDocen(l);
    }

    public void establecerPromedioSue() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerSueldo();
        }
        promedioS = suma / lista.size();
    }

    public void establecerListaDocen(ArrayList<Docente> l) {
        lista = l;
    }

    public double obtenerPromedioSue() {
        return promedioS;
    }

    public ArrayList<Docente> obtenerListaDocen() {
        return lista;
    }

    @Override
    public String toString() {
        String cadenaF = "";
        cadenaF = String.format("%s\nReporte Docente:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%s\n"
                    + "Sueldo: %.2f\n", cadenaF, obtenerListaDocen().get(i).getNombre(),
                    obtenerListaDocen().get(i).getApellido(), obtenerListaDocen().get(i).
                    getEdad(), obtenerListaDocen().get(i).
                            obtenerSueldo());
        }
        cadenaF = String.format("\n%sPromedio de Sueldos: %.2f", cadenaF,
                obtenerPromedioSue());
        return cadenaF;
    }
}
