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

**Generic Data Types**
* _Used to declare an ArrayLists instead of it's primative counterpart_
* `<Integer>`
* `<Double>`
* `<Char>`

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

## Inheritance
* Child classes inherit traits from the parent class
* Only one file needs the `main()` method; this is the file that will run
    * Various classes in our Java package will have access to each other, so we can instantiate one class inside of another
* Passing values to `super()` will modify the constructor of the child class and instantiate that class with the constructor fields automatically assigned 
* In addition to access modifiers, there's another way to establish how a child class can interact with inherited parent class members using the `final` keyword
    * by adding `final` before a parent class method's access modifier, we disallow any child class from changing that method
    * this is helpful in limiting bugs that may be caused by modifing a particular method

## Polymorphism
* Derives from Greek meaning "many forms"
* Allows a child class to share the information and behavior of it's parent class while also incorporating it's own functionality
* ADVANTAGES:
    * Simplifying syntax
    * Reducing congnitive overload for developers
* You cannot use a generic parent class instance where a child class instance is required
* One common use for polymorphism is _overriding_ the method of a parent class within a child class
    * This is useful if we want our child class method to have the same name as the parent class but behave differently in some way
    * In order to properly override a method, the method in the child class must have the following in common with the corresponding method: method name, return type, number and type of parameters
    * You will also need the `@Override` keyword declared above the method

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
* Allow us to create blocks of code that are reusable and modular
* The _method signature_ gives the program some information about the method
* The method signature declares the method's type, name, and parameters
* Method calls occur inside the `main()` method
* Using methods to change instance fields is how we update the state of an object to make it more flexible

**Scope**
* Cannot access variables that are defined inside a method outside the scope of that method
* Variables defined at the top of a class can be declared within all methods of that class
* In order to use a variable outside of the method it is declared in, you must define the variable as a parameter of the 

**Access Modifiers**
* `public`: accessible by all classes
* `protected`: restricts global access
* `no modifier`: restricts global and child class access
* `private`: only accessible by that class

**Syntax**
* `void`: a keyword that means there is no specific output for the method
* `datatype keywords` can be passed in indicate that the method will return a value of that type

## Arrays
* Declaration: variable type with empty sqaure brackets then name
* Arrays are declared explicitly using curly braces
    * Ex: `String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};`
* Importing: `java.util.Arrays` contains many useful methods for arrays like `Arrays.toString()`
* Empty arrays have to be initialized with a fixed sized
    * Ex: `String[] menuItems = new String[5];`
* Once the size of an array has been declared it can not be changed

## ArrayLists
* To represent dynamic lists, we use _ArrayLists_
    * Unlike with _Arrays_ you can add and remove elements from _ArrayLists_
* `import java.util.ArrayList`
* Declaration: We use angel brackets to declare the type of Arraylist
    * Ex: `ArrayList<String> babyNames;`
* Angel brackets are used for `generics`
* `Generics`: Java construct that allows us to define classes and objects as parameters of an _Arraylist_.
    * For this reason we cannot use _primitive types_ in Arraylists
        * `ArrayList<int> ages;` -- Will not compile
        * `ArrayList<Integer> ages;` -- Will compile
        * _Initializing_: `ages = new ArrayList<Integer>();`
* **Adding Items**: `.add(value)` 
    * Adds an item to the end of an ArrayList
* **ArrayList Size**: `.size()` 
* **Access Indicies**: `.get(value)`
    * bracket notation will not work with ArrayLists
* **Changing Values**: `.set(index, value)`
    * Rewriting values using bracket notation will not work with ArrayLists
* **Removing Items**: `.remove(index)`
    * If you remove an item by specifying the value. The **FIRST** instance of that value will be removed
* **Get Index**: `.indexOf(value)`
    * Returns index of specified value if exists

## Loops
* `for-each`: 
    * syntax:
        * _for (String inventoryItem : inventoryItems) { // do something with each inventoryItem }_

## Libraries
* `java.util.Arrays`
* `java.util.ArrayList`
* `java.util.Random`