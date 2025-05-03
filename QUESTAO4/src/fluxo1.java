import java.util.Scanner;

public class fluxo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Informe uma disciplina: ");
            String disciplina = input.nextLine();

            System.out.println("Informe o nome do professor: ");
            String professor = input.nextLine();

            if (disciplina.equals("") && professor.equals("")) {
                System.out.println("Não é possível informar os dados");
                System.out.println("Vazio");
            }
            else {
                System.out.println("Disciplina: " + disciplina);
                if (professor.equals("")) {
                    System.out.println("Professor vazio");
                }
                else{
                    System.out.println("Professor: " + professor);
                }
            }
            System.out.println("FIM");
        input.close();
    }
}
