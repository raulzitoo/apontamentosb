package br.com.oportuna.apontamentosb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.oportuna.apontamentosb.models.Apontamento;
import br.com.oportuna.apontamentosb.repository.ApontamentoRepository;

@Controller 
@RequestMapping("/apontamento")
public class ApontamentoController {

	@Autowired
	private ApontamentoRepository repository;
	
	
	@RequestMapping("/form")
	public ModelAndView form() {
		
		return new ModelAndView("form");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Apontamento apontamento) {
		
		System.out.println(apontamento);
		
		repository.save(apontamento);
		
		return new ModelAndView("redirect:/apontamento");
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaApontamento() {
		System.out.println("entrei no controller");
		return new ModelAndView("listaApontamento");
	}
	
	
	
	
}
