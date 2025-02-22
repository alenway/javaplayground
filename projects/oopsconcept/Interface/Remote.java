interface RemoteControl {
    void powerOn();

    void volumenUp();
}

class SonyTv implements RemoteControl {
    public void powerOn() {
        System.out.println("SonyTv is On.");
    }

    public void volumenUp() {
        System.out.println("SonyTv volumenUp.");
    }
}

class SamsungTv implements RemoteControl {
    public void powerOn() {
        System.out.println("SamsungTv is on");
    }

    public void volumenUp() {
        System.out.println("SamsungTv volumenUp.");
    }
}

public class Remote {
    public static void main(String[] args) {
        RemoteControl sony = new SonyTv();
        sony.powerOn();
        sony.volumenUp();

        RemoteControl samsung = new SamsungTv();
        samsung.powerOn();
        samsung.volumenUp();
    }
}
