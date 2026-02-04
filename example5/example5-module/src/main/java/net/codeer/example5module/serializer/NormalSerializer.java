package net.codeer.example5module.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NormalSerializer {
    Gson gson = new GsonBuilder().create();

    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    public String getSerializerPackage() {
        return this.gson.getClass().getPackageName();
    }
}
