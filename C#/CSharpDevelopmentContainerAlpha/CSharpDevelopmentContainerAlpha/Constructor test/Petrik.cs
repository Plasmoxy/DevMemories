using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor_test
{
	class Petrik : Clovek
	{
		public Petrik(string meno, int vek) : base(meno, vek) { }
		public Petrik(string meno, int vek, string zamestnanie) : base(meno, vek, zamestnanie) { }

		public override void Pozdrav()
		{

			base.Pozdrav();
			Console.WriteLine("xd Petrik !");

		}

	}
}
