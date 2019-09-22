package br.com.simple.spring.data.redis.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.simple.spring.data.redis.model.Pessoa;
import br.com.simple.spring.data.redis.repository.PessoaRepository;


@RestController
@CrossOrigin
@RequestMapping(value ="/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String save(@RequestBody @Valid Pessoa pessoa) {
    	repository.save(pessoa);
    	return "sucess";
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public Pessoa get(@PathVariable("id") String id) {
    	return repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}

	@GetMapping(produces = "application/json")
	public Iterable<Pessoa> get() {
    	return repository.findAll();
	}


	@PutMapping(value = "/{id}", produces = "application/json")
	public Pessoa update(@PathVariable("id") String id, @RequestBody @Valid Pessoa pessoa) {
    	repository.save(pessoa);
    	return pessoa;
	}

	@DeleteMapping(value = "/{id}", produces = "application/json")
	public Pessoa delete(@PathVariable("id") String id) {
    	Pessoa pessoa = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    	repository.deleteById(id);
    	return pessoa;
	}
}
