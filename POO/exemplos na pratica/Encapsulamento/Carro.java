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
    O método construtor só utiliza o public e o nome da função */
    public Carro(){ 
        this.cor = "Branco";
        this.modelo = "Fiat Uno";
    }
    
    public void status(){
        System.out.println("O carro é um "+ this.modelo + " da cor "+ this.cor);
    }
}