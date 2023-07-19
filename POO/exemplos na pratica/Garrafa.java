public class Garrafa
{
    String cor, modelo, marca;
    float ponta, volume;
    boolean tampada;
    
/*Para criar um método, usa-se o void*/
    void status(){
        System.out.println("Uma garrafa" + this.cor);
        /*O this serve para referenciar o objeto que receberá a cor, ou seja, quem chamou
        o método status é referenciado por this*/
        System.out.println(" está tampada?" + this.tampada);
        System.out.println("volume em litros: " + this.volume);
        
    }
    void comAgua(){
        if (this.volume > 0){
            System.out.println("Está com água?" + true);    
        }else{
            System.out.println("Está com água?" + false);
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
