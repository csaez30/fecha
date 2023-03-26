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
class Casa implements Propiedad
{
String direccion;
int metrosCuadrados;

Casa(String direccion, int metrosCuadrados) {
this.direccion = direccion;
this.metrosCuadrados = metrosCuadrados;
}

String getDireccion()
{
return direccion;
}
void setMetrosCuadrados (int metrosCuadrados)
{
this.metrosCuadrados = metrosCuadrados;
}
int getMetrosCuadrados()
{
return metrosCuadrados;
}
public void ampliar()
{
this.metrosCuadrados+=80;
}

public int precio()
{
return 1000*metrosCuadrados;
}

public boolean esCara()
{
return this.precio()>=10000000;
}

@Override
    public String toString(){
    
        return "Casa "+"Direccion "+direccion+" Metros Cuadrados "+metrosCuadrados;
    }


}

