package COurse;
class Smartphone {
    // Properties
    private int batteryLevel = 85; // Private access modifier
    public double screenSize;

    // Encapsulation: we don't see the internal logic of taking a photo
    public void takePhoto() {
        processImageSensors(); // Internal complex work
        System.out.println("Photo captured and saved to gallery.");
    }

    private void processImageSensors() {
        // Complex internal processing hidden from the user
        System.out.println("Processing light and pixels...");
    }

    // Polymorphism: The "Play" action works differently for different inputs
    public void play(String mediaType) {
        if (mediaType.equals("Video")) {
            System.out.println("Opening video player...");
        } else if (mediaType.equals("Song")) {
            System.out.println("Playing audio through speakers...");
        }
    }
}
public class Day1Exmple2 {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        myPhone.takePhoto(); // User only sees this simple command

        // Polymorphism in action
        myPhone.play("Video");
        myPhone.play("Song");
    }
}
