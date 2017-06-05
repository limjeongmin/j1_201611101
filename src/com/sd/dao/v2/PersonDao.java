package com.sd.dao.v2;

import java.util.List;

public interface PersonDao{
  public void insert(PersonVO p);
  public List<PersonVO> findAll();
  public PersonVO findById(int id);
  public void update(PersonVO p);
  public void delete(int id);
  //public void deletePerson(PersonV0 p);

}