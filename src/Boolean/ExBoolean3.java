package Boolean;

//importando método Scanner
import java.util.Scanner;

//criação da classe 01
public class ExBoolean3 {
    //criando objeto para leitura
    Scanner s = new Scanner(System.in);

    //criando variável, definindo a variável "cpf" e o tipo: Long
    Long cpf = 1234567890l;
    Long ccpf;

    //métodos getters e setters
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCcpf() {
        //lendo e declarando a variável
        return ccpf = s.nextLong();
    }

    public void setCcpf(Long ccpf) {
        this.ccpf = ccpf;
    }

    public Long ccpf(){
        //apresentação na tela
        System.out.println("Confirme seu cpf: ");
        //retornando o valor após o chamado e leitura
        return getCcpf();
    }

    //método de verificação BOOLEAN
    public Boolean conf(){
        //se a variável "cnome" for igual ao "nome, ele retorna VERDADEIRO
        if (this.cpf.equals(this.ccpf())){
            return true;
            //caso contrário, ele retorna FALSO
        } return false;
    }
}
