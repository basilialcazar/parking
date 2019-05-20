package com.pgrsoft.gestionparking.services;

import java.util.Date;
import java.util.List;

import com.pgrsoft.gestionparking.model.Plaza;

public interface PlazaServices {
	
	List<Plaza> getDisponibles(Date desde, Date hasta);
	List<Plaza> getNoDisponible(Date desde, Date hasta);
}
