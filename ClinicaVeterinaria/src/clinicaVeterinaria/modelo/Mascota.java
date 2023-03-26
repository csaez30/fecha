/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Mascota {

private int id=-1;
private int codigo;
private String alias;
private String sexo;
private String especie;
private String raza;
private String color;
private LocalDate fecNac;
private double pesoMedio;
private Cliente dueño;


 public Mascota() {
        this.id = -1;
        
    }
    public Mascota(int codigo, String alias, Cliente dueño) {
        this.codigo = codigo;
        this.alias = alias;
        this.dueño = dueño;
    }

    public Mascota(int codigo, String alias, String sexo, String especie, String raza, String color, LocalDate fecNac, double peso, Cliente dueño) {
        this.codigo = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fecNac = fecNac;
        this.pesoMedio = peso;
        this.dueño = dueño;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double peso) {
        this.pesoMedio = peso;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

  



}
