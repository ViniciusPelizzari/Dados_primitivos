package Int;

//classe de execução
public class Execution {

    //método 'main' de execução
    public static void main(String[] args) {

        //chamando e executando classe
        ExInt1 i1 = new ExInt1();
        ExInt2 i2 = new ExInt2();
        ExInt3 i3 = new ExInt3();

        //imprimindo na tela
        System.out.print("Exemplo 1: ");
        //chamando método e executando
        i1.conf();
        //imprimindo na tela
        System.out.println("Exemplo 2: ");
        //chamando método e executando
        i2.conf();
        //imprimindo na tela
        System.out.print("Exemplo 3: ");
        //chamando método e executando
        i3.conf();
    }
}
