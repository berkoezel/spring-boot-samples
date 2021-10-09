package com.frogwine.sbs.roomwebappv3.controllers;

import java.util.List;

import com.frogwine.sbs.roomwebappv3.models.StaffMember;
import com.frogwine.sbs.roomwebappv3.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}
