package Char;

//importando biblioteca Scanner
import java.util.Scanner;

//classe Exemplo 2
public class ExChar2 {

    //criando objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável e declarando o tipo: Char ou Character
    private Character opcao;

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Digite qual a sua carteira de motorista: ");
        //lendo e declarando variável
        char opcao = s.next().charAt(0);
        //condição if
        if (opcao == 'A' || opcao== 'B'||opcao == 'C' ||opcao == 'D' ||opcao == 'E'){
            //condição if
            if(opcao == 'A'){
                //imprimindo na tela
                System.out.println("Você pode dirigir motocicletas");
                //condição else if (se não if), caso for o contrário da condição if, ele executa a outra condição
            } else if(opcao == 'B'){
                //imprimindo na tela
                System.out.println("Você pode dirigir automóveis");
                //condição else if (se não if), caso for o contrário da condição if, ele executa a outra condição
            } else if(opcao == 'C'){
                //imprimindo na tela
                System.out.println("Você pode dirigir micro-ônibus e caminhões pequenos");
                //condição else if (se não if), caso for o contrário da condição if, ele executa a outra condição
            } else if(opcao == 'D'){
                //imprimindo na tela
                System.out.println("Você pode dirigir caminhões e ônibus");
                //condição else if (se não if), caso for o contrário da condição if, ele executa a outra condição
            } else if(opcao == 'E'){
                //imprimindo na tela
                System.out.println("Você pode dirigir carretas ");
            }
            //condição else (se não), caso for o contrário da condição if, ele só executa o comando
        } else {
            //imprimindo na tela
            System.out.println("Opção inválida");
        }
    }
}
