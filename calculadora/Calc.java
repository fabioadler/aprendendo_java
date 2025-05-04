package calculadora;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\nCalculadora java\n");
            System.out.println("1) Soma");
            System.out.println("2) Subitração");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.println("0) Sair\n");

            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){
                System.out.print("Digite o primeiro numero: ");
                double n1 = scanner.nextDouble();
                System.out.print("Digite o Segundo numero: ");
                double n2 = scanner.nextDouble();
                double resultado = 0;
                String op = " ? ";
                if(opcao == 1){
                    resultado = n1 + n2;
                    op = " + ";
                }
                else if(opcao == 2){
                    resultado = n1 - n2;
                    op = " - ";
                }
                else if(opcao == 3){
                    resultado = n1 * n2;
                    op = " X ";
                }
                else if(opcao == 4){
                    resultado = n1 / n2;
                    op = " / ";
                }
                System.out.println("\n" + n1 + op + n2 + " = " + resultado);
            }
            else if(opcao != 0){
                System.out.println("Opção invalida!");
            }
            else{}


        } while(opcao != 0);

    }
}
