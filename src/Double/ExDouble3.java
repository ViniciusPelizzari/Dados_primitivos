package Double;

//importando biblioteca Scanner
import java.util.Scanner;

//classe exemplo 3
public class ExDouble3 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando seu tipo: Double
    private double saldo;

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite seu saldo: ");
        //chamando a variável set para a leitura e declaração
        this.saldo = s.nextDouble();
        //imprimindo na tela
        System.out.println("Seu saldo é de " + saldo + " dinheiros");
    }
}
