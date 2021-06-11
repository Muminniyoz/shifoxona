package uz.itcenter.shifoxona.service;

import uz.itcenter.shifoxona.model.Bemor;

import java.util.ArrayList;
import java.util.List;

public class BemorService {
    private static final List<Bemor> bemorlar = new ArrayList<>();
    private static int lastId = 1;
    public void qoshish(Bemor bemor){
        bemor.setId(lastId++);
        bemorlar.add(bemor);
    }
    public List<Bemor> getBemorlar(){
        return bemorlar;
    }

    public Bemor getById(int id) {
        for (Bemor b: bemorlar) {
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }
}
