package com.Srilankan.Res.Res.Repository;


import com.Srilankan.Res.Res.Model.Res_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Res_Repository extends JpaRepository<Res_Table,Integer> {

}
