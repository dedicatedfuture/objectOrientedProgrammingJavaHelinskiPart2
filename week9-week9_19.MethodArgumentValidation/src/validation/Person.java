package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {


        if (name == null || name.equals("") || name.length() > 40){
            throw new IllegalArgumentException("The name needs to be filled out, and under 40 characters");
        }

        if(age < 0 || age > 120){
            throw new IllegalArgumentException("age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
