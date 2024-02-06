package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame {
	JPanel jp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	String items[]= {"5","10","15","20","25","30"};
	JComboBox<String>jcom;
	// 선들의 좌표와 넓이
	int x=-15, y=-15, wh=5;
	Color color;
	// 내부클래스
	CanvasTest ct=new CanvasTest();
	
	public Ex02_Paint() {	
		super("미니그림판");
		jp=new JPanel();
		jb1=new JButton(" ");
		jb1.setBackground(color.RED);
		jb2=new JButton(" ");
		jb2.setBackground(color.GREEN);
		jb3=new JButton(" ");
		jb3.setBackground(color.BLUE);
		jb4=new JButton(" ");
		jb4.setBackground(color.CYAN);
		jb5=new JButton(" ");
		jb5.setBackground(color.MAGENTA);
		jb6=new JButton(" ");
		jb6.setBackground(color.YELLOW);
		
		jb7=new JButton("clear");
		jcom=new JComboBox<String>(items);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jcom);
		
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		// 화면 크기 구함
		Dimension ds= Toolkit.getDefaultToolkit().getScreenSize();
		// 위치 지정 (화면 중앙에 창을 보이게함) 총 높이와 넓이 600중에서 절반을 빼주면 중간으로 이동. 수학과 다르게 아래 y축이 +임
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.RED;
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.GREEN;
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.BLUE;
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.CYAN;
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.MAGENTA;
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color=Color.YELLOW;
			}
		});
		jb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.removeNotify();
				ct.addNotify();
				x=-5;
				y=-5;
				wh=5;
				// 크기 지정
				jcom.setSelectedIndex(0);
			}
		});
		
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED)
				switch ((String)e.getItem()) {
				case "5" : wh=5; break;
				case "10" : wh=10; break;
				case "15" : wh=15; break;
				case "20" : wh=20; break;
				case "25" : wh=25; break;
				case "30" : wh=30; break;
				}
			}
		});
		ct.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		});
		ct.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {	}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				x= e.getX();
				y=e.getY();
				ct.repaint();
			}
		});
	}

	// 내부클래스
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
	}
	
}
