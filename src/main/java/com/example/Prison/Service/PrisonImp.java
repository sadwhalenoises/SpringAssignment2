package com.example.Prison.Service;

import com.example.Prison.Dao.PrisonDao;
import com.example.Prison.Entity.Prison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PrisonImp implements PrisonService{
    @Autowired
    private PrisonDao prisonDao;

    List<Prison> list;

    public PrisonImp(){
        list = new ArrayList<>();
        list.add(new Prison("James"));
        list.add(new Prison("Carl"));
        list.add(new Prison("Nova"));
        list.add(new Prison("Abby"));
    }

    @Override
    public List<Prison> getInmates() {
        return prisonDao.findAll();
    }

    @Override
    public Prison getInmateId(int id) {

        Optional<Prison> p = this.prisonDao.findById(id);
        Prison prison = null;
        if(p.isPresent()){
            prison = p.get();
        } else {
            throw new RuntimeException("Course not found!");
        }

        return prison;
    }

    @Override
    public Prison addInmate(Prison prison) {
        return this.prisonDao.save(prison);
    }

    @Override
    public Prison updateInmate(Prison prison) {
        return this.prisonDao.save(prison);
    }

    @Override
    public String removeInmate(int id) {
         this.prisonDao.deleteById(id);
         return "Deleted!";
    }
}
