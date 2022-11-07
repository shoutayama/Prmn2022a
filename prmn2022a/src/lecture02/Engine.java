package lecture02;

public class Engine {
    int rpm;
    Engine(int rpm){
        this.rpm=rpm;
    }
    public void start(){
        System.out.println(rpm+"エンジンを始動させました");
    }
}
