package com.asd.back.Web.Controller;

import com.asd.back.Domain.Person;
import com.asd.back.Domain.Service.PersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Persona")
public class EmpresaCrud {

    @Autowired
    private PersonService personService;

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Person> getAllPerson() {return personService.getAllPerson(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Person> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return personService.getPerson(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePerson(@PathVariable("id") int personId) {
        return personService.deletePerson(personId);
    }




    @RequestMapping("/espana")
    public String cadena(){
        return "desde el back";
    }

    @RequestMapping("/carnaval")
    public String cadena2(){
        return "desde el back jjjjjjj";
    }
}
