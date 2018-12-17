package com.tbb.dailytest.test0000;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ImgOperate {

    public static void main(String[] args) throws IOException {

        BufferedImage read = ImageIO.read(new File("D:\\IDEAProject\\dailytest\\src\\main\\resources\\static\\img\\robot.jpg"));

        Graphics graphics = read.getGraphics();
        graphics.setColor(Color.red);
        graphics.setFont(new Font(null, Font.PLAIN, 30));
        String num = new Random().nextInt(10)+"";
        graphics.drawString(num, read.getWidth() - 30, 40);
        graphics.drawImage(read, 0, 0, read.getWidth(), read.getHeight(), null);
        graphics.dispose();

        ImageIO.write(read, "JPEG", new File("D:\\IDEAProject\\dailytest\\src\\main\\resources\\static\\img\\robot2.JPEG"));
    }
}
