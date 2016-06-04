package com.company;

import com.company.basic;
import java.util.*;

/**
 * Package com.company
 * Created by trevor2076 on 6/1/16/Jun/2016}.
 * <p>
 * The following code may not be used without the explicit permission of trevor2076
 */
public class normal {

    com.company.basic basic = new basic();

    public static void main(String[] args) {


        Dictionary dict = new Hashtable();


    }


    public String encryptCustom(String message1) {
        String message = message1;
        message.toString();
        Hashtable<String, String> localParams;
        Dictionary dict = new Hashtable<String, String>();
        dict.put("a", "1");
        dict.put("b", "2");
        dict.put("c", "3");
        dict.put("d", "5");
        dict.put("e", "8");
        dict.put("f", "13");
        dict.put("g", "21");
        dict.put("h", "55");
        dict.put("i", "76");
        dict.put("j", "131");
        dict.put("k", "207");
        dict.put("l", "241");
        dict.put("m", "448");
        dict.put("n", "689");
        dict.put("o", "27,834");
        dict.put("p", "45,127");
        dict.put("q", "72,961");
        dict.put("r", "117,088");
        dict.put("s", "190,049");
        dict.put("t", "380,098");
        dict.put("u", "570,147");
        dict.put("v", "1,140,294");
        dict.put("w", "1,710,441");
        dict.put("x", "2,850,735");
        dict.put("y", "4,561,176");
        dict.put("z", "7,411,911");

        String finalResult = "";
        for (int i = 0; i < message.length(); i++) {
            message.toLowerCase();
            String thing = basic.encrypt(message, i);
            String endy = String.valueOf(dict.get(thing));
            finalResult = finalResult + " " + endy;
        }
    return finalResult;
    }


}


