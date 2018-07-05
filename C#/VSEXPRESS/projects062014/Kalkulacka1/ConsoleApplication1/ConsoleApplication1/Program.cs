using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {

        public static int volba = 0;

        static void Main(string[] args)
        {

            start:

            Console.Clear();

            Console.Write("Volba:\n1 : Pozdrav\n2 : Daco nove\n3 : Vtip\n4 : debil\n\nVolba: ");
            volba = int.Parse(Console.ReadLine());

            switch (volba)
            {
                case(1):
                    Console.Write("\nAHOOOOOOOJ");
                    break;
                case(2):
                    Console.Write("\nNic neni nove !!!");
                    break;
                case(3):
                    Console.Write("\nPoranda ci.");
                    break;
                case(4):
                    Console.Write("\nAleš");
                    break;
                default :
                    Console.Write("\nNespravna moznost !!!");
                    break;
            }

            
            Console.ReadKey();

            goto start;

        }
    }
}
