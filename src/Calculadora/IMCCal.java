package Calculadora;

public class IMCCal {
    private float altura;
    private float peso;
    private float resultado;

    public IMCCal(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getResultado() {
        return resultado;
    }
    
    public float calcular(){
        resultado = peso / (altura * altura);
        return resultado;
    }
}
