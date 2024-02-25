package com.example.test_01.model;

public class SinhVienModel {
    private int masv;
    private String tensv;
    private float diem;

    public SinhVienModel(int masv, String tensv, float diem) {
        this.masv = masv;
        this.tensv = tensv;
        this.diem = diem;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}
