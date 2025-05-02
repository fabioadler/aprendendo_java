package segundo_script;

public class meu_segundo_codigo {

    public static void main(String[] args){

        String nome = "Matheus";
        boolean vamos = true;
        int raio = 10;
        double pi = 3.14;

        System.out.println("Meu nome e " + nome);
        System.out.println("Por favor vem me ajudar!");
        if(vamos == true) {
            System.out.println("Eba!");
            System.out.println("Eu tenho uma bola que tem um raio de " + raio + " me ajuda a calcular a circunferencia");
            System.out.println("Então eu preciso usar a formula c = 2πr no caso seria c = 2 x " + pi + " x " + raio);
            System.out.println("Então c = " + (2*pi*raio));
        }
        else {
            System.out.println("Por que?");
        }
    }

}