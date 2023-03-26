/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedad;

/**
 *
 * @author cris
 */
class Edificio implements Propiedad
{
String direccion;
int cantidadDeDepartamentos;

Edificio(String direccion, int cantidadDeDepartamentos)
{
this.direccion = direccion;
this.cantidadDeDepartamentos =cantidadDeDepartamentos;
}
String getDireccion()
{
return direccion;
}
int getCantidadDeDepartamentos()
{
return cantidadDeDepartamentos;
}

void setCantidadDeDepartamentos(int cantidadDeDepartamentos)
{
this.cantidadDeDepartamentos = cantidadDeDepartamentos;
}

public void ampliar()
{
this.cantidadDeDepartamentos+=5;
}

public int precio()
{
return 200000*cantidadDeDepartamentos;
}

public boolean esCara()
{
return this.precio()>=500000;
}


@Override
    public String toString(){
    
        return "Edificio con Direccion en "+direccion+" Canidad de Departamentos "+cantidadDeDepartamentos;
    }

}


