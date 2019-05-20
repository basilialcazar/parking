package com.pgrsoft.gestionparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionparking.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
