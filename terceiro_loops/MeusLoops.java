package terceiro_loops;

public class MeusLoops {

    public static void main(String[] args) {

        int counter1 = 0;
        while(counter1 <= 10){
            System.out.println("Contando: " + counter1);
            counter1 ++;
        }

        for(int counter2 = 0; counter2 <= 10; counter2 ++) {
            System.out.println("Contando: " + counter2);
        }

        int[] lista_num = {1,2,3,4,56,78,90,91};

        for(int num : lista_num) {
            String tipo;
            if((num % 2) == 0){
                tipo = "par";
            }
            else {
                tipo = "impar";
            }
            System.out.println("O numero " + num + " e " + tipo);
        }


    }

}