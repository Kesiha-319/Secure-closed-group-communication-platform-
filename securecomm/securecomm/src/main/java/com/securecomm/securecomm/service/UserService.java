/*package com.securecomm.securecomm.service;

public class UserService {
    
}/* */
package com.securecomm.securecomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.securecomm.securecomm.model.User;
import com.securecomm.securecomm.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public boolean loginUser(String email, String password){

        User user = userRepository.findByEmail(email);

        if(user != null && user.getPassword().equals(password)){
            return true;
        }

        return false;
    }
}