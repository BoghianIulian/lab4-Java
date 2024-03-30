package com.example.lab4;

import Domain.Comanda;
import Domain.Tort;

import java.util.ArrayList;

public class Convert {

    public static Comanda convertToComanda(int id,String s)
    {
        ArrayList<Tort> torturi = new ArrayList<>();
        String[] tokens = s.split(";");
        for(String t:tokens){
            String[] tort = t.split(",");
            Tort trt = new Tort(Integer.parseInt(tort[0]),tort[1]);
            torturi.add(trt);
        }
        Comanda c = new Comanda(id,torturi);
        return c;

    }
}
