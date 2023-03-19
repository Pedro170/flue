package flue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	@GetMapping("/api/usuario")
	
	public String hello() {
		return "Olá mundo!";
	}
	
}