package counting.view;

import javax.swing.JFrame;
import counting.controller.CountingController;
import java.awt.Dimension;

public class CountingFrame extends JFrame
{
	private CountingController baseController;
	private CountingPanel basePanel;
	
	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new CountingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Recursion");
		this.setSize(new Dimension(500,500));
		this.setResizable(false);
		this.setVisible(true);	
	}
}