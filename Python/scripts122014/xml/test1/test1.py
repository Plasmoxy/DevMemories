#python

import xml.dom.minidom as minidom;

document1 = minidom.parse("rodina.xml").documentElement;

print document1.toxml();
