package kg.beka.na_tv.repository;

import kg.beka.na_tv.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRep extends JpaRepository<Text,Long> {
}
