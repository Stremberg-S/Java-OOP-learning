package com.teht3.tehtava_3;

public class Henkilo {
    private String nimi;


    public Henkilo() {
    }

    public Henkilo(String nimi) {
        this();
        setNimi(nimi);
    }


    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }


    @Override
    public String toString() {
        return " | " + getNimi();
    }
}
