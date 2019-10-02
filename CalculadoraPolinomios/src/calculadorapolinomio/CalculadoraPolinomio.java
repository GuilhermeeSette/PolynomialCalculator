package calculadorapolinomio;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author Guilherme Sette - 41783441
 * @author Luiz Henrique Monteiro de Carvalho - 41719468
 *
 */

public class CalculadoraPolinomio {

    private Polinomio Polinomio_1;
    private Polinomio Polinomio_2;

    public CalculadoraPolinomio(Polinomio Polinomio_1, Polinomio Polinomio_2) {
        this.Polinomio_1 = Polinomio_1;
        this.Polinomio_2 = Polinomio_2;
    }


    public static void main(String[] args) {
        //Definicao das variaveis
        Polinomio polinomio_1;
        Polinomio polinomio_2;
        Polinomio polinomio_soma;
        Polinomio polinomio_mult;
        CalculadoraPolinomio calculadora;
        int grau_polinomio_1, grau_polinomio_2;
        double[] vetor_termos_1, vetor_termos_2;
        Scanner input    = new Scanner(System.in);
        boolean mainLoop = true;
        int escolha, continua, esolha_calcula, valor_calcula;

        //Criacao dos polinomios
        System.out.print("--------------------------------------------\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("|        CALCULADORA DE POLINOMIOS         |\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("--------------------------------------------\n");
        System.out.print("\n");
        System.out.print("Bem-vindo!\n");
        System.out.print("Para iniciar os calculos, é necessário criar 2 polinomios.\n");
        System.out.print("Vamos la:\n");

        System.out.print("Digite o grau do polinômio 1: ");
        grau_polinomio_1 = input.nextInt();
        vetor_termos_1 = new double[grau_polinomio_1];
        vetor_termos_1 = preenche_vetor(grau_polinomio_1);
        //Preencher polinomio
        polinomio_1 = new Polinomio(grau_polinomio_1, vetor_termos_1);
        System.out.print("Polinômio 1 criado com sucesso!\n");

        System.out.print("Digite o grau do polinômio 2: \n");
        grau_polinomio_2 = input.nextInt();
        vetor_termos_2 = new double[grau_polinomio_2];
        vetor_termos_2 = preenche_vetor(grau_polinomio_2);
        //Preencher polinomio
        polinomio_2 = new Polinomio(grau_polinomio_2, vetor_termos_2);
        System.out.print("\nPolinômio 2 criado com sucesso!");

        while (true) {
            System.out.println("----------------------\n");
            System.out.println("Menu - Calculadora\n");
            System.out.print("1.) Somar\n");
            System.out.print("2.) Multiplicar\n");
            System.out.print("3.) Calcular valor de um polinomio\n");
            System.out.print("0.) Sair\n");
            System.out.print("\nDigite sua opção: ");
            System.out.println("----------------------\n");

            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    polinomio_soma = polinomio_1.soma(polinomio_2);
                    polinomio_soma.mostra();
                    System.out.println("Digite um número para continuar");
                    continua = input.nextInt();
                    break;
                case 2:
                    polinomio_mult = polinomio_1.multiplica(polinomio_2);
                    polinomio_mult.mostra();
                    System.out.println("Digite um número para continuar");
                    continua = input.nextInt();
                    break;
                case 3:
                    System.out.println("Escolha o polinomio a ser calculado:");
                    System.out.print("  1.) ");
                    polinomio_1.mostra();
                    System.out.print("  2.) ");
                    polinomio_2.mostra();
                    esolha_calcula = input.nextInt();
                    if(esolha_calcula == 1) {
                        System.out.println("Digite o valor de x: ");
                        valor_calcula = input.nextInt();
                        System.out.println(polinomio_1.calcula(valor_calcula));
                        System.out.println("Digite um número para continuar");
                        continua = input.nextInt();
                        break;
                    }else if(esolha_calcula == 2){
                        System.out.println("Digite o valor de x: ");
                        valor_calcula = input.nextInt();
                        System.out.println(polinomio_2.calcula(valor_calcula));
                        System.out.println("Digite um número para continuar");
                        continua = input.nextInt();
                        break;
                    }else{
                        System.out.println("Opcao invalida! Tente novamente.");
                        break;
                    }
                case 0:
                    System.out.println("Ate mais...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        }
    }

    public static double[] preenche_vetor(int grau) {
        int grau_atual = grau;
        double[] vetor = new double[grau + 1];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < grau + 1; i++) {
            System.out.print("Digite o valor de X^" + grau_atual + ": ");
            vetor[grau_atual] = input.nextInt();
            grau_atual -= 1;
        }
        return vetor;
    }
}

