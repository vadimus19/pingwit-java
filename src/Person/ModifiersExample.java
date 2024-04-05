package Person;

import Person.Person;

public class ModifiersExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Egorka");
        person.setAge(28);
        person.setHungry(false);

        System.out.println(person);

        person.setName("Kolya");
        System.out.println(person);

        ImmutablePerson ImmutablePerson = new ImmutablePerson("Petr", 33, true);
        System.out.println(ImmutablePerson);

    }
}
