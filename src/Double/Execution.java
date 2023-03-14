package Double;

//classe execução
public class Execution {

    //método 'main' para execução
    public static void main(String[] args) {
        //chamando classes e criando objetos
        ExDouble1 d1 = new ExDouble1();
        ExDouble2 d2 = new ExDouble2();
        ExDouble3 d3 = new ExDouble3();

        //imprimindo na tela
        System.out.println("Exemplo 1: ");
        //exemplo1
        d1.conf();
        //imprimindo na tela
        System.out.println("Exemplo 2: \nAltura = " + d2.conf());
        //imprimindo na tela
        System.out.println("Exemplo 3: ");
        //exemplo 3
        d3.conf();
    }
}
