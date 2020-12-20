package com.company;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class ImageTest {

    public static void main(String[] args) {
                ImageFrame frame = new ImageFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }

}
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        setTitle("ImageTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Добавление компонента к фрейму.

        ImageComponent component = new ImageComponent();
        add(component);
    }
    public static final int DEFAULT_WIDTH = 1024;
    public static final int DEFAULT_HEIGHT = 768;
}
class ImageComponent extends JComponent
{
    public ImageComponent()
    {

        try
        {
            image = ImageIO.read(new File("src/com/company/img01.jpg"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, null);
    }
    private Image image;
}