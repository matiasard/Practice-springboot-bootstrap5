package ar.edu.unju.fi.tp4.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

// Notacion de Spring: Component
@Component
public class Cliente {

	private String tipoDocumento;
	private int numeroDocumento;
	private String nombreApellido;
	private String email;
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	private int edad;
	private int codigoAreaTelefono;
	private int numeroTelefono;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaUltimaCompra;

	// Constructor Vacio
	public Cliente() {
		super();
	}

	// Constructor Sobre Cargado
	public Cliente(String tipoDocumento, int numeroDocumento, String nombreApellido, String email, String password,
			LocalDate fechaNacimiento, int edad, int codigoAreaTelefono, int numeroTelefono,
			LocalDate fechaUltimaCompra) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.numeroTelefono = numeroTelefono;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	// Getter and Setter
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido.toUpperCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// public int getEdad() {
	// return edad;
	// }

	// public void setEdad(int edad) {
	// this.edad = edad;
	// }

	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}

	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}

	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", nombreApellido="
				+ nombreApellido + ", email=" + email + ", password=" + password + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", codigoAreaTelefono=" + codigoAreaTelefono
				+ ", numeroTelefono=" + numeroTelefono + ", fechaUltimaCompra=" + fechaUltimaCompra + "]";
	}

	public int getEdad() {
		int edad = 0;
		// * LocalDate.now() = Permite obtener la fecha actual del reloj del sistema
		LocalDate hoy = LocalDate.now();
		// * Period.between() = Calcula el tiempo entre la Fecha de "fechaNacimiento" y
		// la Fecha ACTUAL
		Period periodo = Period.between(this.fechaNacimiento, hoy);
		// * getYears() = Permite VISUALIZAR SOLO EL AÑO
		edad = periodo.getYears();
		return edad;
	}

	public String getTiempoUltimaCompra() {
		String ultimaCompra = "";
		Period periodo = Period.between(fechaNacimiento, fechaUltimaCompra);
		ultimaCompra = String.valueOf("Tiempo hasta Ultima Compra: " + periodo.getDays()) + "-"
				+ String.valueOf(periodo.getMonths()) + "-" + String.valueOf(periodo.getYears());
		return ultimaCompra;

	}

	//*  FALTA COMPLETAR ESTA Metodo
	public String getTiempoHastaCumpleanios() {
		
		String proximoCumpleanio = "";
		LocalDate hoy = LocalDate.now();
		//*  Aumenta un Año a la variable "hoy"
		
		LocalDate siguienteAño = LocalDate.now().plusYears(1); 
		
		if (hoy.isBefore(siguienteAño)) {
			Period period = Period.between(hoy, siguienteAño);
		}
		

		/*
		 * LocalDate hoy = LocalDate.now(); LocalDate FechaProximoCumpleaño =
		 * LocalDate.of(2021, fechaNacimiento.getMonth(),
		 * fechaNacimiento.getDayOfMonth()); Period periodo = Period.between( );
		 */
		return proximoCumpleanio;

	}

}
