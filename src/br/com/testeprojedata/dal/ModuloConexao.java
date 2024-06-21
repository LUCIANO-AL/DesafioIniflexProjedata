/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testeprojedata.dal;
import java.sql.*;

/**
 *Conexão com banco de dados
 * @author Luciano Albuquerque Lima
 * @version 1.1
 */
public class ModuloConexao {
    
     public static Connection conector(){
        
         Connection conexao = null;
        
        //a linha abaixo chama o drive que foi importado para a biblioteca 
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco        
        String url = "jdbc:mysql://127.0.0.1:3306/teste_projedata?characterEncoding=utf-8";        
        String user = "dba";       
        String password = "Sist@123456";      
        
        //Estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}

