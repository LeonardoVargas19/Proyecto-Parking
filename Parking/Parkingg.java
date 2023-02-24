package Parking;

import java.util.ArrayList;

import java.util.Collections;

public class Parkingg {
	private String nombre ;
	private ArrayList<String> matriculas;
	public Parkingg(String nombre,int plazas) {
	
		this.nombre = nombre;
		matriculas= new ArrayList<>(Collections.nCopies(plazas, null));
	}
	public String getNombre() {
		return nombre;
	}
	public void entrada(String matricula, int plaza)throws ParkinException {
		if(plaza >= matriculas.size()||plaza <0)
			throw new ParkinException("Mensaje inexistente", matricula);
			
		
		if(matricula.length()<4||matricula==null) {
		
			throw new ParkinException("Matricula \nIncorrecta\n Recuerda las matriculas se\ncomponen de 4 digitos", matricula);
			
			
		}else if(matriculas.get(plaza)!=null) {
			throw new ParkinException("Plaza ocupada", matricula);
			
		}else if (matriculas.contains(matricula)) {
			throw new ParkinException("Matricula repetida", matricula);
			
		}
		
	
		matriculas.set(plaza, matricula);
		
		
	}
	public int salida(String matricula)throws ParkinException {
		if(!matriculas.contains(matricula)) {
			throw new ParkinException("La matricula no existe ", matricula);
		}
		
		
		int plaza=matriculas.indexOf(matricula);
		matriculas.set(plaza, null);
		return  plaza;
	}
	public int getPlazasTotales() {
		
		return matriculas.size();
	}
	public int getPlazasOcupadas() {
	 	return  getPlazasTotales()-getPlazasLibres();	
		
	}
	public int getPlazasLibres() {
		return  Collections.frequency(matriculas, null); 	
		
	}
	@Override
	public String toString() {
	 	String cadena="Parking"+nombre+"\n";
	 	cadena+="-------------------\n";
	 	for(int i =0;i<matriculas.size();i++)	{
	 		cadena+="Plaza "+i+" :";
	 		cadena+=(matriculas.get(i)==null)? "(-Vacia-)": matriculas.get(i);
	 		cadena+="\n";
	 	}
	 	cadena+="-------------------\n";
	return cadena;
	
	 	
	 	
	}
	
	
}
