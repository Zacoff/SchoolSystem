package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String id;
    private String name;
    private Integer age;
    private String email;

    public Person(String name, Integer age, String email) {
        this.id = hashId();
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    private String hashId() {
        List<Integer> hashId = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            int hash = (int) Math.floor(Math.random() * 10);
            hashId.add(hash);
        }

        return hashId.stream().map(String::valueOf).collect(Collectors.joining(""));
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
