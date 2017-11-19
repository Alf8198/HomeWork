package Learning_AWT;

import java.awt.*;
import java.awt.event.*;

public class JavaApplication1 extends Frame {

    public JavaApplication1() {
        setTitle("Test window");//создаем окно
        setSize(500, 500);//размер окно
        Button b1 = new Button("Увеличить текст");
        Button b2 = new Button("Уменьшить текст");
        TextArea ta = new TextArea("Введите текст");//окно текста
        setLayout(new BorderLayout());
        Panel panel = new Panel(new BorderLayout());//панель ввода текста
        Panel panel1 = new Panel(); // панель с кнопками

        MenuBar menu_bar = new MenuBar();
        setMenuBar(menu_bar);

//        FileDialog d = new FileDialog(this);//Frame
//        d.setDirectory("D:\\");
//        d.setFile("*.txt;*.xml;*.log;*.exe");
//        d.setVisible(true);
//        System.out.println(d.getDirectory() + d.getFile());


        Menu menuFile = new Menu("File");//менюбар
        menu_bar.add(menuFile);
        MenuItem openMenuItem = new MenuItem("Open");
        menuFile.add(openMenuItem);
        openMenuItem.setActionCommand("Open");

        menuFile.add(new MenuItem("New", new MenuShortcut(KeyEvent.VK_CONTROL + KeyEvent.VK_N)));
        //menuFile.add(new MenuItem("Open", new MenuShortcut(KeyEvent.VK_CONTROL + KeyEvent.VK_O)));
        menuFile.add(new MenuItem("Save", new MenuShortcut(KeyEvent.VK_CONTROL + KeyEvent.VK_S)));
        menuFile.add(new MenuItem("Save all"));
        menuFile.add(new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_ALT + KeyEvent.VK_F4)));

        Menu file_menu1 = menu_bar.add(new Menu("Edit"));
        file_menu1.add(new MenuItem("Copy"));
        file_menu1.add(new MenuItem("Paste"));
        file_menu1.add(new MenuItem("Cut"));

        Menu file_menu2 = menu_bar.add(new Menu("Help"));
        file_menu2.add(new MenuItem("Help"));
        file_menu2.add(new MenuItem("Keymap"));
        file_menu2.add(new MenuItem("About"));
// переопределение
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setFont(new Font("Areal", Font.BOLD, ta.getFont().getSize() + 1));//нужно увеличить размер шрифта при каждом нажатии через счетчик
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("Areal", Font.BOLD, ta.getFont().getSize() - 1));
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_F4 + KeyEvent.VK_ALT) {
                    dispose();
                }
                if(ke.getKeyCode() == KeyEvent.VK_CONTROL + KeyEvent.VK_N){
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
                //закрыть окно
            }
        });

        panel.add(panel1, BorderLayout.SOUTH);
        panel.add(ta, BorderLayout.CENTER);

        panel1.add(b1);
        panel1.add(b2);

        add(panel);//добавление на глав панель

        setVisible(true);//запуск окна
    }

    private void addKeyListener(KeyAdapter l) {
    }


    public static void main(String[] args) {
        JavaApplication1 j = new JavaApplication1();
        //Frame frame = new Frame();

    }
}