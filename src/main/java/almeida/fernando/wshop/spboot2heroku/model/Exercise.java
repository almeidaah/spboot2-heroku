package almeida.fernando.wshop.spboot2heroku.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter
@EqualsAndHashCode
public class Exercise {

    enum EXERCISE_LEVEL{
        EASY,
        MEDIUM,
        HARD,
        PRO
    }

    @Id
    private String id;

    private String name;
    private EXERCISE_LEVEL level;
    private String description;


}
