//1. Lớp trừu tượng (Abstract Class):
//SmartDevice:
//Thuộc tính: String id, String name, boolean status
//Phương thức chung: turnOn(), turnOff()
//2. Giao diện (Interfaces):
//WifiConnectable: Có phương thức connectWifi()
//LevelAdjustable: Có phương thức adjustLevel()
//3. Các lớp con (Subclasses):
//SmartLight (Đèn): Kế thừa SmartDevice | Implement LevelAdjustable.
//AirConditioner (Máy lạnh): Kế thừa SmartDevice | Implement WifiConnectable.
//SmartSpeaker (Loa): Kế thừa SmartDevice | Implement WifiConnectable, LevelAdjustable.
//Curtain (Rèm): Chỉ kế thừa SmartDevice.
//4. Lớp quản lý (Manager):
//Hub: Quản lý danh sách List<SmartDevice>. Xử lý các nghiệp vụ turnOffAll() và setupWifi().
abstract class SmartDevice{
    protected String id;
    protected String name;
    protected boolean status;
    public SmartDevice(String id, String name){
        this.id=id;
        this.name= name;
        this.status= true;
    }
    public void turnOff(){
        this.status=false;
        System.out.println(this.name+" turned off");
    }

    public String getName() {
        return name;
    }
}
interface WifiConnectable{
    void connectWifi();
}
interface Level{
    void adjustLevel();
}
class SmartLight extends SmartDevice implements Level{
    public SmartLight(String id, String name){
        super(id,name);
    }
    @Override
    public void adjustLevel(){
    }
}
class AirConditioner extends SmartDevice implements WifiConnectable{
    public AirConditioner (String id, String name){
        super(id,name);
    }
    @Override
    public void connectWifi(){
        System.out.println(this.name+ " connected to wifi");
    }
}
class SmartSpeaker extends SmartDevice implements WifiConnectable, Level {
    public SmartSpeaker(String id, String name) {
        super(id, name);
    }

    @Override
    public void connectWifi() {
        System.out.println(this.name + " connected to wifi");
    }

    @Override
    public void adjustLevel() {
    }
}
class Curtain extends SmartDevice {
    public Curtain(String id, String name) { super(id, name); }
}
//tao bi gay
