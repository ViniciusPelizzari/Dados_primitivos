package Float;

//classe execução
public class Execution {

    //método 'main' de execução
    public static void main(String[] args) {
        //chamando classes e criando objetos
        ExFloat1 f1 = new ExFloat1();
        ExFloat2 f2 = new ExFloat2();
        ExFloat3 f3 = new ExFloat3();

        //imprimindo na tela - exemplo 1
        System.out.println("Exemplo 1: " + f1.conf());
        System.out.print("Exemplo 2: ");
        f2.conf();
        System.out.print("Exemplo 3: ");
        f3.conf();

    }
}
