package com.example.club.services;

import com.example.club.models.Players;
import com.example.club.repositories.BaseRepository;
import com.example.club.repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersServiceImpl extends BaseServiceImpl<Players, Long> implements PlayersService {

    @Autowired
    private PlayersRepository playersRepository;

    public PlayersServiceImpl(BaseRepository<Players, Long> baseRepository) {
        super(baseRepository);
    }
}
