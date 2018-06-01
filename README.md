# ShepherdPi
This repository is devoted to using Raspberry Pi in the classroom at Shepherd University. 

## Hardware
The Pi is a small computer that can be battery powered and installed in small robots.
The Pi is a powerful computer capable of running Java and Python programs under Linux. 
The Pi can be used with a USB keyboard, a USB mouse, and an HDMI monitor.
The Pi has ethernet, wifi, and bluetooth connectivity.
The Pi motherboard has pins that allow us to connect sensors, displays, motors, and even other Pi.
Shepherd students use Pi to gain experience with programmatic control of network and robotic hardware.
* Of the many Pi models available, we use Raspberry Pi 3 B (not B+).
* Raspberry Pi 3 B specs with images at [MagPi](https://www.raspberrypi.org/magpi/raspberry-pi-3-specs-benchmarks/).
* Raspberry Pi 3 B motherboard with labels: [jpg](images/Raspi3Layout.jpg)
* Raspberry Pi 3 B GPIO pin lables: [jpg](images/raspberry_pi_gpio.jpg)
* The Pi slows down automatically if it heats up.
Here is how to create a unix command "temp" to report CPU temperature:
```alias temp='/opt/vc/bin/vcgencmd measure_temp'```
Gamers sometimes overclock i.e. increase the Pi CPU clock MHz above the supported value.
Overclocked Pi may require fans or heat sinks to remain performant.
## Terminology
* Raspberry Pi: a computer available for ~$35 from several companies, built to the open standard specification.
* Raspbian: the Pi operating system, a version of Unix/Linux/Debian, which is free and open source. 
* NOOBS: free software that installs Raspbian on a Pi.
* LED: light-emitting diode, a tiny and low-energy light bulb.
* LCD: liquid crystal display, a low-energy digital screen, usually black on grey.
* HDMI: the only video output format supported on Raspberry Pi 3.
* SD card: the "secure digital" flash memory card that holds the Pi default file system and boot disk.
* GPIO: general purpuse input & output, an array of pins for connecting the Pi to other devices.
* IDE: Integrated Development Environment such as BlueJ or Eclipse.
* Embedded programming: Writing software that runs inside a device.
* IoT: the internet of things, the goal of networking all household items.
## Links to helpful (free) information
* The Raspberry Pi Foundation [RaspberryPi.org](https://www.raspberrypi.org/)
has a gentle introduction to the Linux operating system 
[here](https://www.raspberrypi.org/documentation/linux/).
* The BlueJ IDE can be installed on Raspberry Pi:
[instructions](https://www.bluej.org/raspberrypi/).
* The [Osoyoo](http://osoyoo.com/2017/07/13/raspberry-pi-3-starter-learning-kit-introduction/) 
sensor kit guide has links to videos describing various projects.
* The [Kookye](http://kookye.com/category/tutorials/rapsberry-pi-projects/)
sensor kit guide has links to many Raspberry Pi project descriptions.
* [Java Tutorial Network](https://javatutorial.net/category/raspberry-pi-java) 
has a [tutorial](https://javatutorial.net/raspberry-pi-java-tutorial) 
that includes Java code to control an LED connected to the GPIO. 
* The [Pi4J](http://pi4j.com/) project
has a Java API that you can download and use in your programs.
## Other resources (not free)
* Introduction to Raspberry Pi IoT applications
on [DZone](https://dzone.com/refcardz/iot-applications-with-java-and-raspberry-pi?chapter=1)
includes Java code to control an LED connected to the GPIO. (Free HTML. Must register for PDF.)
* [Mapt](https://www.packtpub.com/mapt/book/hardware_and_creative/9781786462121)
courses has a Raspberry Pi ebook with Java projects for $16.
* Book for $40:
Raspberry Pi 3 Projects for Java Programmers: Get the most out of your Raspberry Pi 3 with Java
* Book for $25:
Raspberry Pi with Java: Programming the Internet of Things (IoT) (Oracle Press)
* Book for $28:
Raspberry Pi IoT Projects: Prototyping Experiments for Makers
