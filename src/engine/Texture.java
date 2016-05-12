package src.engine;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Texture
{
    private int size;
    private int[] pixels;
    private String path;

    public static ArrayList<Texture> textures = new ArrayList<Texture>() {{
    add(new Texture("res/wood.jpg", 64));
    add(new Texture("res/redbrick.jpg", 64));
    add(new Texture("res/bluestone.jpg", 64));
    add(new Texture("res/greystone.jpg", 64));
    }};

    public Texture(String pa, int s)
    {
        size = s;
        pixels = new int[s * s];
        path = pa;
        readImg();
    }

    public int getPixelAt(int p)
    {
        return pixels[p];
    }

    public int getSize()
    {
        return size;
    }

    private void readImg()
    {
        try
        {
            BufferedImage buffImg = ImageIO.read(new File(path));
            int width = buffImg.getWidth();
            int height = buffImg.getHeight();
            buffImg.getRGB(0, 0, width, height, pixels, 0, width);
        }
        catch (IOException e) // happens when the file cannot be found
        {
            e.printStackTrace();
        }
    }
}

