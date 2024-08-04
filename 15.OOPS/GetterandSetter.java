public class GetterandSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String Color;
    private int tip;

    String getColor(){
        return this.Color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor (String newColor){
        this.Color = newColor;
    }

    void setTip (int tip){
        this.tip = tip;
    }
}
