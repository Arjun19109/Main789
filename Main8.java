class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from child");
    }
}


class Main8
{
    public static void main(String[] args) 
    {
        Parent p = new Child();
        //Parent p = new Parent();
        p.sayHello();
    }
}