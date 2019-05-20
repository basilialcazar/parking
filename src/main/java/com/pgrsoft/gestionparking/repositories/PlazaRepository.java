package com.pgrsoft.gestionparking.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionparking.model.Plaza;

@Repository 
public interface PlazaRepository extends JpaRepository<Plaza, Long>{

	@Query(value="SELECT DISTINCT  r.palza FROM Reserva r where (?1 <= r.fin) and (?2 >= r.inicio) AND r.palza.disponible=true")// r where (?1 <= r.fin) and (?2 >= r.inicio)") 
	public List<Plaza> getOcupades(Date start, Date end);
	

	@Query(value="SELECT p FROM Plaza p WHERE p not exists(SELECT DISTINCT  r.palza FROM Reserva r where (?1 <= r.fin) and (?2 >= r.inicio) AND r.palza.disponible=true)") // r where (?1 <= r.fin) and (?2 >= r.inicio))")// where ((?1 <= r.fin) and (?2 >= r.inicio)))")// r where (?1 <= r.fin) and (?2 >= r.inicio)") 
	public List<Plaza> getDisponibles();//Date start, Date end);
}
