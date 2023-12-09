# Example 3

The app has two modules:

* `example3-app` - application that can be run (contains the main method)
* `example3-module` - the module that is loaded (through maven dependency) in `example3-app`

The code for this example is almost the same as Example 2 - the only change is that Serializer classes (
the ones that create GSON instances) have an additional method to show the package of `gson` (`getSerializerPackage`
method).

The main change is in `pom.xml` of `example3-module` - the shade plugin:

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.5.1</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                    <configuration>
                        <artifactSet>
                            <includes>
                                <include>com.google.code.gson:gson</include>
                            </includes>
                        </artifactSet>
                        <relocations>
                            <relocation>
                                <pattern>com.google.gson</pattern>
                                <shadedPattern>net.codeer.com.google.gson</shadedPattern>
                            </relocation>
                        </relocations>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

If we try to run App 3 (e.g. from run configuration) the app will fail in the same manner as the app in previous
example:

```
{"name":"Kamil","year":2023}
com.google.gson
Exception in thread "main" java.lang.NoSuchMethodError: 'com.google.gson.GsonBuilder com.google.gson.GsonBuilder.disableJdkUnsafe()'
    at net.codeer.example3module.serializer.FancySerializer.<init>(FancySerializer.java:7)
    at net.codeer.example3.App.main(App.java:15)
```

However, if we package that example `mvn package` and run uber jar manually `java -jar target/example3-app.jar`
we will see that it works correctly - GSON classes in the module are moved into the different package and all
occurrences (in
this module) are replaced to use a new path:

```
{"name":"Kamil","year":2023}
com.google.gson
{"name":"Kamil","year":2023}
net.codeer.com.google.gson
```

That means classes from GSON 2.10.1 are shaded.
