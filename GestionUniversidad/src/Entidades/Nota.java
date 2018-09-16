/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Nota {
    int nota = -1;
    Date fecha = new Date();

    public Nota(int nota, Date fecha) {
        this.nota = nota;
        this.fecha = fecha;
    }

}
