package com.example.lesson10task1.repostory;

import com.example.lesson10task1.entitiy.Hotel;
import com.example.lesson10task1.entitiy.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepos extends JpaRepository<Room,Integer> {

}
