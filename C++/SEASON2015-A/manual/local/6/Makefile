CC=g++
CFLAGS=-Wall

6: 6.o greetings.o
	$(CC) $(CFLAGS) -o 6 *.o
6.o: 6.cpp
	$(CC) $(CFLAGS) -c 6.cpp
greetings.o: greetings.hpp greetings.cpp
	$(CC) $(CFLAGS) -c greetings.cpp
clean:
	rm *.o 6
cleanall:
	rm *.o 6
