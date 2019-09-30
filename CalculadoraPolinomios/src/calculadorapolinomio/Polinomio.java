package calculadorapolinomio;

public class Polinomio {
    // vetor para representar os termos do polinomio
    private double[] termos;
    private int grau;
    // recebe um grau de polinômio e instancia os termos do
    // polinômio
    public Polinomio(int grau){
        this.grau = grau;
    }

    public Polinomio preenche_termos(double[] termos){
        for (int i =0; i < this.grau + 1; i++){
            this.termos[i] = (i == (this.grau - 1)) ?  0 : termos[i];
        }
    }


    // imprime o polinômio, será explica a seguir
    public void mostra(){

    }
}
