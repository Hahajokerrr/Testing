package org.example;

/**
 * The TelFee is the class that help to calculate the total fee that a customer needs
 * to pay after a telephone call, according to the time the call starts and the duration
 * of the call
 *
 * @author Ngo Tran Anh Phuong
 * @version 1.0
 * @since 2023-9-10
 *
 */

public class TelFee {
    /**
     * The tax that every call needs to be added
     * Static value {@value #TAX}
     */
    public static final double TAX = 1.05;
    /**
     * Static value {@value #FEE}
     */
    public static final double FEE = 0.5;
    /**
     * Static value {@value #TIME_DISCOUNT}
     */
    public static final double TIME_DISCOUNT = 0.5;
    /**
     * Static value {@value #DURATION_DISCOUNT}
     */
    public static final double DURATION_DISCOUNT = 0.85;
    private int hour;
    private int minute;
    private int duration;

    /**
     * Constructor for TelFee class.
     *
     * @param hour: the time on which the call started.
     * @param minute: the time on which the call started.
     * @param duration: the duration of the call.
     */
    public TelFee(int hour, int minute, int duration) {
        this.hour = hour;
        this.minute = minute;
        this.duration = duration;
    }

    /**
     * Calculate the final fee that the customer needs to pay
     *
     * @return the final fee that the customer needs to pay
     */
    public double finalFee() {
        double res = 0;
        double timeDiscount = 1;
        double durationDiscount = 1;
        if(hour >= 18 || hour < 8) {
            timeDiscount = TIME_DISCOUNT;
        }
        if(duration > 60) {
            durationDiscount = DURATION_DISCOUNT;
        }
        res = FEE * duration * timeDiscount * durationDiscount * TAX;
        res = (double) Math.round(res * 100) / 100;
        return res;
    }

    public String finalMessage() {
        String res = "";
        if(hour > 24 || hour < 0 || minute > 59 || minute < 0) {
            res += "Định dạng thời gian sai";
        } else {
            res += finalFee();
        }
        return res;
    }

    /**
     * The function is a getter for hour.
     *
     * @return The hour attribute
     */
    public int getHour() {
        return hour;
    }

    /**
     * The function is a setter for duration.
     *
     * @param hour: set the hour attribute
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * The function is a getter for minute.
     *
     * @return The minute attribute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * The function is a setter for duration.
     *
     * @param minute: set the minute attribute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * The function is a getter for duration.
     *
     * @return The duration attribute
     */
    public int getDuration() {
        return duration;
    }

    /**
     * The function is a setter for duration.
     *
     * @param duration: set the duration attribute
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
