package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/addNew")
	public void addNew() throws Exception{
		languageService.addNew(6,"C++");
	}
	
	@GetMapping("/del")
	public void del() {
		languageService.del(1);
	}
	@GetMapping("/getWithId")
	public Language getWithId() throws Exception {
		return languageService.getWithId(6);
	}
	@GetMapping("/update")
	public void update() throws Exception{
		languageService.update(3,"React");
	}
}
