package com.geekster.Restaurant_management.Repository;
import com.geekster.Restaurant_management.Model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface IFoodRepo extends JpaRepository<FoodItem,Long> {

}
