
package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.InfoCarrera;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InfoCarreraDao {
    private Connection conexion;
    
    public InfoCarreraDao() {
        conexion = Conexion.conectar();
    }
    
    public boolean guardar(InfoCarrera carrera) {
        boolean guardado = false;

        try {
            String sql = "insert into infocarrera (idCarrera, idCaballo, idJockey) values (?, ?, ?)";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, carrera.getIdCarrera());
            st.setInt(2, carrera.getIdCaballo());
            st.setInt(3, carrera.getIdJokey());

            int filas = st.executeUpdate(); 
            if (filas > 0) {
                guardado = true;
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
            String sql = "delete from infocarrera where idCarrera = ?";
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
    
    public boolean modificar(InfoCarrera carrera) {
        boolean mod = false;
        try {
            String sql = "update infocarrera set idCarrera = ?, idCaballo = ?, idJockey = ? where id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, carrera.getIdCarrera());
            ps.setInt(2, carrera.getIdCaballo());
            ps.setInt(3, carrera.getIdJokey());

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
    
    public List<InfoCarrera> obtenerTodos() {
        List<InfoCarrera> lista = new ArrayList<>();

        try {
            String sql = "select id, idCarrera, idCaballo, idJockey from infocarrera";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                InfoCarrera ca = new InfoCarrera();

                ca.setIdCarrera(rs.getInt("idCarrera"));
                ca.setIdCaballo(rs.getInt("idCaballo"));  
                ca.setIdJokey(rs.getInt("idJockey")); 

                lista.add(ca);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    public boolean existe(int idCaballo, Date fechaCarrera) {
        boolean resultado = false;

        String sql = """
            select count(*) from infocarrera p
            join carrera c on p.idCarrera = c.id
            where p.idCaballo = ? and c.fecha = ?
        """;

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idCaballo);
            stmt.setDate(2, fechaCarrera);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                resultado = rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    } 
    
    public boolean existeM(int idCaballo, Date fechaCarrera, int idExcluir) {
        boolean resultado = false;

        String sql = """
            select count(*) from infocarrera p
            join carrera c on p.idCarrera = c.id
            where p.idCaballo = ? and c.fecha = ? and p.id != ?
        """;

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idCaballo);
            stmt.setDate(2, fechaCarrera);
            stmt.setInt(3, idExcluir);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                resultado = rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public InfoCarrera buscarPorId(int id) {
        InfoCarrera info = null;
        try {
            String sql = "SELECT * FROM infocarrera WHERE idInfoCarrera = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                info = new InfoCarrera();
                info.setId(rs.getInt("idInfoCarrera"));
                info.setIdCarrera(rs.getInt("idCarrera"));
                info.setIdCaballo(rs.getInt("idCaballo"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }

}
