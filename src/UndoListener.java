import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static sun.security.util.KeyUtil.validate;

public class UndoListener {
    class UndoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JList<Object> list;
            ListSelectionModel sm = list.getSelectionModel();
            int count = list.getModel().getSize();
            int index;
            System.out.println(index);
            sm.clearSelection();                     // clears the selection
            sm.setSelectionInterval(index, index);
            index++;
            if (index>count-1) index = count-1;
            validate();
        }
    }

    class RedoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ListSelectionModel sm = list.getSelectionModel();
            int count = list.getModel().getSize();
            System.out.println(index);
            sm.clearSelection();                     // clears the selection
            sm.setSelectionInterval(index, index);
            index--;
            if (index<0) index = 0;
            validate();
        }
    }
} 
}
