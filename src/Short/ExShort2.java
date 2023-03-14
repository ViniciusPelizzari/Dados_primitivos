package Short;

//importando biblioteca Scanner
import java.util.Scanner;

//classe exemplo 2
public class ExShort2 {

    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando tipo: Short
    private short nota1;

    //criando variável e declarando tipo: Short
    private short nota2;

    //criando variável e declarando tipo: Short
    private short nota3;

    //criando variável e declarando tipo: Short
    private short media;

    //método de execução;
    public void conf(){
        //imprimir na tela
        System.out.println("Digite a 1º nota: ");
        //lendo e declarando variável;
        this.nota1 = s.nextShort();
        //imprimir na tela
        System.out.println("Digite a 2º nota: ");
        //lendo e declarando variável;
        this.nota2 = s.nextShort();
        //imprimir na tela
        System.out.println("Digite a 3º nota: ");
        //lendo e declarando variável;
        this.nota3 = s.nextShort();
        //calculando a média e declarando variável
        this.media = (short)(this.nota1 + this.nota2 + this.nota3);
        //imprimir na tela
        System.out.println("A média foi: " + this.media/3);
    }
}
