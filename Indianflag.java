package com.company;
import javax.imageio.ImageIO;
import javax.imagio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputstream;
public class FlagPanel extends JPanel{
@Override
protected viod paintComponent(Griphics g){
super.paintComponent(g);

g.setColour(Colour.orange);
g.drawRect(x:10,y:10,width:400,height;70);
g.fileRect(x:10,y:10,width:400,height:70);

g.setColor(Color.WHITE);
g.drawRect(x:10,y:80,width:400,height:70);
g.fileRect(x:10,y:80,width:400,height:70);

g.setcolor(Color,green);
g.drawRect(x:10,y:150,width:400,height:70);
g.fileRect(x:10,y:150,width:400,height:70);

g.setColor(Color,BLACK);
g.fileRect(x:10,y:10,width:5,height:540);

try{
Image img=ImageIO.read(new FileInputstream(name:"src?a.jpg"));
g.drawImage(img,x:165,y:80,width:70,observr:null);
}catch(Exception e)
{
e.printStackTrace();
}
}
package com.company;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
private FlagPanel panel=new FlagPanel();
public MyFrame() throw HeadlessException{
setTital("Indian Falg");
setSize(width:400,height:600);
setLocationzRelatioveTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
add(panel);
setVisible(true);
}
}
package com.company;
public class Indianflag{
public static void main(String[] args){
System.out.prontln("Start");
System.out.println("Lets Goooo");
new MyFrame();
}
}