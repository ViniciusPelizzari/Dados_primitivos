package Float;

//classe exemplo 1
public class ExFloat1 {

    //criando variável e declarando tipo: Float
    private float cpf = 1234567890.00f; //números em notação de ponto flutuante

    //necessário uso do 'f' após a declaração das variáveis

    //criando variável e declarando tipo: Float
    private float cpff = 120345698.08f; //números em notação de ponto flutuante

    //método de execução
    public boolean conf(){
        //método if
        if(this.cpf == this.cpff){
            //retorno caso positivo
            return true;
            //retorno caso negativo;
        } return false;
    }
}
