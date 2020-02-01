package panels;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StartPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel promptLabel;
	private JLabel spinnerLabel;
	private JLabel infoLabel;
	private JSpinner spinner;

	public StartPanel() {
		
		promptLabel = new JLabel("Press spacebar to start", SwingConstants.CENTER);
		spinnerLabel = new JLabel("Number of trials: ", SwingConstants.RIGHT);
		infoLabel = new JLabel("Press 'x' to stop early at any time.");
		spinner = new JSpinner();
		spinner.setValue(10);
		JLabel spinnerEditor = new JLabel(spinner.getValue().toString());
		
		spinner.addChangeListener(e->spinnerEditor.setText(spinner.getValue().toString()));
		
		
		spinner.setEditor(spinnerEditor);
		
		Border border = BorderFactory.createCompoundBorder(new EtchedBorder(), new EmptyBorder(10, 10, 10, 10));
		promptLabel.setBorder(border);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.NONE;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0.0;
		gc.weighty = 0.4;
		gc.anchor = GridBagConstraints.SOUTH;
		
		gc.gridwidth=2;
		add(promptLabel, gc);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		controlPanel.add(spinnerLabel);
		controlPanel.add(spinner);
		
		gc.gridy++;
		gc.anchor = GridBagConstraints.NORTH;
		gc.insets = new Insets(20, 0, 0, 0);
		add(controlPanel, gc);
		
		gc.gridy++;
		gc.gridwidth = 2;
		add(infoLabel, gc);
	}
	
	public int getNumTests() {
		return (int)spinner.getValue();
	}
}
