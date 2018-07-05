// ChlebOS
// (c) Sebastian Petrik
#include "HELP.h"

String build = "1010151424";

String cmdString = "";
const char argumentSeparator = '/'; // change these strings in void setup !!!
const char commandSeparator = ';';
void conPrintln(String text) {
  Serial.println(text);
}

void conPrint(String text) {
  Serial.print(text);
}

String getArgument(String data, char separator, int index) // not my code, too hard :-)
{
  int found = 0;
  int strIndex[] = {0, -1  };
  int maxIndex = data.length()-1;
  for(int i=0; i<=maxIndex && found<=index; i++){
  if(data.charAt(i)==separator || i==maxIndex){
  found++;
  strIndex[0] = strIndex[1]+1;
  strIndex[1] = (i == maxIndex) ? i+1 : i;
  }
 }
  return found>index ? data.substring(strIndex[0], strIndex[1]) : "";
}

void setup() {
  Serial.begin(9600);
  conPrintln("ChlebOS build " + build + " by Sebastian Petrik");
  conPrintln("WELCOME !!!");
  conPrintln("command separator : ';'");
  conPrintln("argument separator : '/'");
  conPrintln("Now listening for input.");
  conPrintln("---------");
}

void loop() {

  // READ FROM SERIAL PORT
  
  while (Serial.available() > 0) {
    cmdString = Serial.readStringUntil(commandSeparator);
  }


  String cmd = getArgument(cmdString, argumentSeparator, 0);
  String arg[10];
  for (int i = 1; i<=10; i++) {
    arg[i] = getArgument(cmdString, argumentSeparator, i);
  }

  // OS LOGIC

  // if there is a command avaliable to process,
  if (!(cmdString.equals(""))) {
    if (cmd.equals("pm")) { // PINMODE
      /* --------------------------------------------------------------------------- command pm start */
      if (arg[2].equals("1")) {
        
        pinMode(arg[1].toInt(), OUTPUT);
        conPrintln("[pm] Mode of pin " + arg[1] + " was set to OUTPUT");
        
      } else if (arg[2].equals("0")) {
        
        pinMode(arg[1].toInt(), INPUT);
        conPrintln("[pm] Mode of pin " + arg[1] + " was set to INPUT");
        
      } else {
        conPrintln("[pm] ERROR : Unknown mode");
      }

      cmdString=""; // clear the command string
      /* --------------------------------------------------------------------------- command pm end */
    } else if (cmd.equals("dw")) { // DIGITALWRITE
      /* --------------------------------------------------------------------------- command dw start */
      if (arg[2].equals("1")) {
        
        digitalWrite(arg[1].toInt(), HIGH);
        conPrintln("[dw] Pin " + arg[1] + " was set to HIGH");
        
      } else if (arg[2].equals("0")) {
        
        digitalWrite(arg[1].toInt(), LOW);
        conPrintln("[dw] Pin " + arg[1] + " was set to LOW");
        
      } else {
        conPrintln("[dw] ERROR : Unknown value");
      }

      cmdString=""; // clear the command string
      /* --------------------------------------------------------------------------- command dw end */
    } else if (cmd.equals("DEV")) {
      
      cmdString=""; // clear the command string
    } else {
      conPrintln("[OS] Unknown command : " + cmd);
      cmdString=""; // clear the command string
    }
    
  }

}
