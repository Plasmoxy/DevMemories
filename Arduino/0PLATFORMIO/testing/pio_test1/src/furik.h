// furik.h Arduino code symplifying lib ( macros )

// shorter port definitions for quicker bit manipulation
#ifndef pb
  #define pb PORTB
#endif
#ifndef pc
  #define pc PORTC
#endif
#ifndef pd
  #define pd PORTD
#endif
// same for ddr
#ifndef db
  #define db DDRB
#endif
#ifndef dc
  #define dc DDRC
#endif
#ifndef dd
  #define dd DDRD
#endif

// set and clear bit functions ( copied from original Arduino website)
// these functions are common for avr code
#ifndef cbi
  #define cbi(sfr, bit) (_SFR_BYTE(sfr) &= ~_BV(bit))
#endif
#ifndef sbi
  #define sbi(sfr, bit) (_SFR_BYTE(sfr) |= _BV(bit))
#endif
// to make it simpler, i removed the -i at the end of function name

#ifndef sb
  #define sb sbi
#endif
#ifndef cb
  #define cb cbi
#endif


#ifndef dly
  #define dly delay
#endif
