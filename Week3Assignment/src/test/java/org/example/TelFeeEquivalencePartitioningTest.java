package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Kiểm thử phân hoạch tương đương mạnh
 */
public class TelFeeEquivalencePartitioningTest {

    /** cuộc gọi dưới 0p (invalid) vào buổi sáng */
    @Test
    public void dayCallDurationTest(){
        TelFee a = new TelFee(10, 0, -1);
        assertEquals("Thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }

    /** cuộc gọi dưới 60p vào buổi sáng */
    @Test
    public void shortDayCallTest(){
        TelFee a = new TelFee(10, 0, 10);
        assertEquals("5.25", a.finalMessage());
    }

    /** cuộc gọi dài hơn 60p vào buổi sáng */
    @Test
    public void LongDayCallTest(){
        TelFee a = new TelFee(10, 0, 70);
        assertEquals("31.24", a.finalMessage());
    }

    /** cuộc gọi dưới 0p (invalid) vào buổi tối */
    @Test
    public void nightCallDurationTest(){
        TelFee a = new TelFee(20, 0, -1);
        assertEquals("Thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }

    /** cuộc gọi dưới 60p vào buổi tối */
    @Test
    public void shortNightCallTest(){
        TelFee a = new TelFee(20, 0, 10);
        assertEquals("2.63", a.finalMessage());
    }

    /** cuộc gọi dài hơn 60p vào buổi tối */
    @Test
    public void longNightCallTest(){
        TelFee a = new TelFee(20, 0, 70);
        assertEquals("15.62", a.finalMessage());
    }

    /** cuộc gọi dưới 0p (invalid) và lỗi định dạng giờ gọi (invalid) */
    @Test
    public void invalidMinDurationHourTest(){
        TelFee a = new TelFee(26, 0, -1);
        assertEquals("Định dạng thời gian sai và thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }

    @Test
    public void invalidMinDurationMinuteTest(){
        TelFee a = new TelFee(23, -1, -1);
        assertEquals("Định dạng thời gian sai và thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }

    @Test
    public void invalidMinDurationTimeTest(){
        TelFee a = new TelFee(26, -1, -1);
        assertEquals("Định dạng thời gian sai và thời lượng cuộc gọi phải là số dương", a.finalMessage());
    }

    /** cuộc gọi dưới 60p và lỗi định dạng giờ gọi (invalid) */
    @Test
    public void invalidShortCallTest1(){
        TelFee a = new TelFee(26, 0, 30);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }

    public void invalidShortCallTest2(){
        TelFee a = new TelFee(23, -1, 30);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }

    /** cuộc gọi dài hơn 60p và lỗi định dạng giờ gọi (invalid) */
    @Test
    public void invalidLongCallTest1(){
        TelFee a = new TelFee(30, 0, 80);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }

    public void invalidLongCallTest2(){
        TelFee a = new TelFee(30, -2, 80);
        assertEquals("Định dạng thời gian sai", a.finalMessage());
    }
}