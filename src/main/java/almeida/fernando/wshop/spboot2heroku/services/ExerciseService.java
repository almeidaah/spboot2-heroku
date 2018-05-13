package almeida.fernando.wshop.spboot2heroku.services;

import almeida.fernando.wshop.spboot2heroku.model.Exercise;
import almeida.fernando.wshop.spboot2heroku.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;

	public List<Exercise> findAll() {
		return exerciseRepository.findAll();
	}

	public Optional<Exercise> findOne(String id) {
		return exerciseRepository.findById(id);
	}

	public void delete(Exercise ex) {
		exerciseRepository.delete(ex);
	}

	public Exercise insert(Exercise exercise) {
		if(StringUtils.isEmpty(exercise.getId())){
			return exerciseRepository.insert(exercise);
		}
		return exerciseRepository.save(exercise);
	}

}
