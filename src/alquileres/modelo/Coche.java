package alquileres.modelo;

/**
 * Un coche es un vehículo que añade un nº de plazas
 * 
 * El coste final de alquiler depende no solo del nº de días de alquiler 
 * sino también del nº de plazas. Si el nº de plazas es > 4 se añaden 5€ más por día
 */
public class Coche extends Vehiculo{
private int numeroPlazas;
	public Coche(String matricula,String marca,String modelo,double precioDia,int numeroPlazas) {
	super(matricula,marca,modelo,precioDia);
	this.setNumeroPlazas(numeroPlazas);
	
}
	public double calcularPrecioAlquiler(int numeroDias) {
		if(numeroPlazas > 4) {
			 super.setPrecioDia(super.getPrecioDia() + 5);
		}
		return super.calcularPrecioAlquiler(numeroDias);
	}
	public String toString() {
		return super.toString() + "  |  Plazas: " + this.numeroPlazas;
		
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
}
