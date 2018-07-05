using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor_test
{
	class Program
	{
		static void Main(string[] args)
		{

			Decko lukas = (Decko) new Clovek("Lukas", 10);

			Console.WriteLine(lukas.GetType());

			Console.ReadKey();

		}
	}
}
