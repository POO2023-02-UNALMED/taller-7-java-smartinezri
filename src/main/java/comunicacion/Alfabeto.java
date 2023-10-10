package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{

	private static ArrayList<String> letras;
	private String interpretacion;
	
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
		super(origen);
		Alfabeto.setLetras(letras);
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.size();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String men = "";
		for(int i = 0; i < letras.size(); i++) {
			men += letras.get(i) + ", ";
		}
		return men;
	}
	
	public static ArrayList<String> getLetras() {
		return letras;
	}

	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
}
