package Long;

import java.util.Scanner;

//classe exemplo 2
public class ExLong2 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando e declarando  variável e tipo: Long
    private long codigo = 1236547809l;

    //criando variável e declarando tipo: Long
    private long codigoo;

    //método de leitura e declaração de variável
    public void codigoo(){
        //lendo e declarando variável
        this.codigoo = s.nextLong();
    }

    //método de execução
    public void conf(){
        //imprimir na tela
        System.out.println("Códigos acima de " + codigo + " não são permitidos");
        //imprimir na tela
        System.out.println("Digite seu código: ");
        //chamando método codigoo()
        this.codigoo();
        //condição if (se), caso for esta condição, execute isso
        if(codigoo >= codigo+1){
            //imprimir na tela
            System.out.println("Entrada negada");
            //condição else (se não), se não for a condição acima, execute isto
        } else{
            //imprimir na tela
            System.out.println("Entrada permitida");
        }
    }
}
