package com.starzplay.mongobee.service;

import com.starzplay.mongobee.model.LogsModel;
import com.starzplay.mongobee.model.Model1;
import com.starzplay.mongobee.repository.modelRepo1.Model1Repository;
import com.starzplay.mongobee.repository.modelRepo2.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Model1Service {
    @Autowired
    private Model1Repository model1Repository;
    @Autowired
    private LogsRepository logsRepository;

    public Model1 saveModel1 (String name){
        logsRepository.save(new LogsModel(null,Long.valueOf(1),"save",name));
        Model1 model1 = model1Repository.save(new Model1(null,name));
        return model1;
    }

    public Model1 updateModel1 (Model1 model1){
        logsRepository.save(new LogsModel(null,Long.valueOf(1),"update", model1.getName()));
        Optional<Model1> model11 = model1Repository.findById(model1.getId());
        Model1 model1Body = model11.get();
        model1Body.setName(model1.getName());
        return model1Repository.save(model1Body);
    }

    public List<Model1> getModel1 (){
        return model1Repository.findAll();
    }
    public List<LogsModel> getLogModels (){
        return logsRepository.findAll();
    }
}
