/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import static connect.four.gui.GamePanel.PLAY_TIME;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUIPiece extends JLabel{
	
	int glowNum;
	ImageIcon glow1;
	ImageIcon glow2;
	ImageIcon glow3;
	ImageIcon glow4;
	ImageIcon[] glowing;
	
	public GUIPiece(int playerNum){
		setSize(145,145);
		setOpaque(false);
		setText("");
		ImageIcon redIcon = new ImageIcon(getClass().getResource("/resources/red_glow1.png"));
		ImageIcon blueIcon = new ImageIcon(this.getClass().getResource("/resources/blue_glow1.png"));
		if(playerNum == 0){
			setIcon(redIcon);
			glowNum = 0;
			glow1 = new ImageIcon(this.getClass().getResource("/resources/red_glow1.png"));
			glow2 = new ImageIcon(this.getClass().getResource("/resources/red_glow2.png"));
			glow3 = new ImageIcon(this.getClass().getResource("/resources/red_glow3.png"));
			glow4 = new ImageIcon(this.getClass().getResource("/resources/red_glow4.png"));
		}
		else{
			setIcon(blueIcon);
			glowNum = 1;
			glow1 = new ImageIcon(this.getClass().getResource("/resources/blue_glow1.png"));
			glow2 = new ImageIcon(this.getClass().getResource("/resources/blue_glow2.png"));
			glow3 = new ImageIcon(this.getClass().getResource("/resources/blue_glow3.png"));
			glow4 = new ImageIcon(this.getClass().getResource("/resources/blue_glow4.png"));
		}
		
		glowing = new ImageIcon[] {glow1, glow2, glow3, glow4, glow3, glow2};
		revalidate();
		repaint();
		setVisible(true);
	}
	
	ImageIcon getGlow(int index){
		return glowing[index];
	}


}
