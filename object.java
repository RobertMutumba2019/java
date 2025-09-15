public class object{
 
        String name;
        int age;

        object(String name, int age){
        this.name=name;
        this.age=age;

    }
    public void done(){
        System.out.println(this.name +"His back");
    }

    public static void main(String[] args){
        object obj=new object("Robert", 12);

        obj.done();
    }
}