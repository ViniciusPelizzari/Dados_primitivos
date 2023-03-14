package Double;

//importando biblioteca Scanner
import java.util.Scanner;

//classe exemplo 1
public class ExDouble1 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando seu tipo: Double
    private double motor;

    //método getter
    public double setMotor() {
        //declarando e retornando valor
        return motor = s.nextDouble();
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite qual o motor do seu carro: ");
        //chamando o método set para a leitura e declaração de variável
        this.setMotor();
        //imprimindo na tela
        System.out.println("Olha, é um motor " + motor + ", muito forte...");
    }
}
