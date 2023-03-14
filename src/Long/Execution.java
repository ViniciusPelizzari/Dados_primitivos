package Long;

//classe execução
public class Execution {

    public static void main(String[] args) {

        //chamando classes e criando objetos
        ExLong1 l1 = new ExLong1();
        ExLong2 l2 = new ExLong2();
        ExLong3 l3 = new ExLong3();

        //imprimindo na tela
        System.out.println("Exemplo 1: ");
        //chamando objeto e classe
        l1.conf();
        //imprimindo na tela
        System.out.println("Exemplo 2: ");
        //chamando objeto e classe
        l2.conf();
        //imprimindo na tela
        System.out.println("Exemplo 3: ");
        //chamando objeto e classe
        l3.conf();

    }
}
