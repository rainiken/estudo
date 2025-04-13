package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - * /
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;

        System.out.println("A divisão entre "+numero1+" e "+numero2+" é de "+resultado);

        // %
        int resto = 21 % 7;

        System.out.println(resto);

        // < > <= >= == !=

        boolean comparador = 30 > 25;
        boolean comparador2 = 30 < 25;
        boolean comparador3 = 30 == 25;
        boolean comparador4 = 30 <= 25;
        boolean comparador5 = 30 >= 25;
        boolean comparador6 = 30 != 25;

        System.out.println("30 é maior que 25? "+comparador);
        System.out.println("30 é menor que 25? "+comparador2);
        System.out.println("30 é igual que 25? "+comparador3);
        System.out.println("30 é menor ou igual que 25? "+comparador4);
        System.out.println("30 é maior ou igual que 25? "+comparador5);
        System.out.println("30 é diferente que 25? "+comparador6);

        // && (AND) || (OR) !
    }
}
