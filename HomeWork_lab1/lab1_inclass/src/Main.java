public class Main {
    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application myapp = new Application(inputDevice, outputDevice);
        myapp.run();
    }
}