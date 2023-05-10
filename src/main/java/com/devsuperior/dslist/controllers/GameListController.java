package com.devsuperior.dslist.controllers;


import com.devsuperior.dslist.dto.GameListDTO;

import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    //Buscando por apenas 1 id
    /*
    @GetMapping(value = "/{id}")
    public GameDTO findByID(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
    */
    //Buscando todos so que de forma resumida
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
