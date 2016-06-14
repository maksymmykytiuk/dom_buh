package ui.control;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


class colorIcon {
    static final int COLUMNS_COUNT = 15;

    static List<File> fileList = new ArrayList<>();

    private static void outputImages(File dir) {
        for (File subDir : dir.listFiles()) {
            if (subDir.getName().contains("hdpi")) {
                File pngFile = subDir.listFiles()[0];
                fileList.add(pngFile);
                break;
            }
            if (subDir.isDirectory()) {
                outputImages(subDir);
            }
        }
    }

    private static void painter(String DIR_WITH_GRAY_IMAGES, String OUTPUT_DIR, Color myColor) throws Throwable {
        File dirWithImages = new File(DIR_WITH_GRAY_IMAGES);
        File outputDir = new File(OUTPUT_DIR);
        String nameFolder = Integer.toHexString(myColor.getRGB());

        for (File subDir : dirWithImages.listFiles()) {
            for (File drawable : subDir.listFiles()) {
                System.out.println(drawable);
                System.out.println(drawable);
                BufferedImage okImage = handlePngFile(drawable, myColor);
                String partPath = drawable.getAbsolutePath().replace(dirWithImages.getAbsolutePath(), "");
                File newPngPath = new File(outputDir.getAbsolutePath() + "\\" + nameFolder + "\\" + partPath);
                newPngPath.mkdirs();
                ImageIO.write(okImage, "png", newPngPath);
            }
        }

        File targetDir = new File(outputDir, "\\" + nameFolder);
        outputImages(targetDir);
        ImageIO.write(getComplexImage(), "png", new File(targetDir, "all.png"));
    }

    private static BufferedImage getComplexImage() {
        BufferedImage bufferedImage = new BufferedImage(800, 500, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImage.getGraphics();

        int i = 0;
        int j = 0;
        int counter = 0;
        try {
            for (File pngFile : fileList) {
                BufferedImage image = ImageIO.read(pngFile);
                g.drawImage(image, i, j, null);
                i += image.getWidth();
                counter++;
                if (counter == COLUMNS_COUNT) {
                    i = 0;
                    counter = 0;
                    j += image.getHeight();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }

    private static BufferedImage handlePngFile(File pngFile, Color myColor) {
        try {
            BufferedImage image = ImageIO.read(pngFile);

            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getHeight(); j++) {
                    Color pixelColor = new Color(image.getRGB(i, j), true);

                    int a = pixelColor.getAlpha();
                    //a += 50;//Повышаем интенсивность - уменьшаем прозрачность

                    if (pixelColor.getRed() != 0) {
                        int r = myColor.getRed();
                        int g = myColor.getGreen();
                        int b = myColor.getBlue();
                        Color newColor = new Color(r, g, b, a);
                        image.setRGB(i, j, newColor.getRGB());
                    }
                }
            }
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}