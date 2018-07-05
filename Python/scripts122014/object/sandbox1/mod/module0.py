#python

class Human:
	def __init__(self, name, age):
		self.name = name;
		self.age = age;
	def greet(self):
		print("%s : Hello, my name is %s and I am %d years old." % (self.name, self.name, self.age) );
	def say(self, stringToSay):
		print("%s : %s" % (self.name, stringToSay) );
	#end defs
#end class