#python

from mod.module0 import Human;

class Main:
	def __init__(self):
		self.main();
	def main(self):
		
		janko = Human("Janko", 13);
		janko.greet();
		janko.say("HELLOOOOOOO !");
		janko.say("Jumperstrip likes kaktus !");
		
	#end defs
#end class

program = Main();