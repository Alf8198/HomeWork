package ManagerComp;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.*;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class LayoutSample implements ItemListener{

    Panel main_panel,cards;
    final static String BUTTONPANEL = "Card with Buttons";
    final static String TEXTPANEL = "Card with textField";


    public LayoutSample() {
        Frame frame = new Frame("Layout Sample");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        main_panel = new Panel();
        addComponentToPane(main_panel);
        frame.add(main_panel);


        frame.pack();
        frame.setVisible(true);
    }


    private void addComponentToPane(Container pane) {

        Panel comboBoxPane = new Panel();
        String comboBoxItems[] = {BUTTONPANEL, TEXTPANEL};
        Choice cb = new Choice();
        cb.add(BUTTONPANEL);
        cb.add(TEXTPANEL);
        cb.addItemListener(this);
        comboBoxPane.add(cb);

        Panel card1 = new Panel();
        card1.add(new Button("Button 1"));
        card1.add(new Button("Button 2"));
        card1.add(new Button("Button 3"));

        Panel card2 = new Panel();
        card2.add(new TextField("Textfield",20));

        cards = new Panel(new CardLayout());
        cards.add(card1,BUTTONPANEL);
        cards.add(card2,TEXTPANEL);

        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards,BorderLayout.CENTER);
    }


    public void itemStateChanged(ItemEvent itemEvent){
        CardLayout c1 = (CardLayout)(cards.getLayout());
        c1.show(cards,(String)itemEvent.getItem());
    }

    public static void main(String[] args) {
        new LayoutSample();
    }
}
