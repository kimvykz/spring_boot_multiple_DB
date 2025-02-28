package com.aisawan.mdb.domain.service;

import com.aisawan.mdb.db1.entity.User;
import com.aisawan.mdb.db1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUser() {

        return userRepository.findAll();
    }
}
