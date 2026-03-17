/*package com.securecomm.securecomm.repository;

public class UserRepository {
    
}/* */
package com.securecomm.securecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.securecomm.securecomm.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
