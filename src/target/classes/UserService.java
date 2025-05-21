import java.util.ArrayList;
import java.util.List;

import com.gimnasio.User;

public class UserService {
    private List<User> users = new ArrayList<>();

     public UserService(List<User> users) {
        this.users = users;
    }

     public List<User> getUsers(){
        return users;
    }

    public void addUser(int id, String name, String email){
        for (User user : users) {
            if (id== user.getId()) {
                System.out.println("El usuario ya se encuentra registrado.");
            }

             users.add(new User(id, name, email, true));
        }
    }

    public void getUserById(int id){
        for (User u : users) {
            if (id == u.getId()) {
                 System.out.println(u);
            }

            System.out.println("Usuario no encontrado!!");
        }
    }

    public void deleteUser(int id){
        for (User user : users) {
            if (id != user.getId()) {
                
            }

            users.remove(id);
        }

    }

    
}
