package com.frogwine.sbs.roomwebapp.data;

import com.frogwine.sbs.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
