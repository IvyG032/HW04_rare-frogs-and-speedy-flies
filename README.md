# Rare Frog and Speedy Flies Takeaways

This assignment helped me better understand core OOP concepts and how to use them effectively in practice.

### 1. Understanding `static`
The keyword `static` means that a variable or method belongs to the class itself, rather than to individual instances. All instances share this exact same piece of data. For example, in the `Frog` class, the `species` variable is `static` because all frogs belong to the same species. On the other hand, each frog has its own `name`, `age`, `tongueSpeed`, and `isFroglet` status. These are non-static variables because they are unique to each individual instance.

### 2. Choosing Between `public` and `private`
Variables or methods that should not be directly accessed or modified by the outside world should be marked as `private`. A classic example is the use of getters and setters, which are typically `public`. They serve as external windows to safely fetch or update `private` data. Utilizing `public` and `private` access modifiers properly helps keep the code structured and robust.

### 3. `override` vs `overload`
**Overload** means creating multiple versions of the same method so it can accept different types or numbers of parameters. A common example is a `print` method that can take an `int`, `double`, or `String`. In the `Frog` class, the `grow` method is overloaded to handle different parameter setups.
Constructors share a similar concept. By passing different parameters, the program decides which constructor gets called to build the object. In the `Fly` class, you can customize `mass` and `speed`, just `mass`, or provide no parameters, and it will instantiate the object accordingly. Constructor chaining is also a very efficient approach; instead of duplicating code, all setup logic is routed to the most specific constructor.

**Override** means redefining a method that is inherited from a parent class. A typical example is overriding the `toString` method. When you call `println`, it prints our customized `toString` content because the `println` function uses `toString` behind the scenes. Both the `Frog` and `Fly` classes override the `toString` method so we can easily output the exact text format we want.

### 4. Relationships Between Data
In the `Frog` class, the `age` variable directly determines the state of the `isFroglet` boolean. In a simple program, you might just rely on manually updating it whenever `age` changes. However, as the code grows more complex, this approach becomes difficult to maintain. From a design perspective, it is much safer to strongly link these dependent states. This can be done by making `isFroglet` a getter method that simply returns the age condition, or by writing a `setAge` method that automatically updates both variables at the same time.
