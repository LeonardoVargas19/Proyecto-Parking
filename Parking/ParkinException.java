package Parking;

public class ParkinException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;
	private String matricula;
	
	
	public ParkinException(String mensaje ,String matricula) {
		this.mensaje=mensaje;
		this.matricula=matricula;
		
	}


	public String getMensaje() {
		return mensaje;
	}


	public String getMatricula() {
		return matricula;
	}
	
}
