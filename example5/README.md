# Example 5

The app has two modules:

* `example5-app` - application that can be run (contains the main method)
* `example5-module` - the module that is loaded (through maven dependency) in `example3-app` - uses gson 2.7
* `example5-secondmodule` - the module that is loaded (through maven dependency) in `example3-app` - uses gson 2.10.1



If we try to run App 4 (e.g. from run configuration) the app will fail in the same manner as the app in the previous
examples:

```
{"name":"Kamil","year":2023}
com.google.gson
Exception in thread "main" java.lang.NoSuchMethodError: 'com.google.gson.GsonBuilder com.google.gson.GsonBuilder.disableJdkUnsafe()'
	at net.codeer.example5module.serializer.FancySerializer.<init>(FancySerializer.java:7)
	at net.codeer.example5.App.main(App.java:16)
```

However, if we reorder the dependencies in `pom.xml` of `example5-app`, so that `example5-secondmodule` 
is before `example5-module`, and run the app again.
We will see that it works correctly – GSON classes in the second module are used:

```
{"name":"Kamil","year":2023}
com.google.gson
{"name":"Kamil","year":2023}
com.google.gson
```

The same set if we set Gson dependency in pom.xml of `example5-app` to version 2.10.1 and run the app again. 
We will see that it works correctly version 2.10.1 is loaded and used in the app:

```
{"name":"Kamil","year":2023}
com.google.gson
{"name":"Kamil","year":2023}
com.google.gson
```

That means the order of dependencies in `pom.xml` matters when there are multiple versions of the same dependency.