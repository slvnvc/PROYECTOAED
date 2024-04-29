/*package Misc;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TablePuestoCellRenderer extends DefaultTableCellRenderer {
    JButton button = new JButton();

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, row, column);
        
        button.setText("Ver Filtros");
        JPanel ver_filtros = new JPanel();
        ver_filtros.add(button);
        
        return ver_filtros;
    }
}*/
