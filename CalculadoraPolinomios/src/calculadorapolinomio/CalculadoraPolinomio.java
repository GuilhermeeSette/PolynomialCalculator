package calculadorapolinomio;
import java.util.Scanner;


/**
 *
 * @author Guilherme Sette - 41783441
 * @author Luiz Henrique Monteiro de Carvalho - 41719468
 *
 */

public class CalculadoraPolinomio {

    private Polinomio Polinomio_1;
    private Polinomio Polinomio_2;

    public CalculadoraPolinomio(Polinomio Polinomio_1, Polinomio Polinomio_2){
        this.Polinomio_1 = Polinomio_1;
        this.Polinomio_2 = Polinomio_2;
    }

    //Inverte vetor
    private static double[] inverterVetor(double vet[]) {
        double temp;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
        return vet;
    }

    public static double[] preenche_vetor(int grau){
        double[] vetor = new double[grau + 1];
        Scanner input = new Scanner(System.in);
        for (int i =0; i < grau + 1; i++) {
            if (i == (grau - 1)) {
                vetor[i] = 0;
            } else {
                System.out.print("Digite o valor\n");
                vetor[i] = input.nextInt();
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        Polinomio polinomio_1;
        Polinomio polinomio_2;
        CalculadoraPolinomio calculadora;

        //Menu
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int escolha;
        while(true){
            System.out.println("----------------------\n");
            System.out.println("Menu - Calculadora\n");
            System.out.print("1.) Criar Polinômio \n");
            System.out.print("2.) Somar\n");
            System.out.print("3.) Multiplicar\n");
            System.out.print("0.) Exit\n");
            System.out.print("\nDigite sua opção: ");
            System.out.println("----------------------\n");

            escolha = input.nextInt();

            switch(escolha){

                case 1:
                    //Criando polinomio
                    int grau_polinomio_1, grau_polinomio_2;
                    double[] vetor_termos_1;
                    double[] vetor_termos_2;
                    System.out.print("Digite o grau do polinômio 1: ");
                    grau_polinomio_1 = input.nextInt();
                    polinomio_1 = new Polinomio(grau_polinomio_1);
                    vetor_termos_1 = new double[grau_polinomio_1];
                    //Preencher polinomio
                    vetor_termos_1 = preenche_vetor(grau_polinomio_1);
                    polinomio_1.preenche_termos(inverterVetor(vetor_termos_1));
                    System.out.print("\nPolinômio 1 criado com sucesso!");

                    System.out.print("\nDigite o grau do polinômio 2: ");
                    grau_polinomio_2 = input.nextInt();
                    polinomio_2 = new Polinomio(grau_polinomio_2);
                    vetor_termos_2 = new double[grau_polinomio_2];
                    //Preencher polinomio
                    vetor_termos_2 = preenche_vetor(grau_polinomio_2);
                    polinomio_2.preenche_termos(inverterVetor(vetor_termos_2));
                    System.out.print("\nPolinômio 2 criado com sucesso!");
                    break;

                case 2:
                    System.out.println("Implementar Soma");
                    break;

                case 3:
                    System.out.println("Implementar Multiplicação");
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;

                default :
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;
            }
        }
    }
}
