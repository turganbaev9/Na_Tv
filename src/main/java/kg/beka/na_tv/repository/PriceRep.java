package kg.beka.na_tv.repository;

import kg.beka.na_tv.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRep extends JpaRepository<Price ,Long> {

/*@Query(value = "SELECT p.*, d.*FROM tb_price p JOIN tb_discount d ON p.discount = d.id WHERE p.id = :id;",nativeQuery = true)
 Price findPriceAndDiscountById(@Param("id") Long id);*/
@Query(value = "SELECT p.*, d.* FROM tb_price p JOIN tb_discount d ON p.discount = d.id WHERE p.id = :id", nativeQuery = true)
Price findPriceAndDiscountById(@Param("id") Long id);

}
