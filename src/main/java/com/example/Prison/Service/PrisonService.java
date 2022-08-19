package com.example.Prison.Service;

import com.example.Prison.Entity.Prison;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface PrisonService {
    List<Prison> getInmates();
    Prison getInmateId(int id);
    Prison addInmate(Prison prison);
    Prison updateInmate(Prison prison);
    String removeInmate(int id);
}
