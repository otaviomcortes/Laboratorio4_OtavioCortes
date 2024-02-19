package laboratorio4_exercicio2;

public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinariaExistente();
        
        Calculadora calculadora = new CalculadoraAdapter(calculadoraBinaria);

        System.out.println("Soma binária: " + calculadora.somar(10, 5));
        System.out.println("Subtração binária: " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + calculadora.multiplicar(10, 5));
    }
}