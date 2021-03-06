/*
 * UserSelInfoView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import win.wangshengan.hotelhousing.business.UserzBuss;
import win.wangshengan.hotelhousing.business.impl.UserzBussImpl;
import win.wangshengan.hotelhousing.entity.Userz;

/**
 *
 * @author  __USER__
 */
public class UserSelInfoView extends javax.swing.JPanel {

	String id = "";
	UserzBuss userBuss = new UserzBussImpl();

	//无参构造
	public UserSelInfoView() {

	}

	/** Creates new form UserSelInfoView */
	public UserSelInfoView(String id) {
		this.id = id;
		initComponents();
		intoUserInfo();
		this.setSize(638, 624);
		this.setOpaque(false);
	}

	/**
	 * 初始化信息
	 */
	private void intoUserInfo() {
		Userz user = userBuss.getUserzById(id);
		lbname.setText(user.getUname());
		lbid.setText(user.getUserid());
		lbphone.setText(String.valueOf(user.getUphone()));
		int isVip = user.getUvip();
		if (isVip == 0) {
			lbisvip.setText("否");
		} else {
			lbisvip.setText("是");
		}
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
		lbname = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		lbid = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		lbphone = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		lbisvip = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setForeground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("华文新魏", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("    \u59d3 \u540d");

		lbname.setFont(new java.awt.Font("华文新魏", 0, 18));
		lbname.setForeground(new java.awt.Color(255, 255, 255));
		lbname.setText("jLabel4");

		jLabel2.setFont(new java.awt.Font("华文新魏", 0, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u8eab\u4efd\u8bc1\u53f7");

		lbid.setFont(new java.awt.Font("华文新魏", 0, 18));
		lbid.setForeground(new java.awt.Color(255, 255, 255));
		lbid.setText("jLabel6");

		jLabel3.setFont(new java.awt.Font("华文新魏", 0, 24));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("   \u624b\u673a\u53f7");

		lbphone.setFont(new java.awt.Font("华文新魏", 0, 18));
		lbphone.setForeground(new java.awt.Color(255, 255, 255));
		lbphone.setText("jLabel7");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("       VIP");

		lbisvip.setFont(new java.awt.Font("华文新魏", 0, 18));
		lbisvip.setForeground(new java.awt.Color(255, 255, 255));
		lbisvip.setText("jLabel4");

		jLabel4.setFont(new java.awt.Font("华文新魏", 1, 36));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u4e2a\u4eba\u4fe1\u606f");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(222,
																		222,
																		222)
																.addComponent(
																		jLabel4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		170,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(181,
																		181,
																		181)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jLabel1,
																										javax.swing.GroupLayout.Alignment.TRAILING)
																								.addGroup(
																										layout.createSequentialGroup()
																												.addGap(9,
																														9,
																														9)
																												.addComponent(
																														jLabel5)))
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel2))
																.addGap(48, 48,
																		48)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						lbid)
																				.addComponent(
																						lbisvip)
																				.addComponent(
																						lbphone,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						119,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						lbname))))
								.addContainerGap(194, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addComponent(jLabel4)
								.addGap(50, 50, 50)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(lbname))
								.addGap(32, 32, 32)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lbid)
												.addComponent(jLabel2))
								.addGap(36, 36, 36)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lbphone)
												.addComponent(jLabel3))
								.addGap(29, 29, 29)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lbisvip)
												.addComponent(jLabel5))
								.addContainerGap(300, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel lbid;
	private javax.swing.JLabel lbisvip;
	private javax.swing.JLabel lbname;
	private javax.swing.JLabel lbphone;
	// End of variables declaration//GEN-END:variables

}