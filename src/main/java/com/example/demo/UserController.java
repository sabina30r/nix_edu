package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody User user){
        userService.create(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity update(@RequestBody User user){
        userService.update(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity delete(Long id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().build();
    }
}
