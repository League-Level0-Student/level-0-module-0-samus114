import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	String sas=JOptionPane.showInputDialog("knock knock");
if (sas.equals("who's there?")) {
JOptionPane.showInputDialog("banana");
}else {
	JOptionPane.showMessageDialog(null, "you failed");
}


}
}
