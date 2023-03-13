package Boolean;

//importando método Scanner
import java.util.Scanner;

//criação da classe 01
public class ExBoolean1 {
    //criando objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável, definindo o tipo: String
    private String nome;
    private String cnome;

    //métodos getters e setters
    public String getNome() {
        //lendo e declarando a variável
        return nome = s.nextLine();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnome() {
        //lendo e declarando a variável
        return cnome = s.nextLine();
    }

    public void setCnome(String cnome) {

        this.cnome = cnome;
    }

    //método de apresentação e leitura, através do chamado do "getNome()"
    public String nome(){
        //apresentação na tela
        System.out.println("Digite seu nome: ");
        //retornando o valor após o chamado e leitura
        return getNome();
    }

    //método de apresentação e leitura, através do chamado do "getCnome()"
    public String cnome(){
        //apresentação na tela
        System.out.println("Confirme seu nome: ");
        //retornando o valor após o chamado e leitura
        return getCnome();
    }

    //método de verificação BOOLEAN
    public Boolean conf(){
        //se a variável "cnome" for igual ao "nome, ele retorna VERDADEIRO
        if (this.nome().equals(this.cnome())){
            return true;
            //caso contrário, ele retorna FALSO
        } return false;
    }
}
