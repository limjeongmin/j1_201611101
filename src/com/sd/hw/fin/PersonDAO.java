package com.sd.hw.fin;
import java.util.List;

public interface PersonDAO {
    public void insert(PersonVO person);
    public void update(PersonVO person);
    public void delete(int id);
    
    
    public List<PersonVO> findAll();
    public PersonVO findById(int id);
}