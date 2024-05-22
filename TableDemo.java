import javax.swing.*; 

public class TableDemo extends JInternalFrame{
    //public JTable(Object[][] rowData, Object[] columnNames)
    String[] colNames = {"Id", "Name", "Age"};
    String[][] rows = new String[][]{
        {"S-101", "Ram", "23"},
        {"S-102", "Shyam", "20"},
        {"S-103", "Hari", "21"},
    };


    JTable tblStudent;
    JPanel p;

    public TableDemo(){
        //JInternalFrame(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable)
        super("Student Report", true, true, true, true);
        tblStudent = new JTable(rows, colNames);
        p= new JPanel();
        JScrollPane sp = new JScrollPane(tblStudent);
        p.add(sp);
        add(p);
        setVisible(true);
        pack();
    }

   /** public static void main(String[] args){
        new TableDemo();
    }**/
}

//D:\BCA_Java\TableDemo.java