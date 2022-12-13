public class Gakuseki {
    private String value;

    public Gakuseki(String value){
        String kashira=value.substring(0,1);
        String sonota=value.substring(1,8);

        if (kashira.equals("b")&&sonota.length()==7){
        this.value=value;
        return;
        }
        throw new RuntimeException(value+" is not Gakuseki");
    }

    public String getValue() {
        return value;
    }
}
