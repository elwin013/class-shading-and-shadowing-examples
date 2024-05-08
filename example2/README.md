# Example 2

The app has two modules:

* `example2-app` - application that can be run (contains the main method)
* `example2-module` - the module that is loaded (through maven dependency) in `example2-app`

There are two entry points to the app - The app class (which is working) and the AppNotWorking class which will fail in
runtime.

The app has dependency on `com.google.code.gson:gson:2.7` while module `com.google.code.gson:gson:2.10.1`
(two different versions).

That means all classes from the library in 2.7 version are loaded, while only missing ones (only those that will be
loaded
by a class loader) will be loaded from the library in version 2.10.1.

When running App the output is:

```
{"name":"Kamil","year":2023}
```

When running AppNotWorking the output is:

```
{"name":"Kamil","year":2023}
Exception in thread "main" java.lang.NoSuchMethodError: 'com.google.gson.GsonBuilder com.google.gson.GsonBuilder.disableJdkUnsafe()'
    at net.codeer.example2.serializer.FancySerializer.<init>(FancySerializer.java:7)
    at net.codeer.example2.AppNotWorking.main(AppNotWorking.java:14)
```

The reason for the error and lack of `disableJdkUnsafe()` (which is used in the module) is the order of loading the
classes from dependencies. First the classes from 2.7 version of GSON library are loaded (including GsonBuilder) as
they are used in `net.codeer.example2.pkg.Serializer` class. Class from that version doesn't contain method
`disableJdkUnsafe`.

Later in class `net.codeer.example2.serializer.FancySerializer` from the module with version 2.10.1 of GSON code is
using that method. But the newer version of the class is not loaded (as it is already loaded).
