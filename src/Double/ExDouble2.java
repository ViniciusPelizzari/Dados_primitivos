package Double;

//classe exemplo 2
public class ExDouble2 {

    //criando variável e declarando seu tipo: Double
    private double altura;

    //método getter
    public double getAltura() {
        return altura;
    }

    //método setter
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metódo de execução
    public double conf(){
        //chamando método set para a declaração
        this.setAltura(1.80d);
        //chamando método get para retornar valor declarado
        return this.getAltura();
    }
}
