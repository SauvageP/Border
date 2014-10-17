package border;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A frame with radio buttons to pick a border style.
 */

public class BorderFrame extends JFrame {
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame() throws HeadlessException {
        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Lowered bevel", BorderFactory.createLoweredBevelBorder());
        addRadioButton("Raised bevel", BorderFactory.createRaisedBevelBorder());
        addRadioButton("Etched bevel", BorderFactory.createEtchedBorder());
        addRadioButton("Line bevel", BorderFactory.createLineBorder(Color.BLUE));
        addRadioButton("Matte bevel", BorderFactory.createMatteBorder(10,10,10,10, Color.BLUE));
        addRadioButton("Empty bevel", BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched,"Border Types");
        buttonPanel.setBorder(titled);

        setLayout(new GridLayout(2,1));
        add(buttonPanel);
        add(demoPanel);
        pack();
    }

    public void addRadioButton(String buttonName, final Border b) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demoPanel.setBorder(b);
            }
        });
        group.add(button);
        buttonPanel.add(button);
    }
}
