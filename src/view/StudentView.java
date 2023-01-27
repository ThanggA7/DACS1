package view;

import model.StudentManagementModel;
import model.StudentModel;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class StudentView extends JFrame {
    StudentManagementModel model;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField adr;
	private JTextField Phone;
	private JTextField old;
	private JTextField NewS;
	private JTextField Search;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentView frame = new StudentView();
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
	public StudentView() {
		this.model = new StudentManagementModel();
		this.setTitle("Chương trình quản lý vay vốn của sinh viên tại ngân hàng");
		ImageIcon img = new ImageIcon("D:\\JAVA VKU\\DAJV_QLTN\\src\\img\\icon.png");
		this.setIconImage(img.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1152, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel Info = new JLabel("QUẢN LÝ VAY VỐN CỦA SINH VIÊN TẠI NGÂN HÀNG");
		Info.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Info.setBounds(186, 8, 765, 52);
		contentPane.add(Info);

		JLabel IDStudent = new JLabel("Mã sinh viên");
		IDStudent.setFont(new Font("Arial", Font.PLAIN, 26));
		IDStudent.setBounds(31, 104, 143, 49);
		contentPane.add(IDStudent);
		
		JLabel studentName = new JLabel("Họ và tên");
		studentName.setFont(new Font("Arial", Font.PLAIN, 26));
		studentName.setBounds(31, 153, 143, 49);
		contentPane.add(studentName);
		
		JLabel andress = new JLabel("Địa chỉ");
		andress.setFont(new Font("Arial", Font.PLAIN, 26));
		andress.setBounds(31, 197, 165, 49);
		contentPane.add(andress);
		
		JLabel schoolName = new JLabel("Trường");
		schoolName.setFont(new Font("Arial", Font.PLAIN, 26));
		schoolName.setBounds(31, 256, 143, 49);
		contentPane.add(schoolName);
		
		JLabel phoneNumber = new JLabel("Số điện thoại");
		phoneNumber.setFont(new Font("Arial", Font.PLAIN, 26));
		phoneNumber.setBounds(31, 307, 153, 49);
		contentPane.add(phoneNumber);

		JLabel money = new JLabel("Số tiền");
		money.setFont(new Font("Arial", Font.PLAIN, 26));
		money.setBounds(31, 376, 143, 49);
		contentPane.add(money);
		Name = new JTextField();
		Name.setBounds(209, 118, 277, 31);
		contentPane.add(Name);
		Name.setColumns(10);
		
		adr = new JTextField();
		adr.setColumns(10);
		adr.setBounds(209, 167, 277, 31);
		contentPane.add(adr);
		
		Phone = new JTextField();
		Phone.setColumns(10);
		Phone.setBounds(209, 211, 277, 31);
		contentPane.add(Phone);
		
		old = new JTextField();
		old.setColumns(10);
		old.setBounds(209, 262, 277, 31);
		contentPane.add(old);
		
		NewS = new JTextField();
		NewS.setColumns(10);
		NewS.setBounds(209, 321, 277, 31);
		contentPane.add(NewS);
		
		JButton add = new JButton("THÊM");
		add.setBounds(31, 452, 116, 42);
		contentPane.add(add);
		
		JButton Delete = new JButton("XÓA");
		Delete.setBounds(192, 452, 116, 42);
		contentPane.add(Delete);
		
		JButton Fix = new JButton("SỬA");
		Fix.setBounds(370, 452, 116, 42);
		contentPane.add(Fix);
		
		Search = new JTextField();
		Search.setColumns(10);
		Search.setBounds(733, 70, 277, 31);
		contentPane.add(Search);
		
		JButton SearchB = new JButton("Search");
		SearchB.setBounds(1020, 70, 101, 31);
		contentPane.add(SearchB);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null,null},
			},
			new String[] {
				"STT", "M\u00E3 sinh vi\u00EAn", "H\u1ECD v\u00E0 T\u00EAn", "\u0110\u1ECBa ch\u1EC9","Trường" ,"S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "S\u1ED1 Ti\u1EC1n"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(533,113,588,298);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(209, 380, 277, 31);
		contentPane.add(textField);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}


	public void showalldata(List<StudentModel> studentModelList){
		List<StudentModel>ListStudent = new ArrayList<>();
		studentModelList = ListStudent;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		ListStudent.forEach(StudentModel) -> {
			tableModel.addRow(new Object[]{


			});
		}
	}

}
