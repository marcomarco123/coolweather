package com.example.chunleung.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    private String date;

    @SerializedName("cond")
    private More more;

    @SerializedName("temp")
    private Temperature temperature;

    public class Temperature
    {
        public String max;
        public String min;
    }

    public class More
    {
        @SerializedName("txt_d")
        public String info;
    }

}
