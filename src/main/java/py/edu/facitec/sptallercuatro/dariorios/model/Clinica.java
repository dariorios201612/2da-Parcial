package py.edu.facitec.sptallercuatro.dariorios.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Clinica extends General {
	
	private String descripcion;

	@JsonBackReference
	@OneToMany(mappedBy="medico")
	private List<Medico>medicos; 
	
	public Clinica() {
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	@Override
	public String toString() {
		return "Clinica [descripcion=" + descripcion + ", medicos=" + medicos + ", getDescripcion()=" + getDescripcion()
				+ ", getMedicos()=" + getMedicos() + ", getCodigo()=" + getCodigo() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
