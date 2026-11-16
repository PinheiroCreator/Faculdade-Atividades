
package Model;

public class Consultor {

    private int id_Consultor = 0;
    private String nome = "";
    private String telefone = "";
    private String email = "";

    
    public int getId_Consultor() {
        return id_Consultor;
    }


    public void setId_Consultor(int id_Consultor) {
        this.id_Consultor = id_Consultor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

@Override
    public String toString() {
        return "Consultor{" + "id_Consultor=" + id_Consultor + ", nome="
                + nome + ", telefone = " + telefone + ", email=" + email + "}";
    }


public Consultor() {}

public Consultor (int id_Consultor, String nome, String telefone, String email) {
        
        this.id_Consultor = id_Consultor;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}

