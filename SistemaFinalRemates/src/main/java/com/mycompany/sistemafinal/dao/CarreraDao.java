
package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarreraDao {
    private Connection conexion;

    public CarreraDao() {
        conexion = Conexion.conectar();
    }

    public boolean guardar(Carrera carrera) {
    boolean guardado = false;

    try {
        String sql = "insert into carrera (nombre,fecha, distancia) values (?, ?, ?)";
        PreparedStatement st = conexion.prepareStatement(sql);
        st.setString(1, carrera.getNombre());
        st.setDate(2, carrera.getFecha());
        st.setFloat(3, carrera.getDistancia());
       ;

        int filas = st.executeUpdate(); 
        if (filas > 0) {
            guardado = true;st.setFloat(2, carrera.getDistancia());
        }

        st.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return guardado;
}

    public boolean eliminar(int id) {
        boolean eliminado = false;

        try {
            String sql = "delete from carrera where id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                eliminado = true;
            }

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return eliminado;
    }

    public boolean modificar(Carrera carrera) {
        boolean mod = false;
        try {
            String sql = "update carrera set nombre=?, fecha = ?, distancia = ? where id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1,carrera.getNombre());
            ps.setDate(2, carrera.getFecha());
            ps.setFloat(3, carrera.getDistancia());
            ps.setInt(4, carrera.getId());//Error

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                mod = true;
            }

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mod;
    }


    public List<Carrera> obtenerTodos() {
        List<Carrera> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM carrera";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Carrera carrera = new Carrera();

                carrera.setId(rs.getInt("id"));
                carrera.setNombre(rs.getString("nombre"));
                carrera.setFecha(rs.getDate("fecha")); 
                carrera.setDistancia(rs.getFloat("distancia")); 

                lista.add(carrera);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    
}
