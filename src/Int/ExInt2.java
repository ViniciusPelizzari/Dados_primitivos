package Int;

//importando biblioteca Scanner
import java.util.Scanner;

//classe exemplo 2
public class ExInt2 {
    //criando objeto de leitura
    Scanner s = new Scanner(System.in);

    //criando e declarando variávem e tipo: int
    private int date;

    //criando e declarando variávem e tipo: int
    private int month;

    //criando e declarando variávem e tipo: int
    private int year;

    //método de leitura e declaração de variável
    public void date(){
        this.date = s.nextInt();
    }

    //método de leitura e declaração de variável
    public void month(){
        this.month = s.nextInt();
    }

    //método de leitura e declaração de variável
    public void year(){
        this.year = s.nextInt();
    }

    public void conf(){
        //imprimindo na tela
        System.out.print("Digite o dia do seu nascimento, ex:01 =  ");
        //chamando método date()
        this.date();
        //imprimindo na tela
        System.out.print("Digite o mês do seu nascimento, ex:06 =  ");
        //chamando método month()
        this.month();
        //imprimindo na tela
        System.out.print("Digite o ano do seu nascimento, ex:2012 = ");
        //chamando método year()
        this.year();
        //imprimindo na tela
        System.out.println("Você nasceu dia " + date + "/" + month + "/" + year);
    }
}
