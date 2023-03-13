package Byte;

import java.util.Scanner;

public class ExByte1 {
    Scanner s = new Scanner(System.in);

    private byte opcao;

    public Byte Opcao(){
        System.out.println("Exemplo 1: ");
        System.out.println("Digite '1' para continuar ou '2' para sair");
        opcao = s.nextByte();
        return opcao;
    }

    public void conf(){
        if(this.Opcao() == 1){
            System.out.println("Você continuou...");
        } else if (opcao == 2) {
            System.out.println("Você saiu...");
        }
    }
}
