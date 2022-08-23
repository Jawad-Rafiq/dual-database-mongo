package com.starzplay.mongobee.controller;

import com.starzplay.mongobee.dto.request.Model1Dto;
import com.starzplay.mongobee.model.LogsModel;
import com.starzplay.mongobee.model.Model1;
import com.starzplay.mongobee.service.Model1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModelController {
    @Autowired
    private Model1Service service;
    @PostMapping("/saveModel1")
    public Model1 saveModel1 (@RequestBody Model1Dto model1Dto){
        return service.saveModel1(model1Dto.getName());
    }
    @PutMapping("/updateModel1")
    public Model1 updateModel1(@RequestBody Model1 model1){
        return service.updateModel1(model1);
    }
    @GetMapping("/getAll")
    public List<Model1> getAllModel1 (){
        return service.getModel1();
    }
    @GetMapping("/getAllLogs")
    public List<LogsModel> getAllLogs(){
        return service.getLogModels();
    }
}
