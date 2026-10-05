import java.util.Scanner;

public class L02EX02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int diasDataAntiga = 0;  
        int diasDataRecente = 0;  

        for (int i = 0; i < 2; i++) {
            int dia;
            int mes;
            int ano;
            boolean bissexto;
            boolean valida;

            do {
                if (i == 0) {
                    System.out.println("Digite a data mais antiga:");
                } else {
                    System.out.println("Digite a data mais recente:");
                }
                System.out.print("Dia: ");
                dia = entrada.nextInt();
                System.out.print("Mês: ");
                mes = entrada.nextInt();
                System.out.print("Ano (entre 1 e 9999): ");
                ano = entrada.nextInt();

                bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
 
                valida = false;
                if (ano >= 1 && ano <= 9999 && mes >= 1 && mes <= 12) {
                    // Quantos dias o mês informado tem
                    int limiteDoMes;
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        limiteDoMes = 30;
                    } else if (mes == 2) {
                        if (bissexto) {
                            limiteDoMes = 29;
                        } else {
                            limiteDoMes = 28;
                        }
                    } else {
                        limiteDoMes = 31;
                    }
                    valida = dia >= 1 && dia <= limiteDoMes;
                }
 
                if (!valida) {
                    System.out.println("Data inválida! Tente novamente.");
                }
            } while (!valida);
 
            int total = 0;

            for (int a = 1; a < ano; a++) {
                if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                    total += 366;
                } else {
                    total += 365;
                }
            }
 
            for (int m = 1; m < mes; m++) {
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    total += 30;
                } else if (m == 2) {
                    if (bissexto) {
                        total += 29;
                    } else {
                        total += 28;
                    }
                } else {
                    total += 31;
                }
            }
 
            total += dia;
 
            if (i == 0) {
                diasDataAntiga = total;
            } else {
                diasDataRecente = total;
            }
        }
 
        if (diasDataRecente < diasDataAntiga) {
            System.out.println("Erro: a data mais recente é anterior à data mais antiga.");
        } else {
            System.out.println("Dias decorridos: " + (diasDataRecente - diasDataAntiga));
        }
 
        entrada.close();
    }
}