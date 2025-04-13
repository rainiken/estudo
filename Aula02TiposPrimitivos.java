package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande =  100000L;
        double salarioDouble = 2000.0D;
        float salariaFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractre = '\u0041';
        var nome2 = "Ronoroa Zoro";

        String nome = "Monkey D. Luffy";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(idade);
        System.out.println("Oi! Eu sou o "+nome+". E EU SEREI O REI DOS PIRATAS!");
        System.out.println("Meu nome é "+nome2+", E EU SEREI O MAIOR ESPADACHIN DO MUNDO!");
    }
}
