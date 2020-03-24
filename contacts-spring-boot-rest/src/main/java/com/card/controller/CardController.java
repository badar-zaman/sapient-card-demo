package com.card.controller;

import com.card.model.ApiResponse;
import com.card.model.Card;
import com.card.model.CardDto;
import com.card.service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping(value = "/fetchCards")
    public ApiResponse<List<Card>> listCards(){
        return new ApiResponse<>(HttpStatus.OK.value(), "card list fetched successfully.", cardService.findAll());
    }

    @PostMapping
    public ApiResponse<Card> saveCard(@RequestBody CardDto contact){
        return new ApiResponse<>(HttpStatus.OK.value(), "Card saved successfully.", cardService.save(contact));
    }

}
