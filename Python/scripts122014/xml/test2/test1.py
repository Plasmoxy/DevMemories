#python

def getStringBetween(s, first, last):
	start = s.index(first) + len(first);
	end = s.index(last, start);
	return s[start:end];
#end def

file1 = open("data1.xml");
data1 = file1.read();

data1 = data1.replace('\n', '').replace('\t', '');

pes = getStringBetween(data1, "<pes", "/pes>");
pes_meno = getStringBetween(pes, "<meno>", "</meno");

print pes_meno;