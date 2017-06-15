/**
 * Created by Shoulder on 6/15/2017.
 */
public class Animal implements Talking{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void say() {
        System.out.print("Animal Say");
    }
}
