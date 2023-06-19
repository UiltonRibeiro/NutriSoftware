/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Usuario
 */
public class calcBasalWoman extends CalcBasal {
    float resultado;

    public calcBasalWoman(int idade, int altura, float peso) {
        super(idade, altura, peso);
    }

    @Override
    public float calc() {
        resultado = 655 + (9.6f * peso) + (1.9f * altura) - (4.7f * idade);
        return resultado;
    }
    
}
