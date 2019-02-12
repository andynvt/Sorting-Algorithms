package Main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class FormAbout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormHuongDan frame = new FormHuongDan();
					frame.setVisible(true);
			        frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormAbout() {
		setBounds(100, 100, 322, 340);
                ImageIcon icon = new ImageIcon(getClass().getResource("/resource/icon.png"));
                Image image = icon.getImage();
                setIconImage(image);
                setTitle("THÔNG TIN");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JTextArea txtInfo = new JTextArea();
		txtInfo.setEditable(false);
		txtInfo.setFont(new Font("Helvetica", Font.PLAIN, 14));
		txtInfo.setBackground(SystemColor.menu);
		txtInfo.setText("\n                 Trường Đại Học Cần Thơ   \n"
                        + "                      Khoa CNTT & TT      \n\n"
                        + " - Phần mềm: Mô phỏng thuật toán sắp xếp\n"
                        + " - Đồ án: Niên luận Cơ sở ngành KTPM\n"
                        + " - Học kỳ I, Năm 2017-2018\n"
                        + " - CBHD: ThS. Võ Huỳnh Trâm\n"
                        + "────────────────────────────────\n\n"
                        + "                     Sinh viên thực hiện\n\n"
                        + " - Họ tên: Nguyễn Văn Tài\n"
                        + " - MSSV: B1400722\n"
                        + " - Email: taib1400722@student.ctu.edu.vn");
		contentPane.add(txtInfo);
	}
}
