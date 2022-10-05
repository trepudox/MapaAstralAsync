package com.lacoste.io;

import com.lacoste.io.runners.FileIO;
import com.lacoste.io.runners.Lambda;
import com.lacoste.io.runners.Stream;

public class App {

    public static void main(String[] args) throws Exception {

        FileIO.run();
        Lambda.run();
        Stream.run();

    }

}