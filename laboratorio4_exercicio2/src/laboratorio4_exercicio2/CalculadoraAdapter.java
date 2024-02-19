package laboratorio4_exercicio2;

class CalculadoraAdapter implements Calculadora {
    private final CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario.replaceAll("[^01]", ""), 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario.replaceAll("[^01]", ""), 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
