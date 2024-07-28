import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="week15" width=400 height=300></applet>*/
abstract public class week15 extends Applet implements KeyListener
{
String msg="";
public void init()
{
setBackground(Color.red);
addKeyListener(this);
}
public void KeyPressed(KeyEvent ke)
{
showStatus("key pressed");
int v=ke.getKeyCode();
switch(v)
{
case KeyEvent.VK_0:showStatus("0 is pressed");
                   break;
case KeyEvent.VK_ALT:showStatus("alt is pressed");
			   break;
case KeyEvent.VK_F1:showStatus("f1 ois pressed");
			    break;
}
repaint();
}
public void KeyTyped(KeyEvent ke)
{
msg+=ke.getKeyChar();
}
public void KeyReleased(KeyEvent ke)
{
showStatus("key released");
}
public void paint(Graphics g)
{
g.drawString("typed characters are:"+msg,100,300);
}
}