package com.company;

public class Main {

    public static void main(String[] args) {
        MonitorWithHDMI monitorWithHDMI = new AdapterComputerWithVGAToMonitorWithHDMI();

        monitorWithHDMI.outputVideo();
    }
}
