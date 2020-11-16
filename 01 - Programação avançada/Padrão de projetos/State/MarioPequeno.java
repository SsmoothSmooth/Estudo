public class MarioPequeno implements MarioState {

	public MarioState pegarCogumelo() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

	public MarioState pegarFlor() {
		System.out.println("Mario grande com fogo");
		return new MarioFogo();
	}

	public MarioState pegarPena() {
		System.out.println("Mario grande com capa");
		return new MarioCapa();
	}

	public MarioState levarDano() {
		System.out.println("Mario morto");
		return new MarioMorto();
	}

}
