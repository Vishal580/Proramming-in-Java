package com.company
import Javax.imagio.ImageIo;
import Javax.swing.*;
import Java.awt.*;
import Java.io.FileInputStream;
public class FlagPanal extends Jpanel
{
@override
protected void paintComponent(Graphic g)
{
Super.paintComponent(g);
g.setColor(Color.orange);
g.drawRect(x:10,y:10,width:400,height:70);
g.fillRect(x:10,y:10,width:400,height:70):

g.setColor(Color.WHITE);
g.drawRect(x:10,y:80,width:400,height:70);
g.fillRect(x:10,y:80,width:400,height:70);

g.setColor(Color.green);
g.drawRect(x:10,y:150,width:400,heght:70);
g.fillRect(x:10,y:150,width:400,height:70);

g.setColor(Color.BLACK);
g.drawRect(x:10,y:10;width:5,height:540);

try
{
Image img=ImageIO.read(new FileInputstream(name:"src/a.jpg"));
g.drawImage(img,x:165,y:80,width:70,height:70,Observer:null);
}
{
e.printStackTrace();
}
}  
}
