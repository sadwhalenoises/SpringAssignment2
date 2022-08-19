package com.example.Prison.PrisonController;

import com.example.Prison.Entity.Prison;
import com.example.Prison.Service.PrisonImp;
import com.example.Prison.Service.PrisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
public class Controller {

    @Autowired
    private PrisonService prisonService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome!</H1></HTML>";
    }

    @GetMapping("/prison")
    public List<Prison> getInmates(){return this.prisonService.getInmates();}

    @GetMapping("/prison/{id}")
    public Prison getId(@PathVariable String id){
        return this.prisonService.getInmateId(Integer.parseInt(id));
    }

    @PostMapping("/prison")
    public Prison addInmate(@RequestBody Prison prison){
        return this.prisonService.addInmate(prison);
    }

    @PutMapping("/prison")
    public Prison updateInmate(@RequestBody Prison prison){
        return this.prisonService.updateInmate(prison);
    }

    @DeleteMapping("/prison/{id}")
    public String removeInmate(@PathVariable String id){
        return this.prisonService.removeInmate(Integer.parseInt(id));
    }


}
