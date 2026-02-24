package level3.exercises.records;

public class PersonClass {
    private String name;
    private int age;

    public PersonClass (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or Negative!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNameInUpperCase() {
        return name.toUpperCase();
    }

    public boolean isAdult() {
        return age > 18;
    }


    /*
    La diferència entre un record i una classe tradicional és que el record genera automàticament el constructor,
    els getters, toString(), equals() i hashCode(), mentre que en una classe tradicional s’han d’implementar manualment.
    El record és immutable per defecte, cosa que el fa més segur per a models de dades simples.
    La classe tradicional és més adequada quan necessitem mutabilitat, lògica més complexa, herència o polimorfisme.
    En termes de llegibilitat, el record redueix molt el codi boilerplate i fa el model més clar i concís.
    */
}
