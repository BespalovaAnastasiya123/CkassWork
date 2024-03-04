import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class UndoRedo extends JFrame {

    List<String> commands = Arrays.asList("Open", "Edit", "Save", "Quit", "Copy",
            "Paste", "Insert", "Append", "Delete", "Move");
    private Deque<String> history = new ArrayDeque<>();
    private JList<String> list;
    private int index = 0;

    public UndoRedo(){
        setVisible(true);
        setTitle("Commands History");
        setSize(600, 420);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultListModel<String> model = new DefaultListModel<>();
        list = new JList<String>(model);

        JButton bUndo = new JButton();
        bUndo.setText("Undo");
        bUndo.setBounds(200, 340, 80, 25);

//bUndo.addActionListener (new UndoListener());
        add(bUndo);
        JButton bRedo = new JButton();
        bRedo.setText("Redo");
        bRedo.setBounds(300, 340, 80, 25);

//bRedo.addActionListener(new RedoListener());
        add(bRedo);

        for (int i = 0; i < commands.size(); i++) { //
            JButton button = new JButton();
            button.setText(commands.get(i)); //
            button.setBounds(10, 20 + i * 30, 200, 25);
            String s = commands.get(i); //
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (history.size() >= 5)
                        history.pollLast();
                    history.addFirst(s);
                    model.clear();
                    Object[] items = history.toArray();
                    String[] sitems = Arrays.copyOf(items, items.length, String[].class);
                    model.addAll(Arrays.asList(sitems));
                    ListSelectionModel sm = list.getSelectionModel();
                    sm.clearSelection();                     // clears the selection
                    sm.setSelectionInterval(0, 0);
                    validate();
                }
            });
            add(button);
        }

        list.setBounds(300, 20, 200, 300);
        add(list);
        setLayout(null);
        //validate();
        repaint();
    }

    public static void main(String[] args) {
        UndoRedo undoRedo = new UndoRedo();
    }
}