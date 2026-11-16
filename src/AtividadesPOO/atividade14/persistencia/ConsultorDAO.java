package persistencia;

import java.nio.file.*;
import Model.Consultor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class ConsultorDAO implements IConsultorCRUD {
    
    private final Path arquivo;
    
    public ConsultorDAO() throws Exception {
        
        this("consultores.txt");
    }
    
    public ConsultorDAO (String caminhoDoArquivo) {
        this.arquivo = Paths.get(caminhoDoArquivo);
    }
    
@Override

    public void incluir(Consultor objConsultor) throws Exception {
        
        try {
            int novoId = 1;
            
            for (Consultor c : lerTodos()) {
                if (c.getId_Consultor() >= novoId) {
                    novoId = c.getId_Consultor() + 1;
                }
            }
            
        objConsultor.setId_Consultor(novoId);
        
        Files.write(arquivo, Collections.singletonList(paraLinha(objConsultor)),
       StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        
        } catch (IOException erro) {
            throw new Exception("ERRO AO GRAVAR O ARQUIVO: " + erro.getMessage());
        }
    }
    
    @Override
    
    public Consultor consultar (int id ) throws Exception  {
        
        try {
            for (Consultor c : lerTodos()) {
                if(c.getId_Consultor() == id) {
                    return c;
                }
            }
        } catch (IOException erro) {
            throw new Exception ("Erro ao ler o arquivo: " + erro.getMessage());
        }
            throw new Exception ("Consultor nao existe no arquivo");
    }
    
    @Override
    
    public void alterar(Consultor objConsultor) throws Exception {
        
        try {
            List<Consultor>lista = lerTodos();
            boolean achou = false;
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getId_Consultor() == objConsultor.getId_Consultor()) {
                    lista.set(i, objConsultor);
                    achou = true;
                }
        }
            if(!achou) {
                throw new Exception ("COnsultor nao existe no arquivo");
            }
            gravarTodos(lista);
    }catch (IOException erro) {
        throw new Exception("Erro ao alterar o arquivo:" + erro.getMessage());
      }
  }
    
  @Override
  
  public void excluir (int id) throws Exception {
      
      try {
          List<Consultor> lista = lerTodos();
          boolean removeu = lista.removeIf(c -> c.getId_Consultor() == id);
          if (!removeu) {
              throw new Exception("Consultor nao existe no arquivo");
          }
          gravarTodos(lista);
      }catch (IOException erro) {
          throw new Exception ("Erro ao excluir no arquivo" + erro.getMessage());
    }
  }
    
  @Override
  
  public List<Consultor> listagemDeConsultores() throws Exception {
      
      try {
          return lerTodos();
      } 
        catch (IOException erro) {
          throw new Exception ("Erro ao ler o arquivo: " + erro.getMessage());
      }
  }
  
  // ============ APOIO DO ARQUIVO .TXT ===============

  private List<Consultor> lerTodos() throws IOException {
      
      List<Consultor>lista = new ArrayList<>();
      if (!Files.exists(arquivo)) {
          return lista;

      }
      for (String linha : Files.readAllLines(arquivo, StandardCharsets.UTF_8)) {
          String[] p = linha.split(";", -1);
          if (p.length != 4) {
              continue;
          }
          try {
              lista.add(new Consultor(Integer.parseInt(p[0].trim()), p[1], p[2], p[3]));
          
          } catch (NumberFormatException erro) {
         
          }
      }
      
      return lista;
}
  private String limpar(String texto) {
    if (texto == null) {
        return "";
    }
    return texto.replace(";", ",").replace("\n", " ").replace("\r", " ");
}
  
    private void gravarTodos(List<Consultor> lista) throws IOException {
        
        List<String> linhas = new ArrayList<>();
        for (Consultor c : lista) {
            linhas.add(paraLinha(c));
        }
        
        Files.write(arquivo, linhas, StandardCharsets.UTF_8,
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        
        private String paraLinha(Consultor c) {
            return c.getId_Consultor() + ";" + limpar(c.getNome()) + ";"
                    + limpar(c.getTelefone()) + ";" + limpar(c.getEmail());
        }
    }