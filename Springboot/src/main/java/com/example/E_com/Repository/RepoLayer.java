package com.example.E_com.Repository;

import com.example.E_com.Model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoLayer extends JpaRepository<Fruit,Integer> {

}