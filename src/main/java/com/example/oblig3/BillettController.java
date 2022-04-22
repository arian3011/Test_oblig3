package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
public class BillettController {
    @Autowired
    private KundeRepository rep;
    private final List<Film> Filmer = new ArrayList<>();

    @GetMapping("/hentBilletter")
    public List<Billett> alleBilletter() {
        return rep.hentAlleBilletter();
    }

    @GetMapping("/hentFilmer")
    public List<Film> hentFilmer() {
        List<Film> listFilmer = new ArrayList<>();
        listFilmer.add(new Film("The Matrix","L.Wachowski"));
        listFilmer.add(new Film("The Batman","M.Reeves"));
        listFilmer.add(new Film("Spider-Man","J.Watts"));
        return listFilmer;
    }

    @PostMapping("/lagreBillett")
    public void lagreBillett(Billett innBillett) {
        rep.lagreBillett(innBillett);
    }

    @GetMapping("/slettAlleBilletter")
    public void slettAlleBilletter() {
        rep.slettAlleBilletter();
    }
}
