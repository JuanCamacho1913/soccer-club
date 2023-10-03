package com.example.club.controllers;

import com.example.club.models.TrainerDt;
import com.example.club.services.TrainerDtServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/trainer")
public class TrainerDtController extends BaseControllerImpl<TrainerDt, TrainerDtServiceImpl>{
}
