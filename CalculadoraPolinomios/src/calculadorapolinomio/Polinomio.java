package calculadorapolinomio;

public class Polinomio {
    // vetor para representar os termos do polinomio
    private double[] termos;
    private int grau;
    // recebe um grau de polinômio e instancia os termos do
    // polinômio
    public Polinomio(int grau, double[] termos){
        this.grau = grau;
        this.termos = termos;
    }

    public void preenche_termos(double[] termos){
        for (int i =0; i < this.grau + 1; i++){
            this.termos[i] = (i == (this.grau - 1)) ?  0 : termos[i];
        }
    }
//this.termos é o vetor
    //this.termos[i] elevado a i
    //resultado += em um for
    public double calcula(){
        double resultado = this.termos[0];
        for (int i = 1; i < this.grau + 1; i++){
            resultado += Math.pow(this.termos[i],i);
        }
    return resultado;
    }

    public double[] soma(Polinomio p2){
        
        double[] soma;
        int maiorGrau = Math.max(this.grau, p2.grau);
        soma = new double[maiorGrau];
        for (int i = 0; i < maiorGrau; i++){
            if (i <= this.grau && i <= p2.grau){
                soma[i] = this.termos[i] + p2.termos[i];//aqui a soma da certo e acontece
            } else {
                if (i > this.grau) {
                    soma[i] = p2.termos[i];
                } else {
                    soma[i] = this.termos[i];
                }
            }
        }


        return soma;
    }

    // imprime o polinômio, será explica a seguir
    public void mostra(){
    }
}

//x3 -5x + 2
