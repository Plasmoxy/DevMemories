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

void osInit() {
  conPrintln("ChlebOS build " + build + " by Sebastian Petrik");
  conPrintln("WELCOME !!!");
  conPrintln("command separator : ';'");
  conPrintln("argument separator : '/'");
  conPrintln("Now listening for input.");
  conPrintln("---------");
}
