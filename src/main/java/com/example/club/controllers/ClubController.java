package com.example.club.controllers;

import com.example.club.models.Club;
import com.example.club.services.ClubServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/club")
public class ClubController extends BaseControllerImpl<Club, ClubServiceImpl>{
}
