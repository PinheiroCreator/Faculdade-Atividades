package fatesg.atividade0809;

public class Atividade0809 {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Lancer evo", 2024, "mitsubishi");
        
        System.out.println("Modelo: " + meuCarro.modelo + "\nAno: " + meuCarro.anoFabricacao + "\nmarca: " + meuCarro.marca + "\n");
    
        
        //QUESTAO 02 -> livro
        
    
        Livro Livro01 = new Livro("Angola skins pro", "angolano rei", 875);
        
        Livro Livro02 = new Livro("angola vs India");
        
        System.out.println("Livro 1 ->\n" + "Titulo: " + Livro01.titulo + "\nAutor: " + Livro01.autor + "\nPaginas: " + Livro01.paginas);
        
        System.out.println("\nLivro 2 ->\n" + "Titulo: " + Livro02.titulo + "\n");
        
        //QUESTAO 03 ->
        
        Filme fnafMovie = new Filme("five nigth at freddy", "scoot", 140);
        
        Filme novoFilme = new Filme("Diretor Desconhecido");
        
        System.out.printf("Titulo: %s \nDiretor: %s \nDuraçao(minutos): %d",fnafMovie.titulo, fnafMovie.diretor, fnafMovie.durancao);
    
        System.out.printf("\n\nTitulo: %s \nDiretor: %s \nDuraçao(minutos): %d",novoFilme.titulo, novoFilme.diretor, novoFilme.durancao);
    
        //QUESTAO 04 ->
        
        Produto Monitor = new Produto("Monitor acer 180hz", 1900.0, 100);
        
        Produto Gabinete = new Produto("Todo mancer e ruim 2", 0.1);
        
        System.out.printf("\n\nNome: %s   Preço: %.2f   Quantidade: %d", Monitor.nome, Monitor.preco, Monitor.quantidade);
    
        System.out.printf("\nNome: %s   Preço: %.2f   Quantidade: %d", Gabinete.nome, Gabinete.preco, Gabinete.quantidade);

        
        //QUESTAO 05 ->
        
        Cachorro zeus = new Cachorro("Zeus","Husk Siberiano");
        
        System.out.printf("\n\nNome: %s   Raça: %s", zeus.nome, zeus.raca);
    }
}
