package com.java2.multifunctional.ushtrime.detyra;

import java.io.*;

public class LineCounter {

    private FileWriter fw;
    private FileReader fr;
    private BufferedReader br;
    private BufferedWriter bw;
    private File file;
    int count = 0;
    int secondCount = 0;

    public LineCounter(String emriFile) throws IOException {
        if (emriFile.trim().isEmpty()) {
            throw new IOException("Path nuk duhet te jete empty");
        }
        file = new File(emriFile);
        fr = new FileReader(file);
        br = new BufferedReader(fr);
    }

    public void write() throws IOException {
        fw = new FileWriter("C:\\Users\\Admin\\Desktop\\iotesting.txt");
        bw = new BufferedWriter(fw);
        bw.write("Numri total i rreshtave ne file: " + count);
        bw.newLine();
        bw.write("Numri total i rreshtave ne file cift dhe permbajne SHK1: " + secondCount);
        bw.close();

    }

    public int countLines()throws IOException {
        String line = null;
        while ((line = br.readLine()) != null) {
            count++;
            if (line.length() % 2 == 0 && line.contains("SHK1")) {
                secondCount++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            LineCounter lineCounter = new LineCounter("C:\\Users\\Admin\\Desktop\\testleximi.txt");
            lineCounter.countLines();
            lineCounter.write();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
