# What is Design Pattern?
Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

## What does the pattern consist of?
Most patterns are described very formally so people can reproduce them in many contexts. Here are the sections that are usually present in a pattern description:

- Intent of the pattern briefly describes both the problem and the solution.
- Motivation further explains the problem and the solution the pattern makes possible.
- Structure of classes shows each part of the pattern and how they are related.
- Code example in one of the popular programming languages makes it easier to grasp the idea behind the pattern.

## Classification of patterns
- Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code.

- Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

- Behavioral patterns take care of effective communication and the assignment of responsibilities between objects.

## Implemented Design Patterns

### 1. Singleton Pattern
- **Purpose:** Ensures a class has only one instance and provides a global point of access.
- **Implementation:**
    - Private constructor to restrict instantiation.
    - Static method to return the instance.
- **Use Case in Application:** Used for logging, caching, or configuration management.

### 2. Factory Method Pattern
- **Purpose:** Defines an interface for creating objects but allows subclasses to alter the type of objects created.
- **Implementation:**
    - `Creator` abstract class with a factory method.
    - `ConcreteCreator` overrides the factory method to instantiate specific products.
- **Use Case in Application:** Used when exact object types are determined at runtime.

### 3. Abstract Factory Pattern
- **Purpose:** Provides an interface for creating related objects without specifying their concrete classes.
- **Implementation:**
    - `AbstractFactory` interface defines creation methods.
    - `ConcreteFactoryA`, `ConcreteFactoryB` create related objects.
    - `AbstractProduct` defines product interface, `ConcreteProductA/B` provide implementations.
- **Use Case in Application:** Used for creating families of related objects with consistency.

### 4. Observer Pattern
- **Purpose:** Allows one object (the subject) to notify multiple dependent objects (observers) of state changes.
- **Implementation:**
    - `Subject` interface with methods to attach, detach, and notify observers.
    - `ConcreteSubject` maintains a list of observers and notifies them when its state changes.
    - `Observer` interface with an `update()` method implemented by concrete observers.
- **Use Case in Application:** Used for real-time event notifications.

### 5. Strategy Pattern
- **Purpose:** Defines a family of algorithms and lets clients choose the appropriate algorithm at runtime.
- **Implementation:**
    - `Strategy` interface defines a common method.
    - `ConcreteStrategyA`, `ConcreteStrategyB` implement different algorithms.
    - `Context` class delegates execution to a selected strategy.
- **Use Case in Application:** Used for dynamic selection of different business rules or calculations.

### 6. Template Method Pattern
- **Purpose:** Defines the skeleton of an algorithm, letting subclasses implement specific steps.
- **Implementation:**
    - `AbstractClass` provides a template method with steps defined.
    - `ConcreteClass` implements the steps.
- **Use Case in Application:** Used to enforce a standard process flow while allowing custom steps.

### 7. Adapter Pattern
- **Purpose:** Converts one interface into another expected by the client.
- **Implementation:**
    - `Adapter` class wraps an existing class and translates its interface.
- **Use Case in Application:** Used for integrating third-party libraries or legacy code with a different API.

### 8. Facade Pattern
- **Purpose:** Provides a simplified interface to a complex subsystem.
- **Implementation:**
    - `Facade` class provides a high-level interface, calling multiple subsystems internally.
- **Use Case in Application:** Used to simplify interaction with complex services or APIs.

## How to Run
1. Clone the repository <https://github.com/Kjeff24/Design-Patterns.git>.
2. Build and run the application.
3. Check logs or UI outputs for pattern-specific behaviors.

## Conclusion
Each pattern improves maintainability, scalability, and flexibility in software design. This application demonstrates their real-world usage effectively.
