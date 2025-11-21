package controller;

import model.User;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping ("/user")
public class UserController {

    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody User u){
        service.save(u);
    }

    @GetMapping
    public List<User> list (){
        return service.list();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping
    public void update (@RequestBody User u){
        service.update(u);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
