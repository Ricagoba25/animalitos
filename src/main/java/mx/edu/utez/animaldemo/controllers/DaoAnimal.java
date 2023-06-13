package mx.edu.utez.animaldemo.controllers;

import mx.edu.utez.animaldemo.models.Animal;
import mx.edu.utez.animaldemo.utils.MysqlConector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoAnimal {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;


    public List<Animal> consultaAnimales(){
        List<Animal> listaAnimal = new ArrayList<>();
        try{
            con = MysqlConector.connect();
            ps = con.prepareStatement("Select * From animal");
            rs = ps.executeQuery();

            while (rs.next()){
                Animal animalito = new Animal();
                animalito.setId(rs.getInt("id"));
                animalito.setNombre(rs.getString("nombre"));
                animalito.setEspecie(rs.getString("especie"));
                animalito.setSexo(rs.getInt("sexo"));
                animalito.setColor(rs.getString("color"));
                animalito.setNoPatas(rs.getInt("noPatas"));

                listaAnimal.add(animalito);

            }
        }catch(SQLException e){
            System.err.println("No se pudo mostrar tu cositas" + e.getMessage());
        }finally {
            cerrarConection("consultaAnimales");
        }


        return listaAnimal;
    }

    public void cerrarConection(String metodo){
        try {
            if (rs != null){
                rs.close();
            }
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            System.err.println("Error al cerrar Conexiones en el Metodo " + metodo + "Mensaje: " + e.getMessage());
        }
    }


}
