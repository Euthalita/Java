public class Carro
{
    private String marca, modelo, cor;
    private double carga, motor;

    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setCarga(double carga){
        this.carga = carga;
    }
    
    public double getCarga(){
        return carga;
    }
    
    /* MÉTODO CONSTRUTOR (O objeto iniciará com esses valores)
    O método construtor só utiliza o public e o mesmo nome da classe */
    public Carro(){ 
        this.cor = "Branco";
        this.modelo = "Fiat Uno";
    }
    
    public void status(){
        System.out.println("O carro é um "+ this.modelo + " da cor "+ this.cor);
    }
    /*Outra forma de declarar o metodo constructor é que ele pode ser passado com
    parametros diretamente, o que o torna mais pratico.
Exemplo:
public class Carro{
      private String cor, modelo;

public Carro(String color, String modelo){ 
          this.cor = color; 
          this.modelo = modelo;
    }
}
Criando o objeto já com o método constructor
    Caneta c1 = new Caneta("preta", "Bic");

Para fazer com o método set (não utiliza o get) no método constructor, é necessário 
ter  os métodos especiais criados.
    
}
