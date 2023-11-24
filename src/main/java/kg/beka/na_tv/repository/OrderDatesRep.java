package kg.beka.na_tv.repository;

import kg.beka.na_tv.model.OrderDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDatesRep extends JpaRepository<OrderDates ,Long> {
}
