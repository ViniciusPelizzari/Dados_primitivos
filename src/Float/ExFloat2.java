package Float;

//importando biblioteca Scanner
import java.util.Scanner;

public class ExFloat2 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando tipo: Float
    private float cpf;

    //método de leitura e declaração de cpf
    public float cpf(){
        //lendo e declarando dados
        this.cpf = s.nextFloat();
        //retornndo varável
        return cpf;
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite seu cpf: ");
        //chamando método
        this.cpf();
        //imprimindo na tela
        System.out.println("Seu cpf é: " + cpf);
    }
}
