/*
 * MainInfoView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import win.wangshengan.hotelhousing.util.ViewUtil;

/**
 *
 * @author  __USER__
 */
public class MainInfoView extends javax.swing.JPanel {

	/** Creates new form MainInfoView */
	public MainInfoView() {
		initComponents();
		this.setSize(650, 624);
		this.setOpaque(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();

		jLabel1.setFont(new java.awt.Font("������κ", 0, 36));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u6b22\u8fce\u6765\u5230\u4e91\u5c1a\u5b89\u4f73\u9152\u5e97");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(135, 135, 135)
						.addComponent(jLabel1)
						.addContainerGap(143, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jLabel1)
						.addContainerGap(586, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables

}