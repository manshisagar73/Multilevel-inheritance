//   Base class 
class Animal {
    public void eat() {
        System.out.println("This animal eat food.");
    }
}

//  Intermediate derived class 
class Mammal extends Animal {
    public void walk() {
        System.out.println("This mammal walks on land.");
    }
}

//  Final derived class 
class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
} 

//   Derived class 
public class MultilevelInheritanceDemo {
    public static void main(String[] agrs) {
        //  create an object of the final derived class 
        Dog myDog = new Dog();

        //   call method for all classes in the hierarchy 
        myDog.eat();  //  Inherited from Amnimal
        myDog.walk();  //  Inherited from mammal
        myDog.bark();   //  Derfined in Dog
    }
}