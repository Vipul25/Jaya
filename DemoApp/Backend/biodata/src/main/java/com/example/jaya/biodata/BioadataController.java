package com.example.jaya.biodata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/biodata")
public class BioadataController {

    @Autowired
    private BiodataService biodataService;

    @PostMapping("/upload-user-data")
    @CrossOrigin(origins = "http://localhost:3001")
    public ResponseEntity<String> postBiodata(@RequestBody Biodata biodata) throws Exception{
        ResponseEntity<String> response = biodataService.addBiodata(biodata);
        return response;
        
    }

    @GetMapping("/users")
    @CrossOrigin(origins = "http://localhost:3001")
    public ResponseEntity<List<Biodata>> getAllUsers(){
        return new ResponseEntity<List<Biodata>>(biodataService.getUsers(), HttpStatus.OK);
    }
    
}
