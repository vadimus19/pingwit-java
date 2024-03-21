package part_7.homework.task_3;

public class Persone {
    String name;
    int age;

    Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Persone() {
        this.name = "Random name";
        this.age = 0;
    }


    {
        System.out.println("New example class");
    }
}

public static void main(String[] args) {
    Persone[] people = new Persone[];
    people[] = new Persone("Gora", 30);
    people[] = new Persone("Random name", 30);
    for (Persone person : people) {
        System.out.println("Name: " + person.name + ", Age: " + person.age);
    }
}
}
