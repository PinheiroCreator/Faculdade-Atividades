package AtividadesPOO.atividade14.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
        

    private static Connection conexao = null;
    
    private ConexaoBD(){}
    
    public static Connection getConexao () throws Exception {
        
        try {
            
            if(conexao == null) {
                   
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://localhost:5432/consultor_projeto_BDE";
                String user = "pinheiro";
                String password = "maia";
                
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
            }
        
        }catch (ClassNotFoundException erro) {
              throw new Exception("Erro no driver do Banco" + erro.getMessage());
            }
    
         catch(SQLException erro) {
            throw new Exception ("Erro de Dados no Banco: " + erro.getMessage());
        }
    
        return conexao;
    }
  }


