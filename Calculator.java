public class Calculator implements ActionListener{

    // GUI 
    //swing
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        float num1 = Float.parseFloat(txtNum1.getText());
        float result = 0;

        String operation = cmbChoose.getSelectedItem().toString();
        switch(operation) {
            case "Add":
                result = num1 + num2;
                break;
            case "Subtract":

                break;
        
            default:
                break;
        }

        String strResult = String.valueOf(result);
        txtResult.setText(strResult);

    }
}
