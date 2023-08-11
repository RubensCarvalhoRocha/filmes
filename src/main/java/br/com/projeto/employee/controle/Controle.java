 //Rotas
package br.com.projeto.employee.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.employee.modelo.Filmes;
import br.com.projeto.employee.repositorio.Repositorio;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin(origins = "http://localhost:4200/") //Cors Fix
public class Controle {

    @Autowired                           	//Para não precisar instanciar esse objeto em cada rota.
    private Repositorio acao;

    @PostMapping("/")               	//Incluir
    public Filmes cadastrar(@RequestBody Filmes f){
        return acao.save(f);
    }

    @GetMapping("/")            	//Selecionar
    public Iterable<Filmes> selecionar(){               
        return acao.findAll();
    }

    @PutMapping("/")         	//Atualizar
    public Filmes atualizar(@RequestBody Filmes f) {
            return acao.save(f);
    }

    @DeleteMapping("/{id}")//Deletar
    public void deletar(@PathVariable long id){
        acao.deleteById(id);
    }
}
