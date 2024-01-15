interface CallFunctionality {
    void makeCall();

    void receiveCall();
}

interface CameraFunctionality {
    void takePhoto();

    void recordVideo();
}

class SmartPhone implements CallFunctionality, CameraFunctionality {
    @Override
    public void makeCall() {
        System.out.println("Making a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receive a call...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.makeCall();
        phone.receiveCall();
        phone.takePhoto();
        phone.recordVideo();
    }
}
