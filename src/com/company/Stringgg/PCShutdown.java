package com.company.Stringgg;

import java.io.*;
import java.util.*;

public class PCShutdown {
    public static void main(String[] args) throws IOException{

        Runtime run = Runtime.getRuntime();

        BufferedReader buffreader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the no. of seconds after which you want your computer to shutdown: ");

        long a = Long.parseLong(buffreader.readLine());

        Process pro = run.exec("shutdown -s -t "+a);

        System.exit(0);
    }

}