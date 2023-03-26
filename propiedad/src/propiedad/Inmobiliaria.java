/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedad;

import java.util.List;

/**
 *
 * @author cris
 */
public class Inmobiliaria {

String localidad;
List<Propiedad> propiedades;

Inmobiliaria(String localidad, List<Propiedad> propiedades) {
this.localidad = localidad;
this.propiedades = propiedades;
}

String getLocalidad() {
return this.localidad;
}

List<Propiedad> getPropiedades() {
return this.propiedades;
}

void setPropiedades(List<Propiedad> propiedades) {
this.propiedades = propiedades;
}

void ampliarPropiedades()
{
for (int i =0; i< propiedades.size(); i++)
{
propiedades.get(i).ampliar();
}
}

int cantidadDePropiedadesBaratas()
{
int baratas=0;
for (int i =0; i< propiedades.size(); i++)
{
if(propiedades.get(i).esCara())
{
baratas++;
}
}
return baratas;
}

}

 
    

