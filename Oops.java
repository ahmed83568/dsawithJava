
public class Oops {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Pen p1= new Pen();//created a pen object clalled p1
        p1.setColor("Blue");
        p1.setTip(5);
        p1.color="yellow";
        System.out.println(p1.color);
        System.out.println(p1.color);

        System.out.println(p1.tip);

        Bankaccount myAcc=new Bankaccount();
        myAcc.username="ahmed raza";
//        myAcc.password="ahmed123";
        myAcc.setPassword("abcde");

        //inheritance

        Fish sharks=new Fish();
        sharks.breathe();
        sharks.eat();

        Dog moti=new Dog();
        moti.eat();
        moti.legs=4;
        System.out.println(moti.legs);

        Mammals1 human=new Mammals1();
        human.waLk();
        Fish1 whale=new Fish1();
        whale.eat1();
        Bird koyel=new Bird();
        koyel.breathe1();

        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println( calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        Horse hor=new Horse();
        hor.eat();
        hor.walk();


        Chicken chick=new Chicken();
        chick.eat();
        chick.walk();
//        System.out.println();

        Queens q=new Queens();
        q.moves();
        Rook r=new Rook();
        r.moves();

        Bear b=new Bear();
        b.eat();
        Horre h1=new Horre();
        System.out.println( h1.color);
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color=newcolor;

    }

    void setTip(int newtip){
        tip=newtip;
    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calculatepercentage(int phy ,int chem,int mat){
        percentage=(phy+chem+mat)/3;
    }
}

class Bankaccount{
     public String username;
     private String password;

     public void setPassword(String pwd){
         password=pwd;
     }


}

//getter&setter

class pencil{
    String color;
    int tip;

    String getColor(){
         return this.color;
    }
    void setColor(String newcolor){
        
        color=newcolor;
    }
}

//Inheritance

//parent class or base class

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}


class Fish extends Animal{
    String Fins;

    void swim(){
        System.out.println("swims in water ");
    }
}
class Animal1{
    String color1;

    void eat1(){
        System.out.println("eats");
    }

    void breathe1(){
        System.out.println("breathes");
    }
}

class Mammals1{
    void waLk(){
        System.out.println("walk");
    }
}
class Fish1 extends Animal1{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal1{
    void fly(){
        System.out.println("flies");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}


 abstract class Anmal{
    String  color;

    Anmal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    void changeColor(){
        color="blue";
     }

}
class Horse extends Anmal{

    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walk son 4 legs");
    }

}
class Chicken extends Anmal{

    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

interface Chessplayer{
    void moves();
}
class Queens implements Chessplayer{
     public void moves(){
        System.out.println("up,down,left,right,diagonal(in all direction)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

interface Herbivore{
     void eat();

}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore,Carnivore{
     public void eat(){
         System.out.println("eat plants and meat");
     }
}

class Aminal{
    String color;
    Aminal(){
        System.out.println("animal constructor is called");
    }
}
class Horre extends Aminal{

    Horre(){
        super.color="Brown";
        System.out.println("horse consturctor is called");
    }
}
