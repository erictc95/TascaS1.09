# Sprint 1 Task S1.09

## Repository with level-1, level-2 and level-3 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise | Package                      | Principal Classes                    | Description                                                                              |
|---------|----------|------------------------------|--------------------------------------|------------------------------------------------------------------------------------------|
| Level 1 | 1        | `level1.exercise1.enums`     | `DayChecker`, `Task`, `Day`, `Level` | Create enum `Day` and enum `Level` and learn how to use in some exercises.               |
| Level 2 | 1        | `level2.exercise1.datentime` | `MyCalendar`, `DateTimeUtils`        | Create `DateTimeUtils` and his different imports and learn how to use them.              |
| Level 3 | 1        | `level3.exercise1records`    | `Person`, `PersonClass`              | Create a record class and a traditional class to compare the difference of uses in java. |



## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.09.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.09
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: level1.exercise1

Level-2 / Exercise 1: level2.exercise1

Level-3 / Exercise 1: level3.exercise1



You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demostrate Java concepts such as different uses of `Enums`; `LocalDate`, `LocalTime` and `LocalDateTime`, 
`Period` and `Duration`, `DateTimeFormatter`; `Records` and `Traditional Class`.


## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95