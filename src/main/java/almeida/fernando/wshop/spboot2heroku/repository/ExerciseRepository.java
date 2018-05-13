package almeida.fernando.wshop.spboot2heroku.repository;

import almeida.fernando.wshop.spboot2heroku.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {

}
