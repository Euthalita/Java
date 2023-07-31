public class Main
{
	public static void main(String[] args) {
		Carro c1 = new Carro();
		/*Para atribuir valores com o set: Colocar o valor no parametro */
	    c1.setMarca("Fiat");
	    
	    //Para puxar o valor atribuido
	    System.out.println(c1.getMarca());
	    
	    c1.setCarga(50);
	    System.out.println("O tanque está com "+ c1.getCarga()+"% de combustivel" );
		
	}
}
