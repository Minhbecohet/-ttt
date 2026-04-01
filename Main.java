import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        List<SmartDevice> devices = new ArrayList<>();
        for (int i =0; i<n; i++){
            String type =scanner.next();
            String id =scanner.next();
            String name =scanner.next();
            switch (type){
                case "L":
                    devices.add(new SmartLight(id, name));
                    break;
                case "AC":
                    devices.add(new AirConditioner(id, name));
                    break;
                case "S":
                    devices.add(new SmartSpeaker(id, name));
                    break;
                case "C":
                    devices.add(new Curtain(id, name));
                    break;
            }
        }
        System.out.println("Turn Off All Devices:");
        for (SmartDevice device: devices){
            device.turnOff();
        }
        System.out.println("Setup Wifi");
        for (SmartDevice device: devices){
            if (device instanceof WifiConnectable){
                ((WifiConnectable) device).connectWifi();
            }
        }
        scanner.close();
    }
}