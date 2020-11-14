package com.alexey.web.controllers;

import com.alexey.web.DAO.Person;
import com.alexey.web.DAO.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/person")
public class CourseAPIController {

    private PersonService service;

    @Autowired
    public void setService(PersonService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Person> list(){
        return service.findAll();
    }

    @RequestMapping(value ="/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Person findById(@PathVariable int id){
        return service.findById(id);
    }

    @RequestMapping(value="/create",method = RequestMethod.POST)
    @ResponseBody
    public Person create(@RequestBody Person person){
        return service.save(person);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public Person update(@RequestBody Person person){
        return service.save(person);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }




}
