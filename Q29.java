import java.awt.*;
import java.awt.event.*;

public class Q29
 extends Frame implements ActionListener {
    private Button button;

    public Q29() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Create a button
        button = new Button("Click Me");

        // Add action listener to the button
        button.addActionListener(this);

        // Add the button to the frame
        add(button);

        // Set frame properties
        setTitle("Event Handling Demo");
        setSize(300, 200);
        setVisible(true);
    }

    // Handle button click event
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new Q29();
    }
}
