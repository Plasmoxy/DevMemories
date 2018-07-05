using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace test1
{
    class Program
    {
        public static System.ConsoleKey key;
        public static bool penOn = false;

        static void painter()
        {
            Console.ForegroundColor = ConsoleColor.Red;
            while (Console.KeyAvailable)
            {
                key = Console.ReadKey(true).Key;

                if (key == ConsoleKey.UpArrow)
                {
                    Console.SetCursorPosition(Console.CursorLeft, (Console.CursorTop - 1));

                    if (penOn == true)
                    {
                        Console.Write("█");
                        Console.SetCursorPosition(Console.CursorLeft - 1, Console.CursorTop);
                    }
                }
                if (key == ConsoleKey.DownArrow)
                {
                    Console.SetCursorPosition(Console.CursorLeft, (Console.CursorTop + 1));

                    if (penOn == true)
                    {
                        Console.Write("█");
                        Console.SetCursorPosition(Console.CursorLeft - 1, Console.CursorTop);
                    }
                }
                if (key == ConsoleKey.LeftArrow)
                {
                    Console.SetCursorPosition((Console.CursorLeft - 2), Console.CursorTop);
                    Console.SetCursorPosition((Console.CursorLeft + 1), Console.CursorTop);

                    if (penOn == true)
                    {
                        Console.Write("█");
                        Console.SetCursorPosition(Console.CursorLeft - 1, Console.CursorTop);
                    }
                }
                if (key == ConsoleKey.RightArrow)
                {
                    Console.SetCursorPosition((Console.CursorLeft + 1), Console.CursorTop);

                    if (penOn == true)
                    {
                        Console.Write("█");
                        Console.SetCursorPosition(Console.CursorLeft - 1, Console.CursorTop);
                    }
                }
                if (key == ConsoleKey.S)
                {
                    penOn = true;
                }
                if (key == ConsoleKey.A)
                {
                    penOn = false;
                }
            }
        }


        static void Main(string[] args)
        {


            Console.SetCursorPosition(0, 0);
            Console.ForegroundColor = ConsoleColor.White;
            Console.CursorSize = 100;

            while (true)
            {
                painter();
            }
            

        }
    }
}
