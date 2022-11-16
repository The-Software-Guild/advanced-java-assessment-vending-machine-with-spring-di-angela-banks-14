package com.ab.vendingmachine.ui;

import com.ab.vendingmachine.ui.UserIO;
import java.math.BigDecimal;
import java.util.Scanner;


public class UserIOImpl implements UserIO{
    Scanner scan;

    public UserIOImpl()
    {
        scan = new Scanner(System.in);
    }

    public void print(String message)
    {
        System.out.println(message);
    }

    public String readString(String prompt)
    {
        System.out.println(prompt);
        return scan.nextLine();
    }

    public int readInt(String prompt)
    {
        System.out.println(prompt);
        return Integer.parseInt(scan.nextLine());
    }

    public int readInt(String prompt, int min, int max)
    {
        int num;
        do {
            System.out.println(prompt);
            num = Integer.parseInt(scan.nextLine());
        }
        while(num < min || num > max);

        return num;
    }

    public double readDouble(String prompt)
    {
        System.out.println(prompt);
        return Double.parseDouble(scan.nextLine());
    }

    public double readDouble(String prompt, double min, double max)
    {
        double num;
        do {
            System.out.println(prompt);
            num = scan.nextInt();
        }
        while(num < min || num > max);

        return num;
    }

    public float readFloat(String prompt)
    {
        System.out.println(prompt);
        return scan.nextFloat();
    }

    public float readFloat(String prompt, float min, float max)
    {
        float num;
        do {
            System.out.println(prompt);
            num = scan.nextFloat();
        }
        while(num < min || num > max);

        return num;
    }

    public long readLong(String prompt)
    {
        System.out.println(prompt);
        return scan.nextLong();
    }

    public long readLong(String prompt, long min, long max)
    {
        long num;
        do {
            System.out.println(prompt);
            num = scan.nextLong();
        }
        while(num < min || num > max);

        return num;
    }

    @Override
    public BigDecimal readBigDecimal(String prompt) {
        System.out.println(prompt);
        return new BigDecimal(scan.nextLine());
    }

    @Override
    public BigDecimal readBigDecimal(String prompt, BigDecimal min, BigDecimal max) {
        BigDecimal num;
        do {
            System.out.println(prompt);
            num = new BigDecimal(scan.nextLine());
        }
        while(num.doubleValue() < min.doubleValue() || num.doubleValue() > max.doubleValue() || num==null);

        return num;
    }
}

