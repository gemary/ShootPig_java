import GUI.MainForm;

public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainForm startUI = new MainForm();
                startUI.setVisible(true);
            }
        });
    }
}
