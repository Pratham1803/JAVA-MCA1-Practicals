// 7. Demonstrate an application to show the uses of "super" keyword in java to call the constructor of super class from subclass.

class SuperClass {
    SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super();
        System.out.println("SubClass Constructor");
    }
}

public class Ass1Que7 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
    }
}
