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

    public Polinomio multiplica(Polinomio p2){
        double[] termos_resultante;
        int grau_resultante = this.grau + p2.grau;
        termos_resultante = new double[grau_resultante + 1];

        for (int i = this.grau; i >= 0; i--){
            for(int j = p2.grau; j >= 0; j--){
                termos_resultante[i + j] += this.termos[i] * p2.termos[j];
            }
        }
        return new Polinomio(grau_resultante, termos_resultante);
    }

    // imprime o polinômio, será explica a seguir
    public void mostra(){
        String polinomio = "";
        for(int i = this.grau; i >=0; i--){
            if (this.termos[i] != 0) {
                if(i == 0){
                    polinomio += this.termos[i];
                }
                else if(this.termos[i] > 0){
                    polinomio += this.termos[i] + "X^" + i + " + ";
                }else if(this.termos[i] < 0){
                    polinomio += this.termos[i] + "X^" + i;
                }
            }
        }
        System.out.println(polinomio + "\n");
    }
}

