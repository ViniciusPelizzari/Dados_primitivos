package Char;

//importando biblioteca Scanner
import java.util.Scanner;

//classe Exemplo 3
public class ExChar3 {

    //criando objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando o tipo: Char ou Character
    private Character sx;

    //método de leitura e declaração de variável
    public Character sx(){
        //leitura dos dados
        char sx = s.next().charAt(0);
        //retorno dos dados já declarados
        return sx;
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite qual o seu sexo: 'M' ou 'F'");
        //condição if
        if(this.sx() == 'M'){
            //imprimindo na tela
            System.out.println("Você é um menino");
            //condição else if (se não if), caso for o contrário da condição if, ele executa a outra condição
        } else if(this.sx() =='F'){
            //imprimindo na tela
            System.out.println("Você é uma menina");
            //condição else (se não), caso for o contrário da condição if, ele só executa o comando
        } else{
            //imprimindo na tela
            System.out.println("Opção inválida");
        }
    }
}
