package almeida.fernando.wshop.spboot2heroku.controllers;

import almeida.fernando.wshop.spboot2heroku.model.Exercise;
import almeida.fernando.wshop.spboot2heroku.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Exercise findOne(@PathVariable String id){
		return exerciseService.findOne(id).get();
	}
	
	@GetMapping
	@ResponseBody
	public List<Exercise> findAll(){
		return exerciseService.findAll();
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Exercise> delete(@PathVariable String id){
		exerciseService.delete(exerciseService.findOne(id).get());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Exercise> insert(@RequestBody Exercise exercise){
		exerciseService.insert(exercise);
		return new ResponseEntity<>(exercise, HttpStatus.CREATED);
	}

	@PostMapping("/insertAll")
	@ResponseBody
	public ResponseEntity<String> insertAll(@RequestBody List<Exercise> exercises){
		exerciseService.insertAll(exercises);
		return new ResponseEntity<>(exercises.size() + " registros inseridos com sucesso.", HttpStatus.CREATED);
	}

}
