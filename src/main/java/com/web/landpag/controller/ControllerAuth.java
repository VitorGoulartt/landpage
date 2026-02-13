package com.web.landpag.controller;

import com.web.landpag.dto.LoginRequestDTO;
import com.web.landpag.dto.LoginResponseDTO;
import com.web.landpag.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class ControllerAuth {
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/Login")
    public ResponseEntity<LoginResponseDTO> login (@RequestBody LoginRequestDTO dto){

    }

}
