package br.com.projeto.employee.repositorio;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.employee.modelo.Filmes;


public interface Repositorio extends CrudRepository<Filmes, Long > {
    
}
