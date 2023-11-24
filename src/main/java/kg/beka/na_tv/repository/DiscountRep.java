package kg.beka.na_tv.repository;

import kg.beka.na_tv.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRep extends JpaRepository<Discount,Long> {
/*   @Query(value = "select *from tb_discount where channel_id=:id" +
           "order by discount_days desc ",nativeQuery = true)
    List<Discount> getDiscounts(Long id);*/
}
