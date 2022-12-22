package com.example.trendyolapplication;

import java.io.Serializable;

public class Urunler implements Serializable {
    private int id;
    private String aciklama;
    private String resimAdi;
    private double fiyat;


    public Urunler(int id, String aciklama, String resimAdi, double fiyat) {
        this.id = id;
        this.aciklama = aciklama;
        this.resimAdi = resimAdi;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
