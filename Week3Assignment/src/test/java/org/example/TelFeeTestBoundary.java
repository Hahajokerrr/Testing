package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Kiểm thử giá trị biên
 */
public class TelFeeTestBoundary {

    /** Test suite cho cuộc gọi buổi tối */
    @Test
    public void nightCallTest1(){
        TelFee a = new TelFee(18, 0, 30);
        assertEquals("7.88", a.finalMessage());
    }
    @Test
    public void nightCallTest2(){
        TelFee a = new TelFee(19, 0, 30);
        assertEquals("7.88", a.finalMessage());
    }
    @Test
    public void nightCallTest3(){
        TelFee a = new TelFee(0, 0, 30);
        assertEquals("7.88", a.finalMessage());
    }
    @Test
    public void nightCallTest4(){
        TelFee a = new TelFee(6, 0, 30);
        assertEquals("7.88", a.finalMessage());
    }
    @Test
    public void nightCallTest5(){
        TelFee a = new TelFee(7, 0, 30);
        assertEquals("7.88", a.finalMessage());
    }

    /** Test suite cho cuộc gọi buổi sáng */
    @Test
    public void dayCallTest1(){
        TelFee a = new TelFee(8, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }
    @Test
    public void dayCallTest2(){
        TelFee a = new TelFee(9, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }
    @Test
    public void dayCallTest3(){
        TelFee a = new TelFee(12, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }
    @Test
    public void dayCallTest4(){
        TelFee a = new TelFee(16, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }@Test
    public void dayCallTest5(){
        TelFee a = new TelFee(17, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }

    /** Test suite cho cuộc gọi định dạng sai giờ */
    @Test
    public void invalidTimeCallTest1(){
        TelFee a = new TelFee(25, 0, 20);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }
    @Test
    public void invalidTimeCallTest2(){
        TelFee a = new TelFee(-1, 0, 20);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }

    @Test
    public void invalidTimeCallTest3(){
        TelFee a = new TelFee(23, -1, 20);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }
    @Test
    public void invalidTimeCallTest4(){
        TelFee a = new TelFee(23, 61, 20);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }

    /** Test case cho cuộc gọi lỗi thời lượng */
    @Test
    public void invalidDurationCallTest(){
        TelFee a = new TelFee(12, 0, -1);
        assertEquals("Thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }


    /** Test suite cho các cuộc gọi không quá 1 tiếng */
    @Test
    public void shortCallTest0(){
        TelFee a = new TelFee(12, 0, 1);
        assertEquals("0.53", a.finalMessage());
    }
    @Test
    public void shortCallTest1(){
        TelFee a = new TelFee(12, 0, 2);
        assertEquals("1.05", a.finalMessage());
    }
    @Test
    public void shortCallTest2(){
        TelFee a = new TelFee(12, 0, 30);
        assertEquals("15.75", a.finalMessage());
    }
    @Test
    public void shortCallTest3(){
        TelFee a = new TelFee(12, 0, 59);
        assertEquals("30.98", a.finalMessage());
    }
    @Test
    public void shortCallTest4(){
        TelFee a = new TelFee(12, 0, 60);
        assertEquals("31.5", a.finalMessage());
    }

    /** Test suite cho các cuộc gọi trên 1 tiếng*/
    @Test
    public void longCallTest1(){
        TelFee a = new TelFee(12, 0, 61);
        assertEquals("27.22", a.finalMessage());
    }
    @Test
    public void longCallTest2(){
        TelFee a = new TelFee(12, 0 ,62);
        assertEquals("27.67", a.finalMessage());
    }
    @Test
    public void longCallTest3(){
        TelFee a = new TelFee(12, 0, 500);
        assertEquals("223.13", a.finalMessage());
    }
    @Test
    public void longCallTest4(){
        TelFee a = new TelFee(12, 0, 999);
        assertEquals("445.8", a.finalMessage());
    }

}