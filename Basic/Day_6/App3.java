package Basic.Day_6;

public class App3 {
    public static void main(String[] args){
        Battery b = new Battery(capacityMaH: 250);
        camera c = new camera(pix:540);
        Phone p = new Phone("Oneplus" ,b, c);

        p.snappicture();
    }
    
}
