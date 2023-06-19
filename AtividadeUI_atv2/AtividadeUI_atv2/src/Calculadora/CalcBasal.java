package Calculadora;

public abstract class CalcBasal {
    public int idade;
    public int altura;
    public float peso;

    public CalcBasal(int idade, int altura, float peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public abstract float calc();
    
}
