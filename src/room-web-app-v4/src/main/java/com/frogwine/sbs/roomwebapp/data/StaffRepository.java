package com.frogwine.sbs.roomwebapp.data;

import com.frogwine.sbs.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
