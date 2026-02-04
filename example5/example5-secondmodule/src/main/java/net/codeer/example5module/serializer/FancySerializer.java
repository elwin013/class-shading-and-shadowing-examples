package net.codeer.example5module.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FancySerializer {
    Gson gson = new GsonBuilder().disableJdkUnsafe().create();

    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    public String getSerializerPackage() {
        return this.gson.getClass().getPackageName();
    }
}
