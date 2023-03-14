package Char;

//classe de execução
public class Execution {

    //classe 'main' para a execução
    public static void main(String[] args) {

        //criando objetos com as classes
        ExChar1 c1 = new ExChar1();
        ExChar2 c2 = new ExChar2();
        ExChar3 c3 = new ExChar3();

        //imprimindo na tela
        System.out.println("Exemplo 1: ");
        //chamando e executando classe 1
        c1.conf();
        //imprimindo na tela
        System.out.println("Exemplo 2: ");
        //chamando e executando classe 2
        c2.conf();
        //imprimindo na tela
        System.out.println("Exemplo 3: ");
        //chamando e executando classe 3
        c3.conf();
    }
}
