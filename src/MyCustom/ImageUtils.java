package MyCustom;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static ImageIcon loadAndScaleImage(String filePath, int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(filePath));
            Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
            // Tạo một BufferedImage mới với kích thước đã chỉ định
            BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            
            // Lấy đối tượng Graphics2D từ BufferedImage mới
            Graphics2D g2d = resizedImage.createGraphics();
            
            // Vẽ lại hình ảnh đã thu nhỏ lên BufferedImage mới để giữ chất lượng hình ảnh
            g2d.drawImage(scaledImage, 0, 0, null);
            g2d.dispose(); // Giải phóng tài nguyên của Graphics2D
            
            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}