package com.mulcam.backendMiniProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.backendMiniProject.model.Board;
import com.mulcam.backendMiniProject.model.User;
import com.mulcam.backendMiniProject.repository.BoardRepository;
import com.mulcam.backendMiniProject.repository.UserRepository;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }

}
