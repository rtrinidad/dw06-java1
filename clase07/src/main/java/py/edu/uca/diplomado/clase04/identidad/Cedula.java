package py.edu.uca.diplomado.clase04.identidad;

public class Cedula extends DocumentoIdentidad {

	/*
	 * Esta es la implementación del método abstracto de DocumentoIdentidad, la
	 * clase ancestra de Cedula
	 */
	@Override
	public String getTipo() {
		return "CEDULA";
	}

}
