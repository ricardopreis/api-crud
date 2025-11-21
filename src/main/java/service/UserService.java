package service;

import model.User;
import org.springframework.stereotype.Service;
import repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepo repo;

    public UserService (UserRepo repo){
        this.repo = repo;
    }

    public void save(User u){
        repo.save(u);
    }

    public List<User> list(){
        List<User> list = repo.findAll();
        if(list.isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        return list;
    }

    public Optional<User> findById(Long id){
        if(id == null || id <=0){
            throw new IllegalArgumentException("id mus be positive");
        }
        if (!repo.existsById(id)){
            throw new IllegalArgumentException("User with Id: " + id + " not found");
        }
        return repo.findById(id);
    }

    public void update(User u){
        if(!repo.existsById(u.getId())){
            throw new IllegalArgumentException("User with Id: " + u.getId() + " not found");
        }
        repo.save(u);

    }

    public void delete(Long id){
        if(id <= 0){
            throw new IllegalArgumentException("Id cannot be null or negative");
        }
        repo.deleteById(id);
    }

}
