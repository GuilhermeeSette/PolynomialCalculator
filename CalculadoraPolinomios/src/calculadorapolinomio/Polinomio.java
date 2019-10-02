package calculadorapolinomio;

public class Polinomio {

    private double[] termos;
    private int grau;

    public Polinomio(int grau, double[] termos){
        this.grau = grau;
        this.termos = termos;
    }

    public double calcula(int valor){
        double resultado = this.termos[0];
        for (int i = 1; i < this.grau + 1; i++){
            resultado += Math.pow(this.termos[i] * valor,i);
        }
    return resultado;
    }

    public Polinomio soma(Polinomio p2){
        double[] soma;
        int maiorGrau = Math.max(this.grau, p2.grau);
        soma = new double[maiorGrau + 1];
        for (int i = 0; i < maiorGrau + 1; i++){
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
        return new Polinomio(maiorGrau, soma);
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
                if(i == this.grau){
                    polinomio += this.termos[i] + "X^" + i;
                }
                else if(i == 0){
                    if(this.termos[i] > 0){
                        polinomio += " + " +this.termos[i];
                    }else{
                        polinomio += " " +this.termos[i];
                    }
                }
                else if(this.termos[i] < 0){
                    polinomio += " " + this.termos[i] + "X^" + i;
                }
                else if(this.termos[i] > 0){
                    polinomio += " + " + this.termos[i] + "X^" + i;
                }
            }
        }
        System.out.println(polinomio + "\n");
    }
}

