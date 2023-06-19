/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Usuario
 */
public class calcBasalMan extends CalcBasal {
    
    float resultado;

    public calcBasalMan(int idade, int altura, float peso) {
        super(idade, altura, peso);
    }

    @Override
    public float calc() {
        resultado = 66 + (13.8f * peso) + (5 * altura) - (6.8f * idade);
        return resultado;
    }
    
}
