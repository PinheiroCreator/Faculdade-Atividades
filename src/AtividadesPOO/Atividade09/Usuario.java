package AtividadesPOO.Atividade09;

public class Usuario {

    
    private String nome, email, tipoDeConta;

    public String getNome () { return nome;}
    
    public void setNome (String nome) {this.nome = nome;}
    
    public String getEmail () { return email;}
    
    public void setEmail (String email) {this.email = email;}
    
    public String getTipoDeConta () { return tipoDeConta; }
    
    public double calcularPreco () { return 0.0;}
    
    public Usuario (String nome, String email, String tipoDeConta) {
        
        this.nome = nome;
        this.email = email;
        this.tipoDeConta = tipoDeConta;
    }
}

class UsuarioBasico extends Usuario {
    
     public UsuarioBasico (String nome, String email, String tipoDeConta) {
     
            super(nome,email,tipoDeConta);
     }

    @Override
    
    public double calcularPreco () {
        return 24.99;
    }
}

//       @@@@@

class UsuarioPremium extends Usuario {
    
     public UsuarioPremium (String nome, String email, String tipoDeConta) {
     
            super(nome,email,tipoDeConta);
     }

    @Override
    
    public double calcularPreco () {
        return 49.99;
    }
}

// ########


class UsuarioFamilia extends Usuario {
    
     public UsuarioFamilia (String nome, String email, String tipoDeConta) {
     
            super(nome,email,tipoDeConta);
     }

    @Override
    
    public double calcularPreco () {
        return 69.99;
    }
}    
