package com.pgrsoft.gestionparking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="reservas")
public class Reserva{
	
	@Id
	@TableGenerator(name="RESERVA_GENERATOR",
	table = "sequencias", 
	pkColumnName = "seq_name",
	pkColumnValue = "res_seq",
	valueColumnName = "seq_number",
	allocationSize = 10)
	
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="palza")
	private Plaza palza;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	public Reserva() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Plaza getPalza() {
		return palza;
	}

	public void setPalza(Plaza palza) {
		this.palza = palza;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}
	
	
}
