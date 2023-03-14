package Int;

//importando método Scanner
import java.util.Scanner;

//classe exemplo 3
public class ExInt3 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando tipo: Int
    private int peso;

    //método de leitura e declaração de variável
    public void peso(){
        //lendo e declarando variável
        this.peso = s.nextInt();
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite seu peso: ");
        //chamando método peso()
        this.peso();
        //condição if (se), caso for isso execute isto
        if (peso >= 200){
            //imprimindo na tela
            System.out.println("Vamos começar a cuidar do nosso peso juntos? Que tal uma caminhada? ");
            //condição else if (se não se), caso não for isto, verifique outra condição e execute isso
        } else if (peso<=45) {
            //imprimindo na tela
            System.out.println("Vamos começar a cuidar do nosso peso juntos? Que tal uma academia? ");
            //condição else (se não), caso não for nenhuma das opções, execute isto
        } else{
            //imprimindo na tela
            System.out.println("Ótimo peso, mas podemos nos cuidar mais");
        }
    }

}
