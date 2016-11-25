package py.edu.facitec.sptallercuatro.dariorios.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.sptallercuatro.dariorios.dao.MedicoDAO;
import py.edu.facitec.sptallercuatro.dariorios.model.Medico;
@RestController
@Transactional
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoDAO medicoDAO;
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Medico> registrar(@RequestBody Medico medico){
		medicoDAO.guardar(medico, medico.getCodigo());
		return new ResponseEntity<Medico>(medico, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Medico>> buscarTodos(){
		List<Medico> medico = medicoDAO.buscarTodos();
		return new ResponseEntity<List<Medico>>(medico, HttpStatus.OK);
	}
	
	@RequestMapping("/formulario")
	public ModelAndView formulario(){
		return new ModelAndView("/medicos/formulario");
		
	}

}