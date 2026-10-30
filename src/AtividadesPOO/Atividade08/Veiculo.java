
public class Veiculo {
    
    private String marca, modelo, tipoVeiculo;
    private int ano;
    private boolean acelerar = false;
    private boolean freiar = false;
    
    public String getTipoVeiculo () { return tipoVeiculo;}
    
    public void setTipoVeiculo (String tipoVeiculo) {this.tipoVeiculo = tipoVeiculo;}
     
    public boolean isAcelerar() {return acelerar;}

    public void setAcelerar(boolean acelerar) {this.acelerar = acelerar;}

    public boolean isFreiar() {return freiar;}

    public void setFreiar(boolean freiar) {this.freiar = freiar;}    
    
    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public int getAno() {return ano;}
    
    public void setAno(int ano) {this.ano = ano;}
    
    public Veiculo(String modelo, String marca, int ano, String tipoVeiculo) {
        
        this.tipoVeiculo =  tipoVeiculo;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        
    }
    
    public void exibirInfoVeiculo() {
            
        System.out.printf("\nTipo: %s\nModelo: %s\nMarca: %s\nAno: %d",this.getTipoVeiculo(), this.getModelo(), this.getMarca(), this.getAno());
    }
    

    public void acelerar() {
        setAcelerar(true);     
    }
    
    public void freiar () {
        
        if(isAcelerar() == true) {
           setFreiar(true);
            System.out.println("\nFreiando");
        }
        
        else {
            System.out.println("\nVoce esta parado!!");
           setFreiar(false);
        }
    }
}




class Carro extends Veiculo {
    
    int numeroDePortas;
    
    public Carro (String tipoVeiculo,String modelo, int ano, String marca, int numeroDePortas) {
        
         super(tipoVeiculo,modelo,ano,marca);
        this.numeroDePortas =  numeroDePortas;
    }
    
    
    @Override
    
    public void exibirInfoVeiculo() {
        
        super.exibirInfoVeiculo();
        
        System.out.printf("\nNumero de portas: %d", this.numeroDePortas);
    }
 
    @Override 
    
    public void acelerar () {
        
        super.acelerar();
        
        System.out.println("\nO carro esta Acelerando");
    }
    
    public void freiar () {
        
        super.freiar();
        
    }
}





class Moto extends Veiculo {
    
    int cilindradas;
    
    public Moto (String tipoVeiculo,String modelo, int ano, String marca, int cilindradas) {
        
        super(tipoVeiculo,modelo,ano,marca);
        this.cilindradas = cilindradas;
    }
    
    
    @Override
    
    public void exibirInfoVeiculo() {
        
        super.exibirInfoVeiculo();
        
        System.out.printf("\nCC: %d", this.cilindradas);
    }
    
    @Override
    
    public void acelerar () {
        
        super.acelerar();
        
        System.out.println("\nA moto esta Acelerando");
    }
    
    public void freiar () {
        
        super.freiar();
        
    }
}






class Caminhao extends Veiculo {
    
    int cargaSuportada;
    
    public Caminhao (String tipoVeiculo,String modelo, int ano, String marca, int cargaSuportada) {
        
        super(tipoVeiculo,modelo,ano,marca);
        this.cargaSuportada = cargaSuportada;
    }
    
    
    @Override
    
    public void exibirInfoVeiculo() {
        
        super.exibirInfoVeiculo();
        
        System.out.printf("\nCarga Suportada(KG): %d", this.cargaSuportada);
    }
    
    @Override
    
    public void acelerar () {
        
        super.acelerar();
        
        System.out.println("\nO caminhao esta Acelerando");
    }
    
    public void freiar () {
        
        super.freiar();
        
    }
}
