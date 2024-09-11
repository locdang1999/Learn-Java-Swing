package notepad;

import javax.swing.*;

public class About extends JFrame {

    public About() {
        setBounds(400, 100, 600, 500);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        JLabel headericon = new JLabel(il);
        add(headericon);

        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
