password = "peso"
password_input = 0
password_input = raw_input("Zadajte heslo: ")
if password_input == password :
 password_verify = 1
else:
 password_verify = 0
if password_verify == 1 :
 print "Heslo spravne :-)"
if password_verify == 0 :
 print "Heslo nespravne !!!"
wait = input(">Press Enter<")


 