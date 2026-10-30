package fatesg.aula2209;

public class Corrida {

    private String origem;
    private String destino;
    private String modelo;
    private String placa;
    private double distancia;

    public Corrida(String origem, String destino, double distancia, String modelo, String placa) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double calcularValor() {
        return distancia * 1.0;
    }

    public double calcularValor(double desconto) {
        return calcularValor() - desconto;
    }
}

class CorridaCarro extends Corrida {

    public CorridaCarro(String origem, String destino, double distancia, String modelo, String placa) {
        super(origem, destino, distancia, modelo, placa);
    }

    @Override
    public double calcularValor() {

        double valor = getDistancia() * 1.5;

        if (valor > 50.00) {
            return valor - 12.5;
        } else {
            return valor;
        }
    }
}

class CorridaMoto extends Corrida {

    public CorridaMoto(String origem, String destino, double distancia, String modelo, String placa) {
        super(origem, destino, distancia, modelo, placa);
    }

    @Override
    public double calcularValor() {

        double valor = getDistancia() * 1.2;

        if (valor > 30.00) {
            return valor - 10;
        } else {
            return valor;
        }
    }
}

class CorridaExecutiva extends Corrida {

    public CorridaExecutiva(String origem, String destino, double distancia, String modelo, String placa) {
        super(origem, destino, distancia, modelo, placa);
    }

    @Override
    public double calcularValor() {

        double valor = getDistancia() * 1.8;

        if (valor > 80.00) {
            return valor - 20;
        } else {
            return valor;
        }
    }
}

