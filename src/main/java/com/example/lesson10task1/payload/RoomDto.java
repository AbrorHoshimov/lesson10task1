package com.example.lesson10task1.payload;

import com.example.lesson10task1.entitiy.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomDto {
    private int number;
    private String floor;
    private String size;
    private Integer hotelId;
}
