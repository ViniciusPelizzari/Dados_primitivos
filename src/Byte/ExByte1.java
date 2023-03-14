package Byte;

//importando Biblioteca para leitura
import java.util.Scanner;

//classe execução projeto 3
public class ExByte1 {
    //objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando o tipo: Byte
    private byte opcao;

    //método de leitura e declaração de variável
    public Byte Opcao(){
        //imprimir dados na tela
        System.out.println("Exemplo 1: ");
        //imprimir dados na tela
        System.out.println("Digite '1' para continuar ou '2' para sair");
        //lendo e declarando variável
        opcao = s.nextByte();
        //retornando valor ja declarado
        return opcao;
    }

    //método de execução
    public void conf(){
        //condição if
        if(this.Opcao() == 1){
            //imprimir dados na tela
            System.out.println("Você continuou...");
            //condição else if (se não se), se não for a primeira opção, execute está outra...
        } else if (opcao == 2) {
            //imprimir dados na tela
            System.out.println("Você saiu...");
        }
    }
}
