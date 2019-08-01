package com.onerep.restControllers;


import com.onerep.conainers.UserData;
import com.onerep.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DataBaseTestController {
    @Autowired
    UserRepo userRepo;

    @RequestMapping(path = "/dataTest")
    public ResponseEntity<Collection<UserData>> test(){
        Collection<UserData> data = new ArrayList<>();
        data = userRepo.findAllByGender("Male");
        return new ResponseEntity<>(data, HttpStatus.OK);

    }

}
