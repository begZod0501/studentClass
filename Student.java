package lesson9;

public class student {
    private  String firsName;
    private String Name;
    private int age;

    public student(String firsName, String name, int age) {
        this.firsName = firsName;
        Name = name;
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "firsName='" + firsName + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}

