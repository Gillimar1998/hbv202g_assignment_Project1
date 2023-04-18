# hbv202g_assignment_Project

This is the final project in the Course HBV202g, based on assingment 8 with textual user interface,
this project is a maven project on github with JUnit tests, UML diagram and JAR file


# Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency and supports to execute a Main Method.

- `src/org/example`:
    - `User`: abstract class for other classes with users
    - `Author`: Class to build authors with setters and getters where needed
    - `Book`: Class to build Books for the library
    - `Student`: extends user, used to create students with acess to the library
    - `FacultyMember`: extends user, used to create Facultymembers with acess to the library
    - `NotAtLeastOneAuthorProvided`: extends exception, exception class used in LibarySystem and Book
    - `UserOrBookDoesNotExistException`: extends exception, exception class used in LibarySystem
    - `Lending`: A class for method regarding renting books etc
    - `LibrarySystem`: the "main" class that connects all above together

- `src/TextGUI`:
    - `DummyData`: Class with fake data to use the GUI with
    - `GUI`: A class with methods for the MainGUI to function
    - `MainGUI`: Main class that executes the GUI threw While loop with the DummyData database
    
    
# Building

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn exec:java` executes the main method of the implementation.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends
  with `Test`, `Tests`, or `TestCase`).
- `mvn Package` creates a fat JAR file of MainGUI

# License

MIT [License](https://spdx.org/licenses/MIT.html)
