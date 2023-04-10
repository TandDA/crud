package com.rating.crud.controller;

import com.rating.crud.dto.AutoDto;
import com.rating.crud.model.Auto;
import com.rating.crud.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("auto")
public class AutoController {
    @Autowired
    AutoRepository autoRepository;
    @GetMapping("/get")
    public List<Auto> getAll(){
        return autoRepository.findAll();
    }
    @PostMapping("create")
    public Auto create(@RequestBody AutoDto autoDto){
        Auto auto = new Auto();
        auto.setBrand(autoDto.getBrand());
        auto.setModel(autoDto.getModel());
        auto.setColor(autoDto.getColor());
        auto.setNumber(autoDto.getNumber());

        return autoRepository.save(auto);
    }
    @PutMapping("/update")
    public Auto update(@RequestBody Auto autoRequest){
        Auto auto = autoRepository.findById(autoRequest.getId()).get();
        auto.setNumber(autoRequest.getNumber());
        auto.setColor(autoRequest.getColor());
        auto.setBrand(autoRequest.getBrand());
        auto.setModel(autoRequest.getModel());

        return auto;
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        autoRepository.deleteById(id);
    }
}
