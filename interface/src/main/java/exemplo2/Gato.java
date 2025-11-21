package exemplo2;

import exemplo1.Animal;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("miau miau");
	}

	@Override
	public void respirar() {

		System.out.println("gato respirando");

	}

}
