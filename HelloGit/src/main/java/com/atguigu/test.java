package com.atguigu;

import org.springframework.scheduling.annotation.AbstractAsyncConfiguration;

import java.io.*;
import java.net.URL;
import java.util.List;

/**
 * @author PiaoBo
 * @create 2020-09-15 13:39
 */
public class test {
    public static void main(String[] args) {
        try {
            //String a=getPara("car").substring(1),b="D34567",c="LJeff34",d="iqngfao";
            //String[] args1=new String[]{ "python", "D:\\pyworkpeace\\9_30_1.py", a, b, c, d };
            //Process pr=Runtime.getRuntime().exec(args1);
            String wav_path="E:\\2.wav";
            String npy_path="E:\\2.npy";
            String[] args1 = new String[] { "python", "E:\\pythonproject\\demo.py",wav_path,npy_path };
            Process pr=Runtime.getRuntime().exec(args1);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            pr.waitFor();
            System.out.println("end");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static String getPara(String string) {
        // TODO Auto-generated method stub
        return null;
    }


}
