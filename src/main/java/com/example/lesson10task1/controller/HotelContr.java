package com.example.lesson10task1.controller;

import com.example.lesson10task1.entitiy.Hotel;
import com.example.lesson10task1.repostory.HotelRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelContr {

    @Autowired
    HotelRepos hotelRepos;
    @PostMapping("/add")
    public String add(@RequestBody Hotel hotel){
        hotelRepos.save(hotel);
        return "saved";
    }
}
