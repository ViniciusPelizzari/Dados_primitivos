package Float;

//importando biblioteca Scanner
import java.util.Scanner;

public class ExFloat2 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando tipo: Float
    private float id;

    //método de leitura e declaração de cpf
    public float id(){
        //lendo e declarando dados
        this.id = s.nextFloat();
        //retornndo varável
        return id;
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite seu ID: ");
        //chamando método
        this.id();
        //imprimindo na tela
        System.out.println("Seu ID é: " + id);
    }
}
