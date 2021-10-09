package com.frogwine.sbs.roomwebapp.service;

import java.util.List;

import com.frogwine.sbs.roomwebapp.data.RoomRepository;
import com.frogwine.sbs.roomwebapp.models.Room;
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

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}