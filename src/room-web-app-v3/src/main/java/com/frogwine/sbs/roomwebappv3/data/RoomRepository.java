package com.frogwine.sbs.roomwebappv3.data;

import com.frogwine.sbs.roomwebappv3.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
