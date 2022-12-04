package com.example.responsi;

public class DaftarMenu {

    private String nama,detail;
    private int logo;

    public DaftarMenu(int logo, String nama, String detail){
        this.logo   = logo;
        this.nama   = nama;
        this.detail = detail;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
