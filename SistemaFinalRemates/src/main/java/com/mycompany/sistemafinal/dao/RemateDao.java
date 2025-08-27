package com.mycompany.sistemafinal.dao;

import com.mycompany.sistemafinal.conexion.Conexion;
import com.mycompany.sistemafinal.model.Remate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RemateDao {
    
     private Connection conexion;

    public RemateDao() {
        conexion = Conexion.conectar();
    }
     
    
    public boolean guardar(Remate remate) {
        boolean guardado = false;

        try {
            String sql = "INSERT INTO remate (idInfoCarrera, idOperador, importePagado, importeCobrar, idTipoJugada) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setInt(1, remate.getIdInfoCarrera());
            stmt.setInt(2, remate.getIdOperador());
            stmt.setFloat(3, remate.getImportePagado());
            stmt.setFloat(4, remate.getImporteCobrar());
            stmt.setInt(5, remate.getIdTipoJugada());

            int filasAfectadas = stmt.executeUpdate();
            guardado = filasAfectadas > 0;

            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return guardado;
    }

    

    public List<Remate> obtenerTodos() {
        List<Remate> lista = new ArrayList<>();

        try {
            String sql = "select * from remate";

            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Remate remate = new Remate();
                remate.setId(rs.getInt("id"));
                remate.setIdInfoCarrera(rs.getInt("idInfoCarrera"));
                remate.setIdOperador(rs.getInt("idOperador"));
                remate.setImportePagado(rs.getFloat("importePagado"));
                remate.setImporteCobrar(rs.getFloat("importeCobrar"));
                remate.setIdTipoJugada(rs.getInt("idTipoJugada"));

                lista.add(remate);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    

}
