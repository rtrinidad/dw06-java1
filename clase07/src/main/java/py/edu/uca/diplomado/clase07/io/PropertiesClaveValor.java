package py.edu.uca.diplomado.clase07.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/*Obtenido de 
 * http://lineadecodigo.com/java/leer-valores-de-fichero-de-properties/*/
public class PropertiesClaveValor {

	public PropertiesClaveValor() {
		super();
	}

	public static void main(java.lang.String[] args) {

		String rutaProperties = "/tmp/salida.properties";

		Properties propiedades = new Properties();
		propiedades = cargarProperties(rutaProperties);

	}

	public static Properties cargarProperties(String rutaProperties) {
		InputStream inputStream = null;
		Properties propiedades = new Properties();
		try {
			// OutputStream salida = new
			// FileOutputStream("/tmp/salida.properties");

			inputStream = new FileInputStream(rutaProperties);
			// "/home/juca/workspaces/poo/cursojava-2012-05-17/ironman.properties");
			/*
			 * Con esta línea cargamos el archivo de properties inicializado más
			 * arriba
			 */
			propiedades.load(inputStream);
			// prop.put("desdeJava", "valorDesdeJava");
			/* Recorremos los enumerados y los mostramos */
			for (Enumeration<Object> e = propiedades.keys(); e
					.hasMoreElements();) {
				/* Obtenemos el objeto */
				Object obj = e.nextElement();
				System.out.println(obj + ": "
						+ propiedades.getProperty(obj.toString()));
			}
			// prop.store(salida, "Guardando preferencias");
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		return propiedades;
	}
}