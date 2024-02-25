package com.example.test_01.model;

public class SinhVienModel {
    private String masv;
    private String tensv;
    private int diem;

    public SinhVienModel(String masv, String tensv, int diem) {
        this.masv = masv;
        this.tensv = tensv;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
