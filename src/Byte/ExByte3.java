package Byte;

//importando Biblioteca para leitura
import java.util.Scanner;

//classe execução projeto 1
public class ExByte3 {
    //objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando o tipo: Byte
    private byte qlaminas;

    //método de execução
    public void conf() {
        //imprimir dados na tela
        System.out.println("Digite a quantia de lâminas: ");
        //lendo e declarando variável
        qlaminas = s.nextByte();
        //imprimir dados na tela
        System.out.println("A quantia foi de: " + qlaminas);
        //condição if
        if (qlaminas >= 10) {
            //imprimir dados na tela
            System.out.println("Quantidade não permitida");
        }
    }
}
