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

/**
 * 
 * GridBagLayout lets us add components in a grid. See Java docs for more info.
 * We will use only three cells, in a column.
 * 
 * This panel contains labels, plus a spinner for configuring the number of trials.
 *
 */

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
		
		// Set the spinner editor to a (non-editable) JLabel. Then the spinner
		// can be adjusted via the up-down control, but values can't be edited via
		// the keyboard. This ensures that we don't have to validate keyboard entry,
		// plus it won't consume our spacebar clicks and prevent them from reaching
		// MainFrame.
		JLabel spinnerEditor = new JLabel(spinner.getValue().toString());
		spinner.addChangeListener(e->spinnerEditor.setText(spinner.getValue().toString()));
		
		spinner.setEditor(spinnerEditor);
		
		Border border = BorderFactory.createCompoundBorder(new EtchedBorder(), new EmptyBorder(10, 10, 10, 10));
		promptLabel.setBorder(border);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.fill = GridBagConstraints.NONE; // Let components be their preferred size.
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0.0;
		
		// Anything would work here since it's the same for all components.
		/// The weights determine how much space cells take up.
		gc.weighty = 0.5; 
		
		// Set the prompt text to align near the bottom of the first cell.
		gc.anchor = GridBagConstraints.SOUTH;

		add(promptLabel, gc);
		
		// To get the spinner and text next to it to align, add them both to JPanel.
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		controlPanel.add(spinnerLabel);
		controlPanel.add(spinner);
		
		// Move one cell down.
		gc.gridy++;
		
		// Put this panel near the top of the second cell down.
		gc.anchor = GridBagConstraints.NORTH;
		
		// Add a bit of padding above this panel.
		gc.insets = new Insets(20, 0, 0, 0);
		add(controlPanel, gc);
		
		// Finally, add a bit of info text underneath all of the above.
		gc.gridy++;
		add(infoLabel, gc);
	}
	
	public int getNumTests() {
		return (int)spinner.getValue();
	}
}
