package alquileres.modelo;

/**
 * Una furgoneta es un vehículo que añade la característica del volumen de
 * carga (valor de tipo double)
 * 
 * El coste de alquiler de una furgoneta no solo depende del nº de días de
 * alquiler Tendrá un incremento que dependerá de su volumen de carga: hasta 5
 * m3 exclusive ( metros cúbicos) de volumen el incremento sobre el precio
 * final será de 10€, entre 5 y 10 (inclusive) el incremento sobre el precio
 * final será de 15€, si volumen > 10 el incremento sobre el precio final
 * será de 25€
 * 
 */
public class Furgoneta extends Vehiculo {
	private double volumen;

	public Furgoneta(String matricula, String marca, String modelo, double precioDia, double volumen) {
		super(matricula, marca, modelo, precioDia);
	}

	public double calcularPrecioAlquiler(int numeroDias) {
		if (volumen < 5) {
			super.setPrecioDia(getPrecioDia() + 10);
		} else if (volumen >= 5 && volumen <= 10) {
			super.setPrecioDia(getPrecioDia() + 15);
		} else {
			super.setPrecioDia(getPrecioDia() + 25);
		}
		return super.calcularPrecioAlquiler(numeroDias);

	}

	public String toString() {
		return super.toString() + "  |  Volumen: " + this.volumen + " (m3)";
		
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
}
