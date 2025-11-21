package programa;

import exemplo1.Animal;
import exemplo2.Cachorro;
import exemplo2.Gato;

public class RodarTeste {

	public static void main(String[] args) {
		Animal a1 = new Cachorro();
		Animal a2 = new Gato();

		a1.emitirSom();
		a1.dormir();
		
		a2.emitirSom();
		a2.dormir();

	}

}
