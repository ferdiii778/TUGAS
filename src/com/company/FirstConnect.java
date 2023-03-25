package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnect {
    public static <JSONArray> void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddress = koneksisaya.buildURL("https://farmasi.mimoapps.xyz/mimoqss2auyq");
        String respone = ConnectURI.getResponseFromHttpUrl(myAddress);
        System.out.println(respone);

        assert respone != null;
        ModelFarmasi responseJSON = new ModelFarmasi(myJSONObject("i_barcode"));
        ArrayList<ModelFarmasi> responseModel =
                new ArrayList<ModelFarmasi>();
        for (int i = 0; i< responseJSON.length(); i += 1) {
            ModelFarmasi resModel = responseJSON.getJSONObject(i);
            resModel.setI_barcode(myJSONObject("i_barcode"));
            resModel.setI_supp(myJSONObject("i_sell"));
            resModel.setI_qty(myJSONObject("i_qty"));
            responseModel.add(resModel);
        }
        System.out.println("Response are");
        for (int index=0; index<responseModel.size();index++){
            System.out.println("NAMA BARANG: " +
                    responseModel.get(index).getI_barcode());
        }
    }

    private static String myJSONObject(String key) {


        return null;
    }