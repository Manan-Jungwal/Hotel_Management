package com.hotelmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.Room;
import com.hotelmanagement.repository.RoomRepository;
import com.hotelmanagement.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repo;

    public Room addRoom(Room room) {
        return repo.save(room);
    }

    public List<Room> getAllRooms() {
        return repo.findAll();
    }

    public Room getRoomById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Room updateRoom(Long id, Room room) {
        room.setRoomId(id);
        return repo.save(room);
    }

    public void deleteRoom(Long id) {
        repo.deleteById(id);
    }
}