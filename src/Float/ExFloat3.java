package Float;

//classe exemplo 3
public class ExFloat3 {

    //criando variável e declarando tipo: Float
    private float saldo;

    //método getter - declarando variável
    public float getSaldo() {
        return saldo = 111111.99f;
    }

    //método de execução
    public void conf(){
        //imprimindo na tela
        System.out.println("Seu saldo é de: " + this.getSaldo());
    }
}
