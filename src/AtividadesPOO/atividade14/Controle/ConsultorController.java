package Controle;

import persistencia.IConsultorCRUD;
import Model.Consultor;
import java.util.List;
        
public class ConsultorController {
    
    private final IConsultorCRUD crud;
    
    public ConsultorController(IConsultorCRUD crud) {
        this.crud = crud;
    }
    
    public void incluir(String nome, String telefone, String email) throws Exception {
        
        validar(nome, telefone, email);
        
        crud.incluir(new Consultor(0, nome.trim(), telefone.trim(), email.trim()));
    }
    
    public Consultor consultar(String textoId) throws Exception {
        return crud.consultar(converterId(textoId));
    }
    
    public void alterar (String textoId, String nome,String telefone, String email) throws Exception {
        
        int id = converterId(textoId);
        validar(nome, telefone, email);
        crud.alterar(new Consultor(id, nome.trim(), telefone.trim(), email.trim()));
    }
    
    public void excluir (String textoId) throws Exception {
        crud.excluir(converterId(textoId));
    }
    
    public List<Consultor> listar() throws Exception {
        return crud.listagemDeConsultores();
    }
    
    private int converterId(String texto) {
        try {
          return Integer.parseInt(texto.trim());
        }
          catch(NumberFormatException erro) {
              throw new IllegalArgumentException("Informe um ID numerico");
          }
    }
    
    private void validar (String nome, String telefone, String email) {
        
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o Telefone.");
        }
        
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o email.");
        }
    }
    
    
}
