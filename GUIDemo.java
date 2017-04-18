import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Minimal Java Swing application.
 * 
 * @author Nathan Sprague
 * 
 */
public class GUIDemo extends JFrame
{
    private JPanel panel;
    private JButton biggerButton;
    private JButton smallerButton;

    /**
     * Set up the application.
     */
    public GUIDemo()
    {
        setTitle("Bigger/Smaller");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        biggerButton = new JButton("BIGGER");
        smallerButton = new JButton("SMALLER");
        biggerButton.addActionListener(ae -> {setSize(getX() + 10, getY() + 10);} );
        smallerButton.addActionListener(ae -> {setSize(getX() - 10, getY() - 10);} );

        add(panel);
        panel.add(biggerButton);
        panel.add(smallerButton);

        setVisible(true);
    }

    /**
     * Start the app by creating a GUIDemo object.
     */
    public static void main(String[] args)
    {
        GUIDemo app = new GUIDemo();
    }
}
