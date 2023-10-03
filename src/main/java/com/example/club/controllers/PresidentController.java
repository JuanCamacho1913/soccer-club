package com.example.club.controllers;

import com.example.club.models.Players;
import com.example.club.models.President;
import com.example.club.services.PresidentServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/president")
public class PresidentController extends BaseControllerImpl<President, PresidentServiceImpl> {
}
