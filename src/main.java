import javax.swing.JFrame;
import Label.*;
public class main {
    public static void main(String[] args) throws Exception {
        LabelFrame labelFrame = new LabelFrame(); // create LabelFrame
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize( 260, 180 ); // set frame size
        labelFrame.setVisible( true ); // display frame
        
        TextFileFrame textFrame = new TextFileFrame();
        textFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        textFrame.setSize(300, 220);
        textFrame.setVisible(true);
        
    }
}






















