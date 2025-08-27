package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.TipoJugada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JugadaDao {
    private Connection conexion;
    
    public JugadaDao() {
        conexion = Conexion.conectar();
    }
    
    public boolean guardar(TipoJugada jugada ) {
    boolean guardado = false;

    try {
        String sql = "insert into tipo_jugada (nombre, porcentaje, descripcion) values (?, ?, ?)";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, jugada.getNombre());
        stmt.setInt(2, jugada.getPorcentaje());
        stmt.setString(3, jugada.getDescripcion());

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
         String sql = "delete from tipo_jugada where id = ?";
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

        
    
    public boolean modificar(TipoJugada jugada) {
    boolean mod = false;

    try {
        String sql = "update tipo_jugada set nombre=?, porcentaje=?, descripcion=? where id=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, jugada.getNombre());
        ps.setInt(2, jugada.getPorcentaje());
        ps.setString(3, jugada.getDescripcion());
        ps.setInt(4, jugada.getId());
       
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            mod = true;
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return mod;
    }
    
    public List<TipoJugada> obtenerTodos() {
        List<TipoJugada> lista = new ArrayList<>();

        try {
            String sql = "select * from tipo_jugada";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TipoJugada jugada = new TipoJugada();
                jugada.setId(rs.getInt("id"));
                jugada.setNombre(rs.getString("nombre"));
                jugada.setPorcentaje(rs.getInt("porcentaje"));
                jugada.setDescripcion(rs.getString("descripcion"));
                lista.add(jugada);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}

