package Label;
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.JTextField;
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images


public class LabelFrame extends JFrame
{
    private JTextField textField; 
    private JLabel label1; // JLabel with just text
    private JLabel label2; // JLabel constructed with text and icon
    private JLabel label3; // JLabel with added text and icon
// LabelFrame constructor adds JLabels to JFrame
    public LabelFrame()
    {
        super( "Testing JLabel" );
        setLayout( new FlowLayout() ); // set frame layout
        // JLabel constructor with a string argument
        textField = new JTextField( "Watch the font style change", 20 );
        //textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
        add( textField );
        label1 = new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        add( label1 ); // add label1 to JFrame
        // JLabel constructor with string, Icon and alignment arguments
        ImageIcon bug = new ImageIcon( getClass().getResource( "bug.png" ) );
        bug = scaleImage(bug, 50, 35);
    

        label2 = new JLabel( "Label with text and icon", bug, SwingConstants.LEFT );
        label2.setToolTipText( "This is label2" );
        add( label2 ); // add label2 to JFrame
        label3 = new JLabel(); // JLabel constructor no arguments
        label3.setText( "Label with icon and text at bottom" );
        //label3.setIcon( bug ); // add icon to JLabel
        label3.setHorizontalTextPosition( SwingConstants.LEFT );
        label3.setVerticalTextPosition( SwingConstants.BOTTOM );
        label3.setToolTipText( "This is label3" );
        add( label3 ); // add label3 to JFrame
    }
    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, java.awt.Image.SCALE_DEFAULT));
    }
}









