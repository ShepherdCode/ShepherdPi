# ShepherdPi
This repository is devoted to using Raspberry Pi in the classroom at Shepherd University. 

## Hardware
Shepherd University students use Pi to gain experience taking programmatic control of 
network hardware and robotic hardware.
The Pi is a credit-card sized computer that can run onboard robots under battery power.
The Pi is nevertheless a powerful computer capable of running Java and Python programs under Linux. 
The Pi can be set up with a USB keyboard, a USB mouse, and an HDMI monitor.
The Pi has ethernet, wifi, and bluetooth connectivity.
The Pi motherboard has pins that allow us to connect sensors, displays, motors, and even other Pi.
* Of the many Pi models available, we use Raspberry Pi 3 B (not B+).
* Raspberry Pi 3 B specs with images at [MagPi](https://www.raspberrypi.org/magpi/raspberry-pi-3-specs-benchmarks/).
* Raspberry Pi 3 B motherboard with labels: [jpg](images/Raspi3Layout.jpg)
* Raspberry Pi 3 B GPIO pin lables: [jpg](images/raspberry_pi_gpio.jpg)
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
* Embedded programming: Writing software that runs inside a device such as a watch, coffee maker, or Pi.
* IoT: the internet of things, the goal of networking household items, can be implemented with Pi.
* Clock speed and overclocking: 
The Pi runs at 1.2 GHz i.e. 1,200,000,000 instructions per second.
The Pi slows down automatically if it heats up.
Here is how to create a unix command "temp" to report current CPU temperature:
```alias temp='/opt/vc/bin/vcgencmd measure_temp'```
Video game players have tried setting the Pi CPU clock speed above the supported value.
Overclocked Pi may require fans or heat sinks to remain performant.
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
* Various [ways](https://www.raspberrypi-spy.co.uk/2012/09/checking-your-raspberry-pi-board-version/) to determine the Pi version, including running 'pinout' and printing 'cpuinfo'. 
* [pinout.xyz](https://pinout.xyz/) draws the pin state.
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
## The Blinking LED Project
* A tutorial with pictures at [ADMFactory](https://www.swarthmore.edu/NatSci/echeeve1/Class/E02/Lab02/Breadboard%20inside.jpg). There is a similar page at [HowTo](https://howchoo.com/g/ytzjyzy4m2e/build-a-simple-raspberry-pi-led-power-status-indicator).
* [wiringPi](http://wiringpi.com/) is a library for controlling GPIO pins on the Pi. The library is written in C and it is used by the Pi4J Java library and (I think) by Python libraries. The [downloads](http://wiringpi.com/download-and-install/) page recommends these three unix commands from home: 'git clone git://git.drogon.net/wiringPi ; cd ~/wiringPi ; ./build '.  
* The Pi4J library for controlling pins from inside Java: [home](http://pi4j.com/), [JavaDoc](http://pi4j.com/apidocs/), by Robert [Savage](http://pi4j.com/team-list.html). The early-2018 version, [1.1](http://www.savagehomeautomation.com/projects/category/pi4j), always reports "cannot detect hardware version" with any recent releases of Linux kernel, Raspbian, and wiringPi. As of Fall 2018, there is no official release and the correct library to install is Pi4J 1.2-SNAPSHOT. There is a Debian package [here](http://pi4j.com/download.html); install it with 'sudo apt install /home/pi/Downloads/Pi4J 1.2-SNAPSHOT.deb'. Pi4J uses its own GPIO numbering; here is its [GPIO numbering](http://pi4j.com/pins/model-3b-rev1.html) for Pi model 3 B. 
