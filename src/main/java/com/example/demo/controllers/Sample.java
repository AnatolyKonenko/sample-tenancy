package com.example.demo.controllers;

import com.example.demo.entities.Meh;
import com.example.demo.repository.MehRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class Sample {
    private final MehRepository mehRepository;

    @GetMapping("/all")
    public ResponseEntity<Collection<Meh>> v1(){
        Collection<Meh> result = new ArrayList<>();
        mehRepository.findAll().forEach(result::add);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/saveme")
    public ResponseEntity<Meh> save(@RequestBody Meh meh){
        return ResponseEntity.ok(mehRepository.save(meh));
    }
}
