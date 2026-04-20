package org.APCSLowell;

public class APLine {
    int as, bs, cs;
    public APLine(int a, int b, int c) {
        as = a;
        bs = b;
        cs = c;
    }
    public boolean isOnLine(int x, int y) {
        return as * x + bs * y + cs == 0;
    }
    public double getSlope() {
        return -(double)as / (double)bs;
    }
}
