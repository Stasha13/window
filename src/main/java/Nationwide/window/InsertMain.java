package Nationwide.window;

import java.awt.*;

public class InsertMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frame F=new Frame("Database Application");
        TextField regno,name,marks;
        Label L1,L2,L3;
        Button Btn=new Button("save");
        WindowHandler wevent=new WindowHandler();
        
        regno=new TextField(10);
        name=new TextField(10);
        marks=new TextField(10);
        
        DataEntry event=new DataEntry(regno,name,marks);
        Btn.addActionListener(event);
        
        F.addWindowListener(wevent);
        F.setLayout(   new GridLayout(4,2)  );
        F.add(new Label("Regno"));
        F.add(regno);
        F.add(new Label("name"));
        F.add(name);
        F.add(new Label("marks"));
        F.add(marks);
        F.add(new Label());
        F.add(Btn);
        F.setSize(400,400);
        F.setVisible(true);
        
    }

}