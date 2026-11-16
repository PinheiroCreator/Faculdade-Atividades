package persistencia;

import java.util.List;
import Model.Consultor;

public interface IConsultorCRUD {
    
    public void incluir (Consultor objConsultor) throws Exception;
    
    public Consultor consultar(int id) throws Exception;
    
    public void alterar (Consultor objConsultor) throws Exception;
    
    public void excluir (int id) throws Exception;
    
    public List<Consultor> listagemDeConsultores() throws Exception;
    
    
    
}
