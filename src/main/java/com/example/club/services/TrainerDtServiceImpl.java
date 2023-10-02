package com.example.club.services;

import com.example.club.models.TrainerDt;
import com.example.club.repositories.BaseRepository;
import com.example.club.repositories.TrainerDtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerDtServiceImpl extends BaseServiceImpl<TrainerDt, Long> implements TrainerDtService{

    @Autowired
    private TrainerDtRepository trainerDtRepository;

    public TrainerDtServiceImpl(BaseRepository<TrainerDt, Long> baseRepository) {
        super(baseRepository);
    }
}
