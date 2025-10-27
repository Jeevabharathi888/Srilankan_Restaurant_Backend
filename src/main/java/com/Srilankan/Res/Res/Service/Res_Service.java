package com.Srilankan.Res.Res.Service;

import com.Srilankan.Res.Res.Model.Res_Table;
import com.Srilankan.Res.Res.Repository.Res_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Res_Service {

    @Autowired
    private Res_Repository res_Repository;

    // Reserve a table and return the saved entity
    public Res_Table reserve(String name, String mail, String number, String numberGuest, String date) {
        Res_Table resTable = new Res_Table(name, mail, number, numberGuest, date);
        return res_Repository.save(resTable);  // return saved entity
    }

}
