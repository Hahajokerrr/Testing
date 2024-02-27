package org.example;

import static org.junit.Assert.*;

public class TelFeeTest {

    @org.junit.Test
    public void finalFee1() {
        TelFee telFee = new TelFee(18, 0, 61);
        assertEquals("13.61", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee2() {
        TelFee telFee = new TelFee(8, 0, 61);
        assertEquals("27.22", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee3() {
        TelFee telFee = new TelFee(8, 0, 60);
        assertEquals("31.5", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee4() {
        TelFee telFee = new TelFee(7, 59, 60);
        assertEquals("15.75", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee5() {
        TelFee telFee = new TelFee(7, 69, 60);
        assertEquals("Định dạng thời gian sai", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee6() {
        TelFee telFee = new TelFee(-1, 59, 60);
        assertEquals("Định dạng thời gian sai", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee7() {
        TelFee telFee = new TelFee(7, -1, 60);
        assertEquals("Định dạng thời gian sai", telFee.finalMessage());
    }

    @org.junit.Test
    public void finalFee8() {
        TelFee telFee = new TelFee(25, 59, 60);
        assertEquals("Định dạng thời gian sai", telFee.finalMessage());
    }



}