package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Operador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OperadorDao {

    private Connection conexion;

    public OperadorDao() {
        conexion = Conexion.conectar();
    }
    
    public Operador validar(String nombre, String contrasenia) {
        Operador operador = null;

        try {
            String sql = "SELECT * FROM operador WHERE nombre = ? AND contrasenia = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.setString(2, contrasenia);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                operador = new Operador();
                operador.setId(rs.getInt("id"));
                operador.setNombre(rs.getString("nombre"));
                operador.setTelefono(rs.getString("telefono"));
                operador.setContrasenia(rs.getString("contrasenia"));
                operador.setRol(rs.getString("rol"));
            } else {
            System.out.println("No se encontró el usuario en la base de datos.");
        }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return operador;
    }


    
    public boolean guardar(Operador operador) {
        boolean guardado = false;

        try {
            String sql = "INSERT INTO operador (nombre, telefono, contrasenia, rol) VALUES (?, ?, ?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, operador.getNombre());
            stmt.setString(2, operador.getTelefono());
            stmt.setString(3, operador.getContrasenia());
            stmt.setString(4, operador.getRol());

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
            String consultaRol = "SELECT rol FROM operador WHERE id = ?";
            PreparedStatement psRol = conexion.prepareStatement(consultaRol);
            psRol.setInt(1, id);
            ResultSet rs = psRol.executeQuery();

            if (rs.next()) {
                String rol = rs.getString("rol");

                if (!"admin".equalsIgnoreCase(rol)) {
                    String sql = "DELETE FROM operador WHERE id = ?";
                    PreparedStatement ps = conexion.prepareStatement(sql);
                    ps.setInt(1, id);

                    int filasAfectadas = ps.executeUpdate();
                    if (filasAfectadas > 0) {
                        eliminado = true;
                    }

                    ps.close();
                }
            }

            rs.close();
            psRol.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eliminado;
    }


    public boolean modificar2(Operador operador) {
        boolean modificado = false;
        try {
            String sql = "UPDATE operador SET telefono = ?, contrasenia = ? WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, operador.getNombre());
            ps.setString(2, operador.getContrasenia());
            ps.setInt(3, operador.getId());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                modificado = true;
            }

            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modificado;
    }
  
    
    public boolean modificar(Operador operador) {
         boolean mod = false;
        try {
            String sql = "update operador set nombre=?,telefono=?, contrasenia=?, rol=? where id=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, operador.getNombre());
            ps.setString(2, operador.getTelefono());
            ps.setString(3, operador.getContrasenia());
            ps.setString(4, operador.getRol());
            ps.setInt(5, operador.getId());
 
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                mod = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mod;
    }

    public List<Operador> obtenerTodos() {
        List<Operador> lista = new ArrayList<>();

        try {
            String sql = "select * from operador";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Operador operador = new Operador();
                operador.setId(rs.getInt("id"));
                operador.setNombre(rs.getString("nombre"));
                operador.setTelefono(rs.getString("telefono"));
                operador.setContrasenia(rs.getString("contrasenia"));
                operador.setRol(rs.getString("rol"));

                lista.add(operador);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
