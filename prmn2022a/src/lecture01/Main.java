package lecture01;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2212540 Shouta Yamaguchi");

        int studentNumber=2212540;
        System.out.println("B"+studentNumber+" Shouta Yamaguchi");

        int age =20;
        if (age>=0&&age<20){
            System.out.println("I am "+age+" years old so I cannot drink liquor.");
        } else if (age>=20&&age<=120) {
            System.out.println("I am "+age+" years old so I can drink liquor.");
        }

        int array[]=new int[100];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        int sum=0;
        for (int i:array){
            if (i%2==1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        int[] score = {41,85,72,38,80};
        String value;
        for (int i=0;i<score.length;i++){
            if (score[i]>=90&&score[i]<=100){
                value="秀";
            } else if (score[i]<90&&score[i]>=80) {
                value="優";
            } else if (score[i]<80&&score[i]>=70) {
                value="良";
            } else if (score[i]<70&&score[i]>=60) {
                value="可";
            }
            else value="不可";
            System.out.println(i+"番目 "+score[i]+"点 "+value);
        }
        System.out.println("最高点:"+max(score)+"\n最低点:"+min(score)+"\n平均点:"+average(score));
    }

    public static int min(int[] array){
        int mini=array[0];
        for (int j:array){
            if (mini>=j){
                mini=j;
            }
        }
        return mini;
    }

    public static int max(int[] array) {
        int maxi=array[0];
        for (int j:array){
            if (maxi<=j){
                maxi=j;
            }
        }
        return maxi;
    }

    public static double average(int[] array){
        int sum=0;
        for (int j:array){
            sum =sum+j;
        }
        return (double)sum/array.length;
    }
}
