package com.pgrsoft.gestionparking.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.services.PlazaServices;

@Service
public class PlazaServicesImpl implements PlazaServices{

	public List<Plaza> getDisponibles(Date desde, Date hasta){
		
		
		return null;
	}
	public List<Plaza> getNoDisponible(Date desde, Date hasta){
		
		return null;
	}
}
