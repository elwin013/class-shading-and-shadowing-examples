# Example 1

The app has two modules:

* `example1-app` - application that can be run (contains the main method)
* `example1-module` - the module that is loaded (through maven dependency) in `example1-app`

The app is simple - run and write to standard output some texts. The first message is from `HelloClass.java`
that is in the app, where the second is from a class with the same name, but with a different package that is in the
module.

Expected output is:

```
HelloClass says hello!
HelloSayer says hello!
```

To demonstrate class shadowing we can uncomment the content of the file
`example1-app/src/main/java/net/codeer/examplemodulefirst/sayers/HelloSayer.java`, then compile and run again.
Output will change to:

```
HelloClass says hello!
HelloSayer - local - says goodnight!
```

That means that a locally created class with the same name and same package is shadowing the class from the
module.
