package kg.beka.na_tv.repository;

import kg.beka.na_tv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User,Long> {

}
