# JUnit, Selenide, Maven

This project is a set of automated tests for web applications, utilizing JUnit for testing with Selenide and the Page Object Model. The project is configured with Maven to manage dependencies and build the project.

### Tech Stack:

- **Java** – The primary programming language for writing test scripts.
- **Maven** – Dependency and build management tool.
- **JUnit** – Testing framework for running automated tests.
- **Selenide** – Wrapper over Selenium for simpler and more readable test code.
- **Selenoid** – Lightweight Selenium Grid alternative for parallel execution in Docker.
## What is JUnit?


##  JUnit: The Testing Framework

[JUnit](https://junit.org/) is a unit testing framework for Java. It provides assertions, test runners, and annotations for writing test cases.

###  Features of JUnit

- **Annotations for Test Management:**
  - `@Test` – Marks a method as a test case.
  - `@BeforeEach` – Runs before each test (setup method).
  - `@AfterEach` – Runs after each test (cleanup method).
  - `@BeforeAll` – Runs once before all tests in a class.
  - `@AfterAll` – Runs once after all tests in a class.

- **Assertions to Validate Test Results:**  
  JUnit provides various assertions to verify test outcomes:

  ```java
  Assertions.assertEquals(5, add(2, 3)); // Check if 2 + 3 equals 5
  Assertions.assertTrue(isLoggedIn());  // Check if the user is logged in
  Assertions.assertFalse(isErrorDisplayed()); // Check if no error is shown
  Assertions.assertNotNull(user.getName()); // Check if user name is not null

## JUnit vs. TestNG

| Feature                 | JUnit                         | TestNG                     |
|-------------------------|-----------------------------|----------------------------|
| **Annotations**         | `@Test`, `@BeforeEach`, `@AfterEach` | `@Test`, `@BeforeMethod`, `@AfterMethod` |
| **Test Prioritization** | No built-in priority        | Supports `priority` attribute |
| **Dependency Management** | No direct test dependencies | Supports `dependsOnMethods` |
| **Parallel Execution**  | Limited (via Maven Surefire) | Built-in support           |
| **Data-driven Testing** | Parameterized tests         | `@DataProvider` feature    |

---


## 🔧 What is Maven?


[Maven](https://maven.apache.org/) is a build automation and dependency management tool for Java projects. It simplifies the process of managing project dependencies, compiling code, running tests, and packaging the application.

### 🛠 Maven Features:

- **Dependency Management:**  
  Maven automatically downloads the required dependencies from online repositories, resolving version conflicts and ensuring smooth project builds.

- **Build Lifecycle:**  
  Maven provides predefined build phases such as:
    - `validate` – Checks if the project is correct and all necessary information is available.
    - `compile` – Compiles the source code.
    - `test` – Runs unit tests using frameworks like JUnit.
    - `package` – Packages the compiled code into a JAR or WAR file.
    - `install` – Installs the package into the local repository for use in other projects.
    - `deploy` – Deploys the package to a remote repository.

- **Plugins & Customization:**  
  Maven allows using plugins to extend its functionality, such as:
    - `maven-surefire-plugin` – Runs unit tests.
    - `maven-compiler-plugin` – Specifies Java version and compiler settings.

### 🔹 Maven vs. Gradle

| Feature | Maven | Gradle |
|---------|-------|--------|
| **Configuration Format** | XML (`pom.xml`) | Groovy/Kotlin (`build.gradle`) |
| **Performance** | Slower (sequential execution) | Faster (incremental builds & caching) |
| **Dependency Management** | Centralized (Maven Central) | More flexible |
| **Build Scripts** | Verbose XML structure | More concise and readable |
| **Learning Curve** | Easier for beginners | More complex but powerful |

---

##  Selenide: A Simplified Selenium Wrapper

[Selenide](https://selenide.org/) is a Java-based testing framework that builds on Selenium to provide a more concise and stable API for UI automation.

###  Features of Selenide

- **Concise API for UI Testing:**
  - Simplifies working with collections of elements

- **Built-in Smart Waits:**
  - Automatically waits for elements to be visible, clickable, or interactable
  - Reduces the need for explicit `wait` statements

- **Fluent and Readable Syntax:**
  - Enables writing tests in a more natural way

- **Easy Setup and Integration:**
  - Works seamlessly with JUnit, TestNG, and other test frameworks

### ✅ Assertions with Selenide

Selenide simplifies assertions by providing an intuitive API:

```java
$("#username").shouldHave(text("JohnDoe")); // Check if the username field contains "JohnDoe"
$("#login-button").shouldBe(visible);       // Check if the login button is visible
$$(".product").shouldHave(size(5));        // Check if 5 products are displayed
```

##  Selenide vs. Selenium

| Feature                 | Selenide                      | Selenium                     |
|-------------------------|-----------------------------|------------------------------|
| **Syntax**             | Concise, fluent API          | Verbose, requires more code  |
| **Implicit Waits**     | Built-in automatic waits     | Requires explicit waits      |
| **Setup Complexity**   | Easy, minimal configuration  | Requires manual setup        |
| **Element Interactions** | Simplified (`click()`, `shouldBe(visible)`) | More verbose (`findElement().click()`) |
| **Fluent Assertions**  | Native support (`shouldHave()`, `shouldBe()`) | Requires third-party libraries |
| **Parallel Execution** | Supported via TestNG/JUnit   | Requires additional setup    |
| **Supported Languages** | Java only                    | Supports Java, Python, C#, etc. |
---

## ✅ Pros & Cons

### ✅ Gradle
- ✔️ Faster than Maven (incremental builds)
- ✔️ Uses Groovy/Kotlin, making scripts more readable
- ✔️ Highly customizable
- ❌ Higher learning curve than Maven
- ❌ Less structured than Maven

### ✅ Maven
- ✔️ Simple dependency management
- ✔️ Standardized project structure
- ✔️ Large community support
- ❌ XML-based configuration can be verbose
- ❌ Slower than Gradle due to sequential execution
---
### ✅ TestNG
- ✔️ Advanced test configuration options
- ✔️ Parallel test execution out of the box
- ✔️ Supports dependencies between tests
- ❌ More complex compared to JUnit
- ❌ Less native integration with Spring projects

### ✅ JUnit
- ✔️ Lightweight and fast
- ✔️ Well-integrated with CI/CD tools
- ❌ Limited built-in support for parallel execution
- ❌ No built-in dependency handling between tests
---
### ✅ Selenium
- ✔️ Supports multiple programming languages (Java, Python, C#, etc.)
- ✔️ Works with all major browsers (Chrome, Firefox, Edge, Safari)
- ✔️ Large community and extensive documentation
- ❌ Requires explicit waits for stable tests
- ❌ No built-in support for concise and readable syntax

### ✅ Selenide
- ✔️ Simplifies Selenium with concise API
- ✔️ Built-in smart waits (implicit and explicit)
- ✔️ Powerful selectors and concise element interaction methods
- ✔️ Easy setup and integration with JUnit & TestNG
- ❌ Limited support for multiple programming languages (primarily Java)
- ❌ Smaller community compared to Selenium
- ❌ Less flexibility for complex custom configurations