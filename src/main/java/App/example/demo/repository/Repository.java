package App.example.demo.repository;

import App.example.demo.model.model;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<model,String> {

}
