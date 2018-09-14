/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofer;

/**
 *
 * @author juanj
 */
public class Empresa {
      String razonSocial;
      int CUIT;
      Empleado []empleados;

    public Empresa() {
    }
      
    public Empresa(String razonSocial, int CUIT, Empleado[] empleados) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
        this.empleados = empleados;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
}
