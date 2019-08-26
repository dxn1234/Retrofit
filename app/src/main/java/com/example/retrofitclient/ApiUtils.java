package com.example.retrofitclient;

public class ApiUtils {
    public static String baseUrl="";
    public static DataService getDataService(){
        return RetrofitClient.getClient(baseUrl).create(DataService.class);
    }
}
