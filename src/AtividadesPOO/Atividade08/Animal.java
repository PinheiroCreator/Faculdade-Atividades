

public class Animal {
    
       private String nome;
       private int idade;


    public String getNome() {
        return nome;
    }

   
    public int getIdade() {
        return idade;
    }

    public Animal (String nome, int idade) {
        
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirInfoAnimal () {
        
        System.out.printf("\nNome: %s\nidade: %d", this.getNome(), this.getIdade());
    } 
    
    public void exibirSom () {
      
        System.out.println("SOM...");
    }
}   



class Cachorro extends Animal {
    
    String raca;
    
    public Cachorro(String nome, int idade, String raca) {
        
        super(nome,idade);
        this.raca = raca;
    }
    
    @Override
    
    public void exibirInfoAnimal() {
    
        
        System.out.println("Cachorro");
        super.exibirInfoAnimal();
        System.out.println("\nRaca: " + this.raca);
    }
    
    @Override 
    
    public void exibirSom() {
        
        System.out.println("\nLatindo...");
    }
}





class Gato extends Animal {
    
    String raca;
    
    public Gato(String nome, int idade, String raca) {
        
        super(nome,idade);
        this.raca = raca;
    }
    
    @Override 
    
    public void exibirSom() {
        
        System.out.println("\nMiando...");
    }


    @Override
    
    public void exibirInfoAnimal() {
    
        System.out.println("GATO");
        super.exibirInfoAnimal();
        System.out.println("\nRaca: " + this.raca);
    }   
}




class Papagaio extends Animal {
    
    String Especie;
    
    public Papagaio(String nome, int idade, String Especie) {
        
        super(nome,idade);
        this.Especie = Especie;
    }
    
    @Override 
    
    public void exibirSom() {
        
        System.out.println("\nCantando...");
    }
    
    
    @Override
    
    public void exibirInfoAnimal() {
    
        System.out.println("Papagaio: ");
        super.exibirInfoAnimal();
        System.out.println("\nEspecie: " + this.Especie);
    }
    
}



    
