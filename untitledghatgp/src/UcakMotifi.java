import java.awt.*;
public class UcakMotifi{

    public static class ucakmotifi extends Frame {

        public ucakmotifi() {
            setTitle("Uçak Motifi");
            setSize(500, 500);
            setVisible(true);
        }

        public void paint(Graphics g) {
            g.setColor(Color.DARK_GRAY); // gövde rengi
            g.fillRect(150, 150, 200, 50); // gövde
            g.fillRect(200, 100, 100, 50); // kokpit
            g.fillRect(275, 175, 50, 25); // kuyruk
            g.setColor(Color.BLACK); // kanat rengi
            g.fillRect(125, 150, 25, 125); // sol kanat
            g.fillRect(350, 150, 25, 125); // sağ kanat
        }

        public static void main(String[] args) {
            new ucakmotifi();
        }
    }

}
