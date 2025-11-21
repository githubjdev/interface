package exemplo2;

import exemplo1.Animal;

public class Cachorro implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("au au");
	}

	@Override
	public void respirar() {
		System.out.println("cachorro respirando");

	}

}
