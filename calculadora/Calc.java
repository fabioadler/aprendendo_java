package calculadora;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("Calculadora java");
            System.out.println("1) Soma");
            System.out.println("2) Subitração");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.println("0) Sair");

            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){
                if(opcao == 1){}
                else if(opcao == 2){}
                else if(opcao == 3){}
                else if(opcao == 4){}
            }
            else if(opcao != 0){
                System.out.println("Opção invalida!");
            }
            else{}


        } while(opcao != 0);

    }
}
