package com.example.E_com.Service;

import com.example.E_com.Model.Fruit;
import com.example.E_com.Repository.RepoLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    @Autowired
    RepoLayer RepoLayer;
    public Fruit getFruit(int id)
    {
        return RepoLayer.findById(id).orElse(null);
    }
    public List<Fruit> getAllFruits()
    {
//        Fruit fruit1=new Fruit(20,"watermelon",100);
//        Fruit fruit2=new Fruit(50,"Banana",50);
//        Fruit fruit3=new Fruit(70,"Apples",150);
//
//        List<Fruit> list=new LinkedList<Fruit>();
//        list.add(fruit1);
//        list.add(fruit2);
//        list.add(fruit3);
        return RepoLayer.findAll();
    }
    public void addfruit(Fruit fruit)
    {
        RepoLayer.save(fruit);
    }
    public void deleteFruitById(int id){
        RepoLayer.deleteById(id);
    }
    public void updateFruit(Fruit fruit){
        Fruit fruit1 = RepoLayer.findById(fruit.getId()).orElse(null);
        if (fruit1!=null){
            if(!fruit.getName().equals("")){
                fruit1.setName(fruit.getName());
            }
            if(fruit.getPrice()!=0){
                fruit1.setPrice(fruit.getPrice());
            }
            if(fruit.getWeight()!=0){
                fruit1.setWeight(fruit.getWeight());
            }
            RepoLayer.save(fruit1);
        }
    }
}