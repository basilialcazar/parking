package com.pgrsoft.gestionparking.services.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.model.Reserva;
import com.pgrsoft.gestionparking.model.Usuario;
import com.pgrsoft.gestionparking.repositories.PlazaRepository;
import com.pgrsoft.gestionparking.repositories.ReservaRepository;
import com.pgrsoft.gestionparking.repositories.UsuarioRepository;

@RestController
public class RepositoriesTestController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PlazaRepository plazaRepository;
	@Autowired
	private ReservaRepository reservaRepository;

	@GetMapping("/usuarios")
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@GetMapping("/usuarios/{id}")
	public Usuario findByIdUsuario(@PathVariable("id") Long id) {

		Usuario usuario = null;
		Optional<Usuario> o = usuarioRepository.findById(id);
		if (o.isPresent()) {
			usuario = o.get();
		}
		return usuario;

	}

	@GetMapping("/reservas")
	public List<Reserva> getAllReservas() {
		return reservaRepository.findAll();
	}

	@GetMapping("/reservas/{id}")
	public Reserva findByIdReserva(@PathVariable("id") Long id) {
		Reserva reserva = null;
		Optional<Reserva> o = reservaRepository.findById(id);
		if (o.isPresent()) {
			reserva = o.get();
		}
		return reserva;
	}

//	@GetMapping("/plazas")
//	public List<Plaza> getAllPlazas() {
//		return plazaRepository.findAll();
//	}
//	
	@GetMapping("/plazas")
	public List<Plaza> getDiponibles(@RequestParam(value = "inicio", required = false) String inici,
			@RequestParam(value = "fin", required = false) String fi) {

		List<Plaza> list;

		if (inici != null && fi != null) {
			list = getDisponible(inici, fi);
		} else {
			list = plazaRepository.findAll();
		}
		return list;

	}

//	@GetMapping("/pep")
//	private List<Plaza> pepe() {
//		return plazaRepository.getDisponibles();
//}
	private List<Plaza> getDisponible(String inici, String fi) {
		Date i;
		Date f;
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd-MM-yyy");
		try {
			i = sdf.parse(inici);
			f = sdf.parse(fi);
			System.out.println(i);
			System.out.println(f);
			return plazaRepository.getOcupades(i, f);

		} catch (ParseException e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/plazas/{id}")
	public Plaza findByIdPlaza(@PathVariable("id") Long id) {
		Plaza plaza = null;
		Optional<Plaza> o = plazaRepository.findById(id);
		if (o.isPresent()) {
			plaza = o.get();
		}
		return plaza;
	}
}
