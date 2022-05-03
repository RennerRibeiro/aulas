

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
	
	@Autowired
	private PibRepository pibRepository;
	
	@RequestMapping(value = "/topicos/{id}", method = RequestMethod.GET )
	public Optional<PibEntity> listar(Integer id){
		return pibRepository.findById(id);
		
	
	
		
		}
	
	@RequestMapping(value = "/topicos/deleta/{id}", method = RequestMethod.DELETE )
	public void deletar(Integer id){
		pibRepository.deleteById(id);
		
		
	
		
		}
	
	@RequestMapping(value = "/topicos/", method = RequestMethod.GET )
	public List<PibEntity> listarTodos(){
		return pibRepository.findAll();
	
		
		}
}
