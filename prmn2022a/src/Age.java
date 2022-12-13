public class Age {
    private int value;
    public Age(int age){
        if (age>=0&&age<=120){
            this.value=age;
        }
        else throw new RuntimeException("age error");
    }
    public boolean isAdult(){
        return this.value>=20;
    }
}
