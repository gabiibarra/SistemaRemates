
package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Jockey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JockeyDao {
    private Connection conexion;
    
    public JockeyDao() {
        conexion = Conexion.conectar();
    }
      
    public boolean guardar(Jockey jockey) {
    boolean guardado = false;

    try {
        String sql = "insert into jockey (nombre, peso, telefono, localidad) values (?,?, ?, ?)";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, jockey.getNombre());
        stmt.setString(2, jockey.getPeso());
        stmt.setString(3, jockey.getTelefono());
        stmt.setString(4, jockey.getLocalidad());

        int filas = stmt.executeUpdate();
        if (filas > 0) {
            guardado = true;
        }

        stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    return guardado;
    }

  
    public boolean eliminar(int id) {
        boolean eliminado = false;

        try {
         String sql = "delete from jockey where id = ?";
         PreparedStatement ps = conexion.prepareStatement(sql);
         ps.setInt(1, id);

         int filasAfectadas = ps.executeUpdate();
         if (filasAfectadas > 0) {
             eliminado = true;
         }


     } catch (Exception e) {
         e.printStackTrace();
     }
  
        return eliminado;
    }

        
    
    public boolean modificar(Jockey jockey) {
        boolean mod = false;

        try {
            String sql = "update jockey set nombre=?, peso=?, telefono=?, localidad=? where id=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, jockey.getNombre());
            ps.setString(2, jockey.getPeso());
            ps.setString(3, jockey.getTelefono());
            ps.setString(4, jockey.getLocalidad());
            ps.setInt(5, jockey.getId());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                mod = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mod;
}


    public List<Jockey> obtenerTodos() {
        List<Jockey> lista = new ArrayList<>();

        try {
            String sql = "select * from jockey";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Jockey jockey = new Jockey();
                jockey.setId(rs.getInt("id"));
                jockey.setNombre(rs.getString("nombre"));
                jockey.setPeso(rs.getString("peso"));
                jockey.setTelefono(rs.getString("telefono"));
                jockey.setLocalidad(rs.getString("localidad"));
                
                lista.add(jockey);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
