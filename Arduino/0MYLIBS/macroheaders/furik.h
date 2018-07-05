// furik.h - a little Arduino code symplifying header ( macros )

// set and clear bit functions ( copied from original Arduino website)
// these functions are common for avr code
#ifndef cbi
  #define cbi(sfr, bit) (_SFR_BYTE(sfr) &= ~_BV(bit))
#endif
#ifndef sbi
  #define sbi(sfr, bit) (_SFR_BYTE(sfr) |= _BV(bit))
#endif

// basic arduino functions ...
#ifndef dly
  #define dly delay
#endif
#ifndef pm
  #define pm pinMode
#endif
#ifndef dw
  #define dw digitalWrite
#endif
#ifndef aw
  #define aw analogWrite
#endif
#ifndef dre
  #define dre digitalRead
#endif
#ifndef are
  #define are analogRead
#endif
