public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
    private int age;

    public void sayHello(){
        System.out.println("i am "+name);
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("sabita");
        person1.sayHello();

        Person John=new Person();
        John.setName("roshan poudel ji");
        John.sayHello();
        John.age=20;

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

       // Person person1 = new Person("John");
        Person person2 = John;
        System.out.println(person2.age);
        System.out.println(person1==John);
    }

}
