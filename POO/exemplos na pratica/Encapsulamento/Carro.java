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
}