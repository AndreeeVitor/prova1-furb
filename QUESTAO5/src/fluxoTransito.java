import java.util.Scanner;

public class fluxoTransito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.println("\"Informe a letra do sinal: G - Verde (siga), Y - Amarelo (atenção), R - Vermelho (pare)");
        char sinal = input.nextLine().charAt(0);
        char corSinal = Character.toUpperCase(sinal);

        if (corSinal == 'G'){
            System.out.println("Verde (siga)");
        }
        else {
            if (corSinal == 'Y') {
                System.out.println("Amarelo (atenção)");
            }
            else {
                if (corSinal == 'R') {
                    System.out.println("Vermelho (pare)");
                }
                else {
                    System.out.println("Entrada incorreta");
                }
            }
        }
        input.close();
    }
}
