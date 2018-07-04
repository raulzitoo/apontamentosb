package br.com.oportuna.apontamentosb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping("/apontamento")
public class ApontamentoController {

	@RequestMapping("/form")
	public ModelAndView form() {
		
		return new ModelAndView("form");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar() {
		
		return new ModelAndView("redirect:/apontamento");
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaApontamento() {
		System.out.println("entrei no controller");
		return new ModelAndView("listaApontamento");
	}
	
	
	
	
}
