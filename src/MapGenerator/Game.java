package MapGenerator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



// TODO：添加长宽参数和validation check


public class Game {
	static Window Win = new Window(); //create the main window
	public static void main(String[] args) {
		
		JButton start = new JButton("start");//start button
		start.setFont(new Font("SanSerif",Font.PLAIN,18));
		Win.infoboard.add(start);
		start.setBounds(30, 30, 100, 50);
		start.addActionListener(new ActionListener() { // add ActionListener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int DEFAULT_ROWS = 20;
				int DEFAULT_COLUMNS = 30;
				int DEFAULT_Cell_SIZE_X = 20;
				int DEFAULT_Cell_SIZE_Y = 20;
				var map = MapGrid.generate(Window.mapPanel, DEFAULT_ROWS, DEFAULT_COLUMNS, DEFAULT_Cell_SIZE_X, DEFAULT_Cell_SIZE_Y);//generate the map
			}
		});		
		
	}
	
}
