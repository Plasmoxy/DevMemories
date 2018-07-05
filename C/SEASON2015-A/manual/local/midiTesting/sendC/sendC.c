#include <linux/soundcard.h>
#include <unistd.h>
#include <fcntl.h>
#include <stdio.h>

int main(void) {
   char* device =  "/dev/midi2" ;
   unsigned char data[3] = {0x90, 30, 127};

   // step 1: open the OSS device for writing
   int fd = open(device, O_WRONLY, 0);
   if (fd < 0) {
      printf("Error: cannot open %s\n", device);
      return 1;
   }

   // step 2: write the MIDI information to the OSS device
   write(fd, data, sizeof(data));

   // step 3: (optional) close the OSS device
   close(fd);

   return 0;
}
