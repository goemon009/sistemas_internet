import java.util.Scanner;

public class ValidaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media;
        boolean loop1 = true, loop2 = true;

        while (loop1){
            try{
                System.out.println("Digite a primeira nota: ");
                nota1 = scanner.nextDouble();
                if(nota1 < 0 || nota1 > 10){
                    throw new ArithmeticException("Nota inválida.");
                }
                loop1 = false;
            }catch (ArithmeticException e){
                System.err.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        }

        while (loop2){
            try{
                System.out.println("Digite a segunda nota: ");
                nota2 = scanner.nextDouble();
                if(nota2 < 0 || nota2 > 10){
                    throw new ArithmeticException("Nota inválida.");
                }
                loop2 = false;
            }catch (ArithmeticException e){
                System.err.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        }


        media = (nota1 + nota2) / 2;
        System.out.println("media = " + media);
        scanner.close();
    }
}
