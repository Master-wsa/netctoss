/*
 * MainUserzView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import win.wangshengan.hotelhousing.business.UserzBuss;
import win.wangshengan.hotelhousing.business.impl.UserzBussImpl;
import win.wangshengan.hotelhousing.entity.Userz;
import win.wangshengan.hotelhousing.util.ViewUtil;

/**
 *
 * @author  __USER__
 */
public class MainUserzView extends javax.swing.JFrame implements Runnable {

	/**
	 * 定义一个成员变量用户ID
	 */
	String id = "";

	public MainUserzView() {

	}

	/** Creates new form MainUserzView */
	/**
	 * 把用户登录的ID传过来
	 * @param id
	 */
	public MainUserzView(String id) {
		this.id = id;
		initComponents();
		jPanel2.removeAll();
		jPanel2.add(new MainInfoView());
		jlbname.setText(getUserNameById(id));
		this.setSize(834, 698);
		jPanel2.setSize(638, 624);
		jPanel1.setOpaque(false);
		jPanel2.setOpaque(false);
		jPanel3.setOpaque(false);
		ViewUtil.viewLocationCenter(this);
		ViewUtil.addBackground(this, "images/12.jpg", 850, 700);
		pack();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			java.util.Date date = new java.util.Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
			lbtime.setText(sdf.format(date));
			lbhour.setText(df.format(date));
			lbtime.setHorizontalAlignment(lbtime.CENTER);
			lbhour.setHorizontalAlignment(lbhour.CENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 通过ID查询其名字
	 */
	private String getUserNameById(String id) {
		UserzBuss userzBuss = new UserzBussImpl();
		Userz user = userzBuss.getUserzById(id);
		String uname = user.getUname();
		return uname;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jlbname = new javax.swing.JLabel();
		lbtime = new javax.swing.JLabel();
		lbhour = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(255, 255, 255)));

		jButton1.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton1.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\个人信息.png")); // NOI18N
		jButton1.setText("\u4e2a\u4eba\u4fe1\u606f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton2.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\修改信息选中.png")); // NOI18N
		jButton2.setText("\u4fe1\u606f\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton3.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\退房.png")); // NOI18N
		jButton3.setText("\u67e5\u623f\u9000\u623f");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton4.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\历史记录.png")); // NOI18N
		jButton4.setText("\u5386\u53f2\u8bb0\u5f55");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton6.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\退出.png")); // NOI18N
		jButton6.setText(" \u9000    \u51fa");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton5.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\预定.png")); // NOI18N
		jButton5.setText("\u9884\u5b9a\u623f\u95f4");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("华文新魏", 0, 14));
		jButton7.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\主界面.png")); // NOI18N
		jButton7.setText("\u4e3b\u754c\u9762");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE)
						.addComponent(jButton7).addGap(43, 43, 43)
						.addComponent(jButton1).addGap(41, 41, 41)
						.addComponent(jButton2).addGap(38, 38, 38)
						.addComponent(jButton5).addGap(37, 37, 37)
						.addComponent(jButton3).addGap(39, 39, 39)
						.addComponent(jButton4).addGap(34, 34, 34)
						.addComponent(jButton6).addGap(28, 28, 28)));

		jPanel2.setLayout(new java.awt.BorderLayout());

		jPanel3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(255, 255, 255)));

		jLabel1.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\welcome.png")); // NOI18N
		jLabel1.setText("\u6b22\u8fce\u60a8\uff01");

		jlbname.setFont(new java.awt.Font("华文新魏", 0, 18));
		jlbname.setForeground(new java.awt.Color(255, 255, 255));
		jlbname.setText("jLabel2");

		lbtime.setForeground(new java.awt.Color(255, 255, 255));
		lbtime.setText(" ");

		lbhour.setForeground(new java.awt.Color(255, 255, 255));
		lbhour.setText(" ");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel1))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lbtime,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				137,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lbhour,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				137,
																				Short.MAX_VALUE)))
										.addContainerGap())
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout.createSequentialGroup()
										.addContainerGap(53, Short.MAX_VALUE)
										.addComponent(jlbname)
										.addGap(52, 52, 52)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(jlbname)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lbtime)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lbhour)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel3,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										629, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														611,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jPanel3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int i = JOptionPane.showConfirmDialog(null, "是否退出！", "提醒",
				JOptionPane.YES_NO_OPTION);
		if (i == 0) {
			System.exit(0);
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new MainInfoView());
		pack();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new UserHistoryView(id));
		pack();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new UserUpdaHosView(id));
		pack();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new UserUpdaInfoView(id));
		pack();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new UserOrderView(id));
		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel2.removeAll();
		jPanel2.add(new UserSelInfoView(id));
		pack();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainUserzView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JLabel jlbname;
	private javax.swing.JLabel lbhour;
	private javax.swing.JLabel lbtime;
	// End of variables declaration//GEN-END:variables

}