package com.frogwine.sbs.roomwebapp.service;

import java.util.List;

import com.frogwine.sbs.roomwebapp.data.StaffRepository;
import com.frogwine.sbs.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}