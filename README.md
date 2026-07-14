# Rare Frog and Speedy Flies Takeaways

This assignment helped me better understand core OOP concepts and how to use them correctly.

### 1. Understanding `static`
The keyword `static` basically means something is uniformly produced by a factory, without caring about individual instances. All instances share this exact same piece of data. For example, in the `Frog` class, the `species` variable is `static` because all frogs belong to the same species. However, every single frog has its own `name`, `age`, `tongueSpeed`, and `isFroglet` status. These are non-static variables because they apply to each individual instance.

### 2. Choosing between `public` and `private`
Anything (variables or methods) that you don't want the outside world to see or use directly should be marked as `private`. Otherwise, they should be `public`. A classic example is that getters and setters are usually `public`, because they serve as external windows to fetch or change `private` data. Mixing `public` and `private` properly is what makes the code's structure strict and robust.

### 3. `override` vs `overload`
**Overload** means creating multiple versions of the same method so it can accept a richer variety of parameter types. Just like a `print` method that can take in an `int`, `double`, or `string`. For instance, our `Frog` class has a `grow` method that is overloaded with different parameter setups.
Constructors are also kind of like overloading. By passing different parameters to the class, it decides which constructor gets called to build the instance. In the `Fly` class, you can customize `mass` and `speed`, or just `mass`, or even pass no parameters, and the program will instantiate flies accordingly. Constructor chaining is also super interesting—instead of copy-pasting code, you just plug all the paths into the most specific constructor.

**Override** literally means rewriting an ancestor's method that already exists in Java. For example, overriding `toString`. When you call `println`, it prints our customized `toString` content because `println` works by calling `toString` under the hood. Both the `Frog` and `Fly` classes override the `toString` method so we can print out the exact text we want directly.

### 4. Relationships Between Data
In the `Frog` class, `age` directly affects the state of `isFroglet`. With simple code like this assignment, you might get away with just relying on your own brain to remember to update it. But once the code gets complicated, this kind of structure becomes a nightmare to maintain. From a design perspective, it's much better to strongly tie `age` changes with `isFroglet`—like making `isFroglet` a boolean method that simply returns the age condition, or writing a `setAge` method that automatically checks and updates it.
