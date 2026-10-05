import java.util.Scanner;

public class L02EX06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int maiorAcidentes = 0;
        int cidadeMaior = 0;
        int menorAcidentes = 0;
        int cidadeMenor = 0;
 
        int somaVeiculos = 0;
 
        int somaAcidentesPoucosVeiculos = 0; 
        int qtdCidadesPoucosVeiculos = 0;   
 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade " + i + " de 5:");
            System.out.print("  Código da cidade: ");
            int codigo = entrada.nextInt();
            System.out.print("  Número de veículos de passeio: ");
            int veiculos = entrada.nextInt();
            System.out.print("  Número de acidentes com vítimas: ");
            int acidentes = entrada.nextInt();
 
            if (i == 1 || acidentes > maiorAcidentes) {
                maiorAcidentes = acidentes;
                cidadeMaior = codigo;
            }
            if (i == 1 || acidentes < menorAcidentes) {
                menorAcidentes = acidentes;
                cidadeMenor = codigo;
            }
 
            somaVeiculos += veiculos;
 
            if (veiculos < 2000) {
                somaAcidentesPoucosVeiculos += acidentes;
                qtdCidadesPoucosVeiculos++;
            }
        }
 
        System.out.println();
        System.out.println("Maior índice de acidentes: " + maiorAcidentes + " (cidade " + cidadeMaior + ")");
        System.out.println("Menor índice de acidentes: " + menorAcidentes + " (cidade " + cidadeMenor + ")");
 
        double mediaVeiculos = somaVeiculos / 5.0;
        System.out.printf("Média de veículos nas cinco cidades: %.2f%n", mediaVeiculos);
 
        if (qtdCidadesPoucosVeiculos > 0) {
            double mediaAcidentes = (double) somaAcidentesPoucosVeiculos / qtdCidadesPoucosVeiculos;
            System.out.printf("Média de acidentes nas cidades com menos de 2.000 veículos: %.2f%n", mediaAcidentes);
        } else {
            System.out.println("Nenhuma cidade tem menos de 2.000 veículos de passeio.");
        }
 
        entrada.close();
    }
}

