package br.com.uniderp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModuloDeConexao {

    public static Connection conector() {
        //criando a varialvel para conexao
        java.sql.Connection conexao = null;
        //chamamdo o driver
        String driver = "org.postgresql.Driver";
        //Armazenanando as informaçoes do banco 
        String url = "jdbc:postgresql://localhost:5432/db_escola2";
        String usuario = "postgres";
        String senha = "postgres";
        
        //estabelecendo a conexao
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro = "+e);
            return null;
        }


    }
    
}
