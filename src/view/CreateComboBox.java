package view;

import javax.swing.*;

public class CreateComboBox {
	JComboBox<?> combo;
	JPanel centerPan;
	String[] menu = {"사용자 등록","직원 추가"};
	public void create() {
		combo = new JComboBox<>(menu);
		centerPan = new JPanel();
		centerPan.add(combo);
	}
}
