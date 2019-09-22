package br.com.simple.spring.data.redis.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.simple.spring.data.redis.model.Pessoa;

@Repository
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, String> {

}