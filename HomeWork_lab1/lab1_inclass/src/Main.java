public class Main {
    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application myapp = new Application(inputDevice, outputDevice);
        //myapp.run();
        // test1
        //myapp.test_randomArraySort();
        // test2
        //exampleHistogram(inputDevice, outputDevice, myapp);

        // print ags Array.
        //outputDevice.printArray(args);
        /*
        ➜  src git:(main) ✗ java Main ceva pisica lol caine mere pere
        array[0]=ceva
        array[1]=pisica
        array[2]=lol
        array[3]=caine
        array[4]=mere
        array[5]=pere
        */

        parseArguments(args, inputDevice, outputDevice, myapp);

    }
    public static void parseArguments(String[] args, InputDevice inputDevice, OutputDevice outputDevice, Application app) {
        // not enough args exit case
        if (args.length < 1 || args.length > 2) {
            outputDevice.writeMessage("too few/many arguments");
            return;
        }
        String firstArg = args[0];
        switch (firstArg) {

            case "words":
                exampleHistogram(inputDevice, outputDevice, app);
                break;
            case "numbers":
                app.test_randomArraySort();
                break;
            case "play":
                if (args.length < 2){
                    outputDevice.writeMessage("no numbers argument");
                    return;
                }
                Integer numbers = Integer.parseInt(args[1]);
                app.run(numbers);
                break;
            default:
                outputDevice.writeMessage("Wrong Argument.");
                break;
        }
    }

    // tests the Histogram array generation from a given string.
    public static void exampleHistogram(InputDevice ip, OutputDevice od, Application app){
        String mystring = ip.getLine();
        Integer[] myHistogram = app.wordSizeHistorgram(mystring);
        od.printArray(myHistogram);
    }
}
