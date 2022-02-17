package aula12poo;
public class Aula12Poo {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe ();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga ();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		c.locomover();
		k.locomover();
		c.emitirSom();
		k.emitirSom();
		j.alimentar();
		r.emitirSom();
		m.alimentar();
		p.soltarBolha();
		a.fazerNinho();
		g.alimentar();
		t.alimentar();
		e.alimentar();
		
		
	}

}
