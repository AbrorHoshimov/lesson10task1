package com.example.lesson10task1.controller;

import com.example.lesson10task1.entitiy.Hotel;
import com.example.lesson10task1.entitiy.Room;
import com.example.lesson10task1.payload.RoomDto;
import com.example.lesson10task1.repostory.HotelRepos;
import com.example.lesson10task1.repostory.RoomRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomContr {

    @Autowired
    HotelRepos hotelRepos;
    @Autowired
    RoomRepos roomRepos;

    @PostMapping("/add")
    public String add(@RequestBody RoomDto roomDto){
        Room room =new Room();
        room.setNumber(roomDto.getNumber());
        room.setFloor(roomDto.getFloor());
        room.setSize(roomDto.getSize());
        Optional<Hotel> hotelOptional = hotelRepos.findById(roomDto.getHotelId());
        if (!hotelOptional.isPresent()) {
            return "not found";
        }
        room.setHotel(hotelOptional.get());
        roomRepos.save(room);
        return "saved";
    }
}
