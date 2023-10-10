package comunicacion;

public class Fabula extends Escrito {

	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabras) {
		return palabras * getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n"
				+ getEnsenanza();
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
}
