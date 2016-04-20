package fr.marc.data;

        import org.springframework.data.mongodb.repository.MongoRepository;

        import java.util.List;

/**
 * Created by marc on 12/04/2016.
 */
public interface ScoreRepository extends MongoRepository<Score, String> {

    public Score findByName(String name);


}
