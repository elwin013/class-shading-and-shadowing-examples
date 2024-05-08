# Class shading and shadowing - examples

Examples for presentation 'Shadowing i shading klas w Javie - jak je wykorzystać na naszą korzyść'
('Shadowing and Shading classes in Java - how to use them to our advantage')

## Examples

### Example 1 - Class shading

Example of shading the class from a different module by adding the same class in our application.

A detailed description is in [example1/README.md](example1/README.md).

### Example 2 - Presentation of an issue with two different versions of dependency

An example of a not working correctly app that has in the dependency tree two different versions of GSON.

A detailed description is in [example2/README.md](example2/README.md).

### Example 3 - Class shading using `maven-shade-plugin`

Example of usage `maven-shade-plugin` to overcome issue with two different versions of packages that causes
`NoSuchMethodError`. Based on the Example 2.

Detailed description is in [example3/README.md](example3/README.md).