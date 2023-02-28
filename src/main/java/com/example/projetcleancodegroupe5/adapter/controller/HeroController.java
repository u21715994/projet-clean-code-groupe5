package com.example.projetcleancodegroupe5.adapter.controller;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.port.HeroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController

public class HeroController {
    @Autowired
    private HeroDAO heroDAO;

    @PostMapping(
            path = "/hero",
            produces = "application/json",
            consumes = "application/json"
    )
    public void addHero(@RequestBody Hero hero){
        heroDAO.addHero(hero);
    }

    @GetMapping(
            path = "/hero/{id}",
            produces = "application/json"
    )
    public Hero getHero(@PathVariable String id){
        return heroDAO.getHero(id);
    }
}
