package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Caballos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CaballoDao {

    private Connection conexion;

    public CaballoDao() {
        conexion = Conexion.conectar();
    }

    public boolean guardar(Caballos caballo) {
        boolean guardado = false;

        try {
            String sql = "insert into caballos (nombre, peso, idCuidador) values (?, ?, ?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, caballo.getNombre());
            stmt.setString(2, caballo.getPeso());
            stmt.setInt(3, caballo.getIdCuidador());

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
            String sql = "delete from caballos where id = ?";
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

    public boolean modificar(Caballos caballo) {
        boolean mod = false;
        try {
            String sql = "update caballos set nombre = ?, peso = ?, idCuidador = ? where id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, caballo.getNombre());
            ps.setString(2, caballo.getPeso());
            ps.setInt(3, caballo.getIdCuidador());
            ps.setInt(4, caballo.getId());

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

    public List<Caballos> obtenerTodos() {
        List<Caballos> lista = new ArrayList<>();

        try {
            String sql = "select * from caballos";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Caballos caballo = new Caballos();
                caballo.setId(rs.getInt("id"));
                caballo.setNombre(rs.getString("nombre"));
                caballo.setPeso(rs.getString("peso"));
                caballo.setIdCuidador(rs.getInt("idCuidador"));
                lista.add(caballo);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
