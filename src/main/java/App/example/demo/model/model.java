package App.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class model {

    @Id
    private String id;


    private String name;

    private String email;

    private String password;


    public String getId() {
        return id;
    }

    public model(model obj) {
        this.id = obj.id;
        this.name = obj.name;
        this.email = obj.email;
        this.password = obj.password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public model() {
    }

}
