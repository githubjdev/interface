package exemplo4;

import exemplo1.Animal;
import exemplo2.Cachorro;
import exemplo2.Gato;

public class TesteZoologico {
	
	
	public static void main(String[] args) {
		
		Animal cachooro = new Cachorro();
		Animal gato = new Gato();
		
		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(cachooro);
		zoologico.interagirComAnimal(gato);
	}

}
