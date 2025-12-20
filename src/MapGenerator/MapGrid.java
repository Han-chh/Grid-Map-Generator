package MapGenerator;

import java.awt.*;
import javax.swing.*;

public class MapGrid extends JLabel{
	
	private String feature; // its current condition

	public MapGrid() { //Constructor of grids objects.
		super();
		this.setVisible(false);
		this.feature = "none"; //initiation is none
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setOpaque(true);
	}
	
	
	/*	
		map generating method
		mapPanel: the panel to hold the map
		rows: number of rows
		columns: number of columns	
		cell_size_x: cell width
		cell_size_y: cell height
		returns a 2D array of MapGrid objects
	*/
	public static MapGrid[][] generate(JPanel mapPanel, int rows,int columns, int cell_size_x, int cell_size_y) {

		mapPanel.removeAll();
		mapPanel.repaint();
		mapPanel.setPreferredSize(new Dimension(columns*cell_size_x, rows*cell_size_y));
		mapPanel.setLayout(new GridLayout(rows, columns));
		MapGrid[][] mapGridsList = new MapGrid[rows][columns]; 
		for (int i = 0;i<rows;i++) {
			for (int j = 0;j<columns;j++) {
				mapGridsList[i][j] = new MapGrid();
				mapGridsList[i][j].setPreferredSize(new Dimension(cell_size_x,cell_size_y));
				mapPanel.add(mapGridsList[i][j]);
				mapGridsList[i][j].setVisible(true);
				mapGridsList[i][j].setBackground(Color.WHITE);
			}
		}
		return mapGridsList;
	}
	
	
	public void setFeature(String feature) { //set feature
		this.feature = feature;
	}
	
	
	public String getFeature() {//get feature
		return this.feature;
	}

	
}
