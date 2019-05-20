package com.pgrsoft.gestionparking.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAZAS")
public class Plaza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long numero;
	
	@Enumerated(EnumType.STRING)
	private Planta planta;
	
	private String propietario;
	
	private String telefono;
	
	private String email;
	
	private boolean disponible;
	
	public Plaza() {
		
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Plaza [numero=" + numero + ", planta=" + planta + ", propietario=" + propietario + ", telefono="
				+ telefono + ", email=" + email + "]";
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
