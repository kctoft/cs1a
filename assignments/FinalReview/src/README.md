# The following topics will be on the Final:

## Variables

Definition: A `variable` is an item such as 'x' used to hold a value.

- An *assignment statement* assigns a variable with a value, such as x = 5.
- '=' is NOT equals in programming FYI
- increasing a value by +1 is called `incrementing`
- a `variable declaration`is a statement that declares a new variable, specifying the variables NAME and TYPE.
- an `assignment statement` assigns the left-hand of the = with the current value of the right side.
- an `identifier` is a name created by the programmer for an item or method
  - it must have letters, underscores, $ & digits
  - start with a letter, underscore, or dollar sign
  - it is CASE SENSITIVE
- `reserve words` are words that are aprat of the language such as:
  - abstract
  - assert
  - boolean
  - break
  - byte
  - case
  - catch
  - char
  - class
  - const
  - continue
  - default
  - do
  - double
  - else
  - enum
  - extends
  - final
  - finally
  - float
  - for
  - goto
  - if
  - implements
  - import
  - instanceof
  - int
  - interface
  - long
  - native
  - new
  - package
  - private	protected
  - public
  - return
  - short
  - static
  - strictfp
  - super
  - switch
  - synchronized
  - this
  - throw
  - throws
  - transient
  - try
  - void
  - volatile


- Compound operators:
  - += , -=, /=, *=

### Special notes:

- `int`: single digits, integer, , truncates to whole numbers, i.e. 1,6, 100, 928
- `double`: stores a floating-point number, i.e. 0.999991
- `final` variable: is a variable you CANNOT change
  - Escape sequence	Char
   * \n	newline
   * \t	tab
   * \'	single quote
   * \"	double quote
   * \\	backslash



## Data Types

- int
- double
- float
- short
- char


## Methods:
 - is a list of statements executed by evoking the method's name, such as invoking a `method call`
 - i.e. Math.sqrt(4)



## Operators

- Operators:
  - addition: +
  - subtraction: -
  - multiplication: *
  - division: /
- MODULO operator: (%) evaluates the remainder of two integer operands.
  - i.e. 23% 10 is 3

## Casting from one data type to another

- `Type conversion` is the conversion between one data type to another (i.e. an int to a double)
- `implicit conversion` is when the compiler automatically performs several common conversioins
- `Type casting` explicitly converts a value of one type to another type.
- a programmer can precede an expression with a (type)
  - i.e. myInt = (int)myDouble


## Branches including if, if/else and switch
- If/Else if/ Else:
    - i.e. if (expression using >, <, ==) {
            // statements that execute first branch
        }
        else if (expression) {
        // statements that execute second branch
        }
        else (expression) {
        // statements that execute final branch
        }
     - Boolean operations:
        - == equals to
        - != not equal
        - && and
        - || or
        - ! not

- Switch:
    - i.e. switch (a) {
                case 0:
                // print "zero";
                break;
                case 1:
                // print "one";
                break;
                default:
                // print "unknown";
                break;
    }

## Loops including for and while

- For loops
    - i.e.
    for (initialExpression; conditionExpression; updateExpression) {
      // Loop body
    }
    // Statements after the loop

    - for (i = 0; i < 10; ++i) {
               System.out.println("$" + currSavings);
               currSavings = currSavings + (currSavings * interestRate);
            }

- While loops
    - i.e.
       while (expression) { // loop expression
            // Loop body: Executes if expression evaluated to true
           // After body, execution jumps back to the "while"
       }
       // Statements that execute after the expression evaluates to false

    - while (userChar == 'y') {
              System.out.println(currPower);
              currPower = currPower * 2;
              userChar = s.next().charAt(0);
           }

           System.out.println("Done");
        }

## Defining a static method

- A parameter is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.
- An argument is a value provided to a method's parameter during a method call.
- Ex: A pizza area method might be called as printPizzaArea(12.0) or as printPizzaArea(16.0).

## Calling a static method



* Using a predefined class and a predefined method from the Java API

* Defining your own new class including public methods and private fields

* Testing your new class