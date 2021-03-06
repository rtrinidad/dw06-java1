package py.edu.uca.diplomado.clase02;

public class Auto {
	/* Definimos las propiedades para nuestra clase */
	int anho;
	String marca;
	String modelo;
	int velocidad;

	public Auto() {
		setMarca("Sin marca");
	}
	
	/*
	 * Definimos un método. Los métodos se recomienda que expresen una acción,
	 * con el infinitivo o por ejemplo getAlgo setAlgo
	 */
	/**
	 * Se arranca el motor del auto y se coloca la velocidad a 0
	 * */
	public void arrancar() {
		System.out.println("Arrancando");
	}

	void acelerar() {
		velocidad++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
