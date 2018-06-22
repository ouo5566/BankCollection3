package view;

import javax.swing.*;

public class CreateTxtField {
	JTextField idTxt;
	JPanel idPan;
	public void create() {
		idTxt = new JTextField();
		idPan = new JPanel();
		idPan.add(idTxt);

	}
}
