public class Gakusei {
    private Gakuseki gakuseki;
    private String name;
    private Age age;

    public Gakusei(String gakuseki,String name,int age){
        try {
            this.gakuseki=new Gakuseki(gakuseki);
            this.age=new Age(age);
            this.name=name;
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

    public void checker(){
        if (this.age.isAdult()){
            System.out.println("adult");
        }
        else System.out.println("child");
    }
}
