package Calculadora;

public class CalCalorias {
    float calorias;
    float resultado;

    public CalCalorias(float calorias) {
        this.calorias = calorias;
    }
    
    public float calcCarbo(){
        resultado = calorias * 0.5f / 4;
        return resultado;
    }
    
    public float calcPro(){
        resultado = calorias * 0.25f / 4;
        return resultado;
    }
    
    public float calcGord(){
        resultado = calorias * 0.25f / 9;
        return resultado;
    }
    
}
