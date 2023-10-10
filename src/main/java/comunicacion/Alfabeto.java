package comunicacion;
//import java.util.ArrayList;

public class Alfabeto extends Pictograma{

	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		String men = "";
		for(String letra : letras) {
			men += letra + ", ";
		}
		return men;
	}
	
	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
}
