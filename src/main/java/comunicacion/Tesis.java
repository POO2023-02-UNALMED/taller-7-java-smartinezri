package comunicacion;
import java.util.ArrayList;

public class Tesis extends Escrito {

	private String idea;
	private static ArrayList<String> argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, ArrayList<String> argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabras) {
		return palabras * super.getPaginas() * 5;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n"
				+ getIdea() + "\n" + getArgumentos().size() + "\n" + getConclusion() + "\n" + getReferencias();
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public ArrayList<String> getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(ArrayList<String> argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
