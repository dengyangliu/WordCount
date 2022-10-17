package Main;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("KWIC");
		frame.setSize(900, 800);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("主程序-子程序",PageDesign.createPanel(1));
		tab.add("面向对象",PageDesign.createPanel(2));
		tab.add("事件系统",PageDesign.createPanel(3));
		tab.add("管道-过滤",PageDesign.createPanel(4));
		tab.setSelectedIndex(0);

		frame.setContentPane(tab);
		frame.setVisible(true);
	}
}