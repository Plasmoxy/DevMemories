#python

class Employee:
	
	empCount = 0;
	
	def __init__(self, name, salary):
		self.name = name;
		self.salary = salary;
		Employee.empCount += 1;
	def displayCount(self):
		print("Total Employee %d" % Employee.empCount);
	def displayEmployee(self):
		print("Name : " + self.name + ", Salary : " + str(self.salary) );
	#end defs
#end class

class Main:
	
	def __init__(self):
		self.main();
	def main(self):
		
		janko = Employee("Janko Hruska", 500);
		jozef = Employee("Jozef Petrik", 600);
		
		janko.displayEmployee();
		janko.displayCount();
		jozef.displayEmployee();
		jozef.displayCount();
		
	#end defs
#end class

#program
program = Main();