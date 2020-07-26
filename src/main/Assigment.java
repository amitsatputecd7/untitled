package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 class Assigment extends Thread
{
    @Override
    public void run() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C://Users//CAP//IdeaProjects//untitled//src//dataFiles//Academic_record.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                Thread.sleep(50);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 class Assigment1 extends Thread
{
    @Override
    public void run() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C://Users//CAP//IdeaProjects//untitled//src//dataFiles//Personal_record.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                Thread.sleep(50);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Assigment t1=new Assigment();
        Assigment1 t2=new Assigment1();
        t1.start();
        t2.start();
//        while (t1.isAlive() || t2.isAlive())
//        {
//            if (t1.isAlive())
//            {
//                t1.interrupt();
//                try {
//                    t2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            else {
//                t2.interrupt();
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }

    }
}