public class statics {
    public void anymethod() {
        System.out.println("Wakanet");
    }

    public static void main(String args[]) {
       // anymethod(); Note static methods are called but public variables are called with creating an object
       statics st=new statics();
       st.anymethod();

    }
}