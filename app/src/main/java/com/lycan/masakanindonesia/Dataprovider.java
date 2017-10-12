package com.bagas.masakanindonesia;

/**
 * Created by bagas on 29-Sep-17.
 */

public class Dataprovider {

    public Dataprovider(int img_res,String n_resep,String deskripsi){
        this.setImg_res(img_res);
        this.setDeskripsi(deskripsi);
        this.setN_resep(n_resep);
    }

    private int img_res;
    private String n_resep,deskripsi;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res=img_res;
    }

    public String getN_resep() {
        return n_resep;
    }

    public void setN_resep(String n_resep) {
        this.n_resep=n_resep;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi=deskripsi;
    }
}
