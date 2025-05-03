package quarto_poo;

public class Poo {

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Merlin");
        pessoa1.setAltura(1.4);
        pessoa1.setIdade(25);
        pessoa1.aniversario();
        System.out.println("Meu nome e " + pessoa1.getNome() + " e eu tenho " + pessoa1.getIdade() + " anos");

    }

}
