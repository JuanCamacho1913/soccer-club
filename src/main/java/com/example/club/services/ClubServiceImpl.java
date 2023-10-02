package com.example.club.services;

import com.example.club.models.Club;
import com.example.club.repositories.BaseRepository;
import com.example.club.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl extends BaseServiceImpl<Club, Long> implements ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public ClubServiceImpl(BaseRepository<Club, Long> baseRepository) {
        super(baseRepository);
    }
}
