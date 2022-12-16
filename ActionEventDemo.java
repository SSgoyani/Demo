import java.awt.*;
import java.awt.Frame;

class ActionEventDemo extends Frame{
    private Button closeBtn;
    public ActionEventDemo(String label){
        setTitle(label);
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        closeBtn = new Button("Close");
        add(closeBtn);
    }
    public void actionPerformed(ActionEvent ae){
        String cmd = ae.getActionCommand();
        if(cmd.equals("Close")){
            System.exit(0); 
        }
    }
    public static void main(String[] args){
    new ActionEventDemo("Action Demo");
    }
}