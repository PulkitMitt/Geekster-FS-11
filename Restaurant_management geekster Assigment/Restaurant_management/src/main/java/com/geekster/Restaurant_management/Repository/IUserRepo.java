package com.geekster.Restaurant_management.Repository;

import com.geekster.Restaurant_management.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

    User findFirstByUserEmail(String userEmail);
}
