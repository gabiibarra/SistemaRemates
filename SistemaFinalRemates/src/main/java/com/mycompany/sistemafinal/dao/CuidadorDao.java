
package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Cuidadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CuidadorDao {
    
    private Connection conexion;
    
    public CuidadorDao() {
        conexion = Conexion.conectar();
    }
    
    public boolean guardar(Cuidadores cuidador) {
    boolean guardado = false;

    try {
        String sql = "insert into cuidadores (nombre, telefono, localidad) VALUES (?, ?, ?)";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, cuidador.getNombre());
        stmt.setString(2, cuidador.getTelefono());
        stmt.setString(3, cuidador.getLocalidad());

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
         String sql = "delete from cuidadores where id = ?";
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

        
    
    public boolean modificar(Cuidadores cuidador) {
    boolean mod = false;

    try {
        String sql = "update cuidadores set nombre=?, telefono=?, localidad=? where id=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, cuidador.getNombre());
        ps.setString(2, cuidador.getTelefono());
        ps.setString(3, cuidador.getLocalidad());
        ps.setInt(4, cuidador.getId());

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            mod = true;
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return mod;
}


    public List<Cuidadores> obtenerTodos() {
        List<Cuidadores> lista = new ArrayList<>();

        try {
            String sql = "select * from cuidadores";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cuidadores cuidador = new Cuidadores();
                cuidador.setId(rs.getInt("id"));
                cuidador.setNombre(rs.getString("nombre"));
                cuidador.setTelefono(rs.getString("telefono"));
                cuidador.setLocalidad(rs.getString("localidad"));
                
                lista.add(cuidador);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
