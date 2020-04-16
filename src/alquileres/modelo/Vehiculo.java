package alquileres.modelo;

/**
 * Representa a un vehículo en alquiler De esta clase no se crearán instancias
 * 
 * De un vehículo se conoce su matrícula, marca, modelo y el precio a pagar
 * por día de alquiler
 * 
 * Para todo vehículo se puede calcular su coste de alquiler que depende del
 * nº de días que se alquile (llamaremos a esta operación
 * calcularPrecioAlquiler() )
 * 
 * Dos vehículos pueden compararse por su matrícula (es su orden natural)
 * 
 * Dos vehículos son iguales si además de pertenecer a la misma clase tienen
 * la misma matrícula
 * 
 */
public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private double precioDia;

	/**
	 * Constructor
	 */
	public Vehiculo(String matricula, String marca, String modelo, double precioDia) {
		this.matricula = matricula.toUpperCase();
		this.marca = marca.toUpperCase();
		this.modelo = modelo.toUpperCase();
		this.precioDia = precioDia;

	}

	public double calcularPrecioAlquiler(int numeroDias) {
		return precioDia * numeroDias;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Vehiculo v = (Vehiculo) obj;
		return this.matricula.equalsIgnoreCase(v.getMatricula());
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass() +" \n");
		sb.append("Matricula: " + this.matricula + "  |  Marca: " + this.marca
				+ "  |  Modelo: " + this.modelo + "\n" + "Precio dia alquiler: "
				+ this.precioDia + "�");
		
		return sb.toString();
	}

	/**
	 * Redefinición de hashCode()
	 * 
	 */
	@Override
	public int hashCode() {
		return matricula.hashCode() * 13;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
			
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}

	public double getPrecioDia() {
		return precioDia;
	}
public void setPrecioDia(double precioDia) {
	this.precioDia = precioDia;
}
}