package org.hsc.form;  

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.util.Env;
import org.hsc.model.MHSCHalqProject;

public class TestForm implements FormPanel {
	/** Context								*/
	protected Properties			p_ctx = Env.getCtx();
	
	String lblCaption[] = { "มีคู่อมือคุณภาพ(QM) ครอบคลุมการผลิตอาหารฮาลาล",
							"มีคู่อมือการปฏิบัติงานครอบคลุมการผลิตอาหารฮาลาล",
							"มีการควบคุมเอกสารและบันทึกการปฎิบัติในการผลิตอาหารฮาลาล"};
	private JLabel lbl[] = new JLabel[3];
	JTabbedPane tab = new JTabbedPane();
	JButton btnOK;
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(int WindowNo, FormFrame frame) {
//		frame.setLayout(new FlowLayout());
		
		tab.addTab("ระบบการบริหารด้านฮาลาล", null);
		tab.addTab("การบริหารทรัพยากร", null);
		Font font = tab.getFont();
		tab.setFont(new Font(font.getName(),Font.BOLD,font.getSize()+5));
		// TODO Auto-generated method stub
//		for (int i = 0; i < lblCaption.length; i++) {
//			lbl[i] = new JLabel(lblCaption[i]);
//			frame.add(lbl[i]);
//		}
//		btnOK = new JButton("OK");
		
//		btnOK.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				MHSCHalqProject project = new MHSCHalqProject(p_ctx, 1000011, null);
//				
//				JOptionPane.showMessageDialog(null, project.getName());
//			}
//			
//		});
		frame.add(tab);
	}

}
