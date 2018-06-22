package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateLabel {
	JLabel idLab;
	JPanel idPan;
	public void create() {
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idPan = new JPanel();
		idPan.add(idLab);
		
	}
}
