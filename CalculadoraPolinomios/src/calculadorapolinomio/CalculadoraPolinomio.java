package calculadorapolinomio;

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
    public static int[] inverterVetor(int vet[]) {
        int temp;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
        return vet;
    }

    public static void main(String[] args) {
        Polinomio polinomio_1;
        Polinomio polinomio_2;
        CalculadoraPolinomio calculadora;

        
    }
}

