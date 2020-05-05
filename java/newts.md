# Java Newts 
---
## Basic
* Each `.java` file has a primary class that named after the file
* `.java` programs have at least one class and one `main()` method
    * the `main()` method runs the tasks of the program
* Java is a _compiled_ programming language
    * code written in a `.java` file is transformed into _byte code_ by a compiler before it is executed by the Java Virtual Machine into a language the computer can understand
    * compiling process catches errors before the compiler rus the code
    * programs are compiled using "javac ProgramName`.java`"
        * a successful compilation produces a `.class` file: ProgramName`.class`; which is executed with "java ProgramName" (the `.class` format is left off)
        * an unsuccessful complication produces errors and no `.class` file until the errors are corrected and the compiler is ran again

### Syntax
* Java does not interpret whitespace
* Java _does_ interpret semicolons
* Classes are writted using _pascal case_
* Methods and variables are written using _camel case_

### Variables
* Variables are declared by their type and a name
* Variable names start with a valid letter, `$` or `_`
* Numbers and no other symbols can start off a variable name

**Primative Data Types**
* `int`:
    * Whole numbers
    * Holds positive/negative numbers and zero
    * Does not store fractions or numbers with decimals in them
    * allows values between -2,147,483,648 and 2,147,483,647, inclusive
* `double`:
    * Can hold decimals
    * Can hold very large and very small numbers
* `boolean`:
    * Booleans are declared by using the keyword `boolean` before the variable name
* `char`:
    * Can hold any character
    * Character must be surrounded by single quotes

**Objects**
* `String`:
    * Strings hold sequences of characters

**Static Checking**
* Java programs will not compile if a variable is assigned a value of an incorrect type
* Static typing helps by catching the bugs during programming rather than execution of code thus avoiding runtime errors

**Operators**
* Division has different results with integers. The `/` operator does _integer division_ so any remainder will be lost _(Reminder: `int` cannot store decimals)_.

## Classes & Objects
* `object-oriented programming` is where you have programs that are built around objects and their interactions
*  `classes` are a blueprint for objects which will detail the general structure 
    * classes can have an _instance_, or an _object_ of that class which will be referred to using the `this` keyword
    * _instances_ of a class will have their own individual _state_ and can have shared behavior, or _methods_
        * *Exampe:* A savings account for a bank may have SavingsAccount class which would contain a _state_ to keep track of an individual's balance and could have shared methods for withdrawing and depositing money. Even if entities had the same balance in their accounts their accounts would be separate from one another.

**Syntax**
* `public`: an _access level modifier_ that allows for **other** classes to interact with the class

**Constructors**
* Constructors are object (instances of a class)
* The constructor shares a name with the class
* We create instances of the class by _calling_ or _invoking_ the constructor within `main()`
* Variables that reference an instance name have a `type` of that class name
* We invoke the constructor `method()` and use the `new` keyword to indicate we are creating an instance

**Instance Fields**
* We'll add associated data to an object by introducing _instance variables_ and _instance fields_
* _instance fields_ are the state within an object
* An _instance variable_ is declared within the class to be available to the constructor

**Constructor Parameters**
* Used to create instances with individual state
* Parameters specify the type and name of data available for reference within a method's scope
* Set the instance field equal to the constructor parameter
* Once values are passed into the method call, they become the state of the instance
    * The type given to the invocation **must match** the type declared by the parameter
    * You access the value of a field using the _dot operator_ (`.`)

## Methods