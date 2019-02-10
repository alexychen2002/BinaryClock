package binaryclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class Window implements ActionListener{

    int secondValue1 = 0;
    int secondValue2 = 0;
    int secondValue3 = 0;
    int secondValue4 = 0;
    int secondValue5 = 0;
    int secondValue6 = 0;
    int secondValue7 = 0;
    int minuteValue1 = 0;
    int minuteValue2 = 0;
    int minuteValue3 = 0;
    int minuteValue4 = 0;
    int minuteValue5 = 0;
    int minuteValue6 = 0;
    int minuteValue7 = 0;
    
    int hourValue1 = 0;
    int hourValue2 = 0;
    int hourValue3 = 0;
    int hourValue4 = 0;
    int hourValue5 = 0;
    int hourValue6 = 0;
    int hourValue7 = 0;
    
    JFrame window = new JFrame("Binary Clock");
    JPanel borderPanel = new JPanel (new BorderLayout());
    JPanel mainPanel = new JPanel(new GridLayout(1,3));
    JPanel hoursPanel = new JPanel(new GridLayout(2,1));
    JPanel minutesPanel = new JPanel(new GridLayout(2,1));
    JPanel secondsPanel = new JPanel(new GridLayout(2,1));
    JPanel hourLabelPanel = new JPanel(new GridLayout(4,2));
    JPanel minuteLabelPanel = new JPanel(new GridLayout(4,2));
    JPanel secondLabelPanel = new JPanel(new GridLayout(4,2));
    JButton addSeconds = new JButton("Add a second");
    JLabel hoursLabel = new JLabel("Hours");
    JLabel minutesLabel = new JLabel("Minutes");
    JLabel secondsLabel = new JLabel("Seconds");
    
    JLabel hourLabel1 = new JLabel("" + hourValue1);
    JLabel hourLabel2 = new JLabel("" + hourValue2);
    JLabel hourLabel3 = new JLabel("" + hourValue3);
    JLabel hourLabel4 = new JLabel("" + hourValue4);
    JLabel hourLabel5 = new JLabel("" + hourValue5);
    JLabel hourLabel6 = new JLabel("" + hourValue6);
    JLabel hourLabel7 = new JLabel("" + hourValue7);
    JLabel hourLabel8 = new JLabel("0");
    JLabel minuteLabel1 = new JLabel("" + minuteValue1);
    JLabel minuteLabel2 = new JLabel("" + minuteValue2);
    JLabel minuteLabel3 = new JLabel("" + minuteValue3);
    JLabel minuteLabel4 = new JLabel("" + minuteValue4);
    JLabel minuteLabel5 = new JLabel("" + minuteValue5);
    JLabel minuteLabel6 = new JLabel("" + minuteValue6);
    JLabel minuteLabel7 = new JLabel("" + minuteValue7);
    JLabel minuteLabel8 = new JLabel("0");
    JLabel secondLabel1 = new JLabel("" + secondValue1);
    JLabel secondLabel2 = new JLabel("" + secondValue2);
    JLabel secondLabel3 = new JLabel("" + secondValue3);
    JLabel secondLabel4 = new JLabel("" + secondValue4);
    JLabel secondLabel5 = new JLabel("" + secondValue5);
    JLabel secondLabel6 = new JLabel("" + secondValue6);
    JLabel secondLabel7 = new JLabel("" + secondValue7);
    JLabel secondLabel8 = new JLabel("0");
    
    Timer timer = new Timer(1000, this);

   
public Window () {
        
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(borderPanel);
        borderPanel.add(mainPanel);
        mainPanel.add(hoursPanel);
        mainPanel.add(minutesPanel);
        mainPanel.add(secondsPanel);
        borderPanel.add(addSeconds, BorderLayout.SOUTH);
        hoursPanel.add(hoursLabel);
        minutesPanel.add(minutesLabel);
        secondsPanel.add(secondsLabel);
        hoursPanel.add(hourLabelPanel);
        minutesPanel.add(minuteLabelPanel);
        secondsPanel.add(secondLabelPanel);
        
        hourLabelPanel.add(hourLabel8);
        hourLabelPanel.add(hourLabel4);
        hourLabelPanel.add(hourLabel7);
        hourLabelPanel.add(hourLabel3);
        hourLabelPanel.add(hourLabel6);
        hourLabelPanel.add(hourLabel2);
        hourLabelPanel.add(hourLabel5);
        hourLabelPanel.add(hourLabel1);
        
        minuteLabelPanel.add(minuteLabel8);
        minuteLabelPanel.add(minuteLabel4);
        minuteLabelPanel.add(minuteLabel7);
        minuteLabelPanel.add(minuteLabel3);
        minuteLabelPanel.add(minuteLabel6);
        minuteLabelPanel.add(minuteLabel2);
        minuteLabelPanel.add(minuteLabel5);
        minuteLabelPanel.add(minuteLabel1);
        
        secondLabelPanel.add(secondLabel8);
        secondLabelPanel.add(secondLabel4);
        secondLabelPanel.add(secondLabel7);
        secondLabelPanel.add(secondLabel3);
        secondLabelPanel.add(secondLabel6);
        secondLabelPanel.add(secondLabel2);
        secondLabelPanel.add(secondLabel5);
        secondLabelPanel.add(secondLabel1);
        
        hoursPanel.setBackground(Color.RED);
        secondsPanel.setBackground(Color.BLUE);
        minutesPanel.setBackground(Color.YELLOW);
        
        addSeconds.addActionListener(this);
        timer.start();
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
    //if (e.getSource() == addSeconds)     
    { 
            secondValue1++;
            secondLabel1.setText("" + secondValue1);
            secondLabel2.setText("" + secondValue2);
            secondLabel3.setText("" + secondValue3);
            secondLabel4.setText("" + secondValue4);
            secondLabel5.setText("" + secondValue5);
            secondLabel6.setText("" + secondValue6);
            secondLabel7.setText("" + secondValue7);
            minuteLabel1.setText("" + minuteValue1);
            minuteLabel2.setText("" + minuteValue2);
            minuteLabel3.setText("" + minuteValue3);
            minuteLabel4.setText("" + minuteValue4);
            minuteLabel5.setText("" + minuteValue5);
            minuteLabel6.setText("" + minuteValue6);
            minuteLabel7.setText("" + minuteValue7);
            hourLabel1.setText("" + hourValue1);
            hourLabel2.setText("" + hourValue2);
            hourLabel3.setText("" + hourValue3);
            hourLabel4.setText("" + hourValue4);
            hourLabel5.setText("" + hourValue5);
            hourLabel6.setText("" + hourValue6);
            hourLabel7.setText("" + hourValue7);
            
            if (secondValue1 == 1) {
                secondValue1-=2;
                secondValue2++;
            }
            
            if (secondValue2 == 2) {
                secondValue2 = 0;
                secondValue3++;
            }
            if (secondValue3 == 2) {
                secondValue3 = 0;
                secondValue4++;
            }
            if (secondValue4==1 && secondValue2==1) {
                secondValue2 = 0;
                secondValue3 = 0;
                secondValue4 = 0;
                secondValue5++;
            }
            if (secondValue5==2) {
                secondValue5 = 0;
                secondValue6++;
            }
            if (secondValue6==2) {
                secondValue6 = 0;
                secondValue7++;
            }
            if  (secondValue6==1 && secondValue7==1) {
                secondValue7 = 0;
                secondValue6 = 0;
                secondValue5 = 0;
                minuteValue1++;
            }
            
            if (minuteValue1 == 2) {
                minuteValue1-=2;
                minuteValue2++;
            }
            
            if (minuteValue2 == 2) {
                minuteValue2 = 0;
                minuteValue3++;
            }
            if (minuteValue3 == 2) {
                minuteValue3 = 0;
                minuteValue4++;
            }
            if (minuteValue4==1 && minuteValue2==1) {
                minuteValue2 = 0;
                minuteValue3 = 0;
                minuteValue4 = 0;
                minuteValue5++;
            }
            if (minuteValue5==2) {
                minuteValue5 = 0;
                minuteValue6++;
            }
            if (minuteValue6==2) {
                minuteValue6 = 0;
                minuteValue7++;
            }
            if  (minuteValue6==1 && minuteValue7==1) {
                minuteValue7 = 0;
                minuteValue6 = 0;
                minuteValue5 = 0;
                hourValue1++;
            }
            
            if (hourValue1 == 2) {
                hourValue1-=2;
                hourValue2++;
            }
            
            if (hourValue2 == 2) {
                hourValue2 = 0;
                hourValue3++;
            }
            if (hourValue3 == 2) {
                hourValue3 = 0;
                hourValue4++;
            }
            if (hourValue4==1 && hourValue2==1) {
                hourValue2 = 0;
                hourValue3 = 0;
                hourValue4 = 0;
                hourValue5++;
            }
            if (hourValue5==2) {
                hourValue5 = 0;
                hourValue6++;
            }
            if (hourValue6==2) {
                hourValue6 = 0;
                hourValue7++;
            }
            if  (hourValue6==1 && hourValue7==1) {
                hourValue7 = 0;
                hourValue6 = 0;
                hourValue5 = 0;
                hourValue1++;
            }
            
    }
    
  }
    
}
