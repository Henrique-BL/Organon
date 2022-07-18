package br.com.organon.model;
import java.sql.*;

public class Conexao {
        //XPGTjnIXaa
        private static final String driver = "com.mysql.cj.jdbc.Driver";
        private static final String url = "jdbc:mysql://localhost:3306/sql10498785";
        private static final String user = "root";
        private static final String pass = "";
    
        public static Connection conexao(){
            Connection  conn = null;
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,pass);
                }catch(Exception e){
                System.out.println("Erro Conexao" + e);
             }
           return conn;
        }
         public static void main (String args[]) throws SQLException{
             Connection conexaoTst = conexao();
             if(conexaoTst!=null){
                 System.out.println("Conexão estabelecida");
                 conexaoTst.close();
             }else{
                 System.out.println("Conexão falha");
             }
         }
}
