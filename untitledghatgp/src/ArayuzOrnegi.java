
    import javax.swing.*;

    public class ArayuzOrnegi {
        public static void main(String[] args) {
            // pencereyi oluştur
            JFrame pencere = new JFrame("Java Arayüz Örneği");

            // pencere boyutunu ayarla
            pencere.setSize(400, 300);

            // pencereyi merkezle
            pencere.setLocationRelativeTo(null);

            // pencereyi görünür yap
            pencere.setVisible(true);

            // metin etiketi oluştur
            JLabel etiket = new JLabel("Merhaba Dünya!");

            // etiketi pencereye ekle
            pencere.add(etiket);

            // düğme oluştur
            JButton dugme = new JButton("Tıkla");

            // düğmeye tıklama olayı dinleyici ekle
            dugme.addActionListener(e -> {
                JOptionPane.showMessageDialog(pencere, "Düğmeye tıklandı!");
            });

            // düğmeyi pencereye ekle
            pencere.add(dugme);
        }
    }

