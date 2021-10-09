package com.frogwine.sbs.roomwebappv3.service;

import java.util.ArrayList;
import java.util.List;

import com.frogwine.sbs.roomwebappv3.data.RoomRepository;
import com.frogwine.sbs.roomwebappv3.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}