package net.codeer.example2.pkg;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serializer {
    Gson gson = new GsonBuilder().create();

    public String serialize(Object obj) {
        return gson.toJson(obj);
    }
}
