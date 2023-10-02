package com.example.club.services;

import com.example.club.models.President;
import com.example.club.repositories.BaseRepository;
import com.example.club.repositories.PresidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresidentServiceImpl extends BaseServiceImpl<President, Long> implements PresidentService{

    @Autowired
    private PresidentRepository presidentRepository;

    public PresidentServiceImpl(BaseRepository<President, Long> baseRepository) {
        super(baseRepository);
    }
}
