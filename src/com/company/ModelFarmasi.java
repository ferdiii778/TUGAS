package com.company;

public class ModelFarmasi {
    private String i_code;
    private String g_code;
    private String i_supp;
    private String i_barcode;
    private String i_name;
    private String i_qty;
    private String myJSONObject;

    public ModelFarmasi(String i_code, String g_code, String i_supp, String i_barcode, String i_name, String i_qty, String i_qtyname, String i_unit, String i_size, String i_color, String i_brands) {
        this.i_code = i_code;
        this.g_code = g_code;
        this.i_supp = i_supp;
        this.i_barcode = i_barcode;
        this.i_name = i_name;
        this.i_qty = i_qty;
        this.i_qtyname = i_qtyname;
        this.i_unit = i_unit;
        this.i_size = i_size;
        this.i_color = i_color;
        this.i_brands = i_brands;
    }

    private String i_qtyname;

    public ModelFarmasi(String myJSONObject) {
        this.myJSONObject = myJSONObject;
    }

    public String getI_code() {
        return i_code;
    }

    public void setI_code(String i_code) {
        this.i_code = i_code;
    }

    public String getG_code() {
        return g_code;
    }

    public void setG_code(String g_code) {
        this.g_code = g_code;
    }

    public String getI_supp() {
        return i_supp;
    }

    public void setI_supp(String i_supp) {
        this.i_supp = i_supp;
    }

    public String getI_barcode() {
        return i_barcode;
    }

    public void setI_barcode(String i_barcode) {
        this.i_barcode = i_barcode;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    public String getI_qty() {
        return i_qty;
    }

    public void setI_qty(String i_qty) {
        this.i_qty = i_qty;
    }

    public String getI_qtyname() {
        return i_qtyname;
    }

    public void setI_qtyname(String i_qtyname) {
        this.i_qtyname = i_qtyname;
    }

    public String getI_unit() {
        return i_unit;
    }

    public void setI_unit(String i_unit) {
        this.i_unit = i_unit;
    }

    public String getI_size() {
        return i_size;
    }

    public void setI_size(String i_size) {
        this.i_size = i_size;
    }

    public String getI_color() {
        return i_color;
    }

    public void setI_color(String i_color) {
        this.i_color = i_color;
    }

    public String getI_brands() {
        return i_brands;
    }

    public void setI_brands(String i_brands) {
        this.i_brands = i_brands;
    }

    private String i_unit;
    private String i_size;
    private String i_color;
    private String i_brands;
}
