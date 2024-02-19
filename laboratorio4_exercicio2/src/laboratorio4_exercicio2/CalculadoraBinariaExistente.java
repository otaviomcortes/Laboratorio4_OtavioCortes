package laboratorio4_exercicio2;

class CalculadoraBinariaExistente implements CalculadoraBinaria {
    @Override
    public String somar(String a, String b) {
        return "Soma binária de " + a + " e " + b;
    }

    @Override
    public String subtrair(String a, String b) {
        return "Subtração binária de " + a + " e " + b;
    }
}
