package com.alexey.web.DAO;

import com.google.common.collect.Lists;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;



    @Override
    public List<Person> findAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Person findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);
    }
}
