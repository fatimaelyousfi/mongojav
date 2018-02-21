package dev.monexemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.monexemple.entite.Formation;
import dev.monexemple.repository.FormationRepository;

@RequestMapping("/exemples")
@RestController
public class ApiController {
	@Autowired
	private FormationRepository formationRepo;

	@GetMapping
	public List<Formation> listerexemples() {
		return this.formationRepo.findAll();

	}

	@RequestMapping(method = RequestMethod.POST)
	public void postInsert(@RequestBody Formation forma) {
		formationRepo.save(forma);
	}
}
