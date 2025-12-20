package MapGenerator;

import java.awt.*;
import javax.swing.*;

import MapGenerator.Window;

public class Window extends JFrame {
	JPanel infoboard = new JPanel();
	static JPanel mapBoarderPanel = new JPanel(); // the panel that has the map border and title and holds the map panel
	static JPanel mapPanel = new JPanel(); // the panel that holds the map grids

	public Window() {    //initiation of the main_window
		super("Map Generator");
		this.setLocation(300,80);
		
		this.setSize(900, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// this.setResizable(false);
		Container c = new Container();
		c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		// set map
		mapBoarderPanel.setPreferredSize(new Dimension(900, 550));
		mapBoarderPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
		mapBoarderPanel.setBorder(BorderFactory.createTitledBorder("MAP"));
		mapBoarderPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		// 不填充，保持自身大小
		gbc.fill = GridBagConstraints.NONE;
		// 权重给 1，让它永远居中
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		mapBoarderPanel.add(mapPanel, gbc);

		//set info_board
		infoboard.setPreferredSize(new Dimension(900, 200));
		infoboard.setMaximumSize(new Dimension(Integer.MAX_VALUE, 200));
		infoboard.setBorder(BorderFactory.createTitledBorder("INFOBOARD"));
		infoboard.setLayout(null);
		
		
		
		c.add(mapBoarderPanel);
		c.add(infoboard);
		
		this.setVisible(true);
	}
}
