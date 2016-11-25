package py.edu.facitec.sptallercuatro.dariorios.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

@Entity
public class Medico extends General {
	
	private String nombre;
	private Double salario;
	
	@JsonIdentityReference
	@ManyToOne
	private Clinica clinica;
	
	public Medico() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", salario=" + salario + ", clinica=" + clinica + ", getNombre()="
				+ getNombre() + ", getSalario()=" + getSalario() + ", getClinica()=" + getClinica() + ", getCodigo()="
				+ getCodigo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
