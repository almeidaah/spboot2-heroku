package almeida.fernando.wshop.spboot2heroku.repository;

import almeida.fernando.wshop.spboot2heroku.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {

    @Override
    void delete(Exercise exercise);

    @Override
    <S extends Exercise> S insert(S s);

    @Override
    <S extends Exercise> S save(S s);


}
