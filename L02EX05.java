import java.util.Scanner;

public class L02EX05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int maiorIdade = 0;
        int menorIdade = 0;
        int totalHabitantes = 0;
        int qtdPerfil = 0; // mulheres de 18 a 35 anos, olhos verdes e cabelos louros
 
        // A idade é lida primeiro porque é ela que indica o fim dos dados (-1)
        System.out.print("Idade (digite -1 para encerrar): ");
        int idade = entrada.nextInt();
 
        while (idade != -1) {
 
            if (idade < 0) {
                System.out.println("Idade inválida! Digite uma idade positiva ou -1 para encerrar.");
            } else {
                System.out.print("Sexo (masculino ou feminino): ");
                String sexo = entrada.next();
                System.out.print("Cor dos olhos (azuis, verdes ou castanhos): ");
                String olhos = entrada.next();
                System.out.print("Cor dos cabelos (louros, castanhos ou pretos): ");
                String cabelos = entrada.next();
 
                // Maior e menor idade (o primeiro habitante serve de ponto de partida)
                if (totalHabitantes == 0 || idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (totalHabitantes == 0 || idade < menorIdade) {
                    menorIdade = idade;
                }
                totalHabitantes++;
 
                // Mulheres de 18 a 35 anos (inclusive) com olhos verdes e cabelos louros
                if (sexo.equalsIgnoreCase("feminino")
                        && idade >= 18 && idade <= 35
                        && olhos.equalsIgnoreCase("verdes")
                        && cabelos.equalsIgnoreCase("louros")) {
                    qtdPerfil++;
                }
            }
 
            // Lê a idade do próximo habitante
            System.out.print("Idade (digite -1 para encerrar): ");
            idade = entrada.nextInt();
        }
 
        if (totalHabitantes == 0) {
            System.out.println("Nenhum habitante foi informado.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres de 18 a 35 anos, olhos verdes e cabelos louros: " + qtdPerfil);
        }
 
        entrada.close();
    }
}

