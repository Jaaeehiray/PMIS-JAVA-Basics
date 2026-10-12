package Basic.Day_6;

class Battery{
    int capacityMaH;
    Battery(int capacityMaH){
        this.capacityMaH = capacityMaH;
    }

    void drain(){
        System.out.println("battery used.\nCapacity remaining:" +(capacityMaH - 100)+"MH");
    }
}

class camera{
    int pix;

    camera(int pix){
        this.pix = pix;
    }

    void takephoto(){
        System.out.println("Click...capture a[hoto with " +pix + "sensor");
    }
}

class Phone{
    String brand;
    Battery battery;
    camera camera;

    Phone(String brand, Battery battery, camera camera){
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }
    void snappicture(){
        System.out.println("[" + brand +"]" + " is active.");
        camera.takephoto();
        battery.drain();
    }
}


    

