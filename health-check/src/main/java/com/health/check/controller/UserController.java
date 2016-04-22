package com.health.check.controller;

import com.health.check.helper.UserDataHelper;
import com.health.check.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    @RequestMapping(value = "api/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<User>> getUsers() {
        return new ResponseEntity<Collection<User>>(UserDataHelper.getUsers(), HttpStatus.ACCEPTED);
    }
}
