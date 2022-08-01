package components;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class DateTest extends MouseAdapter{

    // frame
    static JFrame f;

    // label
    static JLabel l, l1;

    // spinner
    static JSpinner s, s1, s2;
    
    JFrame frame = new JFrame();
    Button btn1 = new Button("btn1");
    Button btn2 = new Button("btn2");
    Button btn3 = new Button("btn3");
    Button btn4 = new Button("btn4");
    Button btn5 = new Button("btn5");
    Button btn6 = new Button("btn6");
    Button btn7 = new Button("btn7");
    Button btn8 = new Button("btn8");
    Button btn9 = new Button("btn9");
    public void initComponent(){
        JSpinner spinner = new JSpinner();
        spinner.setValue(2000);
//        spinner.setFont(new Font("Liberation Sans", 0, 6));
        spinner.setBounds(200, 100, 50, 40);
        frame.setLayout(null);
        frame.add(spinner);

        JSlider slider = new JSlider();
        frame.add(slider);
        slider.setBounds(200, 200, 150, 40);
        BoundedRangeModel myModel = new DefaultBoundedRangeModel(){
            public void setValue(int n){
                System.out.println("SetValue:"+n);
                super.setValue(n);
            }
        };
        slider.setModel(myModel);
        
        
        btn1.addMouseListener(this);
        btn2.addMouseListener(this);
        btn3.addMouseListener(this);
        btn4.addMouseListener(this);
        btn5.addMouseListener(this);
        btn6.addMouseListener(this);
        btn7.addMouseListener(this);
        btn8.addMouseListener(this);
        btn9.addMouseListener(this);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        btn1.setBounds(0,0,100,30);
        btn2.setBounds(0,50,100,30);
        btn3.setBounds(0,100,100,30);
        btn4.setBounds(0,150,100,30);
        btn5.setBounds(0,200,100,30);
        btn6.setBounds(0,250,100,30);
        btn7.setBounds(0,300,100,30);
        btn8.setBounds(0,350,100,30);
        btn9.setBounds(0,400,100,30);
        frame.setLayout(null);
        frame.setBounds(0, 0, 600, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DateTest dt = new DateTest();
        dt.initComponent();
        
//        UIDefaults defaults = UIManager.getDefaults();
//        defaults.put("SPinner.previous.background",Color.RED);
//        Font font = new Font("Liberation Sans",0,26);
//        defaults.put("FormattedTextField.font",font);
//        Font font2 = new Font("Liberation Sans",0,6);
//        UIManager.put("Spinner.font",font2);
//        UIManager.put("FormattedTextField.font",font2);
//javax.swing.plaf.windows.MetalLookAndFeel 
//        com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//        com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel 
//                com.sun.java.swing.plaf.motif.MotifLookAndFeel
//                        com.sun.java.swing.plaf.mac.MacLookAndFeel
//                                com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//                                        
//        try {
////            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        
////        UIManager.getSystemLookAndFeelClassName();
////        UIManager.setLookAndFeel();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
//        

        /*UtilDateModel model = new UtilDateModel();
        model.setDate(20,004,2014);
        
        Properties p = new Properties();
        p.put("text.today", "today");
        p.put("text.month", "month");
        p.put("text.year", "year");
        
        JDatePanelImpl datePanel =new JDatePanelImpl(model,p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,null);

*//*        UtilDateModel model = new UtilDateModel();
//model.setDate(20,04,2014); 
// Need this... 
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
// Don't know about the formatter, but there it is... 
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());*//*

        JFrame frame=new JFrame("dee");
//
//        JPanel cp=new JPanel();
//
        DateChooserJButton button=new DateChooserJButton ();
        button.setBounds(300,300,300,300);
        frame.add(button);
//
//        cp.add(button);
//
//        frame.setContentPane(cp);
//
        frame.add(datePicker);
        frame.setBounds(0,0,600,600);
//
        frame.setVisible(true);*/

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if(e.getComponent() == btn1){
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn2){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn3){
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn4){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn5){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn6){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn7){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.mac.MacLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn8){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }else if(e.getComponent() == btn9){
            try {
                String lookAndFeel1 = UIManager.getSystemLookAndFeelClassName();
                LookAndFeel lookAndFeel2 = UIManager.getLookAndFeel();
                UIDefaults lookAndFeel3 = UIManager.getLookAndFeelDefaults();
                UIManager.LookAndFeelInfo[] lookAndFeel4 = UIManager.getInstalledLookAndFeels();
                String lookAndFeel5 = UIManager.getCrossPlatformLookAndFeelClassName();
                LookAndFeel[] lookAndFeel6 = UIManager.getAuxiliaryLookAndFeels();
                System.out.println(lookAndFeel1);
                System.out.println(lookAndFeel2);
                System.out.println(lookAndFeel3);
                System.out.println(lookAndFeel4);
                System.out.println(lookAndFeel5);
                System.out.println(lookAndFeel6);
                
                for(int i = 0;i<lookAndFeel4.length;i++){
                    System.out.println(lookAndFeel4[i]);
                }
                
                UIManager.setLookAndFeel(lookAndFeel1);
                SwingUtilities.updateComponentTreeUI(frame);
            }   catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }                    
    }

}