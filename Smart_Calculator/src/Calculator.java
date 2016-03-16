//

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SoRa
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public  static String Mode ="Normal" ;
    private static Double count = 0.0;
    private static String operator = null;
    private static Double number1=0.0,number2=0.0;
    private static Boolean state = false;
    private String reg = "\\-?\\d+(.\\d+)?+";
    private static ArrayList<String> listWithNumbers = new ArrayList<String>();
    private static ArrayList<String> Operators       = new ArrayList<String>();
            
    public Calculator() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor stringToCalculate initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        txtForCalculation = new javax.swing.JTextField();
        btnProduct = new javax.swing.JButton();
        btnLeftBracket = new javax.swing.JButton();
        btnRightBracket = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnMode = new javax.swing.JButton();
        txtMode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatorActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatorActionPerformed(evt);
            }
        });

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatorActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatorActionPerformed(evt);
            }
        });

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        txtForCalculation.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        txtForCalculation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtForCalculationKeyTyped(evt);
            }
        });

        btnProduct.setText("n!");

        btnLeftBracket.setText("(");
        btnLeftBracket.setEnabled(false);
        btnLeftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnRightBracket.setText(")");
        btnRightBracket.setEnabled(false);
        btnRightBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        btnSquareRoot.setText("sqrt()");

        btnBackSpace.setText("Bckspace");
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });

        btnMode.setText("Mode");
        btnMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeActionPerformed(evt);
            }
        });

        txtMode.setText("Normal");
        txtMode.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSquareRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(btnLeftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(btnNine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnSix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(13, 13, 13))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnMode)
                                .addGap(18, 18, 18)
                                .addComponent(txtMode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                            .addComponent(btnSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEquals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMultiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))
                            .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtForCalculation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBackSpace)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackSpace)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtForCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMode)
                    .addComponent(txtMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProduct)
                            .addComponent(btnSquareRoot)
                            .addComponent(btnLeftBracket)
                            .addComponent(btnRightBracket))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThree)
                            .addComponent(btnOne))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeven)
                            .addComponent(btnNine)
                            .addComponent(btnEight))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDot)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear)
                                    .addComponent(btnZero)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeActionPerformed
        if(txtMode.getText().equals("Normal"))
        {
            txtMode.setText("Expert");
            Mode = txtMode.getText();
            txtForCalculation.setText("");
            number1 = 0.0;
            
            btnLeftBracket.setEnabled(true);   // Enable bracket buttons if mode is Expert
            btnRightBracket.setEnabled(true);
            
        }
        else
        {
            txtMode.setText("Normal");
            Mode = txtMode.getText();
            txtForCalculation.setText("");
            number1 = 0.0;
            
            btnLeftBracket.setEnabled(false);  // Disable bracket buttons if mode is Normal
            btnRightBracket.setEnabled(false);
        }
    }//GEN-LAST:event_btnModeActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed
        String textBefore = txtForCalculation.getText();
        if(textBefore.length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Nothing  to delete!"); //Show Alert message if textField is empty
        }
        else
        {
            // Delete the last character . 
            String textAfter = textBefore.substring(0,textBefore.length()-1);
            txtForCalculation.setText(textAfter);
            txtForCalculation.requestFocus();
        }
        
    }//GEN-LAST:event_btnBackSpaceActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
      
        Double result = 0.0 ;
        
        if(txtForCalculation.getText().equals(""))
        {
            // Echo error message if no number is typed in .
            JOptionPane.showMessageDialog(this, "Nothing to calculate!");
        }
         else
         {
            if(Mode.equals("Expert"))
            {
                // Expert method of calculating the result .
                
                String desiredFormat = "\\(\\-?\\d+(.\\d+)?[\\+\\-\\/\\*]\\-?\\d+(.\\d+)?\\)([\\+\\-\\/\\*]\\(\\-?\\d+(.\\d+)?[\\+\\-\\/\\*]\\-?\\d+(.\\d+)?\\))?" ;
                if(txtForCalculation.getText().trim().matches(desiredFormat))
                {
                    calculateExpression();
                    System.out.println("List "+listWithNumbers.toString());
                    System.out.println("Operators "+Operators.toString());

                    
                    // True only if something like this is typed (a+b) .
                    if(Operators.isEmpty()) result = Double.parseDouble(listWithNumbers.get(0));

                    // Iterate through operators list .
                    for(int i=0;i<Operators.size();i++)
                    {
                        // Constuct a string with the first  the operator and the second number .
                        String stringToCalculate = listWithNumbers.get(i)+Operators.get(i)+listWithNumbers.get(i+1);
                        result = calculateResult(stringToCalculate);

                        System.out.println("Result:"+String.valueOf(result));
                        System.out.println("Method inputs:"+String.valueOf(stringToCalculate));
                        
                        // Set the i+1 item on the list equal to the result found above . 
                        listWithNumbers.set(i+1, String.valueOf(result));
                    }

                    // Clear the lists after calculating the result . 
                    txtForCalculation.setText(String.valueOf(result));
                    listWithNumbers.clear();
                    Operators.clear();
                    state = true;
                }
                 else
                {
                    System.out.println("\t\t\t\tSyntax Error");
                    JOptionPane.showMessageDialog(this,"Syntax Error","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                // Normal method of calculating the result
                
                // Get second number
                // Make a string of the two numbers with the operator
                // and call calculateResult method

                
                if(txtForCalculation.getText().matches(reg))
                {
                    number2 = Double.parseDouble(txtForCalculation.getText());
                    String calculateThis = String.valueOf(number1)+operator+String.valueOf(number2);

                    count = calculateResult(calculateThis);
                    txtForCalculation.setText(String.valueOf(count));
                    state = true;
                }
                else JOptionPane.showMessageDialog(this,"Error","Error",JOptionPane.ERROR_MESSAGE);
            
                              
            }
        }  
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // TODO add your handling code here:
        if(state) 
        {
            txtForCalculation.setText(evt.getActionCommand()); 
            state = false;
        }
        else
        {
            txtForCalculation.setText(txtForCalculation.getText()+evt.getActionCommand());
        }
    }//GEN-LAST:event_ButtonActionPerformed

    private void OperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperatorActionPerformed
        // TODO add your handling code here:
        if( Mode.equals("Normal") )
            {
                if(txtForCalculation.getText().matches(reg))
                {
                    // Get operator from evt
                    // Store first number
                    // Clear text
                    operator = evt.getActionCommand();
                    number1 = Double.parseDouble(txtForCalculation.getText());
                    txtForCalculation.setText("");
                }
                else JOptionPane.showMessageDialog(this,"Syntax Error","Error",JOptionPane.ERROR_MESSAGE);

            }
            else txtForCalculation.setText(txtForCalculation.getText()+evt.getActionCommand());
        
        
    }//GEN-LAST:event_OperatorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtForCalculation.setText("");
        count   = 0.0;
        number1 = 0.0;
        number2 = 0.0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtForCalculationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtForCalculationKeyTyped
        String  regex1 = "[\\d\\-\\+\\/\\*().]";
        if(Mode.equals("Expert"))
        {
            if(!String.valueOf(evt.getKeyChar()).matches(regex1))
            {
                evt.consume();   
            }
        }
        else
        {
            if(!String.valueOf(evt.getKeyChar()).matches(regex1) ) evt.consume();
        }
          
    }//GEN-LAST:event_txtForCalculationKeyTyped

    
    private Double calculateResult(String txtToCalculate)
    {
        Double finalResult = 0.0;
        String result[] = null;
        String operator = null;
        
        if          (txtToCalculate.contains("+")) operator = "+";
        else if     (txtToCalculate.contains("-")) operator = "-";
        else if     (txtToCalculate.contains("*")) operator = "*";
        else if     (txtToCalculate.contains("/")) operator = "/";
        result = txtToCalculate.split("\\" + operator);
      
        switch(operator)
        {
            case "+":
                 finalResult = Double.parseDouble( result[0] ) + Double.parseDouble( result[1] ) ;
                break;
            case "-":
                 finalResult = Double.parseDouble( result[0] ) - Double.parseDouble( result[1] ) ;
                break;    
            case "*":
                 finalResult = Double.parseDouble( result[0] ) * Double.parseDouble( result[1] ) ;
                break;
            case "/":
                 finalResult = Double.parseDouble( result[0] ) / Double.parseDouble( result[1] ) ;
                break;
        }
        return finalResult;
        
    }
    
    
    public void calculateExpression()
    {
        String eval = txtForCalculation.getText();
        
        int indexLeft  = 0;
        int indexRight = 0;
        int operator   = -1;
        boolean flag = true;
        
        
        while(flag)
        {
            // Find the indexes of left and right brackets .
            indexLeft  = eval.indexOf("(", indexLeft);
            indexRight = eval.indexOf(")",indexRight);
            
            System.out.println("indexLeft:"+String.valueOf(indexLeft));
            System.out.println("indexRight:"+String.valueOf(indexRight));
            try
            {
                // The operator between expressions is right of right bracket .
                operator   = indexRight+1; 
                
                System.out.println("Operator:"+String.valueOf(operator));
                // Calculate the substring in the brackets and add it to the list
                // also add the operator if exists .
                Double result = calculateResult(eval.substring(indexLeft+1,indexRight));
                listWithNumbers.add(String.valueOf(result));
                Operators.add(String.valueOf(eval.charAt(operator)));
                
                // Increment by one to find the next bracket .
                indexLeft++;
                indexRight++;
                
                // If no char next to right bracket
                // throw an exception and break the loop .
                eval.charAt(indexRight+1); // Throws exception
            }
            catch(Exception e) {break;}
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnLeftBracket;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMode;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRightBracket;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JTextField txtForCalculation;
    private javax.swing.JTextField txtMode;
    // End of variables declaration//GEN-END:variables
}