package ie.atu.project.cicd.repo;

import ie.atu.project.cicd.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,Integer> {
}
