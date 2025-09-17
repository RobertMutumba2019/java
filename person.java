public class person {
    private String name; // private variable

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        person obj = new person();
        obj.setName("Robert");   
        System.out.println(obj.getName()); // use getter instead of obj.name
    }
}
