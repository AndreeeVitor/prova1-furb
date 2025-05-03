import java.util.Scanner;

public class menuQuestao6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("a) Maior quantidade de itens produzidos");
            System.out.println("b) Menor quantidade de itens produzidos");
            System.out.println("c) Quantidades ordenadas do menor para o maior");
            System.out.println("d) Média da produção nos três meses");
            System.out.println("");

            System.out.println("Quantidade produzido primeiro mês: ");
            int mes1 = input.nextInt();

            System.out.println("Quantidade produzido segundo mês: ");
            int mes2 = input.nextInt();

            System.out.println("Quantidade produzido terceiro mês: ");
            int mes3 = input.nextInt();
            
            System.out.println("Escolha uma das opções do menu (a, b, c, d)");
            char digito = input.next().charAt(0);
            char escolha = Character.toLowerCase(digito);

            int maior = 0;
            int meio = 0;
            int menor = 0;

            // MAIOR
            if (mes1 >= mes2 && mes1 >= mes3){
                maior = mes1;
            }

            if (mes2 >= mes1 && mes2 >= mes3){
                maior = mes2;
            }

            if (mes3 >= mes1 && mes3 >= mes2){
                maior = mes3;
            }
            // MAIOR - poderia ser usado Else também ao final de cada finalização.

            // MENOR
            if (mes1 <= mes2 && mes1 <= mes3){
                menor = mes1;
            }

            if (mes2 <= mes1 && mes2 <= mes3){
                menor = mes2;
            }

            if (mes3 <= mes1 && mes3 <= mes2){
                menor = mes3;
            }
            // MENOR

            // MEIO
            if (mes1 > menor && mes1 < maior){
                meio = mes1;
            }

            if (mes2 > menor && mes2 < maior){
                meio = mes2;
            }

            if (mes3 > menor && mes3 < maior){
                meio = mes3;
            }
            // MEIO

            switch (escolha) {
                case 'a':
                    System.out.println("Maior quantidade de itens produzidos foi: " + maior);
                    break;
                case 'b':
                    System.out.println("Menor quantidade de itens produzidos foi: " + menor);
                    break;
                case 'c':
                    System.out.println("Quantidades ordenadas do menor para o maior é: " + menor + " " + meio + " " + maior);
                    break;
                case 'd':
                    System.out.println("Média da produção nos três meses foi de: " + (mes1 + mes2 + mes3) / 3);
                    break;
                default:
                    System.out.println("");
                    break;
            }
        input.close();
    }
}
