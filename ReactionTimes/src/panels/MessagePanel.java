package panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MessagePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel titleLabel;

	public MessagePanel(String title, String subtitle) {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0.0;
		gc.weighty = 0.0;
		
		if(subtitle == null) {
			titleLabel = new JLabel(title, SwingConstants.CENTER);
			add(titleLabel, gc);
		}
		else {
		
			titleLabel = new JLabel(title, SwingConstants.CENTER);
			add(titleLabel, gc);
			
			gc.gridy++;
			JLabel subtitleLabel = new JLabel(subtitle, SwingConstants.CENTER);
			add(subtitleLabel, gc);
			
		}
	}
	
	public void setTitle(String text) {
		titleLabel.setText(text);
	}
}
