package com.example.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("oracle-university")
    public List<String> findByOracleUniversity(){
        return Arrays.asList("Burak","Ahmet","Mehmet","Veli"); 
    }
    
    @GetMapping("eclipse-university")
    public List<String> getFindByEclipseUniversity(){
        return Arrays.asList("Ali","Hakkı","Buğra","Kaya");
    }
}
