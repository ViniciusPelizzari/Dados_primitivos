package Short;

//classe de execução
public class Execution {

    //método 'main' para a execução
    public static void main(String[] args) {
        //chamado de classe e criação de objetos
        ExShort1 s1 = new ExShort1();
        ExShort2 s2 = new ExShort2();
        ExShort3 s3 = new ExShort3();

        //imprimir na tela
        System.out.println("Exemplo 1: ");
        //chamando classe pelo objeto e executando métodoe
        s1.conf();
        //imprimir na tela
        System.out.println("Exemplo 2: ");
        //chamando classe pelo objeto e executando método
        s2.conf();
        //imprimir na tela
        System.out.println("Exemplo 3: ");
        //chamando classe pelo objeto e executando método
        s3.conf();

    }
}
