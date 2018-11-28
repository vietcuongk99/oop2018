package week12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {


    static class Person {

        String name;
        int age;
        String soulmate;
        String gender;

        private List<Person> list;

        public Person(String name, String gender, String soulmate, int age) {

            this.name = name;
            this.gender = gender;
            this.age = age;
            this.soulmate = soulmate;
            list = new ArrayList<Person>();
        }

        public void addChild(Person e) {
            list.add(e);
        }

        public List<Person> getPerson() {
            return list;
        }
    }

    public static void main(String[] args) {
        Person father = new Person("Peter", "Men", "Jessie", 80);
        Person son1 = new Person("Parker","Men", null, 30);
        Person daughter1 = new Person("Nancy","Woman","Jack",26);
        Person son2 = new Person("Jonathan","Man","Alice",10);
        Person son3 = new Person("Jim","Man",null,11);
        Person daughter3 = new Person("Jane","Woman",null,22);

        father.addChild(son1);
        father.addChild(daughter1);
        daughter1.addChild(son2);
        son2.addChild(son3);
        son2.addChild(daughter3);

        System.out.println(father.name);
        for(Person p : father.getPerson()) {
            System.out.println(p.name);

            for(Person p1 : p.getPerson()) {
                System.out.println(p1.name);
            }
        }
    }
}
