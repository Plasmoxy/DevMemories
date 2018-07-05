using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace test1
{
    class Program
    {

        static void writeOnPos(int _cursorTop, int _cursorLeft, String _text)
        {

            int __writeOnPos__beforeCursorTop = Console.CursorTop;
            int __writeOnPos__begoreCursorLeft = Console.CursorLeft;

            Console.SetCursorPosition(_cursorLeft, _cursorTop);
            Console.Write(_text);
            Console.SetCursorPosition(__writeOnPos__begoreCursorLeft, __writeOnPos__beforeCursorTop);

        }
        static void Main(string[] args)
        {

            Console.CursorVisible = false;

            Console.ForegroundColor = ConsoleColor.Red;

            for (int i = 10; i != 10; i++)
            {
                writeOnPos(10, i, "0 0");
                writeOnPos(11, i, " 0 ");
                writeOnPos(12, i, "000");
                
            }

            Console.ReadKey();

        }
    }
}
