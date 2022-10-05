package com.example.studentdetails;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "student")
public interface StudentApi {
    
    @GetMapping("oracle-university")
    public List<String> findByOracleUniversity();
    
    @GetMapping("eclipse-university")
    public List<String> getFindByEclipseUniversity();

}
