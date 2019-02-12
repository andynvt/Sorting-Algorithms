package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class FormHuongDan extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
        private JTabbedPane tabbedPane, tabbedPaneB2;
        private JComponent pnBuoc1, pnBuoc2, pnBuoc21, pnBuoc22, pnBuoc23, pnBuoc3, pnBuoc4;

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
	public FormHuongDan() {
		setBounds(100, 100, 950, 580);
                ImageIcon icon = new ImageIcon(getClass().getResource("/resource/icon.png"));
                Image image = icon.getImage();
                setIconImage(image);
                setTitle("HƯỚNG DẪN SỬ DỤNG");
                
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
                
                tabbedPane = new JTabbedPane();
                pnBuoc1 = new JPanel();
                pnBuoc1.setLayout(new FlowLayout());
                pnBuoc2 = new JPanel();
                pnBuoc21 = new JPanel();
                pnBuoc22 = new JPanel();
                pnBuoc23 = new JPanel();
                pnBuoc3 = new JPanel();
                pnBuoc4 = new JPanel();
                
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
                
                // <editor-fold defaultstate="collapsed" desc="Bước 1">

                Icon taomang = new ImageIcon(getClass().getResource("/resource/taomang_1.gif"));
                JLabel gifTaoMang = new JLabel(taomang);
                Border border = BorderFactory.createLineBorder(Color.BLACK);
                gifTaoMang.setBorder(border);

                pnBuoc1.add(gifTaoMang);

                tabbedPane.addTab("Bước 1 - Khởi tạo mảng", pnBuoc1);
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Bước 2">
                Icon ngaunhien = new ImageIcon(getClass().getResource("/resource/ngaunhien.gif"));
                JLabel gifNgauNhien = new JLabel(ngaunhien);
                gifNgauNhien.setBorder(border);
                pnBuoc21.add(gifNgauNhien);
                
                Icon bangtay = new ImageIcon(getClass().getResource("/resource/bangtay.gif"));
                JLabel gifBangTay = new JLabel(bangtay);
                gifBangTay.setBorder(border);
                pnBuoc22.add(gifBangTay);
                
                Icon bangfile = new ImageIcon(getClass().getResource("/resource/bangfile.gif"));
                JLabel gifBangFile = new JLabel(bangfile);
                gifBangFile.setBorder(border);
                pnBuoc23.add(gifBangFile);
                
                tabbedPaneB2 = new JTabbedPane();
                tabbedPaneB2.addTab("Cách 1 - Tạo ngẫu nhiên", pnBuoc21);
                tabbedPaneB2.addTab("Cách 2 - Nhập bằng tay", pnBuoc22);
                tabbedPaneB2.addTab("Cách 3 - Nhập từ file text", pnBuoc23);
                pnBuoc2.add(tabbedPaneB2);
                tabbedPane.addTab("Bước 2 - Tạo dữ liệu mảng", pnBuoc2);
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Bước 3">
                Icon chontt = new ImageIcon(getClass().getResource("/resource/chontt.gif"));
                JLabel gifChonTT = new JLabel(chontt);
                gifChonTT.setBorder(border);
                pnBuoc3.add(gifChonTT);
                
                tabbedPane.addTab("Bước 3 - Chọn thuật toán", pnBuoc3);
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Bước 4">
                Icon sapxep = new ImageIcon(getClass().getResource("/resource/sapxep.gif"));
                JLabel gifSapXep = new JLabel(sapxep);
                gifSapXep.setBorder(border);
                pnBuoc4.add(gifSapXep);
                tabbedPane.addTab("Bước 4 - Tuỳ chỉnh và sắp xếp", pnBuoc4);
                // </editor-fold>
                
                contentPane.add(tabbedPane);
	}
     
}
