package Main;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PageDesign {
	//界面设计
	public static JComponent createPanel(int type) {
			JPanel panel = new JPanel();
			panel.setLayout(new GridBagLayout());
			//风格简介
			String description = new String();
			//图片路径
			String pictureurl = new String();
			if(type == 1) {
				description = "主程序/子程序风格将系统组织成层次结构，包括一个主程序和一系列子程序。\n"
						+"主程序是系统的控制器，负责调度各子程序的执行。\n"
						+ "各子程序又是一个局部的控制器，负责调度其子子程序的执行。";
				pictureurl = "E:/1.png";
				
			}
			else if(type == 2) {
				description = "面向对象体系结构风格的组件是类和对象。\n每个对象封装其内部的数据，\n并基于数据对外提供服务，\n"
						+ "适用于那些能够基于数据信息分解和组织的软件系统。";
				pictureurl = "E:/2.png";
				
			}
			else if(type == 3) {
				description = "观察者（Observer）模式中包含两种对象，分别是目标对象和观察者对象。\n"
						+ "在目标对象和观察者对象间存在着一种一对多的对应关系，\n"
						+ "当这个目标对象的状态发生变化时，所有依赖于它的观察者对象都会得到通知并执行它们各自特有的行为。";
				pictureurl = "E:/3.png";
				
			}
			else if(type == 4) {
				description = "把系统分解为几个序贯的处理步骤，这些步骤之间通过数据流连接，一个步骤的输出是另一个步骤的输入；\n" 
							+ "每个处理步骤由一个过滤器构件(Filter)实现。";
				pictureurl = "E:/4.png";
				
			}
			else {
				return null;
			}
			
			//风格简介
			JTextArea desc = new JTextArea("风格简介:");
			desc.append(description);
			JScrollPane scroll_desc = new JScrollPane(desc);
			GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
			gridBagConstraints_1.gridy = 0;
			gridBagConstraints_1.gridx = 0;
			gridBagConstraints_1.weightx = 0.2;
			gridBagConstraints_1.weighty = 0.3;
			gridBagConstraints_1.fill = GridBagConstraints.BOTH;
			panel.add(scroll_desc,gridBagConstraints_1);
			
			//图片展示
			ImageIcon img = new ImageIcon(pictureurl);
			img.setImage(img.getImage().getScaledInstance(600, 340, 0));
			JLabel label = new JLabel(img);
			GridBagConstraints gridBagConstraints_2 = new GridBagConstraints();
			gridBagConstraints_2.gridy = 1;
			gridBagConstraints_2.gridx = 0;
			gridBagConstraints_2.weightx = 0.3;
			gridBagConstraints_2.weighty = 0.3;
			gridBagConstraints_2.fill = GridBagConstraints.HORIZONTAL;
			panel.add(label,gridBagConstraints_2);
			
			//运行结果展示
			final JTextArea result = new JTextArea("运行结果");
			JScrollPane scroll_result = new JScrollPane(result);
			scroll_result.setFont(new Font(null, Font.PLAIN, 40));
			GridBagConstraints gridBagConstraints_5 = new GridBagConstraints();
			gridBagConstraints_5.gridy = 0;//行
			gridBagConstraints_5.gridx =2;//列
			gridBagConstraints_5.gridheight = 3;
			gridBagConstraints_5.weightx = 0.5;
			gridBagConstraints_5.weighty = 0.5;
			gridBagConstraints_5.fill = GridBagConstraints.BOTH;
			panel.add(scroll_result,gridBagConstraints_5);
			
			
			//根据用户的选择，展示不同的内容
			if(type == 1) {
							result.setText("主程序-子程序运行结果：");
							ClearFile.clearFile();
							//调用主子程序代码
							style1.demo1.main(null);
		    				//读取output.txt
							String result_content = GetFile.getFileContent();
							result.append(result_content);
						
					
				
			}
			else if(type == 2) {
							result.setText("面向对象运行结果：");
							ClearFile.clearFile();
							//调用面向对象风格代码
							style2.Main.main(null);
		    				//读取output.txt
							String result_content = GetFile.getFileContent();
							result.append(result_content);
				
			}
			else if(type == 3) {
							result.setText("事件系统-观察者模式运行结果：");
							ClearFile.clearFile();
							//调用事件系统风格代码
							style3.Main.main(null);
		    				//读取output.txt
							String result_content = GetFile.getFileContent();
							result.append(result_content);
			}
			else if(type == 4) {
							result.setText("管道-过滤器运行结果：");
							ClearFile.clearFile();
							try {
								style4.Main.main(null);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		    				//读取output.txt
							String result_content = GetFile.getFileContent();
							result.append(result_content);
				
			}
			else {
				return null;
			}
			
			return panel;
	}

}
