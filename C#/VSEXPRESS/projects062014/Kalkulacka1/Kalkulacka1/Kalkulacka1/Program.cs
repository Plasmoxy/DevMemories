using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kalkulacka1
{
    class Program
    {
        public static long _cislo_1 = 0;
        public static long _cislo_2 = 0;
        public static long _vysledok = 0;
        public static string _operator;

        static void kalkulacka_takt()
        {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.Write("Naprogramované v C# (CSharp)");
            Console.ForegroundColor = ConsoleColor.Magenta;
            Console.Write("\n\n-----------Kalkulačka----------");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.Write("\n---(c) Sebastián Petrík 2014---");
            try
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.Write("\n\nZadajte prvé číslo : ");
                Console.ForegroundColor = ConsoleColor.Green;
                _cislo_1 = int.Parse(Console.ReadLine());
            }
            catch
            {
                Console.Clear();
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("\nChyba [001] : Neplatné číslo");
                Console.Write("\n\nNezadali ste platné číslo alebo je zadané číslo príliš veľké");
                Console.Write("\n\n\nStlačte ľubovoľnú klávesu pre pokračovanie.");
                Console.ReadKey();
                kalkulacka_takt();
            }
            

            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.Write("\nZadajte operátor : ");
            Console.ForegroundColor = ConsoleColor.Blue;
            _operator = Console.ReadLine();
            if ( false == (_operator == "+" || _operator == "plus" || _operator == "p" || _operator == "-" || _operator == "minus" || _operator == "m" || _operator == "*" || _operator == "krat" || _operator == "k" || _operator == "x" || _operator == "/" || _operator == "delene" || _operator == ":" || _operator == "d"))
            {
                Console.Clear();
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("\nChyba [002] : Neplatný operátor");
                Console.Write("\n\nDostupné operátory :");
                Console.Write("\n   PLUS : +;plus;p");
                Console.Write("\n   MINUS : -;minus;m");
                Console.Write("\n   KRAT : *;krat;k;x");
                Console.Write("\n   DELENE : /;delene;:;d");
                Console.Write("\n\n\nStlačte ľubovoľnú klávesu pre pokračovanie.");
                Console.ReadKey();
                kalkulacka_takt();
            }
            try
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.Write("\nZadajte druhé číslo : ");
                Console.ForegroundColor = ConsoleColor.Green;
                _cislo_2 = int.Parse(Console.ReadLine());
            }
            catch
            {
                Console.Clear();
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("\nChyba [001] : Neplatné číslo");
                Console.Write("\n\nNezadali ste platné číslo alebo je zadané číslo príliš veľké");
                Console.Write("\n\n\nStlačte ľubovoľnú klávesu pre pokračovanie.");
                Console.ReadKey();
                kalkulacka_takt();
            }

            if (_operator == "+" || _operator == "plus" || _operator == "p")
            {
                _vysledok = (_cislo_1 + _cislo_2);
                _operator = "+";
            }
            else if (_operator == "-" || _operator == "minus" || _operator == "m")
            {
                _vysledok = (_cislo_1 - _cislo_2);
                _operator = "-";
            }
            else if (_operator == "*" || _operator == "krat" || _operator == "k" || _operator == "x")
            {
                _vysledok = (_cislo_1 * _cislo_2);
                _operator = "x";
            }
            else if (_operator == "/" || _operator == "delene" || _operator == ":" || _operator == "d")
            {
                _vysledok = (_cislo_1 / _cislo_2);
                _operator = ":";
            }
            else
            {
                Console.Clear();
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("\nChyba [002] : Neplatný operátor");
                Console.Write("\n\nDostupné operátory :");
                Console.Write("\n   PLUS : +;plus;p");
                Console.Write("\n   MINUS : -;minus;m");
                Console.Write("\n   KRAT : *;krat;k;x");
                Console.Write("\n   DELENE : /;delene;:;d");
                Console.Write("\n\n\nStlačte ľubovoľnú klávesu pre pokračovanie.");
                Console.ReadKey();
                kalkulacka_takt();
            }

            Console.Write("\n\n");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.Write(_cislo_1);
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.Write(" " + _operator);
            Console.ForegroundColor = ConsoleColor.Green;
            Console.Write(" " + _cislo_2);
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.Write(" = ");
            Console.ForegroundColor = ConsoleColor.Magenta;
            Console.Write(_vysledok);

            Console.ForegroundColor = ConsoleColor.Red;
            Console.Write("\n\n\nStlačte ľubovoľný kláves pre reštart kalkulačky.");
            Console.ReadKey();


            kalkulacka_takt();
        }

        static void Main(string[] args)
        {

            Console.Title = ("Kalkulačka | (c) Sebastián Petrík 2014");
            kalkulacka_takt();

        }
    }

}
