package App.example.demo.service;

import App.example.demo.model.model;
import App.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public void save(model obj)
    {
        repository.save(obj);
    }
    
}
