/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ReporteEstudiante extends Reporte {

    double promedioM;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c, ArrayList<Estudiante> l) {
        super(c);
        establecerListaEst(l);
    }

    public void establecerPromedioMat() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioM = suma / lista.size();
    }

    public void establecerListaEst(ArrayList<Estudiante> l) {
        lista = l;
    }

    public double obtenerPromedioMat() {
        return promedioM;
    }

    public ArrayList<Estudiante> obtenerListaEst() {
        return lista;
    }

    @Override
    public String toString() {
        String cadenaF = "";
        cadenaF = String.format("%s\nReporte Estudiantes:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%d\n"
                    + "Matricula: %.2f\n", cadenaF, obtenerListaEst().get(i).getNombre(),
                    obtenerListaEst().get(i).getApellido(), obtenerListaEst().get(i).
                    getEdad(), obtenerListaEst().get(i).
                            getMatricula());
        }
        cadenaF = String.format("%s\nPromedio de Matriculas: %.2f", cadenaF,
                obtenerPromedioMat());
        return cadenaF;
    }
}
