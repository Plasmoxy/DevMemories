using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VeryGudVirusAvastRemovPls
{
	class Program
	{

		private static string text = "";
		private static string cringeNumber = "WATCH DA SHUW !";

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
			Console.WriteLine("xd hey Im warnign u u will get rekt maximal Avast pls remuv virus go uninstall :/\n (Press key once a timerino)");
			Console.ReadKey();

			Console.Clear();
			Console.WriteLine(" eyyyy #lmao u gud men hir reward fur virus no deletino my wife salut you :)");
			Console.ReadKey();





			Console.Title = " ############################################ PARTY BIATCH M8 FKIN MLG XDD ############################################";

			for (int i = 0; i <= 10; i++)
			{
				text += "x";
				for (int j = 0; j <= i; j++)
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


			Console.BackgroundColor = ConsoleColor.Black;
			Console.Clear();
			System.Threading.Thread.Sleep(1800);

			Console.WriteLine("3");
			System.Threading.Thread.Sleep(300);
			Console.WriteLine("2");
			System.Threading.Thread.Sleep(300);
			Console.WriteLine("1");
			System.Threading.Thread.Sleep(300);
			Console.WriteLine("PAAASCHOOOL NAHUUUII !!");
			System.Threading.Thread.Sleep(300);

			Console.Title = "PAAASCHOOOL NAHUUUII CYKA BLYAT YOBANY HAKER DOMINIQ SHOKER IST BEST PAUL VICHIL IS ZE WORD !!";

			int speed = 200;
			while (true)
			{
				Console.BackgroundColor = colors[rand.Next(0, 7)];
				Console.Clear();

				for ( int i = 0; i < 10; i++)
				{
					cringeNumber += rand.Next().ToString();
				}

				Console.Write(cringeNumber);

				if (speed > 0) System.Threading.Thread.Sleep(speed);

				Console.BackgroundColor = ConsoleColor.Black;
				Console.Clear();

				for (int i = 0; i < 10; i++)
				{
					cringeNumber += rand.Next().ToString();
				}

				Console.Write(cringeNumber);

				if (speed > 0 ) System.Threading.Thread.Sleep(speed);

				speed -= 10;

				Console.Write("\n");

			}



		}
	}
}
