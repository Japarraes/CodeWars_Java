package RgbToHex;

import java.awt.*;

public class RgbToHex {

    public static void main(String[] args) {
        System.out.println(rgb(254, 253, 252));
    }

    public static String rgb(int r, int g, int b) {

        int[] rgbNumbers = new int[3];
        rgbNumbers[0] = r;
        rgbNumbers[1] = g;
        rgbNumbers[2] = b;

        //Valid decimal values for RGB are 0 - 255.
        // Any values that fall out of that range must be rounded to the closest valid value.
        for (int i = 0; i < rgbNumbers.length; i++) {
            if (rgbNumbers[i] < 0) {
                rgbNumbers[i] = 0;
            } else if (rgbNumbers[i] > 255) {
                rgbNumbers[i] = 255;
            }
        }

        Color color = new Color(rgbNumbers[0], rgbNumbers[1], rgbNumbers[2]);
        String hex = Integer.toHexString(color.getRGB() & 0xffffff);

        // Add Zero to get 6 digits code
        for (int i=hex.length(); i<6; i++) {
            hex = "0" + hex;
        }

        return hex.toUpperCase();

    }
}
