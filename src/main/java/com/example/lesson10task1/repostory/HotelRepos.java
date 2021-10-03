package com.example.lesson10task1.repostory;

import com.example.lesson10task1.entitiy.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepos extends JpaRepository<Hotel,Integer> {

}
