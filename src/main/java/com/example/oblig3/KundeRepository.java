package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class KundeRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Billett innBillett){
        String sql = "INSERT INTO Billett (antall, fornavn, etternavn,telefon,epost,valgtFilm) VALUES(?,?,?,?,?,?)";
        db.update(sql,innBillett.getAntall(),innBillett.getFornavn(),innBillett.getEtternavn(),innBillett.getTelefon(),innBillett.getEpost(),innBillett.getValgtFilm());
    }

    public List<Billett> hentAlleBilletter(){
        String sql = "SELECT * FROM Billett";
        List<Billett> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Billett.class));
        Collections.sort(alleBilletter);
        return alleBilletter;
    }
    public List<Film> hentFilmer(){
        String sql = "SELECT * FROM Filmer";
        List<Film> alleFilmer = db.query(sql,new BeanPropertyRowMapper(Film.class));
        return alleFilmer;
    }

    public void slettAlleBilletter(){
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}
