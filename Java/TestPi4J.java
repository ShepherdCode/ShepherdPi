import com.pi4j.io.gpio.*;
/**
 * Test the Pi4J Java library on a simple circuit.
 * Configure the circuit while the Pi is powered off.
 * Use a breadboard to make the following connections.
 * Connect Pi GPIO physical pin 16 
 * (also called GPIO_04 in Pi4J)
 * to either end of a resistor that provides about 200 ohms.
 * Connect the other end of the resistor 
 * to the anode (positive, long leg) of an LED.
 * Connect the cathode (negative, short leg) of the LED 
 * to any GPIO ground pin on the Pi.
 * With such a circuit, this Java program can switch the
 * power to the LED (light emitting diode).
 */
public class TestPi4J {
    int DELAY;
    final GpioController gpio;
    final Pin pinNumber;
    final GpioPinDigitalOutput outputPin;
    
    public TestPi4J (Pin pin) {
        this.pinNumber = pin;
        this.DELAY = 1000; // ms
        this.gpio = GpioFactory.getInstance();
        outputPin = gpio.provisionDigitalOutputPin
           (pinNumber,   // PIN NUMBER
            "TEST PIN",           // PIN FRIENDLY NAME (optional)
            PinState.LOW);      // PIN STARTUP STATE (optional)
        // prepare for accidental shut down
        outputPin.setShutdownOptions(true,PinState.LOW,PinPullResistance.OFF);
    }

    public void setPinState (boolean on) {
        if (on) {
            outputPin.high();
        } else {
            outputPin.low();
        }
    }

    public void showPinState () {
        // Provision gpio pin (i.e. it belongs to this running program).
        // Configure it as an output pin.
        // Make sure it is set to LOW at startup.
        System.out.println("State is "+outputPin.getState());
    }

    public void pinShutdown () {
        gpio.shutdown();
        gpio.unprovisionPin(outputPin);
    }

    public void delay () {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            System.out.println("Interrupted prematurely!");
        }
    }

    public static void main(String[] args) {
        Pin pin4 = RaspiPin.GPIO_04;
        System.out.println("Create test instance.\nProvision pin "+pin4);
        TestPi4J test = new TestPi4J(pin4);
        System.out.println("Test Pin Usage...");
        for (int i=0; i<5; i++) {
            System.out.println("Iteration "+(i+1));
            test.setPinState(true);
            test.showPinState();
            test.delay();
            test.setPinState(false);
            test.showPinState();
            test.delay();
        }
        System.out.println("Pin shutdown...");
        test.pinShutdown();
        System.out.println("All done. Bye!");
    }
}
