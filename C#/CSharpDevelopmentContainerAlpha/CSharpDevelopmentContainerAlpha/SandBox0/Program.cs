using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SandBox0
{
    class Program
    {

		private static string text = "";
		private static Random rand;
		private static ConsoleColor[] colors =
		{
			ConsoleColor.Blue,
			ConsoleColor.Cyan,
			ConsoleColor.Red,
			ConsoleColor.Magenta,
			ConsoleColor.Green,
			ConsoleColor.Yellow,
			ConsoleColor.DarkMagenta,
			ConsoleColor.DarkRed
		};


        static void Main(string[] args)
        {
			rand = new Random();

			Console.Title = "PASCHOL NAHUI CYKA BLYAT, YOBAL TVOY MAT :( im lonely here";
			Console.BackgroundColor = ConsoleColor.DarkBlue;
			Console.ForegroundColor = ConsoleColor.White;
			Console.Clear();

            Dick d = new Dick("xddddddddddddddddddddddddddddddddddddd");
            d.Eyy();

            Console.ReadKey();

			d.Eyy();

			Console.ReadKey();

			Console.Title = " ############################################ PARTY BIATCH M8 FKIN MLG XDD ############################################";

			for ( int i = 0; i <= 100; i++)
			{
				text += "x";
				for ( int j = 0; j <= i; j++)
				{
					text += "d";
				}
				text += "\n";

				Console.BackgroundColor = colors[rand.Next(0, 7)];
				Console.Clear();
				Console.WriteLine(text);

				System.Threading.Thread.Sleep(100);

				Console.BackgroundColor = ConsoleColor.Black;
				Console.Clear();
				Console.WriteLine(text);

				System.Threading.Thread.Sleep(100);

			}



        }
    }
}
