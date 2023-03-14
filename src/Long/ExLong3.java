package Long;

import java.util.Scanner;

//classe exemplo 3
public class ExLong3 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando tipo: Long
    private long renavam;

    //método de leitura e declaração de variável
    public void renavam(){
        //lendo e declarando variável
        this.renavam = s.nextLong();
    }

    //método de execução
    public void conf(){
        //imprimir na tela
        System.out.println("Digite o renavam do seu carro: ");
        //chamando método renavam()
        this.renavam();
        //imprimir na tela
        System.out.println("Renavam: " + renavam + " | Registro confirmado no detran");
    }
}
