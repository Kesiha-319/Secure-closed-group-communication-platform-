/*package com.securecomm.securecomm.controller;

public class AuthController {
    
}/* */
package com.securecomm.securecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.securecomm.securecomm.model.User;
import com.securecomm.securecomm.service.UserService;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.registerUser(user);
    }
}