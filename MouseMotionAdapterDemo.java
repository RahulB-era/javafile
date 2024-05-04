import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterDemo extends Frame {
    private Label label;

    public MouseMotionAdapterDemo() {
        setLayout(new FlowLayout());

        label = new Label("Move the mouse over this window");
        add(label);

        addMouseMotionListener(new CustomMouseMotionAdapter());
        
        setTitle("Mouse Motion Adapter Demo");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterDemo();
    }

    class CustomMouseMotionAdapter extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            label.setText("Mouse moved at: (" + e.getX() + ", " + e.getY() + ")");
        }
    }
}
