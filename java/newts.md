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

