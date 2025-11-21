package exemplo4;

import exemplo1.Animal;

public class Zoologico {
	
	public void interagirComAnimal(Animal animal) {
		animal.emitirSom();
		animal.respirar();
		animal.dormir();
	}

}
