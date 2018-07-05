#python

tmf1=open("file.tmf").read();

tmf1 = tmf1.replace("	", "");

def getStringBetween(s, leader, trailer):
	end_of_leader = s.index(leader) + len(leader);
	start_of_trailer = s.index(trailer, end_of_leader);
	return s[end_of_leader:start_of_trailer];
#end def

print(getStringBetween(tmf1, "{{{", "}}}"));