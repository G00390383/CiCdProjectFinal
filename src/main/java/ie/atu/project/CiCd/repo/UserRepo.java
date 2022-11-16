package ie.atu.project.CiCd.repo;

import ie.atu.project.CiCd.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,Integer> {
}
