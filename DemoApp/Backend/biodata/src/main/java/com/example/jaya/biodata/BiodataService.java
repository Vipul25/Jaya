package com.example.jaya.biodata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BiodataService {

    @Autowired
    private BiodataRepository biodataRepository;

    public BiodataService(BiodataRepository biodataRepository) {
        this.biodataRepository = biodataRepository;
    }

    public ResponseEntity<String> addBiodata(Biodata biodata) throws Exception{
        biodataRepository.save(biodata);
       return ResponseEntity.status(HttpStatus.OK).body("Biodata added successfully");
    }

    public List<Biodata> getUsers() {
        return biodataRepository.findAll();
    }

}
