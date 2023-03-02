package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import company.Aplication;
import dto.TarefaDTO;
import facade.TarefasFacade;

@Controller
@RequestMapping(value= "/tarefas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TarefasAPI {
	@Autowired
	private TarefasFacade tarefasFacade;
    
	/* Os quatros metodos da API*/
	
	//Metodo Criar que recebe um post
	@PostMapping
	@ResponseBody
	public TarefaDTO criar(@RequestBody TarefaDTO tarefaDTO) {
		return tarefasFacade.criar(tarefaDTO);
	}
	//Metodo Put para fazer a atualização. 
	//Ele vai receber a variavel mais o corpo da requisição para fazer a atualização
	
	@PutMapping("/{tarefaCEP}")
	@ResponseBody
	public TarefaDTO atualizar(@PathVariable("tarefaCEP")Long tarefaCEP,
			                   @RequestBody TarefaDTO tarefaDTO) {
		return tarefasFacade.atualizar(tarefaDTO, tarefaCEP);
	}
	//Metodo Get para retornar todos os registros
	@GetMapping
	@ResponseBody
	public List<TarefaDTO> getAll(){
		return tarefasFacade.getAll();
	}
	//Metodo delete para apagar o registro
	@DeleteMapping("/{tarefaCEP}")
	@ResponseBody
	public String deletar(@PathVariable("tarefaCEP")Long tarefaCEP){
		return tarefasFacade.delete(tarefaCEP);
	}
}
