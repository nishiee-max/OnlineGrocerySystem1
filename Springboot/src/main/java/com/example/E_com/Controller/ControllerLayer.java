package com.example.E_com.Controller;

import com.example.E_com.Model.Fruit;
import com.example.E_com.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ControllerLayer {

    @Autowired
    ServiceLayer sl;

    @GetMapping("/status")
    public String status()
    {
        return "Active...";
    }

    @GetMapping("/fruit/{id}")
    public Fruit getFruit(@PathVariable int id){
        return sl.getFruit(id);
    }

    @GetMapping("/fruits")
    public List<Fruit> getAllFruits(){
        return sl.getAllFruits();
    }

    @PostMapping("/addfruit")
    public String addfruit(@RequestBody Fruit fruit){
        if(!fruit.getName().equals("")){
        sl.addfruit(fruit);
        return "added";
    }
    return "not added";
}


    @PostMapping("/updatefruit")
    public String updatefruit(@RequestBody Fruit fruit){
        if(!fruit.getName().equals("")){
            sl.updateFruit(fruit);
            return "updated";
        }
        return "not updated";
    }

    @DeleteMapping("/deletefruit")
    public void deleteFruitById(@RequestBody Fruit fruit){
        if(fruit.getId()!=0){
         sl.deleteFruitById(fruit.getId());
        }

    }
}