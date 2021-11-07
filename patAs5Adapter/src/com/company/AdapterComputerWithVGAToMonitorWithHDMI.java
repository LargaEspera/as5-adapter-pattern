package com.company;

public class AdapterComputerWithVGAToMonitorWithHDMI extends ComputerWithVGA implements MonitorWithHDMI {
    @Override
    public void outputVideo() {
        output();
    }
}
