package facade;
import company.Aplication;
import dto.TarefaDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TarefasFacade {
	private static final Map<Long, TarefaDTO> tarefas= new HashMap<>();
	
	public TarefaDTO criar(TarefaDTO tarefaDTO) {
		long proximoCEP = tarefas.keySet().size()+1L;
		tarefaDTO.setCep(proximoCEP);
		tarefas.put(proximoCEP,tarefaDTO);
		return tarefaDTO;
	}
	
	public TarefaDTO atualizar(TarefaDTO tarefaDTO, Long tarefaCEP) {
		tarefas.put(tarefaCEP, tarefaDTO);
		return tarefaDTO;
	}
     
	public TarefaDTO getById(Long tarefaCEP) {
		return tarefas.get(tarefaCEP);
	}
	
	public List<TarefaDTO> getAll(){
		return new ArrayList<>(tarefas.values());
	}
	
	public String delete(Long tarefaCEP) {
		tarefas.remove(tarefaCEP);
		return "Deletado";
	}
}
