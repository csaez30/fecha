/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import clinicaVeterinaria.modelo.TratamientoData;



/**
 *
 * @author Usuario
 */
public class VisitaData {
     private Connection connection = null;
     private Conexion conexion;
     private double pesoPromedio=0;
       List<Double> pesos = new ArrayList<>();

    public VisitaData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

  
    
    
    public void registrarVisita(Visita visita){
        try {
            if (visita.getMascota().getDueño().getId()==-1) 
            { JOptionPane.showMessageDialog(null, "Por favor primero registre el Cliente antes de registrar la visita");
              
            }
            else{
            String sql = "INSERT INTO visita (fecha, detalle, pesoActual,id_mascota,id_tratamiento) VALUES ( ? , ? , ?,?,?,? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1,Date.valueOf(visita.getFecha()));
            statement.setString(3, visita.getDetalle());
            statement.setDouble(4, visita.getPesoActual());
            statement.setInt(5, visita.getMascota().getId());
            statement.setInt(6, visita.getTratamiento().getId());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            pesoPromedio= promediarPeso(visita.getPesoActual());
            if (rs.next()) {
                visita.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id de visita");
            }
            statement.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
    }
    
    public double promediarPeso(double peso){
     int j=0; double pesoPromedio=0;
      
           
            pesos.add(peso);
        
        
        for(int i=0;i<=pesos.size();i++)
        {  j++;
            pesoPromedio += pesos.get(i);
        }
        pesoPromedio= pesoPromedio/j;
        return pesoPromedio;
    }
    
    public double retornarPesoPromedio(){
        return pesoPromedio;
    }

    //LISTAR MASCOTAS CON UN  MISMO TRATAMIENTO
    
    public List<Mascota> mismoTratamieno(int idTratamiento){
       List<Mascota> mascotas = new ArrayList<Mascota>();
       
       
        try {
            
            String sql = "SELECT * FROM visita WHERE id_tratamiento =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idTratamiento);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                             
               Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
               mascotas.add(m);
               
            }      
            statement.close();       
            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
       return mascotas;
       
    }
    private Mascota buscarMascota(int id) {
         
    
        MascotaData md=new MascotaData(conexion);
        
        return md.buscarMascota(id);
        
    
    }
   
    
    public Visita buscarVisita (int id){
        Visita v = new Visita();
        
        
        
    try {
            
            String sql = "SELECT * FROM visita WHERE id =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               v.setId(resultSet.getInt("id"));
               v.setDetalle(resultSet.getString("detalle"));
               v.setFecha(resultSet.getDate("fecha").toLocalDate());      
                v.setPesoActual(resultSet.getDouble("pesoActual"));   
               Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
               v.setMascota(m);
               Tratamiento t= buscarTratamiento(resultSet.getInt("id_tratamiento"));
               v.setTratamiento(t);

                
            }      
            statement.close();
     
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        
        return v;
        
    }
    
    
    public Visita buscarVisitaXMascota (int id){
        Visita v = new Visita();
        
        
        
    try {
            
            String sql = "SELECT * FROM visita WHERE id_mascota =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               v.setId(resultSet.getInt("id"));
               v.setDetalle(resultSet.getString("detalle"));
               v.setFecha(resultSet.getDate("fecha").toLocalDate());      
                v.setPesoActual(resultSet.getDouble("pesoActual"));   
               Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
               v.setMascota(m);
               Tratamiento t= buscarTratamiento(resultSet.getInt("id_tratamiento"));
               v.setTratamiento(t);

                
            }      
            statement.close();
     
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        
        return v;
        
    }
    
    
     private Tratamiento buscarTratamiento(int id) {
       TratamientoData td=new TratamientoData(conexion);
        
        return td.buscarTratamiento(id);
    
}

}
    
  /* 
    public List<Cursada> obtenerCursadasXAlumno(int id){
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM cursada WHERE idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("id"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return cursadas;
    }

    
    public Alumno buscarAlumno(int id){
    
        AlumnoData ad=new AlumnoData(conexion);
        
        return ad.buscarAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
    
        MateriaData md=new MateriaData(conexion);
        return md.buscarMateria(id);
    
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "SELECT idMateria, nombre FROM cursada, materia WHERE cursada.idMateria = materia.id\n" +
"and cursada.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "Select * from materia where id not in "
                    + "(select idMateria from cursada where idAlumno =?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("id"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public void borrarCursadaDeUnaMateriaDeunAlumno(int idAlumno,int idMateria){
    
        try {
            
            String sql = "DELETE FROM cursada WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }
    public void actualizarNotaCursada(int idAlumno,int idMateria, int nota){
    
        try {
            
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }*/

   
