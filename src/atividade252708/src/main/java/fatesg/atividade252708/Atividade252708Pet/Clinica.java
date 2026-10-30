package fatesg.atividade252708.Atividade252708Pet;

public class Clinica {

    public static void main(String[] args) {

        Animal[] animais = new Animal[5];

        animais[0] = new Animal("Rex", "Cachorro", 3, 22.5);

        animais[1] = new Animal("Miau", "Gato", 2, 4.2);

        animais[2] = new Animal("Piu", "Calopsita", 1, 0.1);

        animais[3] = new Animal("Bolinha", "Hamster", 1, 0.05);

        animais[4] = new Animal("Thor", "Cachorro", 5, 30.0);

        for (int i = 0; i < animais.length; i++) {
            animais[i].exibirInfo();
        }

        animais[0].fazerAniversario();

        System.out.println("Apos aniversario do Rex:");

        animais[0].exibirInfo();


        Veterinario[] veterinarios = new Veterinario[5];

        veterinarios[0] = new Veterinario("Ana Souza", "CRMV-GO 1234", "Clinica Geral", 4);

        veterinarios[1] = new Veterinario("Carlos Lima", "CRMV-GO 5678", "Cirurgia", 8);

        veterinarios[2] = new Veterinario("Beatriz Alves", "CRMV-GO 9012", "Dermatologia", 2);

        veterinarios[3] = new Veterinario("Diego Farias", "CRMV-GO 3456", "Ortopedia", 6);

        veterinarios[4] = new Veterinario("Elisa Prado", "CRMV-GO 7890", "Nutricao Animal", 3);

        for (int i = 0; i < veterinarios.length; i++) {
            veterinarios[i].exibirInfo();
        }

        veterinarios[1].incrementarExperiencia();

        System.out.println("Apos incremento de experiencia do Carlos:");

        veterinarios[1].exibirInfo();
    }
}