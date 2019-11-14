//Calculator

import java.awt.*;
import java.applet.*;
public class L19 extends Applet {

    private Label lab;
    private boolean firstDigit = true;
    private float savedValue = 0.0f;
    private String operator = "=";

    private void addButtons(Panel p, String labels) {
        int count = labels.length();
        for (int i=0;i<count;i++)
        p.add (new Button (labels.substring(i,i+1)));
    }

    public void init () {
        setLayout (new BorderLayout());
        add ("North", lab = new Label ("0", Label.RIGHT));
        Panel p = new Panel();
        p.setLayout (new GridLayout (4, 4));
        addButtons (p, "789/");
        addButtons (p, "456*");
        addButtons (p, "123-");
        addButtons (p, ".0=+");
        add ("Center", p);
    }

    public boolean action (Event e, Object o) {
        if (e.target instanceof Button) {
            String s = (String)o;
            if ("0123456789.".contains(s)) {
                if (firstDigit) {
                    firstDigit = false;
                    lab.setText (s);
                } else {
                    lab.setText (lab.getText() + s);
                }
            } else {
                if (!firstDigit) {
                    compute (lab.getText());
                    firstDigit = true;
                }
                operator = s;
            }
            return true;
        }
        return false;
    }

    private void compute (String s) {
        float sValue = Float.parseFloat(s);
        char c = operator.charAt (0);
        switch (c) {
            case '=':   savedValue  = sValue;
                break;
            case '+':   savedValue += sValue;
                break;
            case '-':   savedValue -= sValue;
                break;
            case '*':   savedValue *= sValue;
                break;
            case '/':   savedValue /= sValue;
                break;
        }
        lab.setText (String.valueOf(savedValue));
    }
}
