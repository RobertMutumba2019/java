public class sample{
    String party;
    int year;
    String[] card;

    sample(String party, int year ){
        this.party=party;
        this.year=year;

    }
    public static void arra(){
    card=new String[]{"NRM","NUP","PPP"};

    for(String ar:card){
        System.out.println("print "+ar);
    }
    }
    public void output(){
        System.out.println(this.party +" come 2026");
    }

    public static void main(String args[]){
        sample s=new sample("NUP", 2026);
        s.output();
        arra();
    }
}