package com.Srilankan.Res.Res.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Res_Table {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableNo;
    private String name;
    private String mail;
    private String number;
    private String number_guest;
    private String date;

    public Res_Table(String name, String mail, String number, String number_guest, String date) {



        this.name = name;
        this.mail = mail;
        this.number = number;
        this.number_guest = number_guest;
        this.date = date;

    }

    public Res_Table()
    {

    }

}
